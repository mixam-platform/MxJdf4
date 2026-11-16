package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The same identity {@link MxJdf4#getReferencedJobNumber()} packs into one string of digits,
 * broken out here as plain, independently-readable fields instead - so a consumer that wants one
 * of these values doesn't have to know the packed id's shape (how many digits each part takes, or
 * when a part is omitted) to get at it.
 * <p>
 * {@code referencedJobNumber} stays exactly as it's always been, alongside this - nothing about
 * this object changes how that's built or read. See Mixam's {@code FulfilmentService} for the
 * packing/unpacking logic itself.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FulfilmentReference {

    /**
     * Mixam's order case number, e.g. {@code 1234567}. The same number visible to the customer and
     * to Mixam staff for this order.
     */
    private int caseNumber;

    /**
     * This article's 1-based position among the order's items, e.g. {@code 3} for the 3rd item on
     * the order. Always {@code 1} for an order with only one item.
     */
    private int itemNumber;

    /**
     * Which of this article's deliveries this job is for, 1-based. Always {@code 1} today: Mixam
     * sends one combined job per article, covering every delivery address, rather than one job per
     * delivery address - so there's only ever a "delivery 1" to refer to. Present now so a consumer
     * reading this field doesn't need to change if that ever stops being true.
     */
    private int deliveryNumber;

    /**
     * Which attempt at fulfilling this article this is, 1-based. {@code 1} for the first (and,
     * almost always, only) attempt; higher only if a previous attempt had to be abandoned and the
     * article re-fulfilled.
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
