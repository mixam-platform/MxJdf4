package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderType {

    STANDARD(0),
    FOURTHWALL(1),
    ;

    private final int value;

    OrderType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
