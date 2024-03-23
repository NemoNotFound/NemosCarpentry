package com.nemonotfound.nemoscarpentry.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import static com.nemonotfound.NemosCarpentry.MOD_ID;

@Mixin(ItemStack.class)
public class ItemStackMixin {

    @ModifyVariable(at = @At("HEAD"), method = "fromNbt", ordinal = 0, argsOnly = true)
    private static NbtCompound fixMissingFromRegistry(NbtCompound nbt) {
        String id = nbt.getString("id");
        String[] splitId = id.split(":");

        if (splitId.length == 2) {
            if (splitId[0].equals("nemos-carpenting")) {
                splitId[0] = MOD_ID;
            }

            if (splitId[1].equals("carpenting_table")) {
                splitId[1] = "carpenters_workbench";
            } else if (splitId[1].contains("glass_front")) {
                splitId[1] = splitId[1].replace("glass_front", "glass");
            }

            String newId = splitId[0] + ":" + splitId[1];

            if (!id.equals(newId)) {
                nbt.putString("id", newId);
            }
        }

        return nbt;
    }
}