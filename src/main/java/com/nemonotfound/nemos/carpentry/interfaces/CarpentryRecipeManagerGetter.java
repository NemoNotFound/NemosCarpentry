package com.nemonotfound.nemos.carpentry.interfaces;

import com.nemonotfound.nemos.carpentry.client.recipebook.ClientCarpentryRecipeManager;
import com.nemonotfound.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;

public interface CarpentryRecipeManagerGetter {

    default ClientCarpentryRecipeManager nemo_sCarpentry$getModRecipeManager() {
        return new ClientCarpentryRecipeManager(CarpentryRecipeDisplay.Grouping.empty());
    }
}
