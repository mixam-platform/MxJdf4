package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum FoldingType {
    FLAT (0),
    HALF  (1),
    LETTER  (2),
    Z  (3),
    GATE_OPEN (4),
    GATE_CLOSED (5),
    CROSS (6),
    DOUBLE_PARALLEL (7),
    ;

    private final int value;
    private static final Map<Integer, FoldingType> intToTypeMap = new HashMap<>();
    static {
        for (FoldingType type : FoldingType.values()) {
            intToTypeMap.put(type.value, type);
        }
    }

    public static FoldingType fromInt(int i) {
        FoldingType type = intToTypeMap.get(i);
        if (type == null)
            return FoldingType.FLAT;
        return type;
    }

    FoldingType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}

