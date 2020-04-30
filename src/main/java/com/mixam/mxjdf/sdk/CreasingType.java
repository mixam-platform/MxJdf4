package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CreasingType {
    NONE(0),
    CREASING_NECESSARY(1),
    ;

    private final int value;

    CreasingType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
