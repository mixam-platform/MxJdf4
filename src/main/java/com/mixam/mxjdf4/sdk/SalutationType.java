package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SalutationType {
    MX("Mx."),
    MS("Ms."),
    MR("Mr."),
    DR("Dr."),
    MRS("Mrs"),
    PROF("Prof"),
    ;

    private final String value;

    SalutationType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
