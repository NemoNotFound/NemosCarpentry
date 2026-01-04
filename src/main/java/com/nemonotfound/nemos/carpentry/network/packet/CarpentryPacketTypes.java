package com.nemonotfound.nemos.carpentry.network.packet;

import com.nemonotfound.nemos.carpentry.network.packet.s2c.play.ClientboundUpdateRecipesPacket;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.protocol.PacketType;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.Identifier;

import static com.nemonotfound.nemos.carpentry.NemosCarpentry.MOD_ID;


public class CarpentryPacketTypes {

    public static final PacketType<ClientboundUpdateRecipesPacket> UPDATE_RECIPES = createClientbound("update_recipes");

    private static <T extends Packet<ClientGamePacketListener>> PacketType<T> createClientbound(String id) {
        return new PacketType<>(PacketFlow.CLIENTBOUND, Identifier.fromNamespaceAndPath(MOD_ID, id));
    }
}
