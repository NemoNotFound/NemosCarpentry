package com.nemonotfound.nemoscarpentry.screen;

import com.nemonotfound.nemoscarpentry.interfaces.CarpentryRecipeGetter;
import com.nemonotfound.nemoscarpentry.interfaces.ModRecipeManagerGetter;
import com.nemonotfound.nemoscarpentry.item.SawItem;
import com.nemonotfound.nemoscarpentry.recipe.CarpentryRecipe;
import com.nemonotfound.nemoscarpentry.recipe.display.CarpentryRecipeDisplay;
import com.nemonotfound.nemoscarpentry.screen.slots.ToolSlot;
import net.minecraft.entity.EquipmentSlot;
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

import static com.nemonotfound.nemoscarpentry.screen.ModScreenHandlerTypes.CARPENTRY_SCREEN_HANDLER;

public class CarpentryScreenHandler extends ScreenHandler {

    private final ScreenHandlerContext context;
    final Inventory inventory;
    private final World world;
    private final Property selectedRecipe = Property.create();
    private ItemStack inputStack = ItemStack.EMPTY;
    private ItemStack secondInputStack = ItemStack.EMPTY;
    private CarpentryRecipeDisplay.Grouping availableRecipes = CarpentryRecipeDisplay.Grouping.empty();
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
            CarpentryScreenHandler.this.onContentChanged(this);
            CarpentryScreenHandler.this.contentsChangedListener.run();
        }
    };
    final CraftingResultInventory output = new CraftingResultInventory();

    public CarpentryScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(4), ScreenHandlerContext.EMPTY);
    }

    public CarpentryScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, final ScreenHandlerContext context) {
        super(CARPENTRY_SCREEN_HANDLER, syncId);
        checkSize(inventory, 4);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);
        this.world = playerInventory.player.getWorld();
        this.context = context;

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
                CarpentryRecipeDisplay.GroupEntry recipeGroupEntry = availableRecipes.entries().get(selectedRecipe.get());
                stack.onCraftByPlayer(player.getWorld(), player, stack.getCount());

                takeStacksOfIngredients(recipeGroupEntry.inputCounts());

                if (recipeGroupEntry.requiresTool() && getOptionalSawSlot().isPresent()) {
                    getOptionalSawSlot().get().getStack().damage(1, player, EquipmentSlot.MAINHAND);
                }

                context.run((world, pos) -> {
                    long l = world.getTime();
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

            @Override
            public boolean canTakeItems(PlayerEntity playerEntity) {
                CarpentryRecipeDisplay.GroupEntry recipeGroupEntry = availableRecipes.entries().get(selectedRecipe.get());
                if (recipeGroupEntry.requiresTool() && getOptionalSawSlot().isEmpty()) {
                    long l = world.getTime();

                    if (CarpentryScreenHandler.this.lastTakeTime != l) {
                        world.playSound(null, playerEntity.getBlockPos(), SoundEvents.UI_STONECUTTER_SELECT_RECIPE, SoundCategory.BLOCKS, 1.0f, 4.0f);
                        CarpentryScreenHandler.this.lastTakeTime = l;
                    }

                    return false;
                }

                return super.canTakeItems(playerEntity);
            }

            private Optional<Slot> getOptionalSawSlot() {
                return CarpentryScreenHandler.this.slots.stream()
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
                item.onCraft(movingItemStack, player.getWorld());
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
            if (!getCarpentryRecipesForItemStack(this.slots.get(4).getStack()).isEmpty() && isMovingItemSecondIngredient(this.slots.get(4).getStack(), movingItemStack)) {
                if (!this.insertItem(movingItemStack, 5, 6, false)) {
                    return ItemStack.EMPTY;
                } //TODO:REFACTOR
            } else if ((!getCarpentryRecipesForItemStack(movingItemStack).isEmpty() ? !this.insertItem(movingItemStack, 4, 5, false) :
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
