package com.nemonotfound.nemoscarpentry.recipe;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
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

    @Override
    public ItemStack craft(Inventory inventory, RegistryWrapper.WrapperLookup lookup) {
        return result.copy();
    }

    public List<Pair<Ingredient, Integer>> getIngredientPairs() {
        return ingredientPairs;
    }


    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
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
        public static final MapCodec<CarpentryRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
                getResultStackCodec().forGetter(recipe -> recipe.result),
                validateAmount(Codec.pair(Ingredient.DISALLOW_EMPTY_CODEC, Codec.INT.optionalFieldOf("itemCount", 1)
                        .codec())).fieldOf("ingredients").forGetter(CarpentryRecipe::getIngredientPairs),
                Codec.STRING.optionalFieldOf("tool", "none").forGetter((CarpentryRecipe recipe) -> recipe.tool)
        ).apply(instance, CarpentryRecipe::new));
        private final PacketCodec<RegistryByteBuf, CarpentryRecipe> packetCodec;
        public static final String ID = "carpentry";
        private static final int maxIngredients = 2;

        public Serializer() {
            this.packetCodec = PacketCodec.ofStatic(this::write, this::read);
        }

        private static MapCodec<ItemStack> getResultStackCodec() {
            return RecordCodecBuilder.mapCodec((instance) ->
                    instance.group(Registries.ITEM.getCodec().fieldOf("result").forGetter(ItemStack::getItem),
                            Codec.INT.fieldOf("count").forGetter(ItemStack::getCount)).apply(instance, ItemStack::new));
        }

        private static Codec<List<Pair<Ingredient, Integer>>> validateAmount(Codec<Pair<Ingredient, Integer>> delegate) {
            return delegate.listOf().validate(list -> list.size() > maxIngredients ? DataResult.error(() ->
                            "Recipe has too many ingredients!") : DataResult.success(list))
                    .validate(list -> list.isEmpty() ? DataResult.error(() -> "Recipe has no ingredients!") :
                            DataResult.success(list));
        }

        @Override
        public MapCodec<CarpentryRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, CarpentryRecipe> packetCodec() {
            return packetCodec;
        }

        public CarpentryRecipe read(RegistryByteBuf buf) {
            DefaultedList<Pair<Ingredient, Integer>> ingredientPairs = DefaultedList.of();
            int ingredientCount = buf.readInt();
            Ingredient firstIngredient = Ingredient.PACKET_CODEC.decode(buf);
            int firstIngredientCount = buf.readInt();
            ingredientPairs.add(Pair.of(firstIngredient, firstIngredientCount));

            if (ingredientCount == 2) {
                Ingredient secondIngredient = Ingredient.PACKET_CODEC.decode(buf);
                int secondIngredientCount = buf.readInt();

                ingredientPairs.add(Pair.of(secondIngredient, secondIngredientCount));
            }

            ItemStack result = ItemStack.PACKET_CODEC.decode(buf);
            String tool = buf.readString();

            return new CarpentryRecipe(result, ingredientPairs, tool);
        }

        public void write(RegistryByteBuf buf, CarpentryRecipe recipe) {
            List<Pair<Ingredient, Integer>> ingredientPairs = recipe.getIngredientPairs();
            buf.writeInt(ingredientPairs.size());
            for (Pair<Ingredient, Integer> ingredientPair : recipe.getIngredientPairs()) {
                Ingredient.PACKET_CODEC.encode(buf, ingredientPair.getFirst());
                buf.writeInt(ingredientPair.getSecond());
            }
            ItemStack.PACKET_CODEC.encode(buf, recipe.result);
            buf.writeString(recipe.getTool());
        }
    }
}
