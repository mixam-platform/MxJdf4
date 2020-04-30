package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BandType {
    NONE(0),
    BLACK_AND_WHITE_69WS(1),
    WHITE_T117(2),
    GREEN_AND_BIEGE_72WS(3),
    DARK_BLUE_AND_WHITE_64WS(4),
    RED_T105(5),
    MAROON_AND_WHITE_66WS(6),
    BROWN_AND_BIEGE_58WS(7),
    RED_AND_WHITE_56WS(8),
    MEDIUM_GREY_T109(9),
    YELLOW_T122(10),
    BLACK_T108(11),
    LIGHT_BLUE_AND_WHITE_634WS(12),
    YELLOW_AND_DARK_BLUE_59WS(13),
    RED_AND_GREY_55WS(14),
    RED_AND_YELLOW_65WS(15),
    NAVY_T118(16),
    GREEN_AND_BLACK_52WS(17),
    PURPLE_AND_WHITE_54WS(18),
    BLACK_AND_DARK_GREEN_71WS(19),
    GREEN_AND_RED_61WS(20),
    RED_AND_BLACK_53WS(21),
    YELLOW_AND_BROWN_57WS(22),
    YELLOW_AND_BLACK_67WS(23),
    GREEN_AND_WHITE_68WS(24),
    GREEN_AND_YELLOW_62WS(25),
    NAVY_AND_GOLD(26),
    ;

    private final int value;

    BandType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}



