package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RefiningType {
    NONE (0),
    ULTRA_VIOLET_COATING(1),
    LAMINATION (2),
    PROTECTIVE_FOIL (3),
    METAL_FOIL (4),
    SOFT_PVC_FILM_LAMINATION (5),
    ULTRA_VIOLET_SPOT_COATING (6),
    DISPERSION_COATING (7),
    BIND_EMBOSSING ( 8),
    RELIEF_SPOT_COATING (9),
    ULTRA_VIOLET_3D_SPOT_COATING (10),
    ;

    private final int value;

    RefiningType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}

