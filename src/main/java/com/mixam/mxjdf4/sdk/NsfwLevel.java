package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum NsfwLevel {

    UNIVERSALLY_ACCEPTABLE(0),

    MILDLY_SENSITIVE(1),

    MATURE(2),

    HIGHLY_EXPLICIT(3),

    EXTREMELY_EXPLICIT(4);

    private final int value;

    NsfwLevel(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    public static NsfwLevel fromValue(int value) {
        for (NsfwLevel level : values()) {
            if (level.value == value) {
                return level;
            }
        }
        return null;
    }

}
