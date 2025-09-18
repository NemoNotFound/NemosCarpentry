package com.devnemo.nemos.carpentry.block.tables;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class CoffeeTableBlock extends Block {

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(4, 3, 2.5, 12, 5, 3.5),
            Block.createCuboidShape(4, 3, 12.5, 12, 5, 13.5),
            Block.createCuboidShape(2.5, 3, 4, 3.5, 5, 12),
            Block.createCuboidShape(12.5, 3, 4, 13.5, 5, 12),
            Block.createCuboidShape(1, 7, 1, 15, 9, 15)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public CoffeeTableBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
