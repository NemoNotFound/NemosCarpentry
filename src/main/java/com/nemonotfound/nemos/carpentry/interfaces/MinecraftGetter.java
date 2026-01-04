package com.nemonotfound.nemos.carpentry.interfaces;

import net.minecraft.client.Minecraft;

public interface MinecraftGetter {

    default Minecraft nemo_sCarpentry$getMinecraft() {
        return null;
    }
}
