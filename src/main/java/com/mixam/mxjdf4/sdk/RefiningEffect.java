package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RefiningEffect {
    NONE (0),
    MATT_FINISH(1),
    GLOSS_FINISH (2),
    SILK_FINISH (3),
    SOFT_TOUCH (4),
    GOLD (5),
    SILVER (6),
    ;

    private final int value;

    RefiningEffect(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}

