package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BundlingType {
    SHRINK_WRAP(1)
    ;

    private final int value;

    BundlingType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
