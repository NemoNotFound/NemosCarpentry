package com.nemonotfound.nemos.carpentry.block.seats.parents;

import com.nemonotfound.nemos.carpentry.block.enums.ChairPart;
import com.nemonotfound.nemos.carpentry.property.CarpentryBlockStateProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.core.Direction.DOWN;
import static net.minecraft.core.Direction.UP;

public abstract class MultipleBlockChair extends SitableBlock implements SimpleWaterloggedBlock {

    private final VoxelShape northShape;
    private final VoxelShape eastShape;
    private final VoxelShape southShape;
    private final VoxelShape westShape;
    private static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<ChairPart> PART = CarpentryBlockStateProperties.CHAIR_PART;

    protected MultipleBlockChair(BlockBehaviour.Properties properties, float height, VoxelShape northShape, VoxelShape eastShape,
                                 VoxelShape southShape, VoxelShape westShape) {
        super(properties, height, northShape, eastShape, southShape, westShape);
        this.northShape = northShape;
        this.eastShape = eastShape;
        this.southShape = southShape;
        this.westShape = westShape;
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false)
                .setValue(PART, ChairPart.LOWER));
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter blockGetter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return getShapeIndex(state);
    }

    @Override
    public @NotNull VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter blockGetter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return getShapeIndex(state);
    }

    private VoxelShape getShapeIndex(BlockState state) {
        ChairPart chairPart = state.getValue(PART);
        boolean isLowerChairPart = chairPart == ChairPart.LOWER;

        switch (state.getValue(FACING)) {
            case NORTH -> {
                return isLowerChairPart ? northShape : northShape.move(0, -1, 0);
            }
            case SOUTH -> {
                return isLowerChairPart ? southShape : southShape.move(0, -1, 0);
            }
            case EAST -> {
                return isLowerChairPart ? eastShape : eastShape.move(0, -1, 0);
            }
            case WEST -> {
                return isLowerChairPart ? westShape : westShape.move(0, -1, 0);
            }
        }

        return northShape;
    }

    @Override
    public @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        if (state.getValue(PART) == ChairPart.UPPER) {
            return super.useWithoutItem(state, level, pos.relative(DOWN), player, hitResult);
        }

        return super.useWithoutItem(state, level, pos, player, hitResult);
    }

    @Override
    public @NotNull BlockState updateShape(
            BlockState state,
            @NotNull LevelReader levelReader,
            @NotNull ScheduledTickAccess scheduledTickAccess,
            @NotNull BlockPos pos,
            @NotNull Direction direction,
            @NotNull BlockPos neighborPos,
            @NotNull BlockState neighborState,
            @NotNull RandomSource random
    ) {
        if (state.getValue(WATERLOGGED)) {
            scheduledTickAccess.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(levelReader));
        }

        if (direction == getDirectionToOtherChairHalf(state.getValue(PART)) && (!neighborState.is(this) || neighborState.getValue(PART) == state.getValue(PART))) {
            return Blocks.AIR.defaultBlockState();
        }

        return super.updateShape(state, levelReader, scheduledTickAccess, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState state) {
        return state.getValue(PART) == ChairPart.LOWER ? RenderShape.MODEL : RenderShape.INVISIBLE;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        Direction direction = context.getHorizontalDirection().getOpposite();
        BlockPos blockPosOfOtherChairPart = blockPos.relative(UP);

        if (canBlockBePlaced(level, blockPosOfOtherChairPart, context)) {
            FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());

            return this.defaultBlockState()
                    .setValue(FACING, direction)
                    .setValue(PART, ChairPart.LOWER)
                    .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        }

        return null;
    }

    private boolean canBlockBePlaced(Level level, BlockPos blockPos, BlockPlaceContext ctx) {
        boolean canSecondChairPartBePlaced = level.getBlockState(blockPos).canBeReplaced(ctx);
        boolean isSecondChairPartInWorldBorder = level.getWorldBorder().isWithinBounds(blockPos);

        return canSecondChairPartBePlaced && isSecondChairPartInWorldBorder;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, @NotNull BlockState> builder) {
        builder.add(FACING, WATERLOGGED, PART);
    }

    @Override
    public void setPlacedBy(
            @NotNull Level level,
            @NotNull BlockPos pos,
            @NotNull BlockState state,
            LivingEntity placer,
            @NotNull ItemStack itemStack
    ) {
        super.setPlacedBy(level, pos, state, placer, itemStack);

        if (!level.isClientSide()) {
            BlockPos blockPos = pos.relative(UP);
            level.setBlock(blockPos, getNewBlockState(level, blockPos, state), Block.UPDATE_ALL);
            level.updateNeighborsAt(pos, Blocks.AIR);
            state.updateNeighbourShapes(level, pos, Block.UPDATE_ALL);
        }
    }

    private BlockState getNewBlockState(Level level, BlockPos blockPos, BlockState state) {
        BlockState newBlockState = this.defaultBlockState()
                .setValue(PART, ChairPart.UPPER)
                .setValue(FACING, state.getValue(FACING));

        if (isStillWater(level.getBlockState(blockPos))) {
            return newBlockState.setValue(WATERLOGGED, true);
        }

        return newBlockState;
    }

    private boolean isStillWater(BlockState blockState) {
        return blockState.is(Blocks.WATER) && blockState.getFluidState().isSource();
    }

    @Override
    public @NotNull BlockState playerWillDestroy(Level level, @NotNull BlockPos pos, @NotNull BlockState state, @NotNull Player player) {
        if (!level.isClientSide() && player.isCreative()) {
            ChairPart chairPart = state.getValue(PART);
            if (chairPart.equals(ChairPart.UPPER)) {
                breakOtherChairPart(level, pos, player, chairPart);
            }
        }

        return super.playerWillDestroy(level, pos, state, player);
    }

    private void breakOtherChairPart(Level level, BlockPos pos, Player player, ChairPart chairPart) {
        BlockPos positionOfOtherChairPart = pos.relative(getDirectionToOtherChairHalf(chairPart));
        BlockState stateOfOtherChairPart = level.getBlockState(positionOfOtherChairPart);

        if (stateOfOtherChairPart.is(this) && stateOfOtherChairPart.getValue(PART) == ChairPart.getOppositeChairPart(chairPart)) {
            BlockState newBlockState = level.getBlockState(positionOfOtherChairPart).getValue(WATERLOGGED)
                    ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
            level.setBlock(positionOfOtherChairPart, newBlockState, Block.UPDATE_ALL | Block.UPDATE_SUPPRESS_DROPS);
            level.levelEvent(player, LevelEvent.PARTICLES_DESTROY_BLOCK, positionOfOtherChairPart, Block.getId(stateOfOtherChairPart));
        }
    }

    private Direction getDirectionToOtherChairHalf(ChairPart chairPart) {
        boolean isLowerChairPart = chairPart.equals(ChairPart.LOWER);

        return isLowerChairPart ? UP : DOWN;
    }
}
