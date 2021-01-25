package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * When a {@link Job} previously had a proof (physical or virtual), this element contains details of
 * the proof order so that the supplier can identify the appropriate proof artifact. For jobs that
 * did not have a previous proof this element will be omitted.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class Proof {

    private String referencedJobNumber;
    private JobType jobType;

    public String getReferencedJobNumber() {
        return referencedJobNumber;
    }

    public void setReferencedJobNumber(String referencedJobNumber) {
        this.referencedJobNumber = referencedJobNumber;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

}
