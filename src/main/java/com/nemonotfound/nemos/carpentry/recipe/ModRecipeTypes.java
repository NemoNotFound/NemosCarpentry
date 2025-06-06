package com.nemonotfound.nemos.carpentry.recipe;

import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class ModRecipeTypes {

    public static RecipeType<CarpentryRecipe> CARPENTRY = register("carpentry");

    public static void registerRecipeTypes() {
        log.info("Register recipe types");
    }

   private static <T extends Recipe<?>> RecipeType<T> register(String id) {
        return Registry.register(Registries.RECIPE_TYPE, Identifier.of(MOD_ID, id), new RecipeType<T>() {
            public String toString() {
                return id;
            }
        });
    }
}
