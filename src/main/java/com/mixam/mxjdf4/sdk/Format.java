package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Format extends Dimensions {

    private OrientationType orientation;

    public OrientationType getOrientation() {
        return orientation;
    }

    public void setOrientation(OrientationType orientation) {
        this.orientation = orientation;
    }

}
