package com.nemonotfound.nemoscarpentry.interfaces;

import com.nemonotfound.nemoscarpentry.recipe.display.CarpentryRecipeDisplay;

public interface CarpentryRecipeGetter {

    default CarpentryRecipeDisplay.Grouping nemo_sCarpentry$getCarpentryRecipeForSync() {
        return CarpentryRecipeDisplay.Grouping.empty();
    }

    default CarpentryRecipeDisplay.Grouping nemo_sCarpentry$getCarpentryRecipes() {
        return CarpentryRecipeDisplay.Grouping.empty();
    }
}
