package com.nemonotfound.nemos.carpentry.block.tables;

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

public class StandingTableBlock extends Block {

    public StandingTableBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.combineAndSimplify(Stream.of(
                Block.createCuboidShape(13, 14, 12, 15, 16, 13),
                Block.createCuboidShape(2, 14, 6, 14, 16, 9),
                Block.createCuboidShape(2, 14, 10, 14, 16, 12),
                Block.createCuboidShape(2, 14, 9, 14, 16, 10),
                Block.createCuboidShape(2, 14, 4, 14, 16, 6),
                Block.createCuboidShape(4, 14, 2, 12, 16, 4),
                Block.createCuboidShape(4, 14, 12, 12, 16, 14),
                Block.createCuboidShape(4, 14, 1, 12, 16, 2),
                Block.createCuboidShape(14, 14, 4, 15, 16, 12),
                Block.createCuboidShape(1, 14, 4, 2, 16, 12),
                Block.createCuboidShape(4, 14, 14, 12, 16, 15),
                Block.createCuboidShape(3, 14, 1, 4, 16, 4),
                Block.createCuboidShape(1, 14, 3, 3, 16, 4),
                Block.createCuboidShape(1, 14, 12, 4, 16, 13),
                Block.createCuboidShape(3, 14, 13, 4, 16, 15),
                Block.createCuboidShape(12, 14, 3, 15, 16, 4),
                Block.createCuboidShape(12, 14, 1, 13, 16, 3),
                Block.createCuboidShape(12, 14, 12, 13, 16, 15)
        ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
                VoxelShapes.combineAndSimplify(Block.createCuboidShape(6, 1, 6, 10, 14, 10),
                        Block.createCuboidShape(5, 0, 5, 11, 1, 11), BooleanBiFunction.OR), BooleanBiFunction.OR);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
