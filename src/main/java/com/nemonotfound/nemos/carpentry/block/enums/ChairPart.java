package com.nemonotfound.nemos.carpentry.block.enums;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum ChairPart implements StringRepresentable {

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
    public @NotNull String getSerializedName() {
        return this.name;
    }
}
