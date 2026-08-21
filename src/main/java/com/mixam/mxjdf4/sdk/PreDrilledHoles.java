package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PreDrilledHoles {
    NONE(0),
    ONE_HOLE_OPPOSITE_BINDING_CENTER(1),
    ONE_HOLE_TOP_CENTER(2),
    TOP_CORNERS(3),
    ALL_CORNERS(4)
    ;

    private final int value;

    PreDrilledHoles(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
