package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Chromaticity {
    private ColorType front;
    private ColorType back;

    public ColorType getFront() {
        return front;
    }

    public Chromaticity setFront(ColorType front) {
        this.front = front;
        return this;
    }

    public ColorType getBack() {
        return back;
    }

    public Chromaticity setBack(ColorType back) {
        this.back = back;
        return this;
    }
}
