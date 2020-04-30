package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FileType {
    ALL(0),
    BODY(1),
    COVER(2),
    DUST_JACKET(3),
    HEAD_TO_HEAD(4);

    private final int value;

    FileType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
