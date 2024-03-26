package com.nemonotfound.nemoscarpentry.block;

import com.mojang.serialization.MapCodec;
import com.nemonotfound.nemoscarpentry.entity.ModEntities;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class LogSeat extends SitableBlock implements Waterloggable {

    private static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    private static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(2, 0, 5, 14, 6, 11);
    private static final VoxelShape WEST_SHAPE = Block.createCuboidShape(5, 0, 2, 11, 6, 14);
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(2, 0, 5, 14, 6, 11);
    private static final VoxelShape EAST_SHAPE = Block.createCuboidShape(5, 0, 2, 11, 6, 14);

    protected LogSeat(Settings settings) {
        super(settings, 0.4f);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH -> {
                return NORTH_SHAPE;
            }
            case SOUTH -> {
                return SOUTH_SHAPE;
            }
            case EAST -> {
                return EAST_SHAPE;
            }
            case WEST -> {
                return WEST_SHAPE;
            }
        }
        return NORTH_SHAPE;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED).booleanValue()) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED).booleanValue()) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite()).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    @Override
    protected ActionResult sitEntity(World world, BlockPos pos, BlockState state, Entity entityToSit) {
        double posX = pos.getX() + 0.5;
        double posZ = pos.getZ() + 0.5;
        double posY = pos.getY() + this.height;
        float yaw = entityToSit.getYaw();
        this.chairEntity = ModEntities.CHAIR_ENTITY.create(world);

        chairEntity.refreshPositionAndAngles(posX, posY, posZ, yaw, 0);
        chairEntity.setNoGravity(true);
        chairEntity.setSilent(true);
        chairEntity.setInvisible(false);
        chairEntity.setInvulnerable(true);

        if (world.spawnEntity(chairEntity)) {
            entityToSit.setYaw(yaw);
            entityToSit.setBodyYaw(yaw);
            entityToSit.setHeadYaw(yaw);
            entityToSit.startRiding(chairEntity, true);

            return ActionResult.SUCCESS;
        }
        return ActionResult.CONSUME;
    }
}
