package com.nemonotfound.nemos.carpentry.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.nemonotfound.nemos.carpentry.interfaces.CarpentryRecipeGetter;
import com.nemonotfound.nemos.carpentry.network.packet.s2c.play.ClientboundUpdateRecipesPacket;
import net.minecraft.network.Connection;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.CommonListenerCookie;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.players.PlayerList;
import net.minecraft.world.item.crafting.RecipeManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerList.class)
public class PlayerListMixin {

    @Inject(method = "placeNewPlayer", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/players/PlayerList;sendPlayerPermissionLevel(Lnet/minecraft/server/level/ServerPlayer;)V"))
    private void placeNewPlayer(Connection pConnection, ServerPlayer serverPlayer, CommonListenerCookie pCookie, CallbackInfo ci, @Local ServerGamePacketListenerImpl serverPlayNetworkHandler, @Local RecipeManager recipeManager) {
        serverPlayNetworkHandler.send(new ClientboundUpdateRecipesPacket(((CarpentryRecipeGetter) recipeManager).nemo_sCarpentry$getCarpentryRecipeForSync()));
    }

    @Inject(method = "reloadResources", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/network/ServerGamePacketListenerImpl;send(Lnet/minecraft/network/protocol/Packet;)V"))
    private void reloadResources(CallbackInfo ci, @Local RecipeManager serverRecipeManager, @Local ServerPlayer serverPlayer) {
        serverPlayer.connection.send(new ClientboundUpdateRecipesPacket(((CarpentryRecipeGetter) serverRecipeManager).nemo_sCarpentry$getCarpentryRecipeForSync()));
    }
}
