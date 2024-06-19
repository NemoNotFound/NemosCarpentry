package com.nemonotfound.nemoscarpentry.block.seats;

import com.nemonotfound.nemoscarpentry.block.seats.parents.MultipleBlockChair;
import net.minecraft.block.Block;
import net.minecraft.block.Waterloggable;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class PascalChairBlock extends MultipleBlockChair implements Waterloggable {

    private static final VoxelShape NORTH_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.createCuboidShape(12, 0, 3, 14, 1, 13),
            Block.createCuboidShape(12, 0, 13, 14, 6, 14),
            Block.createCuboidShape(2, 0, 2, 4, 6, 3),
            Block.createCuboidShape(2, 0, 3, 4, 1, 13),
            Block.createCuboidShape(2, 0, 13, 4, 6, 14),
            Block.createCuboidShape(12, 0, 2, 14, 6, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 6, 1, 15, 7, 15),
                    Block.createCuboidShape(1, 7, 14, 15, 21, 15), BooleanBiFunction.OR), BooleanBiFunction.OR);
    private static final VoxelShape EAST_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.createCuboidShape(3, 0, 12, 13, 1, 14),
            Block.createCuboidShape(2, 0, 12, 3, 6, 14),
            Block.createCuboidShape(13, 0, 2, 14, 6, 4),
            Block.createCuboidShape(3, 0, 2, 13, 1, 4),
            Block.createCuboidShape(2, 0, 2, 3, 6, 4),
            Block.createCuboidShape(13, 0, 12, 14, 6, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 6, 1, 15, 7, 15),
                    Block.createCuboidShape(1, 7, 1, 2, 21, 15), BooleanBiFunction.OR), BooleanBiFunction.OR);
    private static final VoxelShape SOUTH_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.createCuboidShape(2, 0, 3, 4, 1, 13),
            Block.createCuboidShape(2, 0, 2, 4, 6, 3),
            Block.createCuboidShape(12, 0, 13, 14, 6, 14),
            Block.createCuboidShape(12, 0, 3, 14, 1, 13),
            Block.createCuboidShape(12, 0, 2, 14, 6, 3),
            Block.createCuboidShape(2, 0, 13, 4, 6, 14)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 6, 1, 15, 7, 15),
                    Block.createCuboidShape(1, 7, 1, 15, 21, 2), BooleanBiFunction.OR), BooleanBiFunction.OR);
    private static final VoxelShape WEST_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.createCuboidShape(3, 0, 2, 13, 1, 4),
            Block.createCuboidShape(13, 0, 2, 14, 6, 4),
            Block.createCuboidShape(2, 0, 12, 3, 6, 14),
            Block.createCuboidShape(3, 0, 12, 13, 1, 14),
            Block.createCuboidShape(13, 0, 12, 14, 6, 14),
            Block.createCuboidShape(2, 0, 2, 3, 6, 4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 6, 1, 15, 7, 15),
                    Block.createCuboidShape(14, 7, 1, 15, 21, 15), BooleanBiFunction.OR), BooleanBiFunction.OR);

    public PascalChairBlock(Settings settings) {
        super(settings, 0.46f, NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
    }
}
