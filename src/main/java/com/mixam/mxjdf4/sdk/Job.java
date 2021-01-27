package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class Job {

    private Article article;
    private JobDetails details;
    private AssociatedProof associatedProof;
    private Shipment shipment;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public JobDetails getDetails() {
        return details;
    }

    public void setDetails(JobDetails details) {
        this.details = details;
    }

    public AssociatedProof getAssociatedProof() {
        return associatedProof;
    }

    public void setAssociatedProof(AssociatedProof associatedProof) {
        this.associatedProof = associatedProof;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

}
