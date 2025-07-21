package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EndPaperColorType {
    NONE(0),
    WHITE(1),
    BLACK(2),
    COLORPLAN_ADRIATIC(10),
    COLORPLAN_AMETHYST(11),
    COLORPLAN_AZURE_BLUE(12),
    COLORPLAN_BARK(13),
    COLORPLAN_BITTER_CHOCOLATE(14),
    COLORPLAN_BRIGHT_RED(15),
    COLORPLAN_BRIGHT_WHITE(16),
    COLORPLAN_CANDY_PINK(17),
    COLORPLAN_LIMESTONE_WHITE(18),
    COLORPLAN_CITRINE(19),
    COLORPLAN_CLARET(20),
    COLORPLAN_COBALT(21),
    COLORPLAN_COOL_BLUE(22),
    COLORPLAN_COOL_GREY(23),
    COLORPLAN_DARK_GREY(24),
    COLORPLAN_EBONY(25),
    COLORPLAN_EMERALD(26),
    COLORPLAN_FACTORY_YELLOW(27),
    COLORPLAN_FOREST(28),
    COLORPLAN_FUSCHIA_PINK(29),
    COLORPLAN_HARVEST(30),
    COLORPLAN_HOT_PINK(31),
    COLORPLAN_ICE_WHITE(32),
    COLORPLAN_LOCH_BLUE(33),
    COLORPLAN_LAVENDAR(34),
    COLORPLAN_LOCKWOOD_GREEN(35),
    COLORPLAN_MANDARIN(36),
    COLORPLAN_MARRS_GREEN(37),
    COLORPLAN_MID_GREEN(38),
    COLORPLAN_MIST(39),
    COLORPLAN_NATURAL(40),
    COLORPLAN_NEW_BLUE(41),
    COLORPLAN_NUBUCK_BROWN(42),
    COLORPLAN_PALE_GREY(43),
    COLORPLAN_PARK_GREEN(44),
    COLORPLAN_PISTACHIO(45),
    COLORPLAN_POWDER_GREEN(46),
    COLORPLAN_PRISTINE_WHITE(47),
    COLORPLAN_PURPLE(48),
    COLORPLAN_RACING_GREEN(49),
    COLORPLAN_REAL_GREY(50),
    COLORPLAN_ROYAL_BLUE(51),
    COLORPLAN_SAPPHIRE(52),
    COLORPLAN_SCARLET(53),
    COLORPLAN_SMOKE(54),
    COLORPLAN_STONE(56),
    COLORPLAN_TABRIZ_BLUE(57),
    COLORPLAN_TURQUOISE(58),
    COLORPLAN_VELLUM_WHITE(59),
    COLORPLAN_VERMILLION(60),
    COLORPLAN_WHITE_FROST(61),
            ;

    private final int value;

    EndPaperColorType(int value) {
        this.value = value;
    }

    public static EndPaperColorType forCode(int value) {
        for (EndPaperColorType en: EndPaperColorType.values()) {
            if (en.value == value) {
                return en;
            }
        }
        return null;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @JsonCreator
    public static EndPaperColorType forValue(String v) {
        return EndPaperColorType.forCode(Integer.parseInt(v));
    }
}
