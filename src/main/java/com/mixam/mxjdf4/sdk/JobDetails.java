package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class JobDetails {

    private String additionalProjectName;
    private CompletionType completionType;
    private int totalCirculation;
    private AssumedPrintType assumedPrintType;
    private JobType jobType;

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

}
