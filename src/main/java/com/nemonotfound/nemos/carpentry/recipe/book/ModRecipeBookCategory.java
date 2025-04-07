package com.nemonotfound.nemos.carpentry.recipe.book;

import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class ModRecipeBookCategory {

    public static final RecipeBookCategory CARPENTERS_WORKBENCH = register("carpenters_workbench");

    public static void registerRecipeBookCategories() {
        log.info("Registering recipe book categories");
    }

    private static RecipeBookCategory register(String path) {
        return Registry.register(Registries.RECIPE_BOOK_CATEGORY, Identifier.of(MOD_ID, path), new RecipeBookCategory());
    }
}
