package com.devnemo.nemos.carpentry.network.listener;

import com.devnemo.nemos.carpentry.network.packet.s2c.play.SynchronizeModRecipesS2CPacket;
import net.minecraft.network.listener.ClientPingResultPacketListener;

public interface ModClientPlayPacketListener extends ClientPingResultPacketListener {

    void nemo_sCarpentry$onSynchronizeModRecipes(SynchronizeModRecipesS2CPacket packet);
}
