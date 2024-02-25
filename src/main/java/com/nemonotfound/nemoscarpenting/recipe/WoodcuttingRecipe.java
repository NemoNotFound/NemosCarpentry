package com.nemonotfound.nemoscarpenting.recipe;

import com.nemonotfound.NemosCarpenting;
import com.nemonotfound.nemoscarpenting.block.ModBlocks;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.CuttingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;

public class WoodcuttingRecipe
extends CuttingRecipe {

    public WoodcuttingRecipe(String group, Ingredient ingredient, ItemStack output) {
        super(NemosFurniture.WOODCUTTING, NemosFurniture.WOODCUTTING_RECIPE_RECIPE_SERIALIZER, group, ingredient, output);
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return this.ingredient.test(inventory.getStack(0));
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModBlocks.WOODCUTTER_BLOCK);
    }
}

