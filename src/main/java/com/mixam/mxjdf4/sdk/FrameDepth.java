package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FrameDepth {

    MM_18(1),
    MM_38(2),
    ;

    private final int value;

    FrameDepth(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
