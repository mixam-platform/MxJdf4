package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ComponentType {
    INVALID(0),
    CONTENT(1),
    COVER(2),
    JACKET(3),
    BOOKMARK(4),
    ENVELOPE(5),
    ;

    private final int value;

    ComponentType(int value) {
        this.value = value;
    }

    public static ComponentType fromValue(String v) {
        return valueOf(v);
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
