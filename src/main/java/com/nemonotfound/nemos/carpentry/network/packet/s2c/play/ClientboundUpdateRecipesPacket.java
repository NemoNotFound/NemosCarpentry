package com.nemonotfound.nemos.carpentry.network.packet.s2c.play;

import com.nemonotfound.nemos.carpentry.network.listener.CarpentryClientGamePacketListener;
import com.nemonotfound.nemos.carpentry.network.packet.CarpentryPacketTypes;
import com.nemonotfound.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.PacketType;
import net.minecraft.network.protocol.game.ClientGamePacketListener;

public record ClientboundUpdateRecipesPacket(CarpentryRecipeDisplay.Grouping carpentryRecipes) implements Packet<ClientGamePacketListener> {

    public static final StreamCodec<RegistryFriendlyByteBuf, ClientboundUpdateRecipesPacket> CODEC = StreamCodec.composite(
            CarpentryRecipeDisplay.Grouping.codec(),
            ClientboundUpdateRecipesPacket::carpentryRecipes,
            ClientboundUpdateRecipesPacket::new
    );

    @Override
    public PacketType<? extends Packet<ClientGamePacketListener>> type() {
        return CarpentryPacketTypes.UPDATE_RECIPES;
    }

    @Override
    public void handle(ClientGamePacketListener clientGamePacketListener) {
        ((CarpentryClientGamePacketListener) clientGamePacketListener).nemo_sCarpentry$onSynchronizeModRecipes(this);
    }
}
