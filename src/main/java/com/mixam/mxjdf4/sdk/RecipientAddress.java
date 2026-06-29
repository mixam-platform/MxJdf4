package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class RecipientAddress {
    private String deliveryId;

    private Address address;
    private int circulation;
    private Delivery delivery;

    private Date dispatchDate;
    private Date deliveryDate;

    /**
     * ISO 8601 date format of the {@link #dispatchDate} to make it clear the timezone we are dealing with
     */
    private String dispatchDateIso8601;

    /**
     * ISO 8601 date format of the {@link #deliveryDate} to make it clear the timezone we are dealing with
     */
    private String deliveryDateIso8601;

    private String instructions;

    /**
     * Unique, Mixam-assigned, opaque identifier for the {@code Delivery} associated with this
     * address.
     */
    public String getDeliveryId() {
        return deliveryId;
    }

    public RecipientAddress setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public RecipientAddress setDelivery(Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public RecipientAddress setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    public Date getDispatchDate() {
        return dispatchDate;
    }

    public RecipientAddress setDispatchDate(Date dispatchDate) {
        this.dispatchDate = dispatchDate;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public RecipientAddress setAddress(Address address) {
        this.address = address;
        return this;
    }

    public int getCirculation() {
        return circulation;
    }

    public RecipientAddress setCirculation(int circulation) {
        this.circulation = circulation;
        return this;
    }

    public String getInstructions() {
        return instructions;
    }

    public RecipientAddress setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public String getDispatchDateIso8601() {
        return dispatchDateIso8601;
    }

    public RecipientAddress setDispatchDateIso8601(String dispatchDateIso8601) {
        this.dispatchDateIso8601 = dispatchDateIso8601;
        return this;
    }

    public String getDeliveryDateIso8601() {
        return deliveryDateIso8601;
    }

    public RecipientAddress setDeliveryDateIso8601(String deliveryDateIso8601) {
        this.deliveryDateIso8601 = deliveryDateIso8601;
        return this;
    }
}
