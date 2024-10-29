package com.nemonotfound.nemoscarpentry.interfaces;

import com.nemonotfound.nemoscarpentry.client.recipebook.ClientModRecipeManager;
import com.nemonotfound.nemoscarpentry.recipe.display.CarpentryRecipeDisplay;

public interface ModRecipeManagerGetter {

    default ClientModRecipeManager nemo_sCarpentry$getModRecipeManager() {
        return new ClientModRecipeManager(CarpentryRecipeDisplay.Grouping.empty());
    }
}
