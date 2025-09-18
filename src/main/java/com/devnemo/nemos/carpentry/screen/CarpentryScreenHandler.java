package com.devnemo.nemos.carpentry.screen;

import com.devnemo.nemos.carpentry.block.ModBlocks;
import com.devnemo.nemos.carpentry.interfaces.CarpentryRecipeGetter;
import com.devnemo.nemos.carpentry.interfaces.ModRecipeManagerGetter;
import com.devnemo.nemos.carpentry.recipe.CarpentryRecipe;
import com.devnemo.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.input.SingleStackRecipeInput;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.Property;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

import java.util.List;
import java.util.Optional;

import static com.devnemo.nemos.carpentry.screen.ModScreenHandlerTypes.CARPENTRY_SCREEN_HANDLER;

public class CarpentryScreenHandler extends ScreenHandler {

    private final ScreenHandlerContext context;
    private final World world;
    private final Property selectedRecipe = Property.create();
    private ItemStack inputStack = ItemStack.EMPTY;
    private ItemStack secondInputStack = ItemStack.EMPTY;
    private CarpentryRecipeDisplay.Grouping availableRecipes = CarpentryRecipeDisplay.Grouping.empty();
    long lastTakeTime;
    final Slot inputSlotOne;
    final Slot inputSlotTwo;
    final Slot outputSlot;
    Runnable contentsChangedListener = () -> {};
    public final Inventory input = new SimpleInventory(2) {

        @Override
        public void markDirty() {
            super.markDirty();
            CarpentryScreenHandler.this.onContentChanged(this);
            CarpentryScreenHandler.this.contentsChangedListener.run();
        }
    };
    final CraftingResultInventory output = new CraftingResultInventory();

    public CarpentryScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
    }

    public CarpentryScreenHandler(int syncId, PlayerInventory playerInventory, final ScreenHandlerContext context) {
        super(CARPENTRY_SCREEN_HANDLER, syncId);
        this.world = playerInventory.player.getWorld();
        this.context = context;

        inputSlotOne = this.addSlot(new Slot(input, 0, 20, 19));
        inputSlotTwo = this.addSlot(new Slot(input, 1, 20, 47));
        outputSlot = this.addSlot(new Slot(output, 0, 143, 33) {

            @Override
            public boolean canInsert(ItemStack stack) {
                return false;
            }

            @Override
            public void onTakeItem(PlayerEntity player, ItemStack stack) {
                stack.onCraftByPlayer(player, stack.getCount());
                CarpentryScreenHandler.this.output.unlockLastRecipe(player, this.getInputStacks());
                var recipeGroupEntry = availableRecipes.entries().get(selectedRecipe.get());

                takeStacksOfIngredients(recipeGroupEntry.inputCounts());

                context.run((world, pos) -> {
                    var l = world.getTime();
                    if (CarpentryScreenHandler.this.lastTakeTime != l) {
                        world.playSound(null, player.getBlockPos(), SoundEvents.UI_STONECUTTER_TAKE_RESULT,
                                SoundCategory.BLOCKS, 1.0f, 1.0f);
                        CarpentryScreenHandler.this.lastTakeTime = l;
                    }
                });

                super.onTakeItem(player, stack);
            }

            private void takeStacksOfIngredients(List<Integer> inputCounts) {
                int firstIngredientCount = inputCounts.get(0);
                ItemStack itemStack = CarpentryScreenHandler.this.inputSlotOne.takeStack(firstIngredientCount);

                if (inputCounts.size() > 1) {
                    int secondIngredientCount = inputCounts.get(1);
                    CarpentryScreenHandler.this.inputSlotTwo.takeStack(secondIngredientCount);
                }

                if (!itemStack.isEmpty()) {
                    CarpentryScreenHandler.this.populateResult(CarpentryScreenHandler.this.selectedRecipe.get());
                }
            }

            private List<ItemStack> getInputStacks() {
                return List.of(CarpentryScreenHandler.this.inputSlotOne.getStack(), CarpentryScreenHandler.this.inputSlotTwo.getStack());
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

            if (slotIndex == 2) {
                item.onCraft(movingItemStack, player.getWorld());
                if (!this.insertItem(movingItemStack, 3, 39, true)) {
                    return ItemStack.EMPTY;
                }
                movingSlot.onQuickTransfer(movingItemStack, itemStack);
            }
            if (slotIndex == 0 || slotIndex == 1) {
                if (!this.insertItem(movingItemStack, 3, 39, false)) {
                    return ItemStack.EMPTY;
                }
            }

            //TODO: REFACTOR
            if (!getCarpentryRecipesForItemStack(this.slots.get(0).getStack()).isEmpty() && isMovingItemSecondIngredient(this.slots.get(0).getStack(), movingItemStack)) {
                if (!this.insertItem(movingItemStack, 1, 2, false)) {
                    return ItemStack.EMPTY;
                } //TODO:REFACTOR
            } else if ((!getCarpentryRecipesForItemStack(movingItemStack).isEmpty() ? !this.insertItem(movingItemStack, 0, 1, false) :
                    (slotIndex >= 3 && slotIndex < 30 ? !this.insertItem(movingItemStack, 30, 39, false) :
                            slotIndex >= 30 && slotIndex < 39 && !this.insertItem(movingItemStack, 3, 30, false)))) {
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
    
    private boolean isMovingItemSecondIngredient(ItemStack firstIngredient, ItemStack secondIngredient) {
        CarpentryRecipeDisplay.Grouping carpentryRecipes = getCarpentryRecipesForItemStack(firstIngredient);

        return carpentryRecipes.entries().stream().anyMatch(recipe ->
                isItemSecondIngredient(recipe.ingredients(), secondIngredient));
    }

    private CarpentryRecipeDisplay.Grouping getCarpentryRecipesForItemStack(ItemStack itemStack) {
        CarpentryRecipeDisplay.Grouping carpentryRecipes = CarpentryRecipeDisplay.Grouping.empty();

        if (!this.world.isClient()) {
            carpentryRecipes = ((CarpentryRecipeGetter) this.world.getRecipeManager()).nemo_sCarpentry$getCarpentryRecipes().filter(itemStack);
        } else if (this.world.isClient()) {
            carpentryRecipes = ((ModRecipeManagerGetter) this.world).nemo_sCarpentry$getModRecipeManager().getCarpentryRecipes().filter(itemStack);
        }

        return carpentryRecipes;
    }

    private boolean isItemSecondIngredient(List<Ingredient> ingredients, ItemStack secondIngredient) {
        return ingredients.size() == 2 && itemIsInMatchingStacks(ingredients.get(1).getMatchingItems().toList(), secondIngredient.getItem());
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return CarpentryScreenHandler.canUse(context, player, ModBlocks.CARPENTERS_WORKBENCH);
    }

    @Override
    public boolean onButtonClick(PlayerEntity player, int index) {
        if (this.isInBounds(index)) {
            if (canCraftRecipe(index)) {
                this.selectedRecipe.set(index);
            } else {
                this.selectedRecipe.set(-1);
            }
            this.populateResult(index);
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
            this.updateInput(firstIngredient);
        }
    }

    private static SingleStackRecipeInput createRecipeInput(Inventory inventory) {
        return new SingleStackRecipeInput(inventory.getStack(0));
    }

    private void updateInput(ItemStack itemStack) {
        this.selectedRecipe.set(-1);
        this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);

        if (!itemStack.isEmpty()) {
            this.availableRecipes = getCarpentryRecipesForItemStack(itemStack);
        } else {
            this.availableRecipes = CarpentryRecipeDisplay.Grouping.empty();
        }
    }

    public int getSelectedRecipe() {
        return this.selectedRecipe.get();
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
        CarpentryRecipeDisplay.GroupEntry recipe = availableRecipes.entries().get(index);
        List<Ingredient> ingredients = recipe.ingredients();
        List<RegistryEntry<Item>> firstIngredientMatchingItems = ingredients.get(0).getMatchingItems().toList();
        List<Integer> inputCounts = recipe.inputCounts();
        ItemStack firstInputItemStack = this.inputSlotOne.getStack();

        boolean hasFirstInputIngredient = itemIsInMatchingStacks(firstIngredientMatchingItems, firstInputItemStack.getItem())
                && firstInputItemStack.getCount() >= inputCounts.get(0);
        boolean hasSecondInputIngredient = true;

        if (ingredients.size() > 1) {
            Ingredient secondIngredient = ingredients.get(1);
            ItemStack secondInputItemStack = this.inputSlotTwo.getStack();

            hasSecondInputIngredient = itemIsInMatchingStacks(secondIngredient.getMatchingItems().toList(), secondInputItemStack.getItem()) &&
                    secondInputItemStack.getCount() >= inputCounts.get(1);
        }

        return hasFirstInputIngredient && hasSecondInputIngredient;
    }

    private boolean itemIsInMatchingStacks(List<RegistryEntry<Item>> matchingItems, Item item) {
        return matchingItems.stream().anyMatch(registryEntry -> registryEntry.value().equals(item));
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

    private void populateResult(int selectedId) {
        Optional<RecipeEntry<CarpentryRecipe>> optionalRecipe;

        if (hasAvailableRecipes() && this.isInBounds(selectedId) && canCraftSelectedRecipe()) {
            CarpentryRecipeDisplay.GroupEntry recipeGroupEntry = this.availableRecipes.entries().get(selectedId);
            optionalRecipe = recipeGroupEntry.recipe().recipe();

        } else {
            optionalRecipe = Optional.empty();
        }

        optionalRecipe.ifPresentOrElse(
                recipeEntry -> {
                    CarpentryRecipe carpentryRecipe = recipeEntry.value();
                    ItemStack itemStack = carpentryRecipe.craft(createRecipeInput(this.input), this.world.getRegistryManager());

                    this.output.setLastRecipe(recipeEntry);
                    this.outputSlot.setStackNoCallbacks(itemStack);
                }, () -> {
                    this.outputSlot.setStackNoCallbacks(ItemStack.EMPTY);
                    this.output.setLastRecipe(null);
                });

        this.sendContentUpdates();
    }
}
