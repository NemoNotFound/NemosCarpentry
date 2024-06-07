package com.nemonotfound.nemoscarpentry.block.seats;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import java.util.stream.Stream;

public class FelixChairBlock extends SitableBlock implements Waterloggable {

    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;

    private static final VoxelShape NORTH_SHAPE = Stream.of(
            Block.createCuboidShape(13, 7, 13, 15, 16, 15),
            Block.createCuboidShape(1, 7, 13, 3, 16, 15),
            Block.createCuboidShape(1, 5, 1, 15, 7, 15),
            Block.createCuboidShape(12, 0, 12, 14, 5, 14),
            Block.createCuboidShape(2, 0, 12, 4, 5, 14),
            Block.createCuboidShape(2, 0, 2, 4, 5, 4),
            Block.createCuboidShape(12, 0, 2, 14, 5, 4),
            Block.createCuboidShape(4, 2, 2.5, 12, 4, 3.5),
            Block.createCuboidShape(4, 2, 12.5, 12, 4, 13.5),
            Block.createCuboidShape(3, 13, 13.5, 13, 15, 14.5),
            Block.createCuboidShape(3, 9, 13.5, 13, 11, 14.5),
            Block.createCuboidShape(2.5, 2, 4, 3.5, 4, 12),
            Block.createCuboidShape(12.5, 2, 4, 13.5, 4, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape EAST_SHAPE = Stream.of(
            Block.createCuboidShape(1, 7, 13, 3, 16, 15),
            Block.createCuboidShape(1, 7, 1, 3, 16, 3),
            Block.createCuboidShape(1, 5, 1, 15, 7, 15),
            Block.createCuboidShape(2, 0, 12, 4, 5, 14),
            Block.createCuboidShape(2, 0, 2, 4, 5, 4),
            Block.createCuboidShape(12, 0, 2, 14, 5, 4),
            Block.createCuboidShape(12, 0, 12, 14, 5, 14),
            Block.createCuboidShape(12.5, 2, 4, 13.5, 4, 12),
            Block.createCuboidShape(2.5, 2, 4, 3.5, 4, 12),
            Block.createCuboidShape(1.5, 13, 3, 2.5, 15, 13),
            Block.createCuboidShape(1.5, 9, 3, 2.5, 11, 13),
            Block.createCuboidShape(4, 2, 2.5, 12, 4, 3.5),
            Block.createCuboidShape(4, 2, 12.5, 12, 4, 13.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SOUTH_SHAPE = Stream.of(
            Block.createCuboidShape(1, 7, 1, 3, 16, 3),
            Block.createCuboidShape(13, 7, 1, 15, 16, 3),
            Block.createCuboidShape(1, 5, 1, 15, 7, 15),
            Block.createCuboidShape(2, 0, 2, 4, 5, 4),
            Block.createCuboidShape(12, 0, 2, 14, 5, 4),
            Block.createCuboidShape(12, 0, 12, 14, 5, 14),
            Block.createCuboidShape(2, 0, 12, 4, 5, 14),
            Block.createCuboidShape(4, 2, 12.5, 12, 4, 13.5),
            Block.createCuboidShape(4, 2, 2.5, 12, 4, 3.5),
            Block.createCuboidShape(3, 13, 1.5, 13, 15, 2.5),
            Block.createCuboidShape(3, 9, 1.5, 13, 11, 2.5),
            Block.createCuboidShape(12.5, 2, 4, 13.5, 4, 12),
            Block.createCuboidShape(2.5, 2, 4, 3.5, 4, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape WEST_SHAPE = Stream.of(
            Block.createCuboidShape(13, 7, 1, 15, 16, 3),
            Block.createCuboidShape(13, 7, 13, 15, 16, 15),
            Block.createCuboidShape(1, 5, 1, 15, 7, 15),
            Block.createCuboidShape(12, 0, 2, 14, 5, 4),
            Block.createCuboidShape(12, 0, 12, 14, 5, 14),
            Block.createCuboidShape(2, 0, 12, 4, 5, 14),
            Block.createCuboidShape(2, 0, 2, 4, 5, 4),
            Block.createCuboidShape(2.5, 2, 4, 3.5, 4, 12),
            Block.createCuboidShape(12.5, 2, 4, 13.5, 4, 12),
            Block.createCuboidShape(13.5, 13, 3, 14.5, 15, 13),
            Block.createCuboidShape(13.5, 9, 3, 14.5, 11, 13),
            Block.createCuboidShape(4, 2, 12.5, 12, 4, 13.5),
            Block.createCuboidShape(4, 2, 2.5, 12, 4, 3.5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public FelixChairBlock(AbstractBlock.Settings settings) {
        super(settings, 0.4f);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH -> {
                return NORTH_SHAPE;
            }
            case SOUTH -> {
                return SOUTH_SHAPE;
            }
            case EAST -> {
                return EAST_SHAPE;
            }
            case WEST -> {
                return WEST_SHAPE;
            }
        }
        return NORTH_SHAPE;
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
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite()).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
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
        builder.add(FACING, WATERLOGGED);
    }
}
