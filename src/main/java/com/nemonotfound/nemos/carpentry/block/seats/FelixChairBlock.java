package com.nemonotfound.nemos.carpentry.block.seats;

import com.nemonotfound.nemos.carpentry.block.seats.parents.SitableBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Waterloggable;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class FelixChairBlock extends SitableBlock implements Waterloggable {

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
        super(settings, 0.4f, NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }
}
