package com.nemonotfound.nemoscarpenting.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.Arrays;

import static com.nemonotfound.NemosCarpenting.MOD_ID;

public class ModItems {

    public static final Item WOODEN_SAW = registerItem("wooden_saw", new SawItem(ToolMaterials.WOOD,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item STONE_SAW = registerItem("stone_saw", new SawItem(ToolMaterials.STONE,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item IRON_SAW = registerItem("iron_saw", new SawItem(ToolMaterials.IRON,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item GOLDEN_SAW = registerItem("golden_saw", new SawItem(ToolMaterials.GOLD,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item DIAMOND_SAW = registerItem("diamond_saw", new SawItem(ToolMaterials.DIAMOND,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item NETHERITE_SAW = registerItem("netherite_saw", new SawItem(ToolMaterials.NETHERITE,
            new FabricItemSettings()), ItemGroups.TOOLS, ModItemGroups.NEMOS_FURNITURE);
    public static final Item OAK_CHAIR_SEAT = registerItem("oak_chair_seat", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);
    public static final Item OAK_CHAIR_LEG = registerItem("oak_chair_leg", new Item(new FabricItemSettings()),
            ModItemGroups.NEMOS_FURNITURE);

    private static Item registerItem(String path, Item item, RegistryKey<ItemGroup>... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), item);
        Arrays.stream(itemGroups).forEach(itemGroup -> ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(content -> content.add(item)));

        return registeredItem;
    }

}
