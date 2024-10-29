package com.nemonotfound.nemoscarpentry.mixin;

import com.nemonotfound.nemoscarpentry.network.listener.ModClientPlayPacketListener;
import net.minecraft.network.listener.ClientPlayPacketListener;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientPlayPacketListener.class)
public interface ClientPlayPacketListenerMixin extends ModClientPlayPacketListener {
}
