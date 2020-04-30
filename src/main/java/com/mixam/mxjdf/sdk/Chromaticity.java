package com.mixam.mxjdf.sdk;

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

    public void setFront(ColorType front) {
        this.front = front;
    }

    public ColorType getBack() {
        return back;
    }

    public void setBack(ColorType back) {
        this.back = back;
    }
}
