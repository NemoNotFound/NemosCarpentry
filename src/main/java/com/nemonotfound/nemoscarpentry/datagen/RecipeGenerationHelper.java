package com.nemonotfound.nemoscarpentry.datagen;

import com.nemonotfound.nemoscarpentry.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeGenerationHelper {

    private static final List<Block> allWoodenPlanks = List.of(Blocks.ACACIA_PLANKS, Blocks.BAMBOO_PLANKS,
            Blocks.BIRCH_PLANKS, Blocks.CHERRY_PLANKS, Blocks.CRIMSON_PLANKS, Blocks.DARK_OAK_PLANKS,
            Blocks.JUNGLE_PLANKS, Blocks.MANGROVE_PLANKS, Blocks.OAK_PLANKS, Blocks.SPRUCE_PLANKS, Blocks.WARPED_PLANKS);
    private static final List<Block> allLogs = List.of(Blocks.ACACIA_LOG, Blocks.BIRCH_LOG, Blocks.CHERRY_LOG,
            Blocks.CRIMSON_STEM, Blocks.DARK_OAK_LOG, Blocks.JUNGLE_LOG, Blocks.MANGROVE_LOG, Blocks.OAK_LOG,
            Blocks.SPRUCE_LOG, Blocks.WARPED_STEM);
    private static final Map<Block, Block> chairMap = new HashMap<>();
    private static final Map<Block, Block> felixChairMap = new HashMap<>();
    private static final Map<Block, Block> logSeatMap = new HashMap<>();

    static {
        chairMap.put(Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_CHAIR);
        chairMap.put(Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_CHAIR);
        chairMap.put(Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_CHAIR);
        chairMap.put(Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_CHAIR);
        chairMap.put(Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_CHAIR);
        chairMap.put(Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_CHAIR);
        chairMap.put(Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_CHAIR);
        chairMap.put(Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_CHAIR);
        chairMap.put(Blocks.OAK_PLANKS, ModBlocks.OAK_CHAIR);
        chairMap.put(Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_CHAIR);
        chairMap.put(Blocks.WARPED_PLANKS, ModBlocks.WARPED_CHAIR);

        felixChairMap.put(Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_CHAIR_FELIX);
        felixChairMap.put(Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_CHAIR_FELIX);
        felixChairMap.put(Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_CHAIR_FELIX);
        felixChairMap.put(Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_CHAIR_FELIX);
        felixChairMap.put(Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_CHAIR_FELIX);
        felixChairMap.put(Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_CHAIR_FELIX);
        felixChairMap.put(Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_CHAIR_FELIX);
        felixChairMap.put(Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_CHAIR_FELIX);
        felixChairMap.put(Blocks.OAK_PLANKS, ModBlocks.OAK_CHAIR_FELIX);
        felixChairMap.put(Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_CHAIR_FELIX);
        felixChairMap.put(Blocks.WARPED_PLANKS, ModBlocks.WARPED_CHAIR_FELIX);

        logSeatMap.put(Blocks.ACACIA_LOG, ModBlocks.ACACIA_LOG_SEAT);
        logSeatMap.put(Blocks.BIRCH_LOG, ModBlocks.BIRCH_LOG_SEAT);
        logSeatMap.put(Blocks.CHERRY_LOG, ModBlocks.CHERRY_LOG_SEAT);
        logSeatMap.put(Blocks.CRIMSON_STEM, ModBlocks.CRIMSON_STEM_SEAT);
        logSeatMap.put(Blocks.DARK_OAK_LOG, ModBlocks.DARK_OAK_LOG_SEAT);
        logSeatMap.put(Blocks.JUNGLE_LOG, ModBlocks.JUNGLE_LOG_SEAT);
        logSeatMap.put(Blocks.MANGROVE_LOG, ModBlocks.MANGROVE_LOG_SEAT);
        logSeatMap.put(Blocks.OAK_LOG, ModBlocks.OAK_LOG_SEAT);
        logSeatMap.put(Blocks.SPRUCE_LOG, ModBlocks.SPRUCE_LOG_SEAT);
        logSeatMap.put(Blocks.WARPED_STEM, ModBlocks.WARPED_STEM_SEAT);
    }


    public static List<Block> getAllWoodenPlanks() {
        return allWoodenPlanks;
    }

    public static List<Block> getAllLogs() {
        return allLogs;
    }

    public static Map<Block, Block> getChairMap() {
        return chairMap;
    }

    public static Map<Block, Block> getFelixChairMap() {
        return felixChairMap;
    }
    public static Map<Block, Block> getLogSeatMap() {
        return logSeatMap;
    }
}
