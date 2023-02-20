package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BindingColorType {
    NONE (0),
    BLACK (1),
    SILVER (2),
    WHITE (3),
    CLEAR(4),
    RED(5),
    BLUE(6),
    REFLEX_BLUE(7),
    YELLOW(8),
    COLLEGE_ORANGE(9),
    RED_WINE(10),
    BURGUNDY(11),
    PINK(12),
    PASTEL_PINK(13),
    FUSCHIA(14),
    NAVY_BLUE(15),
    PASTEL_BLUE(16),
    ROYAL_BLUE(17),
    TEAL(18),
    MEDIUM_GREEN(19),
    PASTEL_GREEN(20),
    APPLE_GREEN(21),
    PEARL_GREY(22),
    DARK_BROWN(23),
    PASTEL_BEIGE(24),
    CHOCOLATE_BROWN(25),
    NEON_GREEN(26),
    ORANGE(27),
    NEON_PINK(28),
    NEON_ORANGE(29),
    WARM_RED(30),
    PURPLE(31),
    VIOLET(32),
    FOREST_GREEN(33),
    DARK_GREEN(34),
    GOLD(35)
    ;
    private final int value;

    BindingColorType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
