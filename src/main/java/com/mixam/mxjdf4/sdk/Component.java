package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Component {

    private int pages;
    private Chromaticity chromaticity;
    private Format format;
    private Material material;
    private Processing processing;
    private ComponentType type;
    private int productionDays;
    @JacksonXmlElementWrapper(localName = "files-list")
    private List<File> files;

    public List<File> getFiles() {
        if (files == null) {
            files = new ArrayList<>();
        }
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Chromaticity getChromaticity() {
        if (chromaticity == null) {
            chromaticity = new Chromaticity();
        }
        return chromaticity;
    }

    public void setChromaticity(Chromaticity chromaticity) {
        this.chromaticity = chromaticity;
    }

    public Format getFormat() {
        if (format == null) {
            format = new Format();
        }
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Material getMaterial() {
        if (material == null) {
            material = new Material();
        }
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Processing getProcessing() {
        if (processing == null) {
            processing = new Processing();
        }
        return processing;
    }

    public void setProcessing(Processing processing) {
        this.processing = processing;
    }

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }

    public int getProductionDays() {
        return productionDays;
    }

    public void setProductionDays(int productionDays) {
        this.productionDays = productionDays;
    }
}
