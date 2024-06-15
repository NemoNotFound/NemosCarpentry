package com.nemonotfound.nemoscarpentry.block.seats;

import com.mojang.serialization.MapCodec;
import com.nemonotfound.nemoscarpentry.entity.ChairEntity;
import com.nemonotfound.nemoscarpentry.entity.ModEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
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
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class OldSitableBlock extends HorizontalFacingBlock {

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    protected ChairEntity chairEntity;
    public float height;

    public OldSitableBlock(Settings settings, float height) {
        super(settings);
        setDefaultState(this.getStateManager().getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
        this.height = height;
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
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        super.onStateReplaced(state, world, pos, newState, moved);

        if (chairEntity != null && !state.isOf(newState.getBlock())) {
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

