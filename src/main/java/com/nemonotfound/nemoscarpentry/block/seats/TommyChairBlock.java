package com.nemonotfound.nemoscarpentry.block.seats;

import com.nemonotfound.nemoscarpentry.block.seats.parents.MultipleBlockChair;
import net.minecraft.block.Block;
import net.minecraft.block.Waterloggable;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class TommyChairBlock extends MultipleBlockChair implements Waterloggable {

    private static final VoxelShape NORTH_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 7, 1, 15, 9, 15),
                    Block.createCuboidShape(1, 9, 13, 15, 23, 15),
                    BooleanBiFunction.OR), BooleanBiFunction.OR);
    private static final VoxelShape EAST_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
                    Block.createCuboidShape(12, 0, 2, 14, 7, 4),
                    Block.createCuboidShape(2, 0, 2, 4, 7, 4),
                    Block.createCuboidShape(2, 0, 12, 4, 7, 14),
                    Block.createCuboidShape(12, 0, 12, 14, 7, 14)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 7, 1, 15, 9, 15),
                    Block.createCuboidShape(1, 9, 1, 3, 23, 15),
                    BooleanBiFunction.OR), BooleanBiFunction.OR);
    private static final VoxelShape SOUTH_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
                    Block.createCuboidShape(12, 0, 12, 14, 7, 14),
                    Block.createCuboidShape(12, 0, 2, 14, 7, 4),
                    Block.createCuboidShape(2, 0, 2, 4, 7, 4),
                    Block.createCuboidShape(2, 0, 12, 4, 7, 14)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 7, 1, 15, 9, 15),
                    Block.createCuboidShape(1, 9, 1, 15, 23, 3),
                    BooleanBiFunction.OR), BooleanBiFunction.OR);
    private static final VoxelShape WEST_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
                    Block.createCuboidShape(2, 0, 12, 4, 7, 14),
                    Block.createCuboidShape(12, 0, 12, 14, 7, 14),
                    Block.createCuboidShape(12, 0, 2, 14, 7, 4),
                    Block.createCuboidShape(2, 0, 2, 4, 7, 4)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 7, 1, 15, 9, 15),
                    Block.createCuboidShape(13, 9, 1, 15, 23, 15),
                    BooleanBiFunction.OR), BooleanBiFunction.OR);

    public TommyChairBlock(Settings settings) {
        super(settings, 0.33f, NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
    }
}
