package com.nemonotfound.nemos.carpentry.mixin;

import com.nemonotfound.nemos.carpentry.interfaces.MinecraftGetter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientCommonPacketListenerImpl;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ClientCommonPacketListenerImpl.class)
public class ClientCommonPacketListenerImplMixin implements MinecraftGetter {

    @Shadow @Final protected Minecraft minecraft;

    @Override
    public Minecraft nemo_sCarpentry$getMinecraft() {
        return minecraft;
    }
}
