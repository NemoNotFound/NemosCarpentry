package com.nemonotfound.nemoscarpentry.datagen;

import com.mojang.datafixers.util.Pair;
import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CarpentryRecipeJsonBuilder implements CraftingRecipeJsonBuilder {

    private final RecipeCategory category;
    private final Item output;
    private final int count;
    private final List<Pair<Ingredient, Integer>> ingredientPairs = new ArrayList<>();
    private final String tool;
    private final Map<String, AdvancementCriterion<?>> advancementBuilder = new LinkedHashMap();

    public CarpentryRecipeJsonBuilder(RecipeCategory category, ItemConvertible output, int count, String tool) {
        this.category = category;
        this.output = output.asItem();
        this.count = count;
        this.tool = tool.equals("saw") ? tool : "none";
    }

    public static CarpentryRecipeJsonBuilder create(RecipeCategory category, ItemConvertible output) {
        return new CarpentryRecipeJsonBuilder(category, output, 1, "none");
    }

    public static CarpentryRecipeJsonBuilder create(RecipeCategory category, ItemConvertible output, String tool) {
        return new CarpentryRecipeJsonBuilder(category, output, 1, tool);
    }

    public static CarpentryRecipeJsonBuilder create(RecipeCategory category, ItemConvertible output, int count, String tool) {
        return new CarpentryRecipeJsonBuilder(category, output, count, tool);
    }


    public CarpentryRecipeJsonBuilder input(Ingredient ingredient) {
        return this.input(ingredient, 1);
    }

    public CarpentryRecipeJsonBuilder input(Ingredient ingredient, int ingredientCount) {
        this.ingredientPairs.add(Pair.of(ingredient, ingredientCount));

        return this;
    }

    @Override
    public CarpentryRecipeJsonBuilder criterion(String string, AdvancementCriterion<?> advancementCriterion) {
        this.advancementBuilder.put(string, advancementCriterion);
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
    public void offerTo(RecipeExporter exporter, Identifier recipeId) {

    }
}
