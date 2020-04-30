package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RefiningSideType {
    NONE(0),
    FRONT(1),
    BACK(2),
    FRONT_AND_BACK(3),
    OUTSIDE(4),
    INSIDE(5),
    OUTSIDE_AND_INSIDE(6),
    ;

    private final int value;

    RefiningSideType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
