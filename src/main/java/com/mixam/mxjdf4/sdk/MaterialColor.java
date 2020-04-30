package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MaterialColor {
    WHITE (0),
    YELLOW(1),
    GREEN(2),
    RED(3),
    ;

    private final int value;

    MaterialColor(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
