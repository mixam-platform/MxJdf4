package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Material {
    private int weight;
    private PaperWeightUnit units;
    @JacksonXmlElementWrapper(localName = "refinings-list")
    private List<MaterialRefining> refinings;
    private MaterialType type;
    private MaterialColor color;

    public MaterialColor getColor() {
        return color;
    }

    public Material setColor(MaterialColor color) {
        this.color = color;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Material setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public PaperWeightUnit getUnits() {
        return units;
    }

    public Material setUnits(PaperWeightUnit units) {
        this.units = units;
        return this;
    }

    public List<MaterialRefining> getRefinings() {
        if (refinings == null) {
            refinings = new ArrayList<>();
        }
        return refinings;
    }

    public Material setRefinings(List<MaterialRefining> refinings) {
        this.refinings = refinings;
        return this;
    }

    public MaterialType getType() {
        return type;
    }

    public Material setType(MaterialType type) {
        this.type = type;
        return this;
    }
}
