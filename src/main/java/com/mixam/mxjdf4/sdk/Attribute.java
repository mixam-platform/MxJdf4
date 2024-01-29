package com.mixam.mxjdf4.sdk;

/**
 * Flexible model for including additional metadata with an MxJdf4 document. This class can be used
 * (in a pinch) to accommodate unusual supplier requests.
 */
public class Attribute {

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public Attribute setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Attribute setValue(String value) {
        this.value = value;
        return this;
    }

}
