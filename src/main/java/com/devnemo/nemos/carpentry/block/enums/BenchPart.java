package com.devnemo.nemos.carpentry.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum BenchPart implements StringIdentifiable {

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
    public String asString() {
        return this.name;
    }
}
