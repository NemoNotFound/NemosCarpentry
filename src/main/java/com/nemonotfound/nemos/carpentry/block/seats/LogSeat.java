package com.nemonotfound.nemos.carpentry.block.seats;

import com.nemonotfound.nemos.carpentry.block.seats.parents.SitableBlock;
import com.nemonotfound.nemos.carpentry.entity.ModEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;

public class LogSeat extends SitableBlock implements Waterloggable {

    private static final VoxelShape SOUTH_SHAPE = Block.createCuboidShape(2, 0, 5, 14, 6, 11);
    private static final VoxelShape WEST_SHAPE = Block.createCuboidShape(5, 0, 2, 11, 6, 14);
    private static final VoxelShape NORTH_SHAPE = Block.createCuboidShape(2, 0, 5, 14, 6, 11);
    private static final VoxelShape EAST_SHAPE = Block.createCuboidShape(5, 0, 2, 11, 6, 14);

    public LogSeat(Settings settings) {
        super(settings, 0.4f, NORTH_SHAPE, EAST_SHAPE, SOUTH_SHAPE, WEST_SHAPE);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    @Override
    protected ActionResult sitEntity(World world, BlockPos pos, BlockState state, Entity entityToSit) {
        double posX = pos.getX() + 0.5;
        double posZ = pos.getZ() + 0.5;
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
}
