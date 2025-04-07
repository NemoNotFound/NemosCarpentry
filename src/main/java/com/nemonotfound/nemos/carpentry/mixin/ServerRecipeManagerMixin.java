package com.nemonotfound.nemos.carpentry.mixin;

import com.nemonotfound.nemos.carpentry.interfaces.CarpentryRecipeGetter;
import com.nemonotfound.nemos.carpentry.recipe.CarpentryRecipe;
import com.nemonotfound.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;
import net.minecraft.recipe.PreparedRecipes;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.ServerRecipeManager;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.resource.featuretoggle.FeatureSet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Mixin(ServerRecipeManager.class)
public abstract class ServerRecipeManagerMixin implements CarpentryRecipeGetter {

    @Shadow private PreparedRecipes preparedRecipes;
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
    private void init(RegistryWrapper.WrapperLookup registries, CallbackInfo ci) {
        carpentryRecipes = CarpentryRecipeDisplay.Grouping.empty();
    }

    @Inject(method = "initialize", at = @At("TAIL"))
    private void initialize(FeatureSet features, CallbackInfo ci) {
        List<CarpentryRecipeDisplay.GroupEntry> carpentryRecipeEntries = new ArrayList<>();
        this.preparedRecipes.recipes().forEach(
                recipeEntry -> {
                    Recipe<?> recipe = recipeEntry.value();
                    if (recipe instanceof CarpentryRecipe carpentryRecipe) {
                        carpentryRecipeEntries.add(new CarpentryRecipeDisplay.GroupEntry(carpentryRecipe.getIngredients(),
                                carpentryRecipe.getInputCounts(), carpentryRecipe.requiresTool(), new CarpentryRecipeDisplay(carpentryRecipe.createResultDisplay(), Optional.of((RecipeEntry<CarpentryRecipe>) recipeEntry))));
                    }
                }
        );

        this.carpentryRecipes = new CarpentryRecipeDisplay.Grouping(carpentryRecipeEntries);
    }
}
