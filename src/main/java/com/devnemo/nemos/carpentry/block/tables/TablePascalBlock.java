package com.devnemo.nemos.carpentry.block.tables;

import net.minecraft.block.Block;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class TablePascalBlock extends RotatableTableBlock {

    private static final VoxelShape NORTH_SHAPE = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(0, 7, 0, 16, 8, 16), Stream.of(
            Block.createCuboidShape(14, 0, 13, 15, 7, 15),
            Block.createCuboidShape(2, 0, 13, 14, 1, 15),
            Block.createCuboidShape(1, 0, 13, 2, 7, 15),
            Block.createCuboidShape(14, 0, 1, 15, 7, 3),
            Block.createCuboidShape(2, 0, 1, 14, 1, 3),
            Block.createCuboidShape(1, 0, 1, 2, 7, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(), BooleanBiFunction.OR);
    private static final VoxelShape EAST_SHAPE = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(0, 7, 0, 16, 8, 16), Stream.of(
            Block.createCuboidShape(1, 0, 14, 3, 7, 15),
            Block.createCuboidShape(1, 0, 2, 3, 1, 14),
            Block.createCuboidShape(1, 0, 1, 3, 7, 2),
            Block.createCuboidShape(13, 0, 14, 15, 7, 15),
            Block.createCuboidShape(13, 0, 2, 15, 1, 14),
            Block.createCuboidShape(13, 0, 1, 15, 7, 2)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(), BooleanBiFunction.OR);
    private static final VoxelShape SOUTH_SHAPE = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(0, 7, 0, 16, 8, 16), Stream.of(
            Block.createCuboidShape(1, 0, 1, 2, 7, 3),
            Block.createCuboidShape(2, 0, 1, 14, 1, 3),
            Block.createCuboidShape(14, 0, 1, 15, 7, 3),
            Block.createCuboidShape(1, 0, 13, 2, 7, 15),
            Block.createCuboidShape(2, 0, 13, 14, 1, 15),
            Block.createCuboidShape(14, 0, 13, 15, 7, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(), BooleanBiFunction.OR);
    private static final VoxelShape WEST_SHAPE = VoxelShapes.combineAndSimplify(
            Block.createCuboidShape(0, 7, 0, 16, 8, 16), Stream.of(
            Block.createCuboidShape(13, 0, 1, 15, 7, 2),
            Block.createCuboidShape(13, 0, 2, 15, 1, 14),
            Block.createCuboidShape(13, 0, 14, 15, 7, 15),
            Block.createCuboidShape(1, 0, 1, 3, 7, 2),
            Block.createCuboidShape(1, 0, 2, 3, 1, 14),
            Block.createCuboidShape(1, 0, 14, 3, 7, 15)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(), BooleanBiFunction.OR);

    public TablePascalBlock(Settings settings) {
        super(settings, NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
    }
}
