package com.nemonotfound.nemos.carpentry.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.nemonotfound.nemos.carpentry.item.CarpentryItems;
import com.nemonotfound.nemos.carpentry.recipe.book.CarpentryRecipeBookCategory;
import com.nemonotfound.nemos.carpentry.recipe.display.CarpentersWorkbenchRecipeDisplay;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.item.crafting.display.RecipeDisplay;
import net.minecraft.world.item.crafting.display.SlotDisplay;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CarpentryRecipe implements Recipe<SingleRecipeInput> {

    private final List<Ingredient> ingredients;
    private final List<Integer> inputCounts;
    private final ItemStack result;
    @Nullable
    private PlacementInfo placementInfo;

    public CarpentryRecipe(List<Ingredient> ingredients, List<Integer> inputCounts, ItemStack result) {
        this.ingredients = ingredients;
        this.inputCounts = inputCounts;
        this.result = result;
    }

    @Override
    public @NotNull RecipeSerializer<@NotNull CarpentryRecipe> getSerializer() {
        return CarpentryRecipeSerializer.CARPENTRY;
    }

    @Override
    public @NotNull RecipeType<@NotNull CarpentryRecipe> getType() {
        return CarpentryRecipeTypes.CARPENTRY;
    }

    @Override
    public @NotNull List<RecipeDisplay> display() {
        List<SlotDisplay> ingredientSlotDisplays = this.ingredients.stream()
                .map(Ingredient::display)
                .toList();

        return List.of(
                new CarpentersWorkbenchRecipeDisplay(
                        ingredientSlotDisplays,
                        this.createResultDisplay(),
                        new SlotDisplay.ItemSlotDisplay(CarpentryItems.CARPENTERS_WORKBENCH)
                )
        );
    }

    public SlotDisplay createResultDisplay() {
        return new SlotDisplay.ItemStackSlotDisplay(this.getResult());
    }

    @Override
    public @NotNull RecipeBookCategory recipeBookCategory() {
        return CarpentryRecipeBookCategory.CARPENTERS_WORKBENCH;
    }

    @Override
    public boolean matches(SingleRecipeInput singleRecipeInput, @NotNull Level level) {
        return this.ingredients.get(0).test(singleRecipeInput.getItem(0));
    }

    @Override
    public @NotNull ItemStack assemble(SingleRecipeInput singleRecipeInput, HolderLookup.@NotNull Provider lookup) {
        return result.copy();
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<Integer> getInputCounts() {
        return inputCounts;
    }

    public ItemStack getResult() {
        return result;
    }

    //TODO: MAKE AVAILABLE FOR DOUBLE
    public @NotNull PlacementInfo placementInfo() {
        if (this.placementInfo == null) {
            this.placementInfo = PlacementInfo.create(this.ingredients.get(0));
        }

        return this.placementInfo;
    }

    @FunctionalInterface
    public interface RecipeFactory<T extends CarpentryRecipe> {
        T create(List<Ingredient> ingredients, List<Integer> inputCounts, ItemStack result);
    }

    public static class Serializer<T extends CarpentryRecipe> implements RecipeSerializer<T> {

        private final MapCodec<T> codec;
        private final StreamCodec<RegistryFriendlyByteBuf, T> streamCodec;

        protected Serializer(CarpentryRecipe.RecipeFactory<T> recipeFactory) {
            this.codec = RecordCodecBuilder.mapCodec(
                    instance -> instance.group(
                                    Ingredient.CODEC.listOf(1, 2).fieldOf("ingredients").forGetter(CarpentryRecipe::getIngredients),
                                    Codec.INT.listOf(1, 2).fieldOf("inputCounts").forGetter(CarpentryRecipe::getInputCounts),
                                    ItemStack.STRICT_CODEC.fieldOf("result").forGetter(CarpentryRecipe::getResult)
                            )
                            .apply(instance, recipeFactory::create)
            );
            this.streamCodec = StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC.apply(ByteBufCodecs.list()),
                    CarpentryRecipe::getIngredients,
                    ByteBufCodecs.INT.apply(ByteBufCodecs.list()),
                    CarpentryRecipe::getInputCounts,
                    ItemStack.STREAM_CODEC,
                    CarpentryRecipe::getResult,
                    recipeFactory::create
            );
        }

        @Override
        public @NotNull MapCodec<T> codec() {
            return codec;
        }

        @Override
        public @NotNull StreamCodec<RegistryFriendlyByteBuf, T> streamCodec() {
            return streamCodec;
        }
    }
}
