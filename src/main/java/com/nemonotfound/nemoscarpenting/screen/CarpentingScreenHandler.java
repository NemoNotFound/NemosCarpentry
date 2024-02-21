package com.nemonotfound.nemoscarpenting.screen;

import com.google.common.collect.Lists;
import com.nemonotfound.NemosCarpenting;
import com.nemonotfound.nemoscarpenting.item.SawItem;
import com.nemonotfound.nemoscarpenting.recipe.CarpentingRecipe;
import com.nemonotfound.nemoscarpenting.screen.slots.ToolSlot;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.screen.Property;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

import java.util.List;
import java.util.Optional;

import static com.nemonotfound.NemosCarpenting.CARPENTING_SCREEN_HANDLER;

public class CarpentingScreenHandler extends ScreenHandler {

    final Inventory inventory;
    private final World world;
    private final Property selectedRecipe = Property.create();
    private ItemStack inputStack = ItemStack.EMPTY;
    private ItemStack secondInputStack = ItemStack.EMPTY;
    private List<CarpentingRecipe> availableRecipes = Lists.newArrayList();
    long lastTakeTime;
    final Slot inputSlotOne;
    final Slot inputSlotTwo;
    final Slot outputSlot;
    Runnable contentsChangedListener = () -> {
    };
    public final Inventory input = new SimpleInventory(2) {

        @Override
        public void markDirty() {
            super.markDirty();
            CarpentingScreenHandler.this.onContentChanged(this);
            CarpentingScreenHandler.this.contentsChangedListener.run();
        }
    };
    final CraftingResultInventory output = new CraftingResultInventory();

    public CarpentingScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(4));
    }

    public CarpentingScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(CARPENTING_SCREEN_HANDLER, syncId);
        checkSize(inventory, 4);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);
        this.world = playerInventory.player.getWorld();

        this.addSlot(new ToolSlot(inventory, 0, -20, 14));
        this.addSlot(new ToolSlot(inventory, 1, -20, 37));
        this.addSlot(new ToolSlot(inventory, 2, -20, 60));
        this.addSlot(new ToolSlot(inventory, 3, -20, 83));

        inputSlotOne = this.addSlot(new Slot(input, 0, 20, 19));
        inputSlotTwo = this.addSlot(new Slot(input, 1, 20, 47));
        outputSlot = this.addSlot(new Slot(output, 0, 143, 33) {

            @Override
            public boolean canInsert(ItemStack stack) {
                return false;
            }

            @Override
            public void onTakeItem(PlayerEntity player, ItemStack stack) {
                CarpentingRecipe recipe = availableRecipes.get(selectedRecipe.get());
                stack.onCraft(player.getWorld(), player, stack.getCount());
                DefaultedList<Ingredient> ingredients = recipe.getIngredients();

                takeStacksOfIngredients(ingredients);

                if (recipe.getTool().equals("saw") && getOptionalSawSlot().isPresent()) {
                    getOptionalSawSlot().get().getStack().damage(1, player, playerEntity ->
                            playerEntity.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
                }

                long l = world.getTime();
                if (CarpentingScreenHandler.this.lastTakeTime != l) {
                    world.playSound(null, player.getBlockPos(), SoundEvents.UI_STONECUTTER_TAKE_RESULT,
                            SoundCategory.BLOCKS, 1.0f, 1.0f);
                    CarpentingScreenHandler.this.lastTakeTime = l;
                }

                super.onTakeItem(player, stack);
            }

            private void takeStacksOfIngredients(DefaultedList<Ingredient> ingredients) {
                int firstIngredientCount = ingredients.get(0).getMatchingStacks()[0].getCount();
                ItemStack itemStack = CarpentingScreenHandler.this.inputSlotOne.takeStack(firstIngredientCount);

                if (ingredients.get(1).getMatchingStacks().length > 0) {
                    int secondIngredientCount = ingredients.get(1).getMatchingStacks()[0].getCount();
                    CarpentingScreenHandler.this.inputSlotTwo.takeStack(secondIngredientCount);
                }

                if (!itemStack.isEmpty()) {
                    CarpentingScreenHandler.this.populateResult();
                }
            }

            @Override
            public boolean canTakeItems(PlayerEntity playerEntity) {
                CarpentingRecipe recipe = availableRecipes.get(selectedRecipe.get());
                if (recipe.getTool().equals("saw") && getOptionalSawSlot().isEmpty()) {
                    long l = world.getTime();

                    if (CarpentingScreenHandler.this.lastTakeTime != l) {
                        world.playSound(null, playerEntity.getBlockPos(), SoundEvents.UI_STONECUTTER_SELECT_RECIPE, SoundCategory.BLOCKS, 1.0f, 4.0f);
                        CarpentingScreenHandler.this.lastTakeTime = l;
                    }

                    return false;
                }

                return super.canTakeItems(playerEntity);
            }

            private Optional<Slot> getOptionalSawSlot() {
                return CarpentingScreenHandler.this.slots.stream()
                        .filter(slot -> slot instanceof ToolSlot)
                        .filter(slot -> slot.getStack().getItem() instanceof SawItem)
                        .findFirst();
            }
        });

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
        this.selectedRecipe.set(-1);
        this.addProperty(this.selectedRecipe);
    }

    //TODO: REFACTOR
    @Override
    public ItemStack quickMove(PlayerEntity player, int slotIndex) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot movingSlot = this.slots.get(slotIndex);
        if (movingSlot.hasStack()) {
            ItemStack movingItemStack = movingSlot.getStack();
            Item item = movingItemStack.getItem();
            itemStack = movingItemStack.copy();
            boolean isToolSlot = movingSlot instanceof ToolSlot;

            if (movingItemStack.getItem() instanceof SawItem && !isToolSlot) {
                if (!this.insertItem(movingItemStack, 0, 4, false)) {
                    return ItemStack.EMPTY;
                }
            }
            if (slotIndex == 6) {
                item.onCraft(movingItemStack, player.getWorld(), player);
                if (!this.insertItem(movingItemStack, 7, 43, true)) {
                    return ItemStack.EMPTY;
                }
                movingSlot.onQuickTransfer(movingItemStack, itemStack);
            }
            if (slotIndex == 4 || slotIndex == 5 || isToolSlot) {
                if (!this.insertItem(movingItemStack, 7, 43, false)) {
                    return ItemStack.EMPTY;
                }
            }

            //TODO: REFACTOR
            if (this.world.getRecipeManager().getFirstMatch(NemosCarpenting.CARPENTING, new SimpleInventory(this.slots.get(4).getStack()), this.world).isPresent() && isItemSecondIngredient(this.slots.get(4).getStack(), movingItemStack)) {
                if (!this.insertItem(movingItemStack, 5, 6, false)) {
                    return ItemStack.EMPTY;
                } //TODO:REFACTOR
            } else if ((this.world.getRecipeManager().getFirstMatch(NemosCarpenting.CARPENTING,
                    new SimpleInventory(movingItemStack),
                    this.world).isPresent() ? !this.insertItem(movingItemStack, 4, 5, false) :
                    (slotIndex >= 7 && slotIndex < 34 ? !this.insertItem(movingItemStack, 34, 43, false) :
                            slotIndex >= 34 && slotIndex < 43 && !this.insertItem(movingItemStack, 7, 34, false)))) {
                return ItemStack.EMPTY;
            }

            if (movingItemStack.isEmpty()) {
                movingSlot.setStack(ItemStack.EMPTY);
            }
            movingSlot.markDirty();
            if (movingItemStack.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            movingSlot.onTakeItem(player, itemStack);
            this.sendContentUpdates();
        }
        return itemStack;
    }

    //TODO: REFACTOR
    private boolean isItemSecondIngredient(ItemStack firstIngredient, ItemStack secondIngredient) {
        return this.world.getRecipeManager().getAllMatches(NemosCarpenting.CARPENTING, new SimpleInventory(firstIngredient),
                        this.world).stream()
                .anyMatch(recipe -> recipe.getIngredients().get(1).getMatchingStacks().length > 0 &&
                        recipe.getIngredients().get(1).getMatchingStacks()[0].getItem().equals(secondIngredient.getItem()));
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    @Override
    public boolean onButtonClick(PlayerEntity player, int index) {
        if (this.isInBounds(index)) {
            if (canCraftRecipe(index)) {
                this.selectedRecipe.set(index);
            } else {
                this.selectedRecipe.set(-1);
            }
            this.populateResult();
        }

        return true;
    }

    private boolean isInBounds(int id) {
        return id >= 0 && id < this.availableRecipes.size();
    }

    @Override
    public void onClosed(PlayerEntity player) {
        super.onClosed(player);
        this.output.removeStack(0);
        this.dropInventory(player, this.input);
    }

    public void setContentsChangedListener(Runnable contentsChangedListener) {
        this.contentsChangedListener = contentsChangedListener;
    }

    @Override
    public void onContentChanged(Inventory inventory) {
        ItemStack firstIngredient = this.inputSlotOne.getStack();
        ItemStack secondIngredient = this.inputSlotTwo.getStack();

        if (!firstIngredient.isOf(this.inputStack.getItem()) || !secondIngredient.isOf(this.secondInputStack.getItem())) {
            this.inputStack = firstIngredient.copy();
            this.secondInputStack = secondIngredient.copy();
            this.updateInput(inventory, firstIngredient);
        }
    }

    private void updateInput(Inventory inventory, ItemStack firstIngredient) {
        this.availableRecipes.clear();
        this.selectedRecipe.set(-1);
        this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);

        if (!firstIngredient.isEmpty()) {
            this.availableRecipes = this.world.getRecipeManager().getAllMatches(NemosCarpenting.CARPENTING, inventory, this.world);
        }
    }

    public int getSelectedRecipe() {
        return this.selectedRecipe.get();
    }

    public List<CarpentingRecipe> getAvailableRecipes() {
        return this.availableRecipes;
    }

    public int getAvailableRecipeCount() {
        return this.availableRecipes.size();
    }

    public boolean hasAvailableRecipes() {
        return !this.availableRecipes.isEmpty();
    }

    public boolean canCraftRecipe(int index) {
        boolean hasRecipes = !this.availableRecipes.isEmpty();
        boolean hasFirstInputSlotStack = this.inputSlotOne.hasStack();

        if (!hasRecipes || !hasFirstInputSlotStack) {
            return false;
        }

        return hasRecipeIngredients(index);
    }

    public boolean canCraftSelectedRecipe() {
        boolean hasRecipes = !this.availableRecipes.isEmpty();
        boolean hasFirstInputSlotStack = this.inputSlotOne.hasStack();
        int selectedRecipeIndex = selectedRecipe.get();

        if (!hasRecipes || !hasFirstInputSlotStack || selectedRecipeIndex == -1) {
            return false;
        }

        return hasRecipeIngredients(selectedRecipeIndex);
    }

    private boolean hasRecipeIngredients(int index) {
        CarpentingRecipe recipe = availableRecipes.get(index);
        DefaultedList<Ingredient> ingredients = recipe.getIngredients();
        Ingredient secondIngredient = ingredients.get(1);

        ItemStack firstIngredientItemStack = ingredients.get(0).getMatchingStacks()[0];
        ItemStack firstInputItemStack = this.inputSlotOne.getStack();

        boolean hasFirstInputIngredient = firstInputItemStack.getItem() == firstIngredientItemStack.getItem()
                && firstInputItemStack.getCount() >= firstIngredientItemStack.getCount();
        boolean hasSecondInputIngredient = true;

        if (secondIngredient.getMatchingStacks().length > 0) {
            ItemStack secondIngredientItemStack = secondIngredient.getMatchingStacks()[0];
            ItemStack secondInputItemStack = this.inputSlotTwo.getStack();

            hasSecondInputIngredient = secondInputItemStack.getItem() == secondIngredientItemStack.getItem() &&
                    secondInputItemStack.getCount() >= secondIngredientItemStack.getCount();
        }

        return hasFirstInputIngredient && hasSecondInputIngredient;
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    void populateResult() {
        if (hasAvailableRecipes() && this.isInBounds(this.selectedRecipe.get()) && canCraftSelectedRecipe()) {
            CarpentingRecipe recipe = this.availableRecipes.get(this.selectedRecipe.get());
            ItemStack itemStack = recipe.craft(this.input, this.world.getRegistryManager());

            if (itemStack.isItemEnabled(this.world.getEnabledFeatures())) {
                this.output.setLastRecipe(recipe);
                this.outputSlot.setStackNoCallbacks(itemStack);
            } else {
                this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);
            }
        } else {
            this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);
        }
        this.sendContentUpdates();
    }
}
