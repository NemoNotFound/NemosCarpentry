package com.nemonotfound.nemos.carpentry.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.nemonotfound.nemos.carpentry.item.ModItems;
import com.nemonotfound.nemos.carpentry.recipe.book.ModRecipeBookCategory;
import com.nemonotfound.nemos.carpentry.recipe.display.CarpentersWorkbenchRecipeDisplay;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.recipe.*;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.recipe.display.RecipeDisplay;
import net.minecraft.recipe.display.SlotDisplay;
import net.minecraft.recipe.input.SingleStackRecipeInput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CarpentryRecipe implements Recipe<SingleStackRecipeInput> {

    private final List<Ingredient> ingredients;
    private final List<Integer> inputCounts;
    private final ItemStack result;
    @Nullable
    private IngredientPlacement ingredientPlacement;

    public CarpentryRecipe(List<Ingredient> ingredients, List<Integer> inputCounts, ItemStack result) {
        this.ingredients = ingredients;
        this.inputCounts = inputCounts;
        this.result = result;
    }

    @Override
    public RecipeSerializer<CarpentryRecipe> getSerializer() {
        return ModRecipeSerializer.CARPENTRY;
    }

    @Override
    public RecipeType<CarpentryRecipe> getType() {
        return ModRecipeTypes.CARPENTRY;
    }

    @Override
    public List<RecipeDisplay> getDisplays() {
        List<SlotDisplay> ingredientSlotDisplays = this.ingredients.stream()
                .map(Ingredient::toDisplay)
                .toList();

        return List.of(
                new CarpentersWorkbenchRecipeDisplay(
                        ingredientSlotDisplays,
                        this.createResultDisplay(),
                        new SlotDisplay.ItemSlotDisplay(ModItems.CARPENTERS_WORKBENCH)
                )
        );
    }

    public SlotDisplay createResultDisplay() {
        return new SlotDisplay.StackSlotDisplay(this.getResult());
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return ModRecipeBookCategory.CARPENTERS_WORKBENCH;
    }

    @Override
    public boolean matches(SingleStackRecipeInput singleStackRecipeInput, World world) {
        return this.ingredients.get(0).test(singleStackRecipeInput.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(SingleStackRecipeInput singleStackRecipeInput, RegistryWrapper.WrapperLookup lookup) {
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
    @Override
    public IngredientPlacement getIngredientPlacement() {
        if (this.ingredientPlacement == null) {
            this.ingredientPlacement = IngredientPlacement.forSingleSlot(this.ingredients.get(0));
        }

        return this.ingredientPlacement;
    }

    @FunctionalInterface
    public interface RecipeFactory<T extends CarpentryRecipe> {
        T create(List<Ingredient> ingredients, List<Integer> inputCounts, ItemStack result);
    }

    public static class Serializer<T extends CarpentryRecipe> implements RecipeSerializer<T> {

        private final MapCodec<T> codec;
        private final PacketCodec<RegistryByteBuf, T> packetCodec;

        protected Serializer(CarpentryRecipe.RecipeFactory<T> recipeFactory) {
            this.codec = RecordCodecBuilder.mapCodec(
                    instance -> instance.group(
                                    Ingredient.CODEC.listOf(1, 2).fieldOf("ingredients").forGetter(CarpentryRecipe::getIngredients),
                                    Codec.INT.listOf(1, 2).fieldOf("inputCounts").forGetter(CarpentryRecipe::getInputCounts),
                                    ItemStack.VALIDATED_CODEC.fieldOf("result").forGetter(CarpentryRecipe::getResult)
                            )
                            .apply(instance, recipeFactory::create)
            );
            this.packetCodec = PacketCodec.tuple(
                    Ingredient.PACKET_CODEC.collect(PacketCodecs.toList()),
                    CarpentryRecipe::getIngredients,
                    PacketCodecs.INTEGER.collect(PacketCodecs.toList()),
                    CarpentryRecipe::getInputCounts,
                    ItemStack.PACKET_CODEC,
                    CarpentryRecipe::getResult,
                    recipeFactory::create
            );
        }

        @Override
        public MapCodec<T> codec() {
            return codec;
        }

        @Override
        public PacketCodec<RegistryByteBuf, T> packetCodec() {
            return packetCodec;
        }
    }
}
