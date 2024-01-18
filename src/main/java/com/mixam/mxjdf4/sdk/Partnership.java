package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Partnership {

    NONE(0),
    FOURTHWALL(1),
    ;

    private final int value;

    Partnership(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
