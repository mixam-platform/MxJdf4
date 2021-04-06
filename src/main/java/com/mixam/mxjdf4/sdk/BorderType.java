package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BorderType {

    WRAP_AROUND(0),
    EDGE_TO_EDGE(1),
    PADDED(2),
    ;

    private final int value;

    BorderType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
