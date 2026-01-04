package com.nemonotfound.nemos.carpentry.property;

import com.nemonotfound.nemos.carpentry.block.enums.BenchPart;
import com.nemonotfound.nemos.carpentry.block.enums.ChairPart;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class CarpentryBlockStateProperties {

    public static final EnumProperty<BenchPart> BENCH_BLOCK_PART = EnumProperty.create("part", BenchPart.class);
    public static final EnumProperty<ChairPart> CHAIR_PART = EnumProperty.create("part", ChairPart.class);
}
