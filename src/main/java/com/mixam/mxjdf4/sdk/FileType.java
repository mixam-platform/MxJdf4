package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Associates the artwork file with a component.
 */
@SuppressWarnings("unused")
public enum FileType {
    ALL(0),
    BODY(1),
    COVER(2),
    DUST_JACKET(3),

    /**
     * Not used in the MxJdf4 feed, though it may(?) exist in some historical data.
     *
     * @deprecated Because it's not really a component (it's more like an 'imposition').
     */
    @Deprecated
    HEAD_TO_HEAD(4);

    private final int value;

    FileType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
