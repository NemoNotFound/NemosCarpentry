package com.nemonotfound.nemoscarpentry.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

import java.util.List;

public class CarpentryRecipe implements Recipe<Inventory> {

    private final Identifier ID;
    private final ItemStack result;
    private final List<Ingredient> ingredients;
    private final String tool;

    public CarpentryRecipe(Identifier ID, ItemStack result, List<Ingredient> ingredients, String tool) {
        this.result = result;
        this.ingredients = ingredients;
        this.ID = ID;
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
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return result;
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> ingredients = DefaultedList.ofSize(this.ingredients.size());
        ingredients.addAll(this.ingredients);

        return ingredients;
    }

    @Override
    public Identifier getId() {
        return ID;
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

        @Override
        public CarpentryRecipe read(Identifier id, JsonObject json) {
            DefaultedList<Ingredient> ingredients = DefaultedList.ofSize(2, Ingredient.EMPTY);
            if (JsonHelper.hasArray(json, "ingredients")) {
                JsonArray jsonArray = JsonHelper.getArray(json, "ingredients");

                for (int i = 0; i < jsonArray.size(); i++) {
                    Ingredient ingredient = Ingredient.fromJson(jsonArray.get(i), false);
                    ingredients.set(i, ingredient);
                }
            } else {
                Ingredient ingredient = Ingredient.fromJson(JsonHelper.getObject(json, "ingredient"), false);
                ingredients.set(0, ingredient);
            }

            String result = JsonHelper.getString(json, "result");
            int resultCount = 1;
            if (JsonHelper.hasElement(json, "count")) {
                int count = JsonHelper.getInt(json, "count");
                resultCount = count > 0 ? count : 1;
            }

            ItemStack itemStack = new ItemStack(Registries.ITEM.get(new Identifier(result)), resultCount);
            String tool = "none";

            if (JsonHelper.hasString(json, "tool")) {
                String toolFromJson = JsonHelper.getString(json, "tool");
                if (toolFromJson.equalsIgnoreCase("saw")) {
                    tool = toolFromJson;
                }
            }

            return new CarpentryRecipe(id, itemStack, ingredients, tool);
        }

        @Override
        public CarpentryRecipe read(Identifier id, PacketByteBuf buf) {
            Ingredient firstIngredient = Ingredient.fromPacket(buf);
            Ingredient secondIngredient = Ingredient.fromPacket(buf);
            ItemStack result = buf.readItemStack();
            String tool = buf.readString();

            DefaultedList<Ingredient> ingredients = DefaultedList.of();
            ingredients.add(firstIngredient);
            ingredients.add(secondIngredient);

            return new CarpentryRecipe(id, result, ingredients, tool);
        }

        @Override
        public void write(PacketByteBuf buf, CarpentryRecipe recipe) {
            for (Ingredient ingredient : recipe.getIngredients()) {
                ingredient.write(buf);
            }
            buf.writeItemStack(recipe.result);
            buf.writeString(recipe.getTool());
        }
    }
}