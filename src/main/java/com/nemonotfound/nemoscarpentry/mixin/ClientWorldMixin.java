package com.nemonotfound.nemoscarpentry.mixin;

import com.nemonotfound.nemoscarpentry.client.recipebook.ClientModRecipeManager;
import com.nemonotfound.nemoscarpentry.interfaces.ModRecipeManagerGetter;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ClientWorld.class)
public class ClientWorldMixin implements ModRecipeManagerGetter {

    @Shadow @Final
    private ClientPlayNetworkHandler networkHandler;

    @Override
    public ClientModRecipeManager nemo_sCarpentry$getModRecipeManager() {
        return networkHandler.nemo_sCarpentry$getModRecipeManager();
    }
}
