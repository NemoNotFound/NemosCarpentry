package com.devnemo.nemos.carpentry.block.seats.parents;

import com.devnemo.nemos.carpentry.block.enums.ChairPart;
import com.devnemo.nemos.carpentry.property.ModProperties;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.*;
import net.minecraft.world.tick.ScheduledTickView;

import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;

public class MultipleBlockChair extends SitableBlock implements Waterloggable {

    private final VoxelShape northShape;
    private final VoxelShape eastShape;
    private final VoxelShape southShape;
    private final VoxelShape westShape;
    private static final EnumProperty<Direction> FACING = HorizontalFacingBlock.FACING;
    public static final EnumProperty<ChairPart> PART = ModProperties.CHAIR_PART;

    protected MultipleBlockChair(Settings settings, float height, VoxelShape northShape, VoxelShape eastShape,
                                 VoxelShape southShape, VoxelShape westShape) {
        super(settings, height, northShape, eastShape, southShape, westShape);
        this.northShape = northShape;
        this.eastShape = eastShape;
        this.southShape = southShape;
        this.westShape = westShape;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH)
                .with(WATERLOGGED, false).with(PART, ChairPart.LOWER));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return getShapeIndex(state);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShapeIndex(state);
    }

    private VoxelShape getShapeIndex(BlockState state) {
        ChairPart chairPart = state.get(PART);
        boolean isLowerChairPart = chairPart == ChairPart.LOWER;

        switch (state.get(FACING)) {
            case NORTH -> {
                return isLowerChairPart ? northShape : northShape.offset(0, -1, 0);
            }
            case SOUTH -> {
                return isLowerChairPart ? southShape : southShape.offset(0, -1, 0);
            }
            case EAST -> {
                return isLowerChairPart ? eastShape : eastShape.offset(0, -1, 0);
            }
            case WEST -> {
                return isLowerChairPart ? westShape : westShape.offset(0, -1, 0);
            }
        }

        return northShape;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hitResult) {
        if (state.get(PART) == ChairPart.UPPER) {
            return super.onUse(state, world, pos.offset(DOWN), player, hitResult);
        }

        return super.onUse(state, world, pos, player, hitResult);
    }

    @Override
    public BlockState getStateForNeighborUpdate(
            BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction,
            BlockPos neighborPos, BlockState neighborState, Random random) {
        if (state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        if (direction == getDirectionToOtherChairHalf(state.get(PART)) && (!neighborState.isOf(this) || neighborState.get(PART) == state.get(PART))) {
            return Blocks.AIR.getDefaultState();
        }

        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return state.get(PART) == ChairPart.LOWER ? BlockRenderType.MODEL : BlockRenderType.INVISIBLE;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        Direction direction = ctx.getHorizontalPlayerFacing().getOpposite();
        BlockPos blockPosOfOtherChairPart = blockPos.offset(UP);

        if (canBlockBePlaced(world, blockPosOfOtherChairPart, ctx)) {
            FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());

            return this.getDefaultState()
                    .with(FACING, direction)
                    .with(PART, ChairPart.LOWER)
                    .with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        }

        return null;
    }

    private boolean canBlockBePlaced(World world, BlockPos blockPos, ItemPlacementContext ctx) {
        boolean canSecondChairPartBePlaced = world.getBlockState(blockPos).canReplace(ctx);
        boolean isSecondChairPartInWorldBorder = world.getWorldBorder().contains(blockPos);

        return canSecondChairPartBePlaced && isSecondChairPartInWorldBorder;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, PART);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);

        if (!world.isClient()) {
            BlockPos blockPos = pos.offset(UP);
            world.setBlockState(blockPos, getNewBlockState(world, blockPos, state), Block.NOTIFY_ALL);
            world.updateNeighbors(pos, Blocks.AIR);
            state.updateNeighbors(world, pos, Block.NOTIFY_ALL);
        }
    }

    private BlockState getNewBlockState(World world, BlockPos blockPos, BlockState state) {
        BlockState newBlockState = this.getDefaultState().with(PART, ChairPart.UPPER)
                .with(FACING, state.get(FACING));

        if (isStillWater(world.getBlockState(blockPos))) {
            return newBlockState.with(WATERLOGGED, true);
        }

        return newBlockState;
    }

    private boolean isStillWater(BlockState blockState) {
        return blockState.isOf(Blocks.WATER) && blockState.getFluidState().isStill();
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient() && player.isCreative()) {
            ChairPart chairPart = state.get(PART);
            if (chairPart.equals(ChairPart.UPPER)) {
                breakOtherChairPart(world, pos, player, chairPart);
            }
        }

        return super.onBreak(world, pos, state, player);
    }

    private void breakOtherChairPart(World world, BlockPos pos, PlayerEntity player, ChairPart chairPart) {
        BlockPos positionOfOtherChairPart = pos.offset(getDirectionToOtherChairHalf(chairPart));
        BlockState stateOfOtherChairPart = world.getBlockState(positionOfOtherChairPart);

        if (stateOfOtherChairPart.isOf(this) && stateOfOtherChairPart.get(PART) == ChairPart.getOppositeChairPart(chairPart)) {
            BlockState newBlockState = world.getBlockState(positionOfOtherChairPart).get(WATERLOGGED)
                    ? Blocks.WATER.getDefaultState() : Blocks.AIR.getDefaultState();
            world.setBlockState(positionOfOtherChairPart, newBlockState, Block.NOTIFY_ALL | Block.SKIP_DROPS);
            world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, positionOfOtherChairPart, Block.getRawIdFromState(stateOfOtherChairPart));
        }
    }

    private Direction getDirectionToOtherChairHalf(ChairPart chairPart) {
        boolean isLowerChairPart = chairPart.equals(ChairPart.LOWER);

        return isLowerChairPart ? UP : DOWN;
    }
}
