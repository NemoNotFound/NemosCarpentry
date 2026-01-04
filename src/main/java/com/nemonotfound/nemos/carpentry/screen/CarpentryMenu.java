package com.nemonotfound.nemos.carpentry.screen;

import com.nemonotfound.nemos.carpentry.block.CarpentryBlocks;
import com.nemonotfound.nemos.carpentry.interfaces.CarpentryRecipeGetter;
import com.nemonotfound.nemos.carpentry.interfaces.CarpentryRecipeManagerGetter;
import com.nemonotfound.nemos.carpentry.recipe.CarpentryRecipe;
import com.nemonotfound.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

import static com.nemonotfound.nemos.carpentry.screen.CarpentryMenuTypes.CARPENTRY_SCREEN_HANDLER;

public class CarpentryMenu extends AbstractContainerMenu {

    private final ContainerLevelAccess containerLevelAccess;
    private final Level level;
    private final DataSlot selectedRecipeIndex = DataSlot.standalone();
    private ItemStack inputStack = ItemStack.EMPTY;
    private ItemStack secondInputStack = ItemStack.EMPTY;
    private CarpentryRecipeDisplay.Grouping availableRecipes = CarpentryRecipeDisplay.Grouping.empty();
    long lastTakeTime;
    final Slot inputSlotOne;
    final Slot inputSlotTwo;
    final Slot outputSlot;
    Runnable slotUpdateListener = () -> {};
    public final Container input = new SimpleContainer(2) {

        @Override
        public void setChanged() {
            super.setChanged();
            CarpentryMenu.this.slotsChanged(this);
            CarpentryMenu.this.slotUpdateListener.run();
        }
    };
    final ResultContainer output = new ResultContainer();

    public CarpentryMenu(int syncId, Inventory playerInventory) {
        this(syncId, playerInventory, ContainerLevelAccess.NULL);
    }

    public CarpentryMenu(int syncId, Inventory playerInventory, final ContainerLevelAccess access) {
        super(CARPENTRY_SCREEN_HANDLER, syncId);
        this.level = playerInventory.player.level();
        this.containerLevelAccess = access;

        inputSlotOne = this.addSlot(new Slot(input, 0, 20, 19));
        inputSlotTwo = this.addSlot(new Slot(input, 1, 20, 47));
        outputSlot = this.addSlot(new Slot(output, 1, 143, 33) {

            @Override
            public boolean mayPlace(@NotNull ItemStack stack) {
                return false;
            }

            @Override
            public void onTake(@NotNull Player player, @NotNull ItemStack stack) {
                stack.onCraftedBy(player, stack.getCount());
                CarpentryMenu.this.output.awardUsedRecipes(player, this.getInputStacks());
                var recipeGroupEntry = availableRecipes.entries().get(selectedRecipeIndex.get());

                takeStacksOfIngredients(recipeGroupEntry.inputCounts());

                access.execute((level, pos) -> {
                    var l = level.getGameTime();
                    if (CarpentryMenu.this.lastTakeTime != l) {
                        level.playSound(null, pos, SoundEvents.UI_STONECUTTER_TAKE_RESULT,
                                SoundSource.BLOCKS, 1.0f, 1.0f);
                        CarpentryMenu.this.lastTakeTime = l;
                    }
                });

                super.onTake(player, stack);
            }

            private void takeStacksOfIngredients(List<Integer> inputCounts) {
                int firstIngredientCount = inputCounts.get(0);
                ItemStack itemStack = CarpentryMenu.this.inputSlotOne.remove(firstIngredientCount);

                if (inputCounts.size() > 1) {
                    int secondIngredientCount = inputCounts.get(1);
                    CarpentryMenu.this.inputSlotTwo.remove(secondIngredientCount);
                }

                if (!itemStack.isEmpty()) {
                    CarpentryMenu.this.setupResultSlot(CarpentryMenu.this.selectedRecipeIndex.get());
                }
            }

            private List<ItemStack> getInputStacks() {
                return List.of(CarpentryMenu.this.inputSlotOne.getItem(), CarpentryMenu.this.inputSlotTwo.getItem());
            }
        });

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
        this.addDataSlot(this.selectedRecipeIndex);
    }

    //TODO: REFACTOR
    @Override
    public @NotNull ItemStack quickMoveStack(@NotNull Player player, int slotIndex) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot movingSlot = this.slots.get(slotIndex);

        if (movingSlot.hasItem()) {
            ItemStack movingItemStack = movingSlot.getItem();
            Item item = movingItemStack.getItem();
            itemStack = movingItemStack.copy();

            if (slotIndex == 2) {
                item.onCraftedBy(movingItemStack, player);

                if (!this.moveItemStackTo(movingItemStack, 3, 39, true)) {
                    return ItemStack.EMPTY;
                }
                movingSlot.onQuickCraft(movingItemStack, itemStack);
            }
            if (slotIndex == 0 || slotIndex == 1) {
                if (!this.moveItemStackTo(movingItemStack, 3, 39, false)) {
                    return ItemStack.EMPTY;
                }
            }

            //TODO: REFACTOR
            if (!getCarpentryRecipesForItemStack(this.slots.get(0).getItem()).isEmpty() && isMovingItemSecondIngredient(this.slots.get(0).getItem(), movingItemStack)) {
                if (!this.moveItemStackTo(movingItemStack, 1, 2, false)) {
                    return ItemStack.EMPTY;
                } //TODO:REFACTOR
            } else if ((!getCarpentryRecipesForItemStack(movingItemStack).isEmpty() ? !this.moveItemStackTo(movingItemStack, 0, 1, false) :
                    (slotIndex >= 3 && slotIndex < 30 ? !this.moveItemStackTo(movingItemStack, 30, 39, false) :
                            slotIndex >= 30 && slotIndex < 39 && !this.moveItemStackTo(movingItemStack, 3, 30, false)))) {
                return ItemStack.EMPTY;
            }

            if (movingItemStack.isEmpty()) {
                movingSlot.set(ItemStack.EMPTY);
            }
            movingSlot.setChanged();
            if (movingItemStack.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            movingSlot.onTake(player, itemStack);
            this.broadcastChanges();
        }
        return itemStack;
    }
    
    private boolean isMovingItemSecondIngredient(ItemStack firstIngredient, ItemStack secondIngredient) {
        CarpentryRecipeDisplay.Grouping carpentryRecipes = getCarpentryRecipesForItemStack(firstIngredient);

        return carpentryRecipes.entries().stream().anyMatch(recipe ->
                isItemSecondIngredient(recipe.ingredients(), secondIngredient));
    }

    private CarpentryRecipeDisplay.Grouping getCarpentryRecipesForItemStack(ItemStack itemStack) {
        CarpentryRecipeDisplay.Grouping carpentryRecipes = CarpentryRecipeDisplay.Grouping.empty();

        if (!this.level.isClientSide()) {
            carpentryRecipes = ((CarpentryRecipeGetter) this.level.recipeAccess()).nemo_sCarpentry$getCarpentryRecipes().filter(itemStack);
        } else if (this.level.isClientSide()) {
            carpentryRecipes = ((CarpentryRecipeManagerGetter) this.level).nemo_sCarpentry$getModRecipeManager().carpentryRecipes().filter(itemStack);
        }

        return carpentryRecipes;
    }

    private boolean isItemSecondIngredient(List<Ingredient> ingredients, ItemStack secondIngredient) {
        return ingredients.size() == 2 && itemIsInMatchingStacks(ingredients.get(1).items().toList(), secondIngredient.getItem());
    }

    @Override
    public boolean stillValid(@NotNull Player player) {
        return CarpentryMenu.stillValid(containerLevelAccess, player, CarpentryBlocks.CARPENTERS_WORKBENCH);
    }

    @Override
    public boolean canTakeItemForPickAll(@NotNull ItemStack stack, Slot slot) {
        return slot.container != this.output && super.canTakeItemForPickAll(stack, slot);
    }

    @Override
    public boolean clickMenuButton(@NotNull Player player, int index) {
        if (this.isInBounds(index)) {
            if (canCraftRecipe(index)) {
                this.selectedRecipeIndex.set(index);
            } else {
                this.selectedRecipeIndex.set(-1);
            }
            this.setupResultSlot(index);
        }

        return true;
    }

    private boolean isInBounds(int id) {
        return id >= 0 && id < this.availableRecipes.size();
    }

    @Override
    public void removed(@NotNull Player player) {
        super.removed(player);
        this.output.removeItemNoUpdate(1);
        this.clearContainer(player, this.input);
    }

    public void setSlotUpdateListener(Runnable slotUpdateListener) {
        this.slotUpdateListener = slotUpdateListener;
    }

    @Override
    public void slotsChanged(@NotNull Container container) {
        ItemStack firstIngredient = this.inputSlotOne.getItem();
        ItemStack secondIngredient = this.inputSlotTwo.getItem();

        if (!firstIngredient.is(this.inputStack.getItem()) || !secondIngredient.is(this.secondInputStack.getItem())) {
            this.inputStack = firstIngredient.copy();
            this.secondInputStack = secondIngredient.copy();
            this.updateInput(firstIngredient);
        }
    }

    private static SingleRecipeInput createRecipeInput(Container container) {
        return new SingleRecipeInput(container.getItem(0));
    }

    private void updateInput(ItemStack itemStack) {
        this.selectedRecipeIndex.set(-1);
        this.outputSlot.set(ItemStack.EMPTY);

        if (!itemStack.isEmpty()) {
            this.availableRecipes = getCarpentryRecipesForItemStack(itemStack);
        } else {
            this.availableRecipes = CarpentryRecipeDisplay.Grouping.empty();
        }
    }

    public int getSelectedRecipeIndex() {
        return this.selectedRecipeIndex.get();
    }

    public CarpentryRecipeDisplay.Grouping getAvailableRecipes() {
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
        boolean hasFirstInputSlotStack = this.inputSlotOne.hasItem();

        if (!hasRecipes || !hasFirstInputSlotStack) {
            return false;
        }

        return hasRecipeIngredients(index);
    }

    public boolean canCraftSelectedRecipe() {
        boolean hasRecipes = !this.availableRecipes.isEmpty();
        boolean hasFirstInputSlotStack = this.inputSlotOne.hasItem();
        int selectedRecipeIndex = this.selectedRecipeIndex.get();

        if (!hasRecipes || !hasFirstInputSlotStack || selectedRecipeIndex == -1) {
            return false;
        }

        return hasRecipeIngredients(selectedRecipeIndex);
    }

    private boolean hasRecipeIngredients(int index) {
        CarpentryRecipeDisplay.GroupEntry recipe = availableRecipes.entries().get(index);
        List<Ingredient> ingredients = recipe.ingredients();
        List<Holder<Item>> firstIngredientMatchingItems = ingredients.get(0).items().toList();
        List<Integer> inputCounts = recipe.inputCounts();
        ItemStack firstInputItemStack = this.inputSlotOne.getItem();

        boolean hasFirstInputIngredient = itemIsInMatchingStacks(firstIngredientMatchingItems, firstInputItemStack.getItem())
                && firstInputItemStack.getCount() >= inputCounts.get(0);
        boolean hasSecondInputIngredient = true;

        if (ingredients.size() > 1) {
            Ingredient secondIngredient = ingredients.get(1);
            ItemStack secondInputItemStack = this.inputSlotTwo.getItem();

            hasSecondInputIngredient = itemIsInMatchingStacks(secondIngredient.items().toList(), secondInputItemStack.getItem()) &&
                    secondInputItemStack.getCount() >= inputCounts.get(1);
        }

        return hasFirstInputIngredient && hasSecondInputIngredient;
    }

    private boolean itemIsInMatchingStacks(List<Holder<Item>> matchingItems, Item item) {
        return matchingItems.stream().anyMatch(registryEntry -> registryEntry.value().equals(item));
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(playerInventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; i++) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }

    private void setupResultSlot(int selectedId) {
        Optional<RecipeHolder<CarpentryRecipe>> optionalRecipe;

        if (hasAvailableRecipes() && this.isInBounds(selectedId) && canCraftSelectedRecipe()) {
            CarpentryRecipeDisplay.GroupEntry recipeGroupEntry = this.availableRecipes.entries().get(selectedId);
            optionalRecipe = recipeGroupEntry.recipe().recipe();

        } else {
            optionalRecipe = Optional.empty();
        }

        optionalRecipe.ifPresentOrElse(
                recipeHolder -> {
                    CarpentryRecipe carpentryRecipe = recipeHolder.value();
                    ItemStack itemStack = carpentryRecipe.assemble(createRecipeInput(this.input), this.level.registryAccess());

                    this.output.setRecipeUsed(recipeHolder);
                    this.outputSlot.set(itemStack);
                }, () -> {
                    this.outputSlot.set(ItemStack.EMPTY);
                    this.output.setRecipeUsed(null);
                });

        this.broadcastChanges();
    }
}
