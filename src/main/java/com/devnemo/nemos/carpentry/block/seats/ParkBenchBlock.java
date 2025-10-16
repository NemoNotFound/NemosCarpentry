package com.devnemo.nemos.carpentry.block.seats;

import com.devnemo.nemos.carpentry.block.enums.BenchPart;
import com.devnemo.nemos.carpentry.block.seats.parents.OldSitableBlock;
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
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

import java.util.stream.Stream;

import static net.minecraft.util.math.Direction.*;

public class ParkBenchBlock extends OldSitableBlock implements Waterloggable {

    public static final EnumProperty<BenchPart> PART = ModProperties.BENCH_BLOCK_PART;

    private static final VoxelShape NORTH_SHAPE_LEFT = Stream.of(
            Block.createCuboidShape(12, 0, 3, 14, 8, 5),
            Block.createCuboidShape(12, 0, 10, 14, 8, 12),
            Block.createCuboidShape(-14, 0, 10, -12, 8, 12),
            Block.createCuboidShape(-14, 0, 3, -12, 8, 5),
            Block.createCuboidShape(-15, 8, 2, 15, 9, 5),
            Block.createCuboidShape(-15, 8, 6, 15, 9, 9),
            Block.createCuboidShape(-15, 8, 10, 15, 9, 13),
            Block.createCuboidShape(-13.5, 6, 5, -12.5, 8, 10),
            Block.createCuboidShape(12.5, 6, 5, 13.5, 8, 10),
            Block.createCuboidShape(-12, 6, 3.5, 12, 8, 4.5),
            Block.createCuboidShape(-12, 6, 10.5, 12, 8, 11.5),
            Stream.of(
                    Block.createCuboidShape(9, 8, 13, 11, 16, 14),
                    Block.createCuboidShape(-11, 8, 13, -9, 16, 14),
                    Block.createCuboidShape(-15, 10, 12, 15, 13, 13),
                    Block.createCuboidShape(-15, 14, 12, 15, 17, 13)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape NORTH_SHAPE_RIGHT = Stream.of(
            Block.createCuboidShape(28, 0, 3, 30, 8, 5),
            Block.createCuboidShape(28, 0, 10, 30, 8, 12),
            Block.createCuboidShape(2, 0, 10, 4, 8, 12),
            Block.createCuboidShape(2, 0, 3, 4, 8, 5),
            Block.createCuboidShape(1, 8, 2, 31, 9, 5),
            Block.createCuboidShape(1, 8, 6, 31, 9, 9),
            Block.createCuboidShape(1, 8, 10, 31, 9, 13),
            Block.createCuboidShape(2.5, 6, 5, 3.5, 8, 10),
            Block.createCuboidShape(28.5, 6, 5, 29.5, 8, 10),
            Block.createCuboidShape(4, 6, 3.5, 28, 8, 4.5),
            Block.createCuboidShape(4, 6, 10.5, 28, 8, 11.5),
            Stream.of(
                    Block.createCuboidShape(25, 8, 13, 27, 16, 14),
                    Block.createCuboidShape(5, 8, 13, 7, 16, 14),
                    Block.createCuboidShape(1, 10, 12, 31, 13, 13),
                    Block.createCuboidShape(1, 14, 12, 31, 17, 13)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape EAST_SHAPE_LEFT = Stream.of(
            Block.createCuboidShape(11, 0, 12, 13, 8, 14),
            Block.createCuboidShape(4, 0, 12, 6, 8, 14),
            Block.createCuboidShape(4, 0, -14, 6, 8, -12),
            Block.createCuboidShape(11, 0, -14, 13, 8, -12),
            Block.createCuboidShape(11, 8, -15, 14, 9, 15),
            Block.createCuboidShape(7, 8, -15, 10, 9, 15),
            Block.createCuboidShape(3, 8, -15, 6, 9, 15),
            Block.createCuboidShape(6, 6, -13.5, 11, 8, -12.5),
            Block.createCuboidShape(6, 6, 12.5, 11, 8, 13.5),
            Block.createCuboidShape(11.5, 6, -12, 12.5, 8, 12),
            Block.createCuboidShape(4.5, 6, -12, 5.5, 8, 12),
            Stream.of(
                    Block.createCuboidShape(2, 8, 9, 3, 16, 11),
                    Block.createCuboidShape(2, 8, -11, 3, 16, -9),
                    Block.createCuboidShape(3, 10, -15, 4, 13, 15),
                    Block.createCuboidShape(3, 14, -15, 4, 17, 15)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape EAST_SHAPE_RIGHT = Stream.of(
            Block.createCuboidShape(11, 0, 28, 13, 8, 30),
            Block.createCuboidShape(4, 0, 28, 6, 8, 30),
            Block.createCuboidShape(4, 0, 2, 6, 8, 4),
            Block.createCuboidShape(11, 0, 2, 13, 8, 4),
            Block.createCuboidShape(11, 8, 1, 14, 9, 31),
            Block.createCuboidShape(7, 8, 1, 10, 9, 31),
            Block.createCuboidShape(3, 8, 1, 6, 9, 31),
            Block.createCuboidShape(6, 6, 2.5, 11, 8, 3.5),
            Block.createCuboidShape(6, 6, 28.5, 11, 8, 29.5),
            Block.createCuboidShape(11.5, 6, 4, 12.5, 8, 28),
            Block.createCuboidShape(4.5, 6, 4, 5.5, 8, 28),
            Stream.of(
                    Block.createCuboidShape(2, 8, 25, 3, 16, 27),
                    Block.createCuboidShape(2, 8, 5, 3, 16, 7),
                    Block.createCuboidShape(3, 10, 1, 4, 13, 31),
                    Block.createCuboidShape(3, 14, 1, 4, 17, 31)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SOUTH_SHAPE_LEFT = Stream.of(
            Block.createCuboidShape(2, 0, 11, 4, 8, 13),
            Block.createCuboidShape(2, 0, 4, 4, 8, 6),
            Block.createCuboidShape(28, 0, 4, 30, 8, 6),
            Block.createCuboidShape(28, 0, 11, 30, 8, 13),
            Block.createCuboidShape(1, 8, 11, 31, 9, 14),
            Block.createCuboidShape(1, 8, 7, 31, 9, 10),
            Block.createCuboidShape(1, 8, 3, 31, 9, 6),
            Block.createCuboidShape(28.5, 6, 6, 29.5, 8, 11),
            Block.createCuboidShape(2.5, 6, 6, 3.5, 8, 11),
            Block.createCuboidShape(4, 6, 11.5, 28, 8, 12.5),
            Block.createCuboidShape(4, 6, 4.5, 28, 8, 5.5),
            Stream.of(
                    Block.createCuboidShape(5, 8, 2, 7, 16, 3),
                    Block.createCuboidShape(25, 8, 2, 27, 16, 3),
                    Block.createCuboidShape(1, 10, 3, 31, 13, 4),
                    Block.createCuboidShape(1, 14, 3, 31, 17, 4)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SOUTH_SHAPE_RIGHT = Stream.of(
            Block.createCuboidShape(-14, 0, 11, -12, 8, 13),
            Block.createCuboidShape(-14, 0, 4, -12, 8, 6),
            Block.createCuboidShape(12, 0, 4, 14, 8, 6),
            Block.createCuboidShape(12, 0, 11, 14, 8, 13),
            Block.createCuboidShape(-15, 8, 11, 15, 9, 14),
            Block.createCuboidShape(-15, 8, 7, 15, 9, 10),
            Block.createCuboidShape(-15, 8, 3, 15, 9, 6),
            Block.createCuboidShape(12.5, 6, 6, 13.5, 8, 11),
            Block.createCuboidShape(-13.5, 6, 6, -12.5, 8, 11),
            Block.createCuboidShape(-12, 6, 11.5, 12, 8, 12.5),
            Block.createCuboidShape(-12, 6, 4.5, 12, 8, 5.5),
            Stream.of(
                    Block.createCuboidShape(-11, 8, 2, -9, 16, 3),
                    Block.createCuboidShape(9, 8, 2, 11, 16, 3),
                    Block.createCuboidShape(-15, 10, 3, 15, 13, 4),
                    Block.createCuboidShape(-15, 14, 3, 15, 17, 4)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape WEST_SHAPE_LEFT = Stream.of(
            Block.createCuboidShape(3, 0, 2, 5, 8, 4),
            Block.createCuboidShape(10, 0, 2, 12, 8, 4),
            Block.createCuboidShape(10, 0, 28, 12, 8, 30),
            Block.createCuboidShape(3, 0, 28, 5, 8, 30),
            Block.createCuboidShape(2, 8, 1, 5, 9, 31),
            Block.createCuboidShape(6, 8, 1, 9, 9, 31),
            Block.createCuboidShape(10, 8, 1, 13, 9, 31),
            Block.createCuboidShape(5, 6, 28.5, 10, 8, 29.5),
            Block.createCuboidShape(5, 6, 2.5, 10, 8, 3.5),
            Block.createCuboidShape(3.5, 6, 4, 4.5, 8, 28),
            Block.createCuboidShape(10.5, 6, 4, 11.5, 8, 28),
            Stream.of(
                    Block.createCuboidShape(13, 8, 5, 14, 16, 7),
                    Block.createCuboidShape(13, 8, 25, 14, 16, 27),
                    Block.createCuboidShape(12, 10, 1, 13, 13, 31),
                    Block.createCuboidShape(12, 14, 1, 13, 17, 31)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape WEST_SHAPE_RIGHT = Stream.of(
            Block.createCuboidShape(3, 0, -14, 5, 8, -12),
            Block.createCuboidShape(10, 0, -14, 12, 8, -12),
            Block.createCuboidShape(10, 0, 12, 12, 8, 14),
            Block.createCuboidShape(3, 0, 12, 5, 8, 14),
            Block.createCuboidShape(2, 8, -15, 5, 9, 15),
            Block.createCuboidShape(6, 8, -15, 9, 9, 15),
            Block.createCuboidShape(10, 8, -15, 13, 9, 15),
            Block.createCuboidShape(5, 6, 12.5, 10, 8, 13.5),
            Block.createCuboidShape(5, 6, -13.5, 10, 8, -12.5),
            Block.createCuboidShape(3.5, 6, -12, 4.5, 8, 12),
            Block.createCuboidShape(10.5, 6, -12, 11.5, 8, 12),
            Stream.of(
                    Block.createCuboidShape(13, 8, -11, 14, 16, -9),
                    Block.createCuboidShape(13, 8, 9, 14, 16, 11),
                    Block.createCuboidShape(12, 10, -15, 13, 13, 15),
                    Block.createCuboidShape(12, 14, -15, 13, 17, 15)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public ParkBenchBlock(AbstractBlock.Settings settings) {
        super(settings, 0.6f);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false).with(PART, BenchPart.LEFT));
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
        BenchPart benchPart = state.get(PART);
        boolean isBenchPartLeft = benchPart == BenchPart.LEFT;

        switch (state.get(FACING)) {
            case NORTH -> {
                return isBenchPartLeft ? NORTH_SHAPE_LEFT : NORTH_SHAPE_RIGHT;
            }
            case SOUTH -> {
                return isBenchPartLeft ? SOUTH_SHAPE_LEFT : SOUTH_SHAPE_RIGHT;
            }
            case EAST -> {
                return isBenchPartLeft ? EAST_SHAPE_LEFT : EAST_SHAPE_RIGHT;
            }
            case WEST -> {
                return isBenchPartLeft ? WEST_SHAPE_LEFT : WEST_SHAPE_RIGHT;
            }
        }
        return NORTH_SHAPE_LEFT;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction,
                                                BlockPos neighborPos, BlockState neighborState, Random random) {
        if (state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        if (direction == getDirectionToOtherBenchHalf(state.get(FACING), state.get(PART)) && (!neighborState.isOf(this) ||
                neighborState.get(PART) == state.get(PART))) {
            return Blocks.AIR.getDefaultState();
        }

        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        World world = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        Direction direction = ctx.getHorizontalPlayerFacing().getOpposite();
        Direction directionToOtherBenchHalf = getDirectionToOtherBenchHalf(direction, BenchPart.LEFT);
        BlockPos blockPosOfOtherBenchPart = blockPos.offset(directionToOtherBenchHalf);

        if (canBlockBePlaced(world, blockPosOfOtherBenchPart, ctx)) {
            FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());

            return this.getDefaultState()
                    .with(FACING, direction)
                    .with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        }

        return null;
    }

    private boolean canBlockBePlaced(World world, BlockPos blockPos, ItemPlacementContext ctx) {
        boolean canSecondBenchPartBePlaced = world.getBlockState(blockPos).canReplace(ctx);
        boolean isSecondBenchPartInWorldBorder = world.getWorldBorder().contains(blockPos);

        return canSecondBenchPartBePlaced && isSecondBenchPartInWorldBorder;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, PART);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);

        if (!world.isClient()) {
            BlockPos blockPos = pos.offset(getDirectionToOtherBenchHalf(state.get(FACING), BenchPart.LEFT));
            world.setBlockState(blockPos, state.with(PART, BenchPart.RIGHT), Block.NOTIFY_ALL);
            world.updateNeighbors(pos, Blocks.AIR);
            state.updateNeighbors(world, pos, Block.NOTIFY_ALL);
        }
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient() && player.isCreative()) {
            BenchPart benchPart = state.get(PART);
            if (benchPart.equals(BenchPart.RIGHT)) {
                breakOtherBenchPart(world, pos, state, player, benchPart);
            }
        }

        return super.onBreak(world, pos, state, player);
    }

    private void breakOtherBenchPart(World world, BlockPos pos, BlockState state, PlayerEntity player, BenchPart benchPart) {
        Direction directionOfOtherBenchHalf = getDirectionToOtherBenchHalf(state.get(FACING), benchPart);
        BlockPos positionOfOtherBenchHalf = pos.offset(directionOfOtherBenchHalf);
        BlockState stateOfOtherBenchHalf = world.getBlockState(positionOfOtherBenchHalf);

        if (stateOfOtherBenchHalf.isOf(this) && stateOfOtherBenchHalf.get(PART) == BenchPart.getOppositeBenchPart(benchPart)) {
            world.setBlockState(positionOfOtherBenchHalf, Blocks.AIR.getDefaultState(), Block.NOTIFY_ALL | Block.SKIP_DROPS);
            world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, positionOfOtherBenchHalf, Block.getRawIdFromState(stateOfOtherBenchHalf));
        }
    }

    private Direction getDirectionToOtherBenchHalf(Direction direction, BenchPart benchPart) {
        Direction directionOfRightBenchHalf;
        boolean isBenchPartLeftHalf = benchPart.equals(BenchPart.LEFT);

        switch (direction) {
            case NORTH -> directionOfRightBenchHalf = WEST;
            case SOUTH -> directionOfRightBenchHalf = EAST;
            case WEST -> directionOfRightBenchHalf = SOUTH;
            default -> directionOfRightBenchHalf = NORTH;
        }

        return isBenchPartLeftHalf ? directionOfRightBenchHalf : directionOfRightBenchHalf.getOpposite();
    }
}
