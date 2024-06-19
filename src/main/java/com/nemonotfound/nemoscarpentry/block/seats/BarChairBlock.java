package com.nemonotfound.nemoscarpentry.block.seats;

import com.nemonotfound.nemoscarpentry.block.seats.parents.SitableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Waterloggable;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class BarChairBlock extends SitableBlock implements Waterloggable {

    private static final VoxelShape NORTH_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.createCuboidShape(4, 0, 5, 5, 1, 11),
            Block.createCuboidShape(5, 8, 5, 11, 9, 11),
            Block.createCuboidShape(7, 2, 7, 9, 8, 9),
            Block.createCuboidShape(5, 0, 5, 11, 2, 11),
            Block.createCuboidShape(5, 0, 4, 11, 1, 5),
            Block.createCuboidShape(11, 0, 5, 12, 1, 11),
            Block.createCuboidShape(5, 0, 11, 11, 1, 12)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(3, 9, 3, 13, 11, 13),
                    Block.createCuboidShape(3, 11, 11, 13, 16, 13), BooleanBiFunction.OR), BooleanBiFunction.OR);
    private static final VoxelShape EAST_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.createCuboidShape(5, 0, 4, 11, 1, 5),
            Block.createCuboidShape(5, 8, 5, 11, 9, 11),
            Block.createCuboidShape(7, 2, 7, 9, 8, 9),
            Block.createCuboidShape(5, 0, 5, 11, 2, 11),
            Block.createCuboidShape(11, 0, 5, 12, 1, 11),
            Block.createCuboidShape(5, 0, 11, 11, 1, 12),
            Block.createCuboidShape(4, 0, 5, 5, 1, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(3, 9, 3, 13, 11, 13),
                    Block.createCuboidShape(3, 11, 3, 5, 16, 13), BooleanBiFunction.OR), BooleanBiFunction.OR);
    private static final VoxelShape SOUTH_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.createCuboidShape(11, 0, 5, 12, 1, 11),
            Block.createCuboidShape(5, 8, 5, 11, 9, 11),
            Block.createCuboidShape(7, 2, 7, 9, 8, 9),
            Block.createCuboidShape(5, 0, 5, 11, 2, 11),
            Block.createCuboidShape(5, 0, 11, 11, 1, 12),
            Block.createCuboidShape(4, 0, 5, 5, 1, 11),
            Block.createCuboidShape(5, 0, 4, 11, 1, 5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(3, 9, 3, 13, 11, 13),
                    Block.createCuboidShape(3, 11, 3, 13, 16, 5), BooleanBiFunction.OR), BooleanBiFunction.OR);
    private static final VoxelShape WEST_SHAPE = VoxelShapes.combineAndSimplify(Stream.of(
            Block.createCuboidShape(5, 0, 11, 11, 1, 12),
            Block.createCuboidShape(5, 8, 5, 11, 9, 11),
            Block.createCuboidShape(7, 2, 7, 9, 8, 9),
            Block.createCuboidShape(5, 0, 5, 11, 2, 11),
            Block.createCuboidShape(4, 0, 5, 5, 1, 11),
            Block.createCuboidShape(5, 0, 4, 11, 1, 5),
            Block.createCuboidShape(11, 0, 5, 12, 1, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(3, 9, 3, 13, 11, 13),
                    Block.createCuboidShape(11, 11, 3, 13, 16, 13), BooleanBiFunction.OR), BooleanBiFunction.OR);

    public BarChairBlock(Settings settings) {
        super(settings, 0.7f, NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
    }
}
