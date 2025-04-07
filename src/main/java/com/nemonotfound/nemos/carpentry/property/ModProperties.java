package com.nemonotfound.nemos.carpentry.property;

import com.nemonotfound.nemos.carpentry.block.enums.BenchPart;
import com.nemonotfound.nemos.carpentry.block.enums.ChairPart;
import net.minecraft.state.property.EnumProperty;

public class ModProperties {

    public static final EnumProperty<BenchPart> BENCH_BLOCK_PART = EnumProperty.of("part", BenchPart.class);
    public static final EnumProperty<ChairPart> CHAIR_PART = EnumProperty.of("part", ChairPart.class);
}
