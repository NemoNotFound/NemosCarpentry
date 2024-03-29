package com.nemonotfound.nemoscarpentry.mixin;

import com.google.gson.JsonObject;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.JsonHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(Ingredient.class)
public class IngredientMixin {

    @ModifyReturnValue(method = "entryFromJson", slice = @Slice(from = @At(value = "INVOKE",
            target = "Lnet/minecraft/recipe/ShapedRecipe;getItem(Lcom/google/gson/JsonObject;)Lnet/minecraft/item/Item;")),
            at = @At(value = "RETURN"))
    private static Ingredient.Entry entryFromJson(Ingredient.Entry original, JsonObject json, @Local(ordinal = 0) Item item) {
        return new Ingredient.StackEntry(new ItemStack(item, JsonHelper.getInt(json, "itemCount", 1)));
    }
}
