package com.nemonotfound.nemos.carpentry.interfaces;

import net.minecraft.client.MinecraftClient;

public interface MinecraftClientGetter {

    default MinecraftClient nemo_sCarpentry$getMinecraftClient() {
        return null;
    }
}
