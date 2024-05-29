package com.nemonotfound.nemoscarpentry.block;

import com.mojang.serialization.MapCodec;
import com.nemonotfound.nemoscarpentry.block.enums.ChairPart;
import com.nemonotfound.nemoscarpentry.property.ModProperties;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldEvents;

import static net.minecraft.util.math.Direction.DOWN;
import static net.minecraft.util.math.Direction.UP;

public class MultipleBlockChair extends SitableBlock implements Waterloggable {

    private final VoxelShape northShape;
    private final VoxelShape EAST_SHAPE;
    private final VoxelShape SOUTH_SHAPE;
    private final VoxelShape WEST_SHAPE;
    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final EnumProperty<ChairPart> PART = ModProperties.CHAIR_PART;

    protected MultipleBlockChair(Settings settings, float height, VoxelShape northShape, VoxelShape EASR_SHAPE,
                                 VoxelShape SOUTH_SHAPE, VoxelShape WEST_SHAPE) {
        super(settings, height);
        this.northShape = northShape;
        this.EAST_SHAPE = EASR_SHAPE;
        this.SOUTH_SHAPE = SOUTH_SHAPE;
        this.WEST_SHAPE = WEST_SHAPE;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH)
                .with(WATERLOGGED, false).with(PART, ChairPart.LOWER));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
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
                return isLowerChairPart ? SOUTH_SHAPE : SOUTH_SHAPE.offset(0, -1, 0);
            }
            case EAST -> {
                return isLowerChairPart ? EAST_SHAPE : EAST_SHAPE.offset(0, -1, 0);
            }
            case WEST -> {
                return isLowerChairPart ? WEST_SHAPE : WEST_SHAPE.offset(0, -1, 0);
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
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED)) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        if (direction == getDirectionToOtherChairHalf(state.get(PART)) && (!neighborState.isOf(this) || neighborState.get(PART) == state.get(PART))) {
            return Blocks.AIR.getDefaultState();
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
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
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, PART);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);

        if (!world.isClient) {
            BlockPos blockPos = pos.offset(UP);
            world.setBlockState(blockPos, state.with(PART, ChairPart.UPPER), Block.NOTIFY_ALL);
            world.updateNeighbors(pos, Blocks.AIR);
            state.updateNeighbors(world, pos, Block.NOTIFY_ALL);
        }
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient && player.isCreative()) {
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
            world.setBlockState(positionOfOtherChairPart, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL | Block.SKIP_DROPS);
            world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, positionOfOtherChairPart, Block.getRawIdFromState(stateOfOtherChairPart));
        }
    }

    private Direction getDirectionToOtherChairHalf(ChairPart chairPart) {
        boolean isLowerChairPart = chairPart.equals(ChairPart.LOWER);

        return isLowerChairPart ? UP : DOWN;
    }
}
