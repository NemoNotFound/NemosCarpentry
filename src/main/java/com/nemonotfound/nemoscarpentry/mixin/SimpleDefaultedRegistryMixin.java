package com.nemonotfound.nemoscarpentry.mixin;

import net.minecraft.registry.SimpleDefaultedRegistry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import static com.nemonotfound.NemosCarpentry.MOD_ID;

@Mixin(SimpleDefaultedRegistry.class)
public class SimpleDefaultedRegistryMixin {

        @ModifyVariable(at = @At("HEAD"), method = "get(Lnet/minecraft/util/Identifier;)Ljava/lang/Object;", ordinal = 0, argsOnly = true)
        Identifier fixMissingFromRegistry(@Nullable Identifier id) {
        if (id != null) {
            if (id.getPath().contains("glass_front")) {
                return new Identifier(MOD_ID, id.getPath().replace("glass_front", "glass"));
            }
            if (id.getPath().equals("carpenting_table")) {
                return new Identifier(MOD_ID, "carpenters_workbench");
            }
            if (id.getPath().equals("carpenting_table_block_entity")) {
                return new Identifier(MOD_ID, "carpenters_workbench_block_entity");
            }
            if (id.getNamespace().contains("nemos-carpenting")) {
                return new Identifier(MOD_ID, id.getPath());
            }
        }
        return id;
    }
}
