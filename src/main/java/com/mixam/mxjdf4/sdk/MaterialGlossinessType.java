package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MaterialGlossinessType {
    NONE(0),
    MATT(1),
    GLOSS(2),
    ;

    private final int value;

    MaterialGlossinessType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}

