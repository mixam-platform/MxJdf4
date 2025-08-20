package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class JobDetails {

    private String additionalProjectName;
    private CompletionType completionType;
    private int totalCirculation;
    private AssumedPrintType assumedPrintType;
    private JobType jobType;
    private OrderType orderType = OrderType.STANDARD; // default
    private String remark;
    private String machineName;
    private String publicationId;
    // Mixam International Standard Book Number (Fake ISBN)
    private String misbn;

    /**
     * Alias of {@code additionalProjectName}.
     */
    public String getOrderId() {
        return additionalProjectName;
    }

    /**
     * Alias of {@code additionalProjectName}.
     */
    public JobDetails setOrderId(String orderId) {
        this.additionalProjectName = orderId;
        return this;
    }

    public AssumedPrintType getAssumedPrintType() {
        return assumedPrintType;
    }

    public JobDetails setAssumedPrintType(AssumedPrintType assumedPrintType) {
        this.assumedPrintType = assumedPrintType;
        return this;
    }

    public String getAdditionalProjectName() {
        return additionalProjectName;
    }

    public JobDetails setAdditionalProjectName(String additionalProjectName) {
        this.additionalProjectName = additionalProjectName;
        return this;
    }

    public CompletionType getCompletionType() {
        return completionType;
    }

    public JobDetails setCompletionType(CompletionType completionType) {
        this.completionType = completionType;
        return this;
    }

    public int getTotalCirculation() {
        return totalCirculation;
    }

    public JobDetails setTotalCirculation(int totalCirculation) {
        this.totalCirculation = totalCirculation;
        return this;
    }

    public JobType getJobType() {
        return jobType;
    }

    public JobDetails setJobType(JobType jobType) {
        this.jobType = jobType;
        return this;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public JobDetails setOrderType(OrderType orderType) {
        this.orderType = Objects.requireNonNull(orderType);
        return this;
    }

    /**
     * Fulfilment-time remarks added by the Mixam admin, if any.
     */
    public String getRemark() {
        return remark;
    }

    public JobDetails setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getMachineName() {
        return machineName;
    }

    public JobDetails setMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    public String getPublicationId() {
        return publicationId;
    }

    public JobDetails setPublicationId(String publicationId) {
        this.publicationId = publicationId;
        return this;
    }

    public String getMisbn() {
        return misbn;
    }

    public JobDetails setMisbn(String misbn) {
        this.misbn = misbn;
        return this;
    }
}
