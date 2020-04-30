package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrientationType {
    PORTRAIT(0),
    LANDSCAPE(1);

    private final int value;

    OrientationType(int value) {
        this.value = value;
    }

    public static OrientationType fromValue(int value) {
        for (OrientationType en: OrientationType.values()) {
            if (en.value == value) {
                return en;
            }
        }
        return null;
    }
    @JsonValue
    public int getValue() {
        return value;
    }
}
