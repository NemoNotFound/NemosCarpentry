package com.nemonotfound.nemos.carpentry.mixin;

import com.nemonotfound.nemos.carpentry.client.recipebook.ClientCarpentryRecipeManager;
import com.nemonotfound.nemos.carpentry.interfaces.CarpentryRecipeManagerGetter;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ClientLevel.class)
public class ClientLevelMixin implements CarpentryRecipeManagerGetter {

    @Shadow @Final
    private ClientPacketListener connection;

    @Override
    public ClientCarpentryRecipeManager nemo_sCarpentry$getModRecipeManager() {
        return ((CarpentryRecipeManagerGetter) connection).nemo_sCarpentry$getModRecipeManager();
    }
}
