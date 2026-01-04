package com.nemonotfound.nemos.carpentry.mixin;

import com.nemonotfound.nemos.carpentry.network.listener.CarpentryClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ClientGamePacketListener.class)
public interface ClientGamePacketListenerMixin extends CarpentryClientGamePacketListener {
}
