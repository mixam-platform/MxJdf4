package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Signals to the supplier whether there are restrictions on the packaging that should be used with
 * this {@link Delivery}. E.g. the supplier should use "plain" (non-branded) packaging.
 */
@SuppressWarnings("unused")
public enum PackagingType {

    /**
     * There is no special guidance regarding the packaging for this {@link Delivery}. The supplier
     * should use whatever packaging is most typical for Mixam orders.
     */
    STANDARD(0),

    /**
     * The supplier should use "plain" (non-branded) packaging with this {@link Delivery}.
     */
    PLAIN(1),
    ;

    private final int value;

    PackagingType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
