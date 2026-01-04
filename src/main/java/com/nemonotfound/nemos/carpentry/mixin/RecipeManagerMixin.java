package com.nemonotfound.nemos.carpentry.mixin;

import com.nemonotfound.nemos.carpentry.interfaces.CarpentryRecipeGetter;
import com.nemonotfound.nemos.carpentry.recipe.CarpentryRecipe;
import com.nemonotfound.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin implements CarpentryRecipeGetter {

    @Shadow private RecipeMap recipes;
    @Unique
    private CarpentryRecipeDisplay.Grouping carpentryRecipes;

    @Override
    public CarpentryRecipeDisplay.Grouping nemo_sCarpentry$getCarpentryRecipeForSync() {
        return this.carpentryRecipes;
    }

    @Override
    public CarpentryRecipeDisplay.Grouping nemo_sCarpentry$getCarpentryRecipes() {
        return this.carpentryRecipes;
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void init(HolderLookup.Provider registries, CallbackInfo ci) {
        carpentryRecipes = CarpentryRecipeDisplay.Grouping.empty();
    }

    @Inject(method = "finalizeRecipeLoading", at = @At("TAIL"))
    private void finalizeRecipeLoading(FeatureFlagSet featureFlagSet, CallbackInfo ci) {
        List<CarpentryRecipeDisplay.GroupEntry> carpentryRecipeEntries = new ArrayList<>();
        this.recipes.values().forEach(
                recipeEntry -> {
                    Recipe<?> recipe = recipeEntry.value();
                    if (recipe instanceof CarpentryRecipe carpentryRecipe) {
                        carpentryRecipeEntries.add(new CarpentryRecipeDisplay.GroupEntry(carpentryRecipe.getIngredients(),
                                carpentryRecipe.getInputCounts(), new CarpentryRecipeDisplay(carpentryRecipe.createResultDisplay(), Optional.of((RecipeHolder<CarpentryRecipe>) recipeEntry))));
                    }
                }
        );

        this.carpentryRecipes = new CarpentryRecipeDisplay.Grouping(carpentryRecipeEntries);
    }
}
