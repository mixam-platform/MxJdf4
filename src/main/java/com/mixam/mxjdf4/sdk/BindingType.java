package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BindingType {
    INVALID(0),
    STAPLED(1),
    PUR(2),
    WIRO(3),
    LOOP(4),
    CASE(5),
    CASE_BOUND_WITH_SEWING(6),
    CALENDAR_WIRO(7)
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