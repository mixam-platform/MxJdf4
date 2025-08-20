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

    public Job setArticle(Article article) {
        this.article = article;
        return this;
    }

    public JobDetails getDetails() {
        return details;
    }

    public Job setDetails(JobDetails details) {
        this.details = details;
        return this;
    }

    public AssociatedProof getAssociatedProof() {
        return associatedProof;
    }

    public Job setAssociatedProof(AssociatedProof associatedProof) {
        this.associatedProof = associatedProof;
        return this;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public Job setShipment(Shipment shipment) {
        this.shipment = shipment;
        return this;
    }

}
