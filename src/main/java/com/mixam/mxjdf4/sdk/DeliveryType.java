package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DeliveryType {
    PARCEL(0),
    PALLET(1),
    ENVELOPE(2);

    private final int value;

    DeliveryType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}

