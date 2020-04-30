package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RibbonType {
    NONE(0),
    MAROON(1),
    BLACK(2),
    DARK_GREEN(3),
    BRIGHT_RED(4),
    IVORY(5),
    WHITE(6),
    GOLD(7),
    PURPLE(8),
    ORANGE(9),
    PINK(10),
    GREY(11),
    BABY_BLUE(12),
    BLUE(13),
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
