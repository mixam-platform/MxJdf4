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

    /**
     * Alias of {@code additionalProjectName}.
     */
    public String getOrderId() {
        return additionalProjectName;
    }

    /**
     * Alias of {@code additionalProjectName}.
     */
    public void setOrderId(String orderId) {
        this.additionalProjectName = orderId;
    }

    public AssumedPrintType getAssumedPrintType() {
        return assumedPrintType;
    }

    public void setAssumedPrintType(AssumedPrintType assumedPrintType) {
        this.assumedPrintType = assumedPrintType;
    }

    public String getAdditionalProjectName() {
        return additionalProjectName;
    }

    public void setAdditionalProjectName(String additionalProjectName) {
        this.additionalProjectName = additionalProjectName;
    }

    public CompletionType getCompletionType() {
        return completionType;
    }

    public void setCompletionType(CompletionType completionType) {
        this.completionType = completionType;
    }

    public int getTotalCirculation() {
        return totalCirculation;
    }

    public void setTotalCirculation(int totalCirculation) {
        this.totalCirculation = totalCirculation;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = Objects.requireNonNull(orderType);
    }

    /**
     * Fulfilment-time remarks added by the Mixam admin, if any.
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }
}
