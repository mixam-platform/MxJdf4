package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * When a {@link Job} previously had a proof (physical or virtual), this element contains details of
 * the proof order so that the supplier can identify the appropriate proof artifact. For jobs that
 * did not have a previous proof this element will be omitted.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class AssociatedProof {

    private String proofJobNumber;
    private JobType proofJobType;
    private Date proofDate;

    public String getProofJobNumber() {
        return proofJobNumber;
    }

    public void setProofJobNumber(String proofJobNumber) {
        this.proofJobNumber = proofJobNumber;
    }

    public JobType getProofJobType() {
        return proofJobType;
    }

    public void setProofJobType(JobType proofJobType) {
        this.proofJobType = proofJobType;
    }

    public Date getProofDate() {
        return proofDate;
    }

    public void setProofDate(Date proofDate) {
        this.proofDate = proofDate;
    }

}
