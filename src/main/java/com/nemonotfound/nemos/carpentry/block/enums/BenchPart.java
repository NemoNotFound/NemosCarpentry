package com.nemonotfound.nemos.carpentry.block.enums;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum BenchPart implements StringRepresentable {

    LEFT("left"),
    RIGHT("right");

    private final String name;

    BenchPart(String name) {
        this.name = name;
    }

    public static BenchPart getOppositeBenchPart(BenchPart benchPart) {
        return benchPart.equals(LEFT) ? RIGHT : LEFT;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public @NotNull String getSerializedName() {
        return this.name;
    }
}
