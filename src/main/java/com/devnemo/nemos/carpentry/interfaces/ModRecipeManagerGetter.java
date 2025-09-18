package com.devnemo.nemos.carpentry.interfaces;

import com.devnemo.nemos.carpentry.client.recipebook.ClientModRecipeManager;
import com.devnemo.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;

public interface ModRecipeManagerGetter {

    default ClientModRecipeManager nemo_sCarpentry$getModRecipeManager() {
        return new ClientModRecipeManager(CarpentryRecipeDisplay.Grouping.empty());
    }
}
