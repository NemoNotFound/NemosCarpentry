package com.nemonotfound.nemoscarpentry.block.seats;


import net.minecraft.block.Block;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.Waterloggable;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class ChairBlock extends SitableBlock implements Waterloggable {

    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    private static final VoxelShape SOUTH_SHAPE = VoxelShapes.union(Block.createCuboidShape(1, 6, 1, 15, 8, 15),
            Block.createCuboidShape(1, 8, 1, 15, 16, 3),
            Block.createCuboidShape(12, 0, 12, 14, 6, 14),
            Block.createCuboidShape(2, 0, 12, 4, 6, 14),
            Block.createCuboidShape(2, 0, 2, 4, 6, 4),
            Block.createCuboidShape(12, 0, 2, 14, 6, 4));
    private static final VoxelShape WEST_SHAPE = VoxelShapes.union(Block.createCuboidShape(1, 6, 1, 15, 8, 15),
            Block.createCuboidShape(13, 8, 1, 15, 16, 15),
            Block.createCuboidShape(2, 0, 12, 4, 6, 14),
            Block.createCuboidShape(2, 0, 2, 4, 6, 4),
            Block.createCuboidShape(12, 0, 2, 14, 6, 4),
            Block.createCuboidShape(12, 0, 12, 14, 6, 14));
    private static final VoxelShape NORTH_SHAPE = VoxelShapes.union(Block.createCuboidShape(1, 6, 1, 15, 8, 15),
            Block.createCuboidShape(1, 8, 13, 15, 16, 15),
            Block.createCuboidShape(2, 0, 2, 4, 6, 4),
            Block.createCuboidShape(12, 0, 2, 14, 6, 4),
            Block.createCuboidShape(12, 0, 12, 14, 6, 14),
            Block.createCuboidShape(2, 0, 12, 4, 6, 14));
    private static final VoxelShape EAST_SHAPE = VoxelShapes.union(Block.createCuboidShape(1, 6, 1, 15, 8, 15),
            Block.createCuboidShape(1, 8, 1, 3, 16, 15),
            Block.createCuboidShape(12, 0, 2, 14, 6, 4),
            Block.createCuboidShape(12, 0, 12, 14, 6, 14),
            Block.createCuboidShape(2, 0, 12, 4, 6, 14),
            Block.createCuboidShape(2, 0, 2, 4, 6, 4));

    public ChairBlock(Settings settings) {
        super(settings, 0.5f, NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }
}
