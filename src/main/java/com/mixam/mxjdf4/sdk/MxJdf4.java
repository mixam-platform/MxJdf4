package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class MxJdf4 {
    private String version;
    private String desc;
    private String referencedJobNumber;
    private String shopName;
    private String author;
    private Date dateCreated;
    private Job job;
    private Export export;
    private Double price;
    private Double packagingCost;
    private String currencyCode;
    private List<Attribute> attributes;

    public Double getPrice() {
        return price;
    }

    public MxJdf4 setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public MxJdf4 setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public MxJdf4 setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public MxJdf4 setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getReferencedJobNumber() {
        return referencedJobNumber;
    }

    public MxJdf4 setReferencedJobNumber(String referencedJobNumber) {
        this.referencedJobNumber = referencedJobNumber;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public MxJdf4 setAuthor(String author) {
        this.author = author;
        return this;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public MxJdf4 setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    public Job getJob() {
        return job;
    }

    public MxJdf4 setJob(Job job) {
        this.job = job;
        return this;
    }

    public Export getExport() {
        return export;
    }

    public MxJdf4 setExport(Export export) {
        this.export = export;
        return this;
    }

    public String getShopName() {
        return shopName;
    }

    public MxJdf4 setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public Double getPackagingCost() {
        return packagingCost;
    }

    public MxJdf4 setPackagingCost(Double packagingCost) {
        this.packagingCost = packagingCost;
        return this;
    }

    public List<Attribute> getAttributes() {
        if (attributes == null) {
            this.attributes = new ArrayList<>();
        }
        return attributes;
    }

    public MxJdf4 setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
        return this;
    }
}
