package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class MxJdf {
    private String version;
    private String desc;
    private String referencedJobNumber;
    private String author;
    private Date dateCreated;
    private Job job;
    private List<File> files;
    private Export export;
    private Double price;
    private String currencyCode;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getReferencedJobNumber() {
        return referencedJobNumber;
    }

    public void setReferencedJobNumber(String referencedJobNumber) {
        this.referencedJobNumber = referencedJobNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<File> getFiles() {
        if (files == null) {
            files = new ArrayList<>();
        }
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Export getExport() {
        if (export == null) {
            export = new Export();
        }
        return export;
    }

    public void setExport(Export export) {
        this.export = export;
    }
}
