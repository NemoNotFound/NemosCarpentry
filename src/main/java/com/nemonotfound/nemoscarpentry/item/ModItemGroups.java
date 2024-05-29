package com.nemonotfound.nemoscarpentry.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;

public class ModItemGroups {

    public static String NEMOS_CARPENTRY_GROUP_ID = "nemos-carpentry-group";
    public static final RegistryKey<ItemGroup> NEMOS_CARPENTRY =
            getItemGroup(NEMOS_CARPENTRY_GROUP_ID);

    public static void registerItemGroups() {
        registerItemGroup("Nemo's Carpentry", NEMOS_CARPENTRY_GROUP_ID, ModItems.IRON_SAW);
        modifyFunctionalItemGroup();
    }

    private static void registerItemGroup(String displayName, String path, Item iconItem) {
        ItemGroup ITEM_GROUP = FabricItemGroup.builder()
                .icon(() -> new ItemStack(iconItem))
                .displayName(Text.translatable(displayName))
                .entries((context, entries) -> {
                    entries.add(ModItems.ACACIA_CHAIR_LUKAS);
                    entries.add(ModItems.BAMBOO_CHAIR_LUKAS);
                    entries.add(ModItems.BIRCH_CHAIR_LUKAS);
                    entries.add(ModItems.CHERRY_CHAIR_LUKAS);
                    entries.add(ModItems.CRIMSON_CHAIR_LUKAS);
                    entries.add(ModItems.DARK_OAK_CHAIR_LUKAS);
                    entries.add(ModItems.JUNGLE_CHAIR_LUKAS);
                    entries.add(ModItems.MANGROVE_CHAIR_LUKAS);
                    entries.add(ModItems.OAK_CHAIR_LUKAS);
                    entries.add(ModItems.SPRUCE_CHAIR_LUKAS);
                    entries.add(ModItems.WARPED_CHAIR_LUKAS);
                })
                .build();

        Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, path), ITEM_GROUP);
    }

    private static void modifyFunctionalItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
            content.add(ModItems.ACACIA_CHAIR_LUKAS);
            content.add(ModItems.BAMBOO_CHAIR_LUKAS);
            content.add(ModItems.BIRCH_CHAIR_LUKAS);
            content.add(ModItems.CHERRY_CHAIR_LUKAS);
            content.add(ModItems.CRIMSON_CHAIR_LUKAS);
            content.add(ModItems.DARK_OAK_CHAIR_LUKAS);
            content.add(ModItems.JUNGLE_CHAIR_LUKAS);
            content.add(ModItems.MANGROVE_CHAIR_LUKAS);
            content.add(ModItems.OAK_CHAIR_LUKAS);
            content.add(ModItems.SPRUCE_CHAIR_LUKAS);
            content.add(ModItems.WARPED_CHAIR_LUKAS);
        });
    }

    private static RegistryKey<ItemGroup> getItemGroup(String path) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, path));
    }
}
