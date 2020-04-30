package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ArticleTaxType {
    EXEMPT(0),
    VAT(1),
    GST(2),
    USA_TAX(3);

    private final int value;

    ArticleTaxType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
