package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BindingType {
    INVALID(0),
    STAPLE_BINDING(1),
    PERFECT_BINDING(2),
    WIRO_BINDING(3),
    LOOP_BINDING(4),
    BOOK_BINDING(5),
    SEW_BINDING(6),
    CALENDAR_BINDING(7),
    ;

    private final int value;

    BindingType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
