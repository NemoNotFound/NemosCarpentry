package com.nemonotfound.nemoscarpentry.mixin;

import com.nemonotfound.nemoscarpentry.interfaces.MinecraftClientGetter;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientCommonNetworkHandler;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ClientCommonNetworkHandler.class)
public class ClientCommonNetworkHandlerMixin implements MinecraftClientGetter {

    @Shadow @Final protected MinecraftClient client;

    @Override
    public MinecraftClient nemo_sCarpentry$getMinecraftClient() {
        return client;
    }
}
