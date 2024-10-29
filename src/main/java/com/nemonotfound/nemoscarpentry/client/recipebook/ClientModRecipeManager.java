package com.nemonotfound.nemoscarpentry.client.recipebook;

import com.nemonotfound.nemoscarpentry.recipe.display.CarpentryRecipeDisplay;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ClientModRecipeManager {

    private final CarpentryRecipeDisplay.Grouping carpentryRecipes;

    public ClientModRecipeManager(CarpentryRecipeDisplay.Grouping carpentryRecipes) {
        this.carpentryRecipes = carpentryRecipes;
    }

    public CarpentryRecipeDisplay.Grouping getCarpentryRecipes() {
        return this.carpentryRecipes;
    }
}
