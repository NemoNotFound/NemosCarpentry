package com.nemonotfound.nemos.carpentry.mixin;

import com.nemonotfound.nemos.carpentry.network.listener.ModClientPlayPacketListener;
import net.minecraft.network.listener.ClientPlayPacketListener;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientPlayPacketListener.class)
public interface ClientPlayPacketListenerMixin extends ModClientPlayPacketListener {
}
