package com.nemonotfound.nemos.carpentry.block.tables;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class TableBlock extends Block {

    public TableBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter blockGetter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        VoxelShape tableLegShape = Block.box(6.0f, 0f, 6.0f, 10.0f, 14.0f, 10.0f);
        VoxelShape tablePlateShape = Block.box(0f, 14.0f, 0f, 16.0f, 16.0f, 16.0f);

        return Shapes.or(tableLegShape, tablePlateShape);
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.MODEL;
    }
}
