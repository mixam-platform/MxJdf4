package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BindingEdge {
    LEFT_RIGHT(0),
    TOP_BOTTOM(1)
    ;

    private final int value;

    BindingEdge(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
