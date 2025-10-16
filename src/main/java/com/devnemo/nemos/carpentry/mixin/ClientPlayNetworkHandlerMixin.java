package com.devnemo.nemos.carpentry.mixin;

import com.devnemo.nemos.carpentry.client.recipebook.ClientModRecipeManager;
import com.devnemo.nemos.carpentry.interfaces.MinecraftClientGetter;
import com.devnemo.nemos.carpentry.interfaces.ModRecipeManagerGetter;
import com.devnemo.nemos.carpentry.network.listener.ModClientPlayPacketListener;
import com.devnemo.nemos.carpentry.network.packet.s2c.play.SynchronizeModRecipesS2CPacket;
import com.devnemo.nemos.carpentry.recipe.display.CarpentryRecipeDisplay;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientCommonNetworkHandler;
import net.minecraft.client.network.ClientConnectionState;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.NetworkThreadUtils;
import net.minecraft.network.listener.ClientPlayPacketListener;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ClientPlayNetworkHandler.class)
public abstract class ClientPlayNetworkHandlerMixin extends ClientCommonNetworkHandler implements ClientPlayPacketListener, ModClientPlayPacketListener, ModRecipeManagerGetter {

    @Unique
    private ClientModRecipeManager modRecipeManager = new ClientModRecipeManager(CarpentryRecipeDisplay.Grouping.empty());

    protected ClientPlayNetworkHandlerMixin(MinecraftClient client, ClientConnection connection, ClientConnectionState connectionState) {
        super(client, connection, connectionState);
    }

    @Override
    public ClientModRecipeManager nemo_sCarpentry$getModRecipeManager() {
        return this.modRecipeManager;
    }

    @Override
    public void nemo_sCarpentry$onSynchronizeModRecipes(SynchronizeModRecipesS2CPacket packet) {
        MinecraftClient client = ((MinecraftClientGetter) this).nemo_sCarpentry$getMinecraftClient();
        NetworkThreadUtils.forceMainThread(packet, this, client.getPacketApplyBatcher());
        this.modRecipeManager = new ClientModRecipeManager(packet.carpentryRecipes());
    }
}
