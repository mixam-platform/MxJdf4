package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AddressLocationType {
    RESIDENTIAL(0),
    BUSINESS_DOCK(1),
    BUSINESS_NO_DOCK(2),
    LIMITED_ACCESS(3),
    TRADE_SHOW(4),
    CONSTRUCTION(5),
    FARM(6),
    ;

    private final int value;

    AddressLocationType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}

