package com.nemonotfound.nemoscarpenting.block;

import com.nemonotfound.nemoscarpenting.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.Arrays;

import static com.nemonotfound.NemosCarpenting.MOD_ID;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block BAMBOO_LADDER = registerBlock("bamboo_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block BOUND_BAMBOO_LADDER = registerBlock("bound_bamboo_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block CHERRY_LADDER = registerBlock("cherry_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block OAK_TABLE_THE_CLASSIC = registerBlock("oak_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block CHERRY_TABLE_THE_CLASSIC = registerBlock("cherry_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block DARK_OAK_TABLE_THE_CLASSIC = registerBlock("dark_oak_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block BAMBOO_TABLE_THE_CLASSIC = registerBlock("bamboo_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block WARPED_TABLE_THE_CLASSIC = registerBlock("warped_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block CRIMSON_TABLE_THE_CLASSIC = registerBlock("crimson_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block MANGROVE_TABLE_THE_CLASSIC = registerBlock("mangrove_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block SPRUCE_TABLE_THE_CLASSIC = registerBlock("spruce_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block BIRCH_TABLE_THE_CLASSIC = registerBlock("birch_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block ACACIA_TABLE_THE_CLASSIC = registerBlock("acacia_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block JUNGLE_TABLE_THE_CLASSIC = registerBlock("jungle_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block OAK_CHAIR = registerBlock("oak_chair",
            new ChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block CHERRY_CHAIR = registerBlock("cherry_chair",
            new ChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            new ChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block BAMBOO_CHAIR = registerBlock("bamboo_chair",
            new ChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block WARPED_CHAIR = registerBlock("warped_chair",
            new ChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block CRIMSON_CHAIR = registerBlock("crimson_chair",
            new ChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block MANGROVE_CHAIR = registerBlock("mangrove_chair",
            new ChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair",
            new ChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block BIRCH_CHAIR = registerBlock("birch_chair",
            new ChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block ACACIA_CHAIR = registerBlock("acacia_chair",
            new ChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block JUNGLE_CHAIR = registerBlock("jungle_chair",
            new ChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_FURNITURE);
    public static final Block CARPENTING_TABLE = registerBlock("carpenting_table", new CarpentingTableBlock(FabricBlockSettings.create()
            .mapColor(MapColor.OAK_TAN)
            .instrument(Instrument.BASS)
            .strength(2.5f)
            .sounds(BlockSoundGroup.WOOD)
            .burnable()), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
    public static final Block ACACIA_GLASS_FRONT_DOOR = registerBlock("acacia_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block BAMBOO_GLASS_FRONT_DOOR = registerBlock("bamboo_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block BIRCH_GLASS_FRONT_DOOR = registerBlock("birch_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block CHERRY_GLASS_FRONT_DOOR = registerBlock("cherry_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block CRIMSON_GLASS_FRONT_DOOR = registerBlock("crimson_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block DARK_OAK_GLASS_FRONT_DOOR = registerBlock("dark_oak_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block JUNGLE_GLASS_FRONT_DOOR = registerBlock("jungle_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block MANGROVE_GLASS_FRONT_DOOR = registerBlock("mangrove_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block OAK_GLASS_FRONT_DOOR = registerBlock("oak_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block SPRUCE_GLASS_FRONT_DOOR = registerBlock("spruce_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);
    public static final Block WARPED_GLASS_FRONT_DOOR = registerBlock("warped_glass_front_door", new DoorBlock(FabricBlockSettings.create()
                    .mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                    .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_FURNITURE);

    @SafeVarargs
    private static Block registerBlock(String path, Block block, RegistryKey<ItemGroup>... itemGroups) {
        Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, path), block);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), new BlockItem(block, new FabricItemSettings()));

        Arrays.stream(itemGroups).forEach(itemGroup -> ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(content -> content.add(block)));

        return registeredBlock;
    }
}
