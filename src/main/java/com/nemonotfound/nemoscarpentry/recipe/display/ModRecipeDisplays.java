package com.nemonotfound.nemoscarpentry.recipe.display;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.log;

public class ModRecipeDisplays {

    public static void registerRecipeDisplays() {
        log.info("Registering recipe displays");

        Registry.register(Registries.RECIPE_DISPLAY, "carpenters_workbench", CarpentersWorkbenchRecipeDisplay.SERIALIZER);
    }
}
