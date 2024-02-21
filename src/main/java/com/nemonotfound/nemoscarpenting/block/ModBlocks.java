package com.nemonotfound.nemoscarpenting.block;

import com.nemonotfound.nemoscarpenting.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
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

    public static final Block WOODCUTTER_BLOCK = registerBlock("woodcutter",
            new WoodcutterBlock(AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.OAK_TAN)
                    .instrument(Instrument.BASS)
                    .strength(2.0f)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_FURNITURE);
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

    @SafeVarargs
    private static Block registerBlock(String path, Block block, RegistryKey<ItemGroup>... itemGroups) {
        Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, path), block);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), new BlockItem(block, new FabricItemSettings()));

        Arrays.stream(itemGroups).forEach(itemGroup -> ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(content -> content.add(block)));

        return registeredBlock;
    }
}
