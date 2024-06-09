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

public class BarrelSeatBlock extends SitableBlock implements Waterloggable {

    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    private static final VoxelShape SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Stream.of(
                    Block.createCuboidShape(4, 10, 14, 12, 12, 14.5),
                    Block.createCuboidShape(12, 10, 12, 12.5, 12, 14),
                    Block.createCuboidShape(3.5, 10, 12, 4, 12, 14),
                    Block.createCuboidShape(12.5, 10, 12, 14, 12, 12.5),
                    Block.createCuboidShape(1.5, 10, 12, 3.5, 12, 12.5),
                    Block.createCuboidShape(2, 10, 3.5, 3.5, 12, 4),
                    Block.createCuboidShape(3.5, 10, 2, 4, 12, 4),
                    Block.createCuboidShape(4, 10, 1.5, 12, 12, 2),
                    Block.createCuboidShape(12, 10, 2, 12.5, 12, 4),
                    Block.createCuboidShape(12.5, 10, 3.5, 14.5, 12, 4),
                    Block.createCuboidShape(14, 10, 4, 14.5, 12, 12),
                    Block.createCuboidShape(1.5, 10, 4, 2, 12, 12)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            Stream.of(
                    Block.createCuboidShape(4, 6, 14, 12, 8, 14.5),
                    Block.createCuboidShape(12, 6, 12, 12.5, 8, 14),
                    Block.createCuboidShape(3.5, 6, 12, 4, 8, 14),
                    Block.createCuboidShape(12.5, 6, 12, 14, 8, 12.5),
                    Block.createCuboidShape(1.5, 6, 12, 3.5, 8, 12.5),
                    Block.createCuboidShape(2, 6, 3.5, 3.5, 8, 4),
                    Block.createCuboidShape(3.5, 6, 2, 4, 8, 4),
                    Block.createCuboidShape(4, 6, 1.5, 12, 8, 2),
                    Block.createCuboidShape(12, 6, 2, 12.5, 8, 4),
                    Block.createCuboidShape(12.5, 6, 3.5, 14.5, 8, 4),
                    Block.createCuboidShape(14, 6, 4, 14.5, 8, 12),
                    Block.createCuboidShape(1.5, 6, 4, 2, 8, 12)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            Stream.of(
                    Block.createCuboidShape(4, 2, 14, 12, 4, 14.5),
                    Block.createCuboidShape(12, 2, 12, 12.5, 4, 14),
                    Block.createCuboidShape(3.5, 2, 12, 4, 4, 14),
                    Block.createCuboidShape(12.5, 2, 12, 14, 4, 12.5),
                    Block.createCuboidShape(1.5, 2, 12, 3.5, 4, 12.5),
                    Block.createCuboidShape(2, 2, 3.5, 3.5, 4, 4),
                    Block.createCuboidShape(3.5, 2, 2, 4, 4, 4),
                    Block.createCuboidShape(4, 2, 1.5, 12, 4, 2),
                    Block.createCuboidShape(12, 2, 2, 12.5, 4, 4),
                    Block.createCuboidShape(12.5, 2, 3.5, 14.5, 4, 4),
                    Block.createCuboidShape(14, 2, 4, 14.5, 4, 12),
                    Block.createCuboidShape(1.5, 2, 4, 2, 4, 12)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            Stream.of(
                    Block.createCuboidShape(3, 13, 4, 4, 14, 12),
                    Block.createCuboidShape(12, 13, 4, 13, 14, 12),
                    Block.createCuboidShape(4, 13, 3, 12, 14, 4),
                    Block.createCuboidShape(4, 13, 12, 12, 14, 13)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            Stream.of(
                    Block.createCuboidShape(12, 0, 4, 13, 1, 12),
                    Block.createCuboidShape(4, 0, 3, 12, 1, 4),
                    Block.createCuboidShape(4, 0, 12, 12, 1, 13),
                    Block.createCuboidShape(3, 0, 4, 4, 1, 12)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(), Stream.of(
            Block.createCuboidShape(4, 1, 2, 12, 13, 4),
            Block.createCuboidShape(12, 1, 4, 14, 13, 12),
            Block.createCuboidShape(2, 1, 4, 4, 13, 12),
            Block.createCuboidShape(4, 1, 12, 12, 13, 14),
            Block.createCuboidShape(4, 0, 4, 12, 13, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(), BooleanBiFunction.OR);

    public BarrelSeatBlock(Settings settings) {
        super(settings, 0.8f);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
       return SHAPE;
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
