package com.nemonotfound.nemos.carpentry.network.listener;

import com.nemonotfound.nemos.carpentry.network.packet.s2c.play.ClientboundUpdateRecipesPacket;
import net.minecraft.network.protocol.ping.ClientPongPacketListener;

public interface CarpentryClientGamePacketListener extends ClientPongPacketListener {

    void nemo_sCarpentry$onSynchronizeModRecipes(ClientboundUpdateRecipesPacket packet);
}
