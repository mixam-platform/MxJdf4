package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CompletionType {
    INVALID(0),
    SAME_DAY(1),
    EXPRESS(2),
    OVERNIGHT(3),
    STANDARD(4),
    SAVER(5);

    private final int value;

    CompletionType(int value) {
        this.value = value;
    }

    public static CompletionType fromValue(String v) {
        return valueOf(v);
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
