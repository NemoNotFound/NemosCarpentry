package com.nemonotfound.nemos.carpentry.mixin;

import com.nemonotfound.nemos.carpentry.network.packet.CarpentryPacketTypes;
import com.nemonotfound.nemos.carpentry.network.packet.s2c.play.ClientboundUpdateRecipesPacket;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.protocol.ProtocolInfoBuilder;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.GameProtocols;
import net.minecraft.util.Unit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.function.Consumer;

@Mixin(GameProtocols.class)
public class GameProtocolsMixin {

    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/protocol/ProtocolInfoBuilder;clientboundProtocol(Lnet/minecraft/network/ConnectionProtocol;Ljava/util/function/Consumer;)Lnet/minecraft/network/protocol/SimpleUnboundProtocol;"))
    private static Consumer<ProtocolInfoBuilder<ClientGamePacketListener, RegistryFriendlyByteBuf, Unit>> init(Consumer<ProtocolInfoBuilder<ClientGamePacketListener, RegistryFriendlyByteBuf, Unit>> registrar) {
        return registrar.andThen(builder -> builder.addPacket(CarpentryPacketTypes.UPDATE_RECIPES, ClientboundUpdateRecipesPacket.CODEC));
    }
}
