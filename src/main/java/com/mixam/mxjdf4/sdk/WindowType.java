package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WindowType {
    NONE(0),
    LEFT(1),
    RIGHT(2);

    private final int value;

    WindowType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
