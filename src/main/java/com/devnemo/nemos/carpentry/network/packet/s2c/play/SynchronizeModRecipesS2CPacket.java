package com.devnemo.nemos.carpentry.network.packet.s2c.play;

import com.devnemo.nemos.carpentry.network.listener.ModClientPlayPacketListener;
import com.devnemo.nemos.carpentry.network.packet.ModPlayPackets;
import com.devnemo.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.PacketType;

public record SynchronizeModRecipesS2CPacket(CarpentryRecipeDisplay.Grouping carpentryRecipes) implements Packet<ClientPlayPacketListener> {

    public static final PacketCodec<RegistryByteBuf, SynchronizeModRecipesS2CPacket> CODEC = PacketCodec.tuple(
            CarpentryRecipeDisplay.Grouping.codec(),
            SynchronizeModRecipesS2CPacket::carpentryRecipes,
            SynchronizeModRecipesS2CPacket::new
    );

    @Override
    public PacketType<? extends Packet<ClientPlayPacketListener>> getPacketType() {
        return ModPlayPackets.UPDATE_RECIPES;
    }

    @Override
    public void apply(ClientPlayPacketListener clientPlayPacketListener) {
        ((ModClientPlayPacketListener) clientPlayPacketListener).nemo_sCarpentry$onSynchronizeModRecipes(this);
    }
}
