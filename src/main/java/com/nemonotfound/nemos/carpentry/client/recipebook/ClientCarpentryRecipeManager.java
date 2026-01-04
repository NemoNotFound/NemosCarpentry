package com.nemonotfound.nemos.carpentry.client.recipebook;

import com.nemonotfound.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record ClientCarpentryRecipeManager(CarpentryRecipeDisplay.Grouping carpentryRecipes) {

}
