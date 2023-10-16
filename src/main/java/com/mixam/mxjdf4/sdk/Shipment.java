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

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public WeightUnitType getUnits() {
        return units;
    }

    public void setUnits(WeightUnitType units) {
        this.units = units;
    }

    public double getSplitDeliveryAdditionalCharge() {
        return splitDeliveryAdditionalCharge;
    }

    public void setSplitDeliveryAdditionalCharge(double splitDeliveryAdditionalCharge) {
        this.splitDeliveryAdditionalCharge = splitDeliveryAdditionalCharge;
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
