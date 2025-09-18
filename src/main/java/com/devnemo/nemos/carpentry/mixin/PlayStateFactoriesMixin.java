package com.devnemo.nemos.carpentry.mixin;

import com.devnemo.nemos.carpentry.network.packet.ModPlayPackets;
import com.devnemo.nemos.carpentry.network.packet.s2c.play.SynchronizeModRecipesS2CPacket;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.state.NetworkStateBuilder;
import net.minecraft.network.state.PlayStateFactories;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.function.Consumer;

@Mixin(PlayStateFactories.class)
public class PlayStateFactoriesMixin {

    @ModifyArg(method = "<clinit>", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/state/NetworkStateBuilder;s2c(Lnet/minecraft/network/NetworkPhase;Ljava/util/function/Consumer;)Lnet/minecraft/network/state/NetworkStateFactory;"))
    private static Consumer<NetworkStateBuilder<ClientPlayPacketListener, RegistryByteBuf, PlayStateFactories.PacketCodecModifierContext>> sc2(Consumer<NetworkStateBuilder<ClientPlayPacketListener, RegistryByteBuf, PlayStateFactories.PacketCodecModifierContext>> registrar) {
        return registrar.andThen(builder -> builder.add(ModPlayPackets.UPDATE_RECIPES, SynchronizeModRecipesS2CPacket.CODEC));
    }
}
