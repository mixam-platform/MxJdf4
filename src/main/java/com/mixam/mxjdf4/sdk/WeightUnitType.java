package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WeightUnitType {
    KILOGRAM(0),
    LIBRA(1),
    ;

    private final int value;

    WeightUnitType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
