package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RibbonType {
    NONE(0),
    WHITE(1),
    IVORY(2),
    GOLD(3),
    ORANGE(4),
    BRIGHT_RED(5),
    MAROON(6),
    BABY_PINK(7),
    PURPLE(8),
    LIGHT_BLUE(9),
    BABY_BLUE(10),
    NAVY_BLUE(11),
    FREASH_GREEN(12),
    DARK_GREEN(13),
    GREY(14),
    BLACK(15),
    ;

    private final int value;

    RibbonType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
