package com.nemonotfound.nemos.carpentry.interfaces;

import com.nemonotfound.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;

public interface CarpentryRecipeGetter {

    default CarpentryRecipeDisplay.Grouping nemo_sCarpentry$getCarpentryRecipeForSync() {
        return CarpentryRecipeDisplay.Grouping.empty();
    }

    default CarpentryRecipeDisplay.Grouping nemo_sCarpentry$getCarpentryRecipes() {
        return CarpentryRecipeDisplay.Grouping.empty();
    }
}
