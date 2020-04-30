package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BindingColorType {
    NONE (0),
    BLACK (1),
    SILVER (2),
    WHITE (3),
    ;
    private final int value;

    BindingColorType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
