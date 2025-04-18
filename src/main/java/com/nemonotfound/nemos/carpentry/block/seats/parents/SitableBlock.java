package com.nemonotfound.nemos.carpentry.block.seats.parents;

import com.mojang.serialization.MapCodec;
import com.nemonotfound.nemos.carpentry.entity.ChairEntity;
import com.nemonotfound.nemos.carpentry.entity.ModEntities;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

import java.util.ArrayList;
import java.util.List;

public abstract class SitableBlock extends HorizontalFacingBlock {

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    private final VoxelShape northShape;
    private final VoxelShape eastShape;
    private final VoxelShape southShape;
    private final VoxelShape westShape;
    protected ChairEntity chairEntity;
    public float height;

    public SitableBlock(Settings settings, float height, VoxelShape northShape, VoxelShape eastShape,
                        VoxelShape southShape, VoxelShape westShape) {
        super(settings);
        setDefaultState(this.getStateManager().getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        this.northShape = northShape;
        this.eastShape = eastShape;
        this.southShape = southShape;
        this.westShape = westShape;
        this.height = height;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return getShapeIndex(state);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getShapeIndex(state);
    }

    private VoxelShape getShapeIndex(BlockState state) {
        switch (state.get(FACING)) {
            case NORTH -> {
                return northShape;
            }
            case SOUTH -> {
                return southShape;
            }
            case EAST -> {
                return eastShape;
            }
            case WEST -> {
                return westShape;
            }
        }

        return northShape;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (state.get(WATERLOGGED)) {
            tickView.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite()).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED)) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.CONSUME;
        }

        if (player.isSpectator() || player.isSneaking()) {
            return ActionResult.FAIL;
        }

        List<ChairEntity> active = world.getEntitiesByClass(ChairEntity.class, new Box(pos), Entity::hasPassengers);
        List<Entity> hasPassenger = new ArrayList<>();
        active.forEach(chairEntity -> hasPassenger.add(chairEntity.getFirstPassenger()));

        if (!active.isEmpty() && hasPassenger.stream().anyMatch(Entity::isPlayer)) {
            return ActionResult.FAIL;
        } else if (!active.isEmpty()) {
            hasPassenger.forEach(Entity::stopRiding);
            return ActionResult.SUCCESS;
        } else if (sitEntity(world, pos, state, player) == ActionResult.SUCCESS) {
            return ActionResult.SUCCESS;
        }

        return ActionResult.CONSUME;
    }


    protected ActionResult sitEntity(World world, BlockPos pos, BlockState state, Entity entityToSit) {
        double posX;
        double posZ;

        Direction direction = state.get(FACING);
        switch (direction) {
            case EAST -> {
                posX = pos.getX() + 0.4;
                posZ = pos.getZ() + 0.5;
            }
            case WEST -> {
                posX = pos.getX() + 0.6;
                posZ = pos.getZ() + 0.5;
            }
            case SOUTH -> {
                posX = pos.getX() + 0.5;
                posZ = pos.getZ() + 0.4;
            }
            default -> {
                posX = pos.getX() + 0.5;
                posZ = pos.getZ() + 0.6;
            }
        }

        double posY = pos.getY() + this.height;
        float yaw = entityToSit.getYaw();
        this.chairEntity = ModEntities.CHAIR_ENTITY.create(world, SpawnReason.DISPENSER);
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

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }

    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        if (chairEntity != null) {
            chairEntity.discard();
        }
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
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }
}

