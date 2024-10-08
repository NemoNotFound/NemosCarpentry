package com.nemonotfound.nemoscarpentry.entity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.CampfireBlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.input.SingleStackRecipeInput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Clearable;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

@Deprecated
public class CustomCampfireBlockEntity extends BlockEntity implements Clearable {

    private final DefaultedList<ItemStack> itemsBeingCooked = DefaultedList.ofSize(4, ItemStack.EMPTY);
    private final int[] cookingTimes = new int[4];
    private final int[] cookingTotalTimes = new int[4];
    private final RecipeManager.MatchGetter<SingleStackRecipeInput, CampfireCookingRecipe> matchGetter = RecipeManager.createCachedMatchGetter(RecipeType.CAMPFIRE_COOKING);

    public CustomCampfireBlockEntity(BlockPos pos, BlockState state) {
        super(ModEntities.CUSTOM_CAMPFIRE_BLOCK_ENTITY, pos, state);
    }

    public static void litServerTick(World world, BlockPos pos, BlockState state, CustomCampfireBlockEntity campfire) {
        boolean bl = false;
        for (int i = 0; i < campfire.itemsBeingCooked.size(); ++i) {
            SingleStackRecipeInput singleStackRecipeInput;
            ItemStack itemStack2;
            ItemStack itemStack = campfire.itemsBeingCooked.get(i);
            if (itemStack.isEmpty()) continue;
            bl = true;
            campfire.cookingTimes[i] = campfire.cookingTimes[i] + 1;
            if (campfire.cookingTimes[i] < campfire.cookingTotalTimes[i] || !(itemStack2 = campfire.matchGetter.getFirstMatch(singleStackRecipeInput = new SingleStackRecipeInput(itemStack), world).map(recipe -> recipe.value().craft(singleStackRecipeInput, world.getRegistryManager())).orElse(itemStack)).isItemEnabled(world.getEnabledFeatures())) continue;
            ItemScatterer.spawn(world, pos.getX(), pos.getY(), pos.getZ(), itemStack2);
            campfire.itemsBeingCooked.set(i, ItemStack.EMPTY);
            world.updateListeners(pos, state, state, Block.NOTIFY_ALL);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(state));
        }
        if (bl) {
            CampfireBlockEntity.markDirty(world, pos, state);
        }
    }

    public static void unlitServerTick(World world, BlockPos pos, BlockState state, CustomCampfireBlockEntity campfire) {
        boolean bl = false;
        for (int i = 0; i < campfire.itemsBeingCooked.size(); ++i) {
            if (campfire.cookingTimes[i] <= 0) continue;
            bl = true;
            campfire.cookingTimes[i] = MathHelper.clamp(campfire.cookingTimes[i] - 2, 0, campfire.cookingTotalTimes[i]);
        }
        if (bl) {
            CampfireBlockEntity.markDirty(world, pos, state);
        }
    }

    public static void clientTick(World world, BlockPos pos, BlockState state, CustomCampfireBlockEntity campfire) {
        int i;
        Random random = world.random;
        if (random.nextFloat() < 0.11f) {
            for (i = 0; i < random.nextInt(2) + 2; ++i) {
                CampfireBlock.spawnSmokeParticle(world, pos, state.get(CampfireBlock.SIGNAL_FIRE), false);
            }
        }
        i = state.get(CampfireBlock.FACING).getHorizontal();
        for (int j = 0; j < campfire.itemsBeingCooked.size(); ++j) {
            if (campfire.itemsBeingCooked.get(j).isEmpty() || !(random.nextFloat() < 0.2f)) continue;
            Direction direction = Direction.fromHorizontal(Math.floorMod(j + i, 4));
            double d = (double)pos.getX() + 0.5 - (double)((float)direction.getOffsetX() * 0.3125f) + (double)((float)direction.rotateYClockwise().getOffsetX() * 0.3125f);
            double e = (double)pos.getY() + 0.5;
            double g = (double)pos.getZ() + 0.5 - (double)((float)direction.getOffsetZ() * 0.3125f) + (double)((float)direction.rotateYClockwise().getOffsetZ() * 0.3125f);
            for (int k = 0; k < 4; ++k) {
                world.addParticle(ParticleTypes.SMOKE, d, e, g, 0.0, 5.0E-4, 0.0);
            }
        }
    }

    public DefaultedList<ItemStack> getItemsBeingCooked() {
        return this.itemsBeingCooked;
    }

    @Override
    public void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        int[] is;
        super.readNbt(nbt, registryLookup);
        this.itemsBeingCooked.clear();
        Inventories.readNbt(nbt, this.itemsBeingCooked, registryLookup);
        if (nbt.contains("CookingTimes", NbtElement.INT_ARRAY_TYPE)) {
            is = nbt.getIntArray("CookingTimes");
            System.arraycopy(is, 0, this.cookingTimes, 0, Math.min(this.cookingTotalTimes.length, is.length));
        }
        if (nbt.contains("CookingTotalTimes", NbtElement.INT_ARRAY_TYPE)) {
            is = nbt.getIntArray("CookingTotalTimes");
            System.arraycopy(is, 0, this.cookingTotalTimes, 0, Math.min(this.cookingTotalTimes.length, is.length));
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        Inventories.writeNbt(nbt, this.itemsBeingCooked, true, registryLookup);
        nbt.putIntArray("CookingTimes", this.cookingTimes);
        nbt.putIntArray("CookingTotalTimes", this.cookingTotalTimes);
    }

    public BlockEntityUpdateS2CPacket toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        NbtCompound nbtCompound = new NbtCompound();
        Inventories.writeNbt(nbtCompound, this.itemsBeingCooked, true, registryLookup);
        return nbtCompound;
    }

    public Optional<RecipeEntry<CampfireCookingRecipe>> getRecipeFor(ItemStack stack) {
        if (this.itemsBeingCooked.stream().noneMatch(ItemStack::isEmpty)) {
            return Optional.empty();
        }
        return this.matchGetter.getFirstMatch(new SingleStackRecipeInput(stack), this.world);
    }

    public boolean addItem(@Nullable Entity user, ItemStack stack, int cookTime) {
        for (int i = 0; i < this.itemsBeingCooked.size(); ++i) {
            ItemStack itemStack = this.itemsBeingCooked.get(i);
            if (!itemStack.isEmpty()) continue;
            this.cookingTotalTimes[i] = cookTime;
            this.cookingTimes[i] = 0;
            this.itemsBeingCooked.set(i, stack.split(1));
            this.world.emitGameEvent(GameEvent.BLOCK_CHANGE, this.getPos(), GameEvent.Emitter.of(user, this.getCachedState()));
            this.updateListeners();
            return true;
        }
        return false;
    }

    private void updateListeners() {
        this.markDirty();
        this.getWorld().updateListeners(this.getPos(), this.getCachedState(), this.getCachedState(), Block.NOTIFY_ALL);
    }

    @Override
    public void clear() {
        this.itemsBeingCooked.clear();
    }

    public void spawnItemsBeingCooked() {
        if (this.world != null) {
            this.updateListeners();
        }
    }
}
