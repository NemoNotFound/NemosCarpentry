package com.nemonotfound.nemoscarpentry.block;

import com.nemonotfound.nemoscarpentry.item.ModItemGroups;
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

import static com.nemonotfound.nemoscarpentry.NemosCarpentry.MOD_ID;
import static net.minecraft.block.Blocks.*;

public class ModBlocks {

    public static final Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_LADDER = registerBlock("acacia_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_LADDER = registerBlock("birch_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_LADDER = registerBlock("spruce_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_LADDER = registerBlock("warped_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_LADDER = registerBlock("bamboo_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_LADDER = registerBlock("crimson_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_LADDER = registerBlock("mangrove_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_LADDER = registerBlock("jungle_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BOUND_BAMBOO_LADDER = registerBlock("bound_bamboo_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_LADDER = registerBlock("cherry_ladder",
            new LadderBlock(AbstractBlock.Settings.copy(LADDER)), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_TABLE_THE_CLASSIC = registerBlock("oak_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_TABLE_THE_CLASSIC = registerBlock("cherry_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_TABLE_THE_CLASSIC = registerBlock("dark_oak_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_TABLE_THE_CLASSIC = registerBlock("bamboo_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_TABLE_THE_CLASSIC = registerBlock("warped_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_TABLE_THE_CLASSIC = registerBlock("crimson_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_TABLE_THE_CLASSIC = registerBlock("mangrove_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_TABLE_THE_CLASSIC = registerBlock("spruce_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_TABLE_THE_CLASSIC = registerBlock("birch_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_TABLE_THE_CLASSIC = registerBlock("acacia_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_TABLE_THE_CLASSIC = registerBlock("jungle_table_the_classic",
            new TableBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_CHAIR = registerBlock("oak_chair",
            new ChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_CHAIR = registerBlock("cherry_chair",
            new ChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            new ChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_CHAIR = registerBlock("bamboo_chair",
            new ChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_CHAIR = registerBlock("warped_chair",
            new ChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_CHAIR = registerBlock("crimson_chair",
            new ChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_CHAIR = registerBlock("mangrove_chair",
            new ChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_CHAIR = registerBlock("spruce_chair",
            new ChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_CHAIR = registerBlock("birch_chair",
            new ChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_CHAIR = registerBlock("acacia_chair",
            new ChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_CHAIR = registerBlock("jungle_chair",
            new ChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_CHAIR_FELIX = registerBlock("acacia_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_CHAIR_FELIX = registerBlock("bamboo_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(BAMBOO_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_CHAIR_FELIX = registerBlock("birch_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_CHAIR_FELIX = registerBlock("cherry_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_CHAIR_FELIX = registerBlock("crimson_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_CHAIR_FELIX = registerBlock("dark_oak_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_CHAIR_FELIX = registerBlock("jungle_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_CHAIR_FELIX = registerBlock("mangrove_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_CHAIR_FELIX = registerBlock("oak_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_CHAIR_FELIX = registerBlock("spruce_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_CHAIR_FELIX = registerBlock("warped_chair_felix",
            new FelixChairBlock(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_LOG_SEAT = registerBlock("acacia_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(ACACIA_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_LOG_SEAT = registerBlock("birch_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(BIRCH_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_LOG_SEAT = registerBlock("cherry_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(CHERRY_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_STEM_SEAT = registerBlock("crimson_stem_seat",
            new LogSeat(AbstractBlock.Settings.copy(CRIMSON_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_LOG_SEAT = registerBlock("dark_oak_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(DARK_OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_LOG_SEAT = registerBlock("jungle_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(JUNGLE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_LOG_SEAT = registerBlock("mangrove_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(MANGROVE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_LOG_SEAT = registerBlock("oak_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(OAK_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_LOG_SEAT = registerBlock("spruce_log_seat",
            new LogSeat(AbstractBlock.Settings.copy(SPRUCE_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_STEM_SEAT = registerBlock("warped_stem_seat",
            new LogSeat(AbstractBlock.Settings.copy(WARPED_PLANKS).nonOpaque()), ItemGroups.FUNCTIONAL,
            ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CARPENTERS_WORKBENCH = registerBlock("carpenters_workbench", new CarpentryTableBlock(FabricBlockSettings.create()
            .mapColor(MapColor.OAK_TAN)
            .instrument(Instrument.BASS)
            .strength(2.5f)
            .sounds(BlockSoundGroup.WOOD)
            .burnable()), ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_GLASS_DOOR = registerBlock("acacia_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_GLASS_DOOR = registerBlock("bamboo_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_GLASS_DOOR = registerBlock("birch_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_GLASS_DOOR = registerBlock("cherry_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_GLASS_DOOR = registerBlock("crimson_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_GLASS_DOOR = registerBlock("dark_oak_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_GLASS_DOOR = registerBlock("jungle_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_GLASS_DOOR = registerBlock("mangrove_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_GLASS_DOOR = registerBlock("oak_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_GLASS_DOOR = registerBlock("spruce_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_GLASS_DOOR = registerBlock("warped_glass_door", new DoorBlock(FabricBlockSettings.create()
                        .mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                        .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_WHITE_STAINED_GLASS_DOOR = registerBlock("acacia_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("acacia_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_GRAY_STAINED_GLASS_DOOR = registerBlock("acacia_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_BLACK_STAINED_GLASS_DOOR = registerBlock("acacia_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_BROWN_STAINED_GLASS_DOOR = registerBlock("acacia_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_RED_STAINED_GLASS_DOOR = registerBlock("acacia_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_ORANGE_STAINED_GLASS_DOOR = registerBlock("acacia_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_YELLOW_STAINED_GLASS_DOOR = registerBlock("acacia_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_LIME_STAINED_GLASS_DOOR = registerBlock("acacia_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_GREEN_STAINED_GLASS_DOOR = registerBlock("acacia_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_CYAN_STAINED_GLASS_DOOR = registerBlock("acacia_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("acacia_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_BLUE_STAINED_GLASS_DOOR = registerBlock("acacia_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_PURPLE_STAINED_GLASS_DOOR = registerBlock("acacia_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_MAGENTA_STAINED_GLASS_DOOR = registerBlock("acacia_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_PINK_STAINED_GLASS_DOOR = registerBlock("acacia_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(ACACIA_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.ACACIA),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_WHITE_STAINED_GLASS_DOOR = registerBlock("bamboo_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("bamboo_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_GRAY_STAINED_GLASS_DOOR = registerBlock("bamboo_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_BLACK_STAINED_GLASS_DOOR = registerBlock("bamboo_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_BROWN_STAINED_GLASS_DOOR = registerBlock("bamboo_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_RED_STAINED_GLASS_DOOR = registerBlock("bamboo_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_ORANGE_STAINED_GLASS_DOOR = registerBlock("bamboo_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_YELLOW_STAINED_GLASS_DOOR = registerBlock("bamboo_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_LIME_STAINED_GLASS_DOOR = registerBlock("bamboo_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_GREEN_STAINED_GLASS_DOOR = registerBlock("bamboo_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_CYAN_STAINED_GLASS_DOOR = registerBlock("bamboo_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("bamboo_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_BLUE_STAINED_GLASS_DOOR = registerBlock("bamboo_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_PURPLE_STAINED_GLASS_DOOR = registerBlock("bamboo_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_MAGENTA_STAINED_GLASS_DOOR = registerBlock("bamboo_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BAMBOO_PINK_STAINED_GLASS_DOOR = registerBlock("bamboo_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BAMBOO_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BAMBOO),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_WHITE_STAINED_GLASS_DOOR = registerBlock("birch_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("birch_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_GRAY_STAINED_GLASS_DOOR = registerBlock("birch_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_BLACK_STAINED_GLASS_DOOR = registerBlock("birch_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_BROWN_STAINED_GLASS_DOOR = registerBlock("birch_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_RED_STAINED_GLASS_DOOR = registerBlock("birch_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_ORANGE_STAINED_GLASS_DOOR = registerBlock("birch_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_YELLOW_STAINED_GLASS_DOOR = registerBlock("birch_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_LIME_STAINED_GLASS_DOOR = registerBlock("birch_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_GREEN_STAINED_GLASS_DOOR = registerBlock("birch_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_CYAN_STAINED_GLASS_DOOR = registerBlock("birch_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("birch_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_BLUE_STAINED_GLASS_DOOR = registerBlock("birch_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_PURPLE_STAINED_GLASS_DOOR = registerBlock("birch_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_MAGENTA_STAINED_GLASS_DOOR = registerBlock("birch_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_PINK_STAINED_GLASS_DOOR = registerBlock("birch_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(BIRCH_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.BIRCH),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_WHITE_STAINED_GLASS_DOOR = registerBlock("cherry_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("cherry_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_GRAY_STAINED_GLASS_DOOR = registerBlock("cherry_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_BLACK_STAINED_GLASS_DOOR = registerBlock("cherry_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_BROWN_STAINED_GLASS_DOOR = registerBlock("cherry_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_RED_STAINED_GLASS_DOOR = registerBlock("cherry_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_ORANGE_STAINED_GLASS_DOOR = registerBlock("cherry_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_YELLOW_STAINED_GLASS_DOOR = registerBlock("cherry_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_LIME_STAINED_GLASS_DOOR = registerBlock("cherry_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_GREEN_STAINED_GLASS_DOOR = registerBlock("cherry_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_CYAN_STAINED_GLASS_DOOR = registerBlock("cherry_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("cherry_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_BLUE_STAINED_GLASS_DOOR = registerBlock("cherry_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_PURPLE_STAINED_GLASS_DOOR = registerBlock("cherry_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_MAGENTA_STAINED_GLASS_DOOR = registerBlock("cherry_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_PINK_STAINED_GLASS_DOOR = registerBlock("cherry_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CHERRY_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CHERRY),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_WHITE_STAINED_GLASS_DOOR = registerBlock("crimson_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("crimson_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_GRAY_STAINED_GLASS_DOOR = registerBlock("crimson_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_BLACK_STAINED_GLASS_DOOR = registerBlock("crimson_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_BROWN_STAINED_GLASS_DOOR = registerBlock("crimson_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_RED_STAINED_GLASS_DOOR = registerBlock("crimson_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_ORANGE_STAINED_GLASS_DOOR = registerBlock("crimson_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_YELLOW_STAINED_GLASS_DOOR = registerBlock("crimson_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_LIME_STAINED_GLASS_DOOR = registerBlock("crimson_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_GREEN_STAINED_GLASS_DOOR = registerBlock("crimson_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_CYAN_STAINED_GLASS_DOOR = registerBlock("crimson_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("crimson_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_BLUE_STAINED_GLASS_DOOR = registerBlock("crimson_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_PURPLE_STAINED_GLASS_DOOR = registerBlock("crimson_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_MAGENTA_STAINED_GLASS_DOOR = registerBlock("crimson_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_PINK_STAINED_GLASS_DOOR = registerBlock("crimson_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(CRIMSON_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.CRIMSON),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_WHITE_STAINED_GLASS_DOOR = registerBlock("dark_oak_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("dark_oak_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_GRAY_STAINED_GLASS_DOOR = registerBlock("dark_oak_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_BLACK_STAINED_GLASS_DOOR = registerBlock("dark_oak_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_BROWN_STAINED_GLASS_DOOR = registerBlock("dark_oak_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_RED_STAINED_GLASS_DOOR = registerBlock("dark_oak_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_ORANGE_STAINED_GLASS_DOOR = registerBlock("dark_oak_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_YELLOW_STAINED_GLASS_DOOR = registerBlock("dark_oak_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_LIME_STAINED_GLASS_DOOR = registerBlock("dark_oak_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_GREEN_STAINED_GLASS_DOOR = registerBlock("dark_oak_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_CYAN_STAINED_GLASS_DOOR = registerBlock("dark_oak_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("dark_oak_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_BLUE_STAINED_GLASS_DOOR = registerBlock("dark_oak_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_PURPLE_STAINED_GLASS_DOOR = registerBlock("dark_oak_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_MAGENTA_STAINED_GLASS_DOOR = registerBlock("dark_oak_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_PINK_STAINED_GLASS_DOOR = registerBlock("dark_oak_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(DARK_OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.DARK_OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_WHITE_STAINED_GLASS_DOOR = registerBlock("jungle_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("jungle_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_GRAY_STAINED_GLASS_DOOR = registerBlock("jungle_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_BLACK_STAINED_GLASS_DOOR = registerBlock("jungle_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_BROWN_STAINED_GLASS_DOOR = registerBlock("jungle_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_RED_STAINED_GLASS_DOOR = registerBlock("jungle_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_ORANGE_STAINED_GLASS_DOOR = registerBlock("jungle_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_YELLOW_STAINED_GLASS_DOOR = registerBlock("jungle_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_LIME_STAINED_GLASS_DOOR = registerBlock("jungle_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_GREEN_STAINED_GLASS_DOOR = registerBlock("jungle_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_CYAN_STAINED_GLASS_DOOR = registerBlock("jungle_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("jungle_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_BLUE_STAINED_GLASS_DOOR = registerBlock("jungle_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_PURPLE_STAINED_GLASS_DOOR = registerBlock("jungle_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_MAGENTA_STAINED_GLASS_DOOR = registerBlock("jungle_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_PINK_STAINED_GLASS_DOOR = registerBlock("jungle_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(JUNGLE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.JUNGLE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_WHITE_STAINED_GLASS_DOOR = registerBlock("mangrove_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("mangrove_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_GRAY_STAINED_GLASS_DOOR = registerBlock("mangrove_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_BLACK_STAINED_GLASS_DOOR = registerBlock("mangrove_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_BROWN_STAINED_GLASS_DOOR = registerBlock("mangrove_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_RED_STAINED_GLASS_DOOR = registerBlock("mangrove_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_ORANGE_STAINED_GLASS_DOOR = registerBlock("mangrove_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_YELLOW_STAINED_GLASS_DOOR = registerBlock("mangrove_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_LIME_STAINED_GLASS_DOOR = registerBlock("mangrove_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_GREEN_STAINED_GLASS_DOOR = registerBlock("mangrove_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_CYAN_STAINED_GLASS_DOOR = registerBlock("mangrove_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("mangrove_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_BLUE_STAINED_GLASS_DOOR = registerBlock("mangrove_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_PURPLE_STAINED_GLASS_DOOR = registerBlock("mangrove_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_MAGENTA_STAINED_GLASS_DOOR = registerBlock("mangrove_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_PINK_STAINED_GLASS_DOOR = registerBlock("mangrove_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(MANGROVE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.MANGROVE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_WHITE_STAINED_GLASS_DOOR = registerBlock("oak_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("oak_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_GRAY_STAINED_GLASS_DOOR = registerBlock("oak_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_BLACK_STAINED_GLASS_DOOR = registerBlock("oak_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_BROWN_STAINED_GLASS_DOOR = registerBlock("oak_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_RED_STAINED_GLASS_DOOR = registerBlock("oak_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_ORANGE_STAINED_GLASS_DOOR = registerBlock("oak_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_YELLOW_STAINED_GLASS_DOOR = registerBlock("oak_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_LIME_STAINED_GLASS_DOOR = registerBlock("oak_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_GREEN_STAINED_GLASS_DOOR = registerBlock("oak_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_CYAN_STAINED_GLASS_DOOR = registerBlock("oak_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("oak_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_BLUE_STAINED_GLASS_DOOR = registerBlock("oak_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_PURPLE_STAINED_GLASS_DOOR = registerBlock("oak_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_MAGENTA_STAINED_GLASS_DOOR = registerBlock("oak_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block OAK_PINK_STAINED_GLASS_DOOR = registerBlock("oak_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(OAK_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.OAK),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_WHITE_STAINED_GLASS_DOOR = registerBlock("spruce_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("spruce_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_GRAY_STAINED_GLASS_DOOR = registerBlock("spruce_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_BLACK_STAINED_GLASS_DOOR = registerBlock("spruce_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_BROWN_STAINED_GLASS_DOOR = registerBlock("spruce_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_RED_STAINED_GLASS_DOOR = registerBlock("spruce_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_ORANGE_STAINED_GLASS_DOOR = registerBlock("spruce_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_YELLOW_STAINED_GLASS_DOOR = registerBlock("spruce_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_LIME_STAINED_GLASS_DOOR = registerBlock("spruce_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_GREEN_STAINED_GLASS_DOOR = registerBlock("spruce_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_CYAN_STAINED_GLASS_DOOR = registerBlock("spruce_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("spruce_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_BLUE_STAINED_GLASS_DOOR = registerBlock("spruce_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_PURPLE_STAINED_GLASS_DOOR = registerBlock("spruce_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_MAGENTA_STAINED_GLASS_DOOR = registerBlock("spruce_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_PINK_STAINED_GLASS_DOOR = registerBlock("spruce_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(SPRUCE_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.SPRUCE),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_WHITE_STAINED_GLASS_DOOR = registerBlock("warped_white_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_LIGHT_GRAY_STAINED_GLASS_DOOR = registerBlock("warped_light_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_GRAY_STAINED_GLASS_DOOR = registerBlock("warped_gray_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_BLACK_STAINED_GLASS_DOOR = registerBlock("warped_black_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_BROWN_STAINED_GLASS_DOOR = registerBlock("warped_brown_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_RED_STAINED_GLASS_DOOR = registerBlock("warped_red_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_ORANGE_STAINED_GLASS_DOOR = registerBlock("warped_orange_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_YELLOW_STAINED_GLASS_DOOR = registerBlock("warped_yellow_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_LIME_STAINED_GLASS_DOOR = registerBlock("warped_lime_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_GREEN_STAINED_GLASS_DOOR = registerBlock("warped_green_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_CYAN_STAINED_GLASS_DOOR = registerBlock("warped_cyan_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_LIGHT_BLUE_STAINED_GLASS_DOOR = registerBlock("warped_light_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_BLUE_STAINED_GLASS_DOOR = registerBlock("warped_blue_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_PURPLE_STAINED_GLASS_DOOR = registerBlock("warped_purple_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_MAGENTA_STAINED_GLASS_DOOR = registerBlock("warped_magenta_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_PINK_STAINED_GLASS_DOOR = registerBlock("warped_pink_stained_glass_door",
            new DoorBlock(FabricBlockSettings.create().mapColor(WARPED_PLANKS.getDefaultMapColor()).instrument(Instrument.BASS)
                                            .strength(3.0f).nonOpaque().burnable().pistonBehavior(PistonBehavior.DESTROY), BlockSetType.WARPED),
            ItemGroups.BUILDING_BLOCKS, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_CAMPFIRE = registerBlock("acacia_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(ACACIA_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_CAMPFIRE = registerBlock("birch_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(BIRCH_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_CAMPFIRE = registerBlock("cherry_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(CHERRY_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_CAMPFIRE = registerBlock("crimson_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(CRIMSON_STEM.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_CAMPFIRE = registerBlock("dark_oak_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(DARK_OAK_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_CAMPFIRE = registerBlock("jungle_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(JUNGLE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_CAMPFIRE = registerBlock("mangrove_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(MANGROVE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_CAMPFIRE = registerBlock("spruce_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(SPRUCE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_CAMPFIRE = registerBlock("warped_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(WARPED_STEM.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block ACACIA_SOUL_CAMPFIRE = registerBlock("acacia_soul_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(ACACIA_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block BIRCH_SOUL_CAMPFIRE = registerBlock("birch_soul_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(BIRCH_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CHERRY_SOUL_CAMPFIRE = registerBlock("cherry_soul_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(CHERRY_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block CRIMSON_SOUL_CAMPFIRE = registerBlock("crimson_soul_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(CRIMSON_STEM.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block DARK_OAK_SOUL_CAMPFIRE = registerBlock("dark_oak_soul_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(DARK_OAK_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block JUNGLE_SOUL_CAMPFIRE = registerBlock("jungle_soul_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(JUNGLE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block MANGROVE_SOUL_CAMPFIRE = registerBlock("mangrove_soul_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(MANGROVE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block SPRUCE_SOUL_CAMPFIRE = registerBlock("spruce_soul_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(SPRUCE_LOG.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);
    public static final Block WARPED_SOUL_CAMPFIRE = registerBlock("warped_soul_campfire",
            new CustomCampfireBlock(true, 1, FabricBlockSettings.create().mapColor(WARPED_STEM.getDefaultMapColor())
                    .instrument(Instrument.BASS).strength(2.0f).sounds(BlockSoundGroup.WOOD)
                    .luminance(Blocks.createLightLevelFromLitBlockState(15)).nonOpaque().burnable()),
            ItemGroups.FUNCTIONAL, ModItemGroups.NEMOS_CARPENTRY);

    @SafeVarargs
    private static Block registerBlock(String path, Block block, RegistryKey<ItemGroup>... itemGroups) {
        Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(MOD_ID, path), block);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, path), new BlockItem(block, new FabricItemSettings()));

        Arrays.stream(itemGroups).forEach(itemGroup -> ItemGroupEvents.modifyEntriesEvent(itemGroup)
                .register(content -> content.add(block)));

        return registeredBlock;
    }
}
