package com.devnemo.nemos.carpentry.interfaces;

import net.minecraft.client.MinecraftClient;

public interface MinecraftClientGetter {

    default MinecraftClient nemo_sCarpentry$getMinecraftClient() {
        return null;
    }
}
