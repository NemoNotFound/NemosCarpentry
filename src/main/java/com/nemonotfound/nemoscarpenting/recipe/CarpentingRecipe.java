package com.nemonotfound.nemoscarpenting.recipe;

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

public class CarpentingRecipe implements Recipe<Inventory> {

    private final ItemStack result;
    private final List<Ingredient> ingredients;
    private final String tool;

    public CarpentingRecipe(ItemStack result, List<Ingredient> ingredients, String tool) {
        this.result = result;
        this.ingredients = ingredients;
        this.tool = tool;
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return ingredients.get(0).test(inventory.getStack(0));
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
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> ingredients = DefaultedList.ofSize(this.ingredients.size());
        ingredients.addAll(this.ingredients);

        return ingredients;
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

    public static class Type implements RecipeType<CarpentingRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "carpenting";
    }

    public static class Serializer implements RecipeSerializer<CarpentingRecipe> {

        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "carpenting";
        public static final Codec<CarpentingRecipe> CODEC = RecordCodecBuilder.create(instance -> instance.group(
                getResultStackCodec().forGetter(recipe -> recipe.result),
                validateAmount(Ingredient.DISALLOW_EMPTY_CODEC, 2).fieldOf("ingredients").forGetter(CarpentingRecipe::getIngredients),
                Codecs.createStrictOptionalFieldCodec(Codec.STRING, "tool", "none").forGetter(recipe -> recipe.tool)
        ).apply(instance, CarpentingRecipe::new));

        private static MapCodec<ItemStack> getResultStackCodec() {
            return RecordCodecBuilder.mapCodec((instance) ->
                    instance.group(Registries.ITEM.getCodec().fieldOf("result").forGetter(ItemStack::getItem),
                            Codec.INT.fieldOf("count").forGetter(ItemStack::getCount)).apply(instance, ItemStack::new));
        }

        private static Codec<List<Ingredient>> validateAmount(Codec<Ingredient> delegate, int max) {
            return Codecs.validate(Codecs.validate(
                    delegate.listOf(), list -> list.size() > max ? DataResult.error(() -> "Recipe has too many ingredients!") : DataResult.success(list)
            ), list -> list.isEmpty() ? DataResult.error(() -> "Recipe has no ingredients!") : DataResult.success(list));
        }

        @Override
        public Codec<CarpentingRecipe> codec() {
            return CODEC;
        }

        @Override
        public CarpentingRecipe read(PacketByteBuf buf) {
            Ingredient firstIngredient = Ingredient.fromPacket(buf);
            Ingredient secondIngredient = Ingredient.fromPacket(buf);
            ItemStack result = buf.readItemStack();
            String tool = buf.readString();

            DefaultedList<Ingredient> ingredients = DefaultedList.of();
            ingredients.add(firstIngredient);
            ingredients.add(secondIngredient);

            return new CarpentingRecipe(result, ingredients, tool);
        }

        @Override
        public void write(PacketByteBuf buf, CarpentingRecipe recipe) {
            for (Ingredient ingredient : recipe.getIngredients()) {
                ingredient.write(buf);
            }
            buf.writeItemStack(recipe.result);
            buf.writeString(recipe.getTool());
        }
    }
}
