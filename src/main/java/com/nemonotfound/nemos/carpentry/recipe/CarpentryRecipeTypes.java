package com.nemonotfound.nemos.carpentry.recipe;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;
import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class CarpentryRecipeTypes {

    public static RecipeType<CarpentryRecipe> CARPENTRY = register("carpentry");

    public static void registerRecipeTypes() {
        log.info("Register recipe types");
    }

   private static <T extends Recipe<?>> RecipeType<T> register(String id) {
        return Registry.register(BuiltInRegistries.RECIPE_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, id), new RecipeType<T>() {
            public String toString() {
                return id;
            }
        });
    }
}
