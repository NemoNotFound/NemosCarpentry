package com.nemonotfound.nemoscarpentry.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModItemGroups {

    public static String NEMOS_CARPENTRY_GROUP_ID = "nemos-carpeanting-blocks";
    public static final RegistryKey<ItemGroup> NEMOS_CARPENTRY =
            getItemGroup(NEMOS_CARPENTRY_GROUP_ID);

    public static void registerItemGroups() {
        registerItemGroup("Nemo's Carpentry", NEMOS_CARPENTRY_GROUP_ID, ModItems.IRON_SAW);
    }

    public static void registerItemGroup(String displayName, String path, Item iconItem) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconItem))
                .displayName(Text.translatable(displayName))
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, path), ITEM_GROUP);
    }

    private static RegistryKey<ItemGroup> getItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, path));
    }
}
