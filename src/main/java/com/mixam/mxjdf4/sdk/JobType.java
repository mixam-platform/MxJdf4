package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates whether a job is the primary print run associated with an order (most common) or some
 * form of ancillary print run like a proof.
 */
@SuppressWarnings("unused")
public enum JobType {

    /**
     * This is the main job of the order: final copies for distribution in whatever form.
     */
    PRIMARY_PRINT(0),

    /**
     * This job is a "ripped" (virtual/electronic) proof.
     */
    RIPPED_PROOF(1),

    /**
     * This job is a "hard" (physical/printed) proof.
     */
    HARD_COPY_PROOF(2)
    ;

    private final int value;

    JobType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
