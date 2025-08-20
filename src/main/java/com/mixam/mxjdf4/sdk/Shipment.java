package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Shipment {
    @JacksonXmlElementWrapper(localName = "deliveryAddresses-list")
    private List<RecipientAddress> deliveryAddresses;
    private Address senderForLabel;

    private double weight;
    private WeightUnitType units;
    private double splitDeliveryAdditionalCharge;

    public double getWeight() {
        return weight;
    }

    public Shipment setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public WeightUnitType getUnits() {
        return units;
    }

    public Shipment setUnits(WeightUnitType units) {
        this.units = units;
        return this;
    }

    public double getSplitDeliveryAdditionalCharge() {
        return splitDeliveryAdditionalCharge;
    }

    public Shipment setSplitDeliveryAdditionalCharge(double splitDeliveryAdditionalCharge) {
        this.splitDeliveryAdditionalCharge = splitDeliveryAdditionalCharge;
        return this;
    }

    public List<RecipientAddress> getDeliveryAddresses() {
        if (deliveryAddresses == null) {
            deliveryAddresses = new ArrayList<>();
        }
        return deliveryAddresses;
    }

    public Shipment setDeliveryAddresses(List<RecipientAddress> deliveryAddresses) {
        this.deliveryAddresses = deliveryAddresses;
        return this;
    }

    public Address getSenderForLabel() {
        return senderForLabel;
    }

    public Shipment setSenderForLabel(Address senderForLabel) {
        this.senderForLabel = senderForLabel;
        return this;
    }
}
