package com.nemonotfound.nemoscarpentry.block;

import com.nemonotfound.nemoscarpentry.entity.CustomCampfireBlockEntity;
import com.nemonotfound.nemoscarpentry.entity.ModEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class CustomCampfireBlock extends CampfireBlock {

    public CustomCampfireBlock(boolean emitsParticles, int fireDamage, Settings settings) {
        super(emitsParticles, fireDamage, settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack;
        CustomCampfireBlockEntity customCampfireBlockEntity;
        Optional<RecipeEntry<CampfireCookingRecipe>> optionalRecipe;
        BlockEntity blockEntity = world.getBlockEntity(pos);

        if (blockEntity instanceof CustomCampfireBlockEntity && (optionalRecipe = (customCampfireBlockEntity =
                (CustomCampfireBlockEntity)blockEntity).getRecipeFor(itemStack = player.getStackInHand(hand))).isPresent()) {
            if (!world.isClient && customCampfireBlockEntity.addItem(player, player.getAbilities().creativeMode ?
                    itemStack.copy() : itemStack, optionalRecipe.get().value().getCookingTime())) {
                player.incrementStat(Stats.INTERACT_WITH_CAMPFIRE);
                return ActionResult.SUCCESS;
            }
            return ActionResult.CONSUME;
        }
        return ActionResult.PASS;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.isOf(newState.getBlock())) {
            return;
        }
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof CustomCampfireBlockEntity) {
            ItemScatterer.spawn(world, pos, ((CustomCampfireBlockEntity)blockEntity).getItemsBeingCooked());
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    public static void extinguish(@Nullable Entity entity, WorldAccess world, BlockPos pos, BlockState state) {
        BlockEntity blockEntity;
        if (world.isClient()) {
            for (int i = 0; i < 20; ++i) {
                CampfireBlock.spawnSmokeParticle((World)world, pos, state.get(SIGNAL_FIRE), true);
            }
        }
        if ((blockEntity = world.getBlockEntity(pos)) instanceof CustomCampfireBlockEntity) {
            ((CustomCampfireBlockEntity)blockEntity).spawnItemsBeingCooked();
        }
        world.emitGameEvent(entity, GameEvent.BLOCK_CHANGE, pos);
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        if (!state.get(Properties.WATERLOGGED) && fluidState.getFluid() == Fluids.WATER) {
            boolean isLit = state.get(LIT);
            if (isLit) {
                if (!world.isClient()) {
                    world.playSound(null, pos, SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, SoundCategory.BLOCKS, 1.0f, 1.0f);
                }
                CustomCampfireBlock.extinguish(null, world, pos, state);
            }
            world.setBlockState(pos, state.with(WATERLOGGED, true).with(LIT, false), Block.NOTIFY_ALL);
            world.scheduleFluidTick(pos, fluidState.getFluid(), fluidState.getFluid().getTickRate(world));
            return true;
        }
        return false;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CustomCampfireBlockEntity(pos, state);
    }

    @Override
    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        if (world.isClient) {
            if (state.get(LIT)) {
                return CustomCampfireBlock.validateTicker(type, ModEntities.CUSTOM_CAMPFIRE_BLOCK_ENTITY, CustomCampfireBlockEntity::clientTick);
            }
        } else {
            if (state.get(LIT)) {
                return CustomCampfireBlock.validateTicker(type, ModEntities.CUSTOM_CAMPFIRE_BLOCK_ENTITY, CustomCampfireBlockEntity::litServerTick);
            }
            return CustomCampfireBlock.validateTicker(type, ModEntities.CUSTOM_CAMPFIRE_BLOCK_ENTITY, CustomCampfireBlockEntity::unlitServerTick);
        }
        return null;
    }
}
