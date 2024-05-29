package com.nemonotfound.nemoscarpentry.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum ChairPart implements StringIdentifiable {

    LOWER("lower"),
    UPPER("upper");

    private final String name;

    ChairPart(String name) {
        this.name = name;
    }

    public static ChairPart getOppositeChairPart(ChairPart chairPart) {
        return chairPart.equals(LOWER) ? UPPER : LOWER;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
