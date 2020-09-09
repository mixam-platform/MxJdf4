package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AssumedPrintType {
    NONE(0),
    LITHO(1),
    DIGITAL(2),
    INKJET(3),
    ;

    private final int value;

    AssumedPrintType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
