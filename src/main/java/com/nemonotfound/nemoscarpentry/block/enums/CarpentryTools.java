package com.nemonotfound.nemoscarpentry.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum CarpentryTools implements StringIdentifiable {
    SAW("saw");

    private final String name;

    CarpentryTools(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
