package com.nemonotfound.nemoscarpentry.block;

import com.nemonotfound.nemoscarpentry.block.enums.ChairPart;
import com.nemonotfound.nemoscarpentry.property.ModProperties;
import net.minecraft.block.Block;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.Waterloggable;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import java.util.stream.Stream;

public class LukasChairBlock extends MultipleBlockChair implements Waterloggable {

    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    public static final EnumProperty<ChairPart> PART = ModProperties.CHAIR_PART;

    private static final VoxelShape NORTH_SHAPE = Stream.of(
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Stream.of(
                    Block.createCuboidShape(1, 7, 1, 15, 9, 15),
                    Block.createCuboidShape(3, 19, 13.5, 13, 21, 14.5),
                    Block.createCuboidShape(3, 13, 13.5, 13, 15, 14.5),
                    Block.createCuboidShape(13, 9, 13, 15, 16, 15),
                    Block.createCuboidShape(13, 16, 13, 15, 23, 15),
                    Block.createCuboidShape(1, 9, 13, 3, 16, 15),
                    Block.createCuboidShape(1, 16, 13, 3, 23, 15)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape EAST_SHAPE = Stream.of(
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Stream.of(
                    Block.createCuboidShape(1, 7, 1, 15, 9, 15),
                    Block.createCuboidShape(1.5, 19, 3, 2.5, 21, 13),
                    Block.createCuboidShape(1.5, 13, 3, 2.5, 15, 13),
                    Block.createCuboidShape(1, 9, 13, 3, 16, 15),
                    Block.createCuboidShape(1, 16, 13, 3, 23, 15),
                    Block.createCuboidShape(1, 9, 1, 3, 16, 3),
                    Block.createCuboidShape(1, 16, 1, 3, 23, 3)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape SOUTH_SHAPE = Stream.of(
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Stream.of(
                    Block.createCuboidShape(1, 7, 1, 15, 9, 15),
                    Block.createCuboidShape(3, 19, 1.5, 13, 21, 2.5),
                    Block.createCuboidShape(3, 13, 1.5, 13, 15, 2.5),
                    Block.createCuboidShape(1, 9, 1, 3, 16, 3),
                    Block.createCuboidShape(1, 16, 1, 3, 23, 3),
                    Block.createCuboidShape(13, 9, 1, 15, 16, 3),
                    Block.createCuboidShape(13, 16, 1, 15, 23, 3)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();
    private static final VoxelShape WEST_SHAPE = Stream.of(
            Block.createCuboidShape(12, 0, 2, 14, 7, 4),
            Block.createCuboidShape(2, 0, 12, 4, 7, 14),
            Block.createCuboidShape(12, 0, 12, 14, 7, 14),
            Block.createCuboidShape(2, 0, 2, 4, 7, 4),
            Stream.of(
                    Block.createCuboidShape(1, 7, 1, 15, 9, 15),
                    Block.createCuboidShape(13.5, 19, 3, 14.5, 21, 13),
                    Block.createCuboidShape(13.5, 13, 3, 14.5, 15, 13),
                    Block.createCuboidShape(13, 9, 1, 15, 16, 3),
                    Block.createCuboidShape(13, 16, 1, 15, 23, 3),
                    Block.createCuboidShape(13, 9, 13, 15, 16, 15),
                    Block.createCuboidShape(13, 16, 13, 15, 23, 15)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get()
).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    protected LukasChairBlock(Settings settings) {
        super(settings, 0.58f, NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH)
                .with(WATERLOGGED, false).with(PART, ChairPart.LOWER));
    }
}
