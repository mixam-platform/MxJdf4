package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MaterialType {

    INVALID(0),
    SILK(1),
    GLOSS(2),
    UNCOATED(3),
    BLUEBACK(4),
    OUTDOOR_PAPER(5),
    ILLUSTRATION_PRINTING_PAPER(6),
    PHOTOGRAPHIC_PRINTING_PAPER(7),
    POSTCARD_BOARD(8),
    RECYCLED_NATURAL_PAPER(9),
    RECYCLED_SILK_PAPER(10),
    FLUORESCENT(11),
    WEATHERPROOF_VINYL(12),
    RECYCLED_UNCOATED_PAPER(13),
    POLYESTER_CANVAS(14),
    PREMIUM_WHITE(15),
    CREME(16)
    ;

    private final int value;

    MaterialType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
