package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class Delivery {

    private DeliveryType type;
    private String carrier;
    private String serviceType;
    private String serviceDescription;
    private String canonicalUri;
    private double cost;
    private String url;
    private PackagingType packagingType;

    public DeliveryType getType() {
        return type;
    }

    public Delivery setType(DeliveryType type) {
        this.type = type;
        return this;
    }

    public String getCarrier() {
        return carrier;
    }

    public Delivery setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    public String getServiceType() {
        return serviceType;
    }

    public Delivery setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public Delivery setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
        return this;
    }

    public String getCanonicalUri() {
        return canonicalUri;
    }

    public Delivery setCanonicalUri(String canonicalUri) {
        this.canonicalUri = canonicalUri;
        return this;
    }

    public double getCost() {
        return cost;
    }

    public Delivery setCost(double cost) {
        this.cost = cost;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Delivery setUrl(String url) {
        this.url = url;
        return this;
    }

    public PackagingType getPackagingType() {
        return packagingType;
    }

    public Delivery setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
        return this;
    }

}


