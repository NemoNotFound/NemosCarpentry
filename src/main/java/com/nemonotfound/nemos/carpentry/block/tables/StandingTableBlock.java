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

public class StandingTableBlock extends Block {

    public StandingTableBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter blockGetter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return Shapes.join(Stream.of(
                Block.box(13, 14, 12, 15, 16, 13),
                Block.box(2, 14, 6, 14, 16, 9),
                Block.box(2, 14, 10, 14, 16, 12),
                Block.box(2, 14, 9, 14, 16, 10),
                Block.box(2, 14, 4, 14, 16, 6),
                Block.box(4, 14, 2, 12, 16, 4),
                Block.box(4, 14, 12, 12, 16, 14),
                Block.box(4, 14, 1, 12, 16, 2),
                Block.box(14, 14, 4, 15, 16, 12),
                Block.box(1, 14, 4, 2, 16, 12),
                Block.box(4, 14, 14, 12, 16, 15),
                Block.box(3, 14, 1, 4, 16, 4),
                Block.box(1, 14, 3, 3, 16, 4),
                Block.box(1, 14, 12, 4, 16, 13),
                Block.box(3, 14, 13, 4, 16, 15),
                Block.box(12, 14, 3, 15, 16, 4),
                Block.box(12, 14, 1, 13, 16, 3),
                Block.box(12, 14, 12, 13, 16, 15)
        ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get(),
                Shapes.join(Block.box(6, 1, 6, 10, 14, 10),
                        Block.box(5, 0, 5, 11, 1, 11), BooleanOp.OR), BooleanOp.OR);
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.MODEL;
    }
}
