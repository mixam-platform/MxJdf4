package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LengthUnitType {
    MM (0),
    INCH(1),
    ;

    private final int value;

    LengthUnitType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
