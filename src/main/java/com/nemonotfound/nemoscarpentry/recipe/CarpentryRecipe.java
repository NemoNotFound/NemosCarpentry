package com.nemonotfound.nemoscarpentry.recipe;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.World;

import java.util.List;

public class CarpentryRecipe implements Recipe<Inventory> {

    private final ItemStack result;
    private final List<Pair<Ingredient, Integer>> ingredientPairs;
    private final String tool;

    public CarpentryRecipe(ItemStack result, List<Pair<Ingredient, Integer>> ingredientPairs, String tool) {
        this.result = result;
        this.ingredientPairs = ingredientPairs;
        this.tool = tool;
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return ingredientPairs.get(0).getFirst().test(inventory.getStack(0));
    }

    public List<Pair<Ingredient, Integer>> getIngredientPairs() {
        return ingredientPairs;
    }

    @Override
    public ItemStack craft(Inventory inventory, DynamicRegistryManager registryManager) {
        return result.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(DynamicRegistryManager registryManager) {
        return result;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public String getTool() {
        return this.tool;
    }

    public static class Type implements RecipeType<CarpentryRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "carpentry";
    }

    public static class Serializer implements RecipeSerializer<CarpentryRecipe> {

        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "carpentry";
        public static final Codec<CarpentryRecipe> CODEC = RecordCodecBuilder.create(instance -> instance.group(
                getResultStackCodec().forGetter(recipe -> recipe.result),
                validateAmount(Codec.pair(Ingredient.DISALLOW_EMPTY_CODEC, Codec.INT.optionalFieldOf("itemCount", 1)
                        .codec()), 2).fieldOf("ingredients").forGetter(CarpentryRecipe::getIngredientPairs),
                Codecs.createStrictOptionalFieldCodec(Codec.STRING, "tool", "none").forGetter(recipe -> recipe.tool)
        ).apply(instance, CarpentryRecipe::new));

        private static MapCodec<ItemStack> getResultStackCodec() {
            return RecordCodecBuilder.mapCodec((instance) ->
                    instance.group(Registries.ITEM.getCodec().fieldOf("result").forGetter(ItemStack::getItem),
                            Codec.INT.fieldOf("count").forGetter(ItemStack::getCount)).apply(instance, ItemStack::new));
        }

        private static Codec<List<Pair<Ingredient, Integer>>> validateAmount(Codec<Pair<Ingredient, Integer>> delegate, int max) {
            return Codecs.validate(Codecs.validate(
                    delegate.listOf(), list -> list.size() > max ? DataResult.error(() -> "Recipe has too many ingredients!") : DataResult.success(list)
            ), list -> list.isEmpty() ? DataResult.error(() -> "Recipe has no ingredients!") : DataResult.success(list));
        }

        @Override
        public Codec<CarpentryRecipe> codec() {
            return CODEC;
        }

        @Override
        public CarpentryRecipe read(PacketByteBuf buf) {
            DefaultedList<Pair<Ingredient, Integer>> ingredientPairs = DefaultedList.of();
            int ingredientCount = buf.readInt();
            Ingredient firstIngredient = Ingredient.fromPacket(buf);
            int firstIngredientCount = buf.readInt();
            ingredientPairs.add(Pair.of(firstIngredient, firstIngredientCount));

            if (ingredientCount == 2) {
                Ingredient secondIngredient = Ingredient.fromPacket(buf);
                int secondIngredientCount = buf.readInt();

                ingredientPairs.add(Pair.of(secondIngredient, secondIngredientCount));
            }

            ItemStack result = buf.readItemStack();
            String tool = buf.readString();

            return new CarpentryRecipe(result, ingredientPairs, tool);
        }

        @Override
        public void write(PacketByteBuf buf, CarpentryRecipe recipe) {
            List<Pair<Ingredient, Integer>> ingredientPairs = recipe.getIngredientPairs();
            buf.writeInt(ingredientPairs.size());
            for (Pair<Ingredient, Integer> ingredientPair : recipe.getIngredientPairs()) {
                ingredientPair.getFirst().write(buf);
                buf.writeInt(ingredientPair.getSecond());
            }
            buf.writeItemStack(recipe.result);
            buf.writeString(recipe.getTool());
        }
    }
}
