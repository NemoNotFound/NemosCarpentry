package com.nemonotfound.nemoscarpentry.mixin;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

@Mixin(BlockEntity.class)
public class BlockEntityMixin {

    @ModifyVariable(at = @At("HEAD"), method = "createFromNbt", ordinal = 0, argsOnly = true)
    private static NbtCompound fixMissingFromRegistry(NbtCompound nbt) {
        String id = nbt.getString("id");
        String[] splitId = id.split(":");

        if (splitId[0].equals("nemos-carpenting")) {
            splitId[0] = MOD_ID;
        }

        if (splitId[1].equals("carpenting_table_block_entity")) {
            splitId[1] = "carpenters_workbench_block_entity";
        }

        String newId = splitId[0] + ":" + splitId[1];

        if (!id.equals(newId)) {
            nbt.putString("id", newId);
        }

        return nbt;
    }
}
