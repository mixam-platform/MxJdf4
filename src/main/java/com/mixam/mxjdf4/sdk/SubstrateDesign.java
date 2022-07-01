package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SubstrateDesign {
    NONE(0),
    LINED(1);
    ;

    private final int value;

    SubstrateDesign(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
