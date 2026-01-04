package com.nemonotfound.nemos.carpentry.recipe.display;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.log;

public class CarpentryRecipeDisplays {

    public static void registerRecipeDisplays() {
        log.info("Registering recipe displays");

        Registry.register(BuiltInRegistries.RECIPE_DISPLAY, "carpenters_workbench", CarpentersWorkbenchRecipeDisplay.SERIALIZER);
    }
}
