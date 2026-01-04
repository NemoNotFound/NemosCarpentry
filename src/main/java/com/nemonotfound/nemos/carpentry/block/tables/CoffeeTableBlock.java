package com.nemonotfound.nemos.carpentry.block.tables;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public class CoffeeTableBlock extends Block {

    private static final VoxelShape SHAPE = Stream.of(
            Block.box(2, 0, 12, 4, 7, 14),
            Block.box(12, 0, 12, 14, 7, 14),
            Block.box(12, 0, 2, 14, 7, 4),
            Block.box(2, 0, 2, 4, 7, 4),
            Block.box(4, 3, 2.5, 12, 5, 3.5),
            Block.box(4, 3, 12.5, 12, 5, 13.5),
            Block.box(2.5, 3, 4, 3.5, 5, 12),
            Block.box(12.5, 3, 4, 13.5, 5, 12),
            Block.box(1, 7, 1, 15, 9, 15)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public CoffeeTableBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter blockGetter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return SHAPE;
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.MODEL;
    }
}
