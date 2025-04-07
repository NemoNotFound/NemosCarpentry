package com.nemonotfound.nemos.carpentry.interfaces;

import com.nemonotfound.nemos.carpentry.client.recipebook.ClientModRecipeManager;
import com.nemonotfound.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;

public interface ModRecipeManagerGetter {

    default ClientModRecipeManager nemo_sCarpentry$getModRecipeManager() {
        return new ClientModRecipeManager(CarpentryRecipeDisplay.Grouping.empty());
    }
}
