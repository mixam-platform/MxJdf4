package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FeatureType {
    INVALID(0),
    SUPPLY_FOLDED(1),
    SUPPLY_NOT_FOLDED(2),
    PERFORATED_ON_TOP(3),
    PERFORATED_LEFT(4),
    PEEL_AND_SEAL(5),
    ;

    private final int value;

    FeatureType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
