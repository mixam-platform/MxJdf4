package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LoopsType {
    NONE (0),
    TWO (1),
    FOUR (2),
    ;
    private final int value;

    LoopsType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
