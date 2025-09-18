package com.devnemo.nemos.carpentry.mixin;

import com.devnemo.nemos.carpentry.client.recipebook.ClientModRecipeManager;
import com.devnemo.nemos.carpentry.interfaces.ModRecipeManagerGetter;
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
        return ((ModRecipeManagerGetter) networkHandler).nemo_sCarpentry$getModRecipeManager();
    }
}
