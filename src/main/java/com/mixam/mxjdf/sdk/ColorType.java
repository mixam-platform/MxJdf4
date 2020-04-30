package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ColorType {
    NONE (0),
    HKS (1),
    BLACK (2),
    PROCESS (3);

    private final int value;
    ColorType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
