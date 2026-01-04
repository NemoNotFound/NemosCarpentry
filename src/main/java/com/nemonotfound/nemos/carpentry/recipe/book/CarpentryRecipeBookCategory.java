package com.nemonotfound.nemos.carpentry.recipe.book;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.RecipeBookCategory;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class CarpentryRecipeBookCategory {

    public static final RecipeBookCategory CARPENTERS_WORKBENCH = register("carpenters_workbench");

    public static void registerRecipeBookCategories() {
        log.info("Registering recipe book categories");
    }

    private static RecipeBookCategory register(String path) {
        return Registry.register(BuiltInRegistries.RECIPE_BOOK_CATEGORY, Identifier.fromNamespaceAndPath(MOD_ID, path), new RecipeBookCategory());
    }
}
