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
    @JacksonXmlElementWrapper(localName = "files-list")
    private List<File> files;

    public List<File> getFiles() {
        if (files == null) {
            files = new ArrayList<>();
        }
        return files;
    }

    public Component setFiles(List<File> files) {
        this.files = files;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public Component setPages(int pages) {
        this.pages = pages;
        return this;
    }

    public Chromaticity getChromaticity() {
        if (chromaticity == null) {
            chromaticity = new Chromaticity();
        }
        return chromaticity;
    }

    public Component setChromaticity(Chromaticity chromaticity) {
        this.chromaticity = chromaticity;
        return this;
    }

    public Format getFormat() {
        if (format == null) {
            format = new Format();
        }
        return format;
    }

    public Component setFormat(Format format) {
        this.format = format;
        return this;
    }

    public Material getMaterial() {
        if (material == null) {
            material = new Material();
        }
        return material;
    }

    public Component setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public Processing getProcessing() {
        if (processing == null) {
            processing = new Processing();
        }
        return processing;
    }

    public Component setProcessing(Processing processing) {
        this.processing = processing;
        return this;
    }

    public ComponentType getType() {
        return type;
    }

    public Component setType(ComponentType type) {
        this.type = type;
        return this;
    }

}
