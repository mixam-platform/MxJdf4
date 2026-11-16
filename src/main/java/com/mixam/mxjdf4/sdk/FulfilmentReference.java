package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The numbers {@link MxJdf4#getReferencedJobNumber()} packs into one string of digits, as
 * separate fields - so a consumer that wants one of them doesn't have to know how many digits
 * each part of the string takes to get at it.
 * <p>
 * Sent alongside {@code referencedJobNumber}, not instead of it.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FulfilmentReference {

    /**
     * The order's case number, e.g. {@code 1234567}.
     */
    private int caseNumber;

    /**
     * The item's 1-based position on the order, e.g. {@code 3} for the 3rd item. {@code 1} for an
     * order with only one item.
     */
    private int itemNumber;

    /**
     * Which of the item's deliveries this job covers, 1-based. {@code 1} when the job covers all
     * of the item's delivery addresses. When a split delivery is sent as one job per delivery
     * address, the number of the address this job is for.
     */
    private int deliveryNumber;

    /**
     * {@code 1} the first time a job is sent, {@code 2} or higher when it has been sent again. A
     * revision of {@code 1} is not written into {@code referencedJobNumber}.
     */
    private int revision;

    public int getCaseNumber() {
        return caseNumber;
    }

    public FulfilmentReference setCaseNumber(int caseNumber) {
        this.caseNumber = caseNumber;
        return this;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public FulfilmentReference setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
        return this;
    }

    public int getDeliveryNumber() {
        return deliveryNumber;
    }

    public FulfilmentReference setDeliveryNumber(int deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
        return this;
    }

    public int getRevision() {
        return revision;
    }

    public FulfilmentReference setRevision(int revision) {
        this.revision = revision;
        return this;
    }
}
