package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dimensions {

    private double longEdge;
    private double shortEdge;
    private LengthUnitType units;

    public double getLongEdge() {
        return longEdge;
    }

    public Dimensions setLongEdge(double longEdge) {
        this.longEdge = longEdge;
        return this;
    }

    public double getShortEdge() {
        return shortEdge;
    }

    public Dimensions setShortEdge(double shortEdge) {
        this.shortEdge = shortEdge;
        return this;
    }

    public LengthUnitType getUnits() {
        return units;
    }

    public Dimensions setUnits(LengthUnitType units) {
        this.units = units;
        return this;
    }

}
