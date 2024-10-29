package com.nemonotfound.nemoscarpentry.network.packet;

import com.nemonotfound.nemoscarpentry.network.packet.s2c.play.SynchronizeModRecipesS2CPacket;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.PacketType;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;


public class ModPlayPackets {

    public static final PacketType<SynchronizeModRecipesS2CPacket> UPDATE_RECIPES = s2c("update_recipes");

    private static <T extends Packet<ClientPlayPacketListener>> PacketType<T> s2c(String id) {
        return new PacketType<>(NetworkSide.CLIENTBOUND, Identifier.of(MOD_ID, id));
    }
}
