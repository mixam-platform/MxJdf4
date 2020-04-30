package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EndPaperColorType {
    NONE(0),
    WHITE(1),
    BLACK(2);

    private final int value;

    EndPaperColorType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
