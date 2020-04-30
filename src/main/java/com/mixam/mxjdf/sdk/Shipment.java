package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Shipment {
    private List<RecipientAddress> deliveryAddresses;
    private Address senderForLabel;

    private double weight;
    private WeightUnitType units;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public WeightUnitType getUnits() {
        return units;
    }

    public void setUnits(WeightUnitType units) {
        this.units = units;
    }



    public List<RecipientAddress> getDeliveryAddresses() {
        if (deliveryAddresses == null) {
            deliveryAddresses = new ArrayList<>();
        }
        return deliveryAddresses;
    }

    public void setDeliveryAddresses(List<RecipientAddress> deliveryAddresses) {
        this.deliveryAddresses = deliveryAddresses;
    }

    public Address getSenderForLabel() {
        return senderForLabel;
    }

    public void setSenderForLabel(Address senderForLabel) {
        this.senderForLabel = senderForLabel;
    }
}
