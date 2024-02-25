package com.nemonotfound.nemoscarpenting.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeCodecs;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RecipeCodecs.class)
public class IngredientMixin {

    @Mutable
    @Shadow @Final
    static Codec<ItemStack> INGREDIENT;

    @Shadow @Final public static Codec<ItemStack> CRAFTING_RESULT;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void modifyIngredient(CallbackInfo callbackInfo) {

    }
}
