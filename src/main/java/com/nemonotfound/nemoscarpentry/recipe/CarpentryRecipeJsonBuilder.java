package com.nemonotfound.nemoscarpentry.recipe;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.advancement.AdvancementRequirements;
import net.minecraft.advancement.AdvancementRewards;
import net.minecraft.advancement.criterion.RecipeUnlockedCriterion;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKey;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CarpentryRecipeJsonBuilder implements CraftingRecipeJsonBuilder {

    private final RecipeCategory category;
    private final CarpentryRecipe.RecipeFactory<?> recipeFactory;
    private final List<Ingredient> ingredients;
    private final List<Integer> inputCounts;
    private final Item output;
    private final int count;
    private final boolean requiresTool;
    private final Map<String, AdvancementCriterion<?>> criteria = new LinkedHashMap<>();

    public CarpentryRecipeJsonBuilder(RecipeCategory category, CarpentryRecipe.RecipeFactory<?> recipeFactory,
                                      List<Ingredient> ingredients, List<Integer> inputCounts, ItemConvertible output,
                                      int count, boolean requiresTool) {
        this.category = category;
        this.recipeFactory = recipeFactory;
        this.ingredients = ingredients;
        this.inputCounts = inputCounts;
        this.output = output.asItem();
        this.count = count;
        this.requiresTool = requiresTool;
    }

    public static CarpentryRecipeJsonBuilder createCarpentry(RecipeCategory category, List<Ingredient> ingredients,
                                                             List<Integer> inputCounts, ItemConvertible output, int count, boolean requiresTool) {
        return new CarpentryRecipeJsonBuilder(category, CarpentryRecipe::new, ingredients, inputCounts, output, count, requiresTool);
    }

    @Override
    public CarpentryRecipeJsonBuilder criterion(String string, AdvancementCriterion<?> advancementCriterion) {
        this.criteria.put(string, advancementCriterion);
        return this;
    }

    @Override
    public CraftingRecipeJsonBuilder group(@Nullable String group) {
        return null;
    }

    @Override
    public Item getOutputItem() {
        return this.output;
    }

    @Override
    public void offerTo(RecipeExporter exporter, RegistryKey<Recipe<?>> recipeKey) {
        this.validate(recipeKey);
        Advancement.Builder builder = exporter.getAdvancementBuilder()
                .criterion("has_the_recipe", RecipeUnlockedCriterion.create(recipeKey))
                .rewards(AdvancementRewards.Builder.recipe(recipeKey))
                .criteriaMerger(AdvancementRequirements.CriterionMerger.OR);
        this.criteria.forEach(builder::criterion);
        CarpentryRecipe carpentryRecipe = this.recipeFactory
                .create(this.ingredients, this.inputCounts, this.requiresTool, new ItemStack(this.output, this.count));
        exporter.accept(recipeKey, carpentryRecipe, builder.build(recipeKey.getValue().withPrefixedPath("recipes/" + this.category.getName() + "/")));
    }

    private void validate(RegistryKey<Recipe<?>> recipeKey) {
        if (this.criteria.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + recipeKey.getValue());
        }
    }
}
