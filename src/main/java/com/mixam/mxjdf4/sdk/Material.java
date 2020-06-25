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

    public void setColor(MaterialColor color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public PaperWeightUnit getUnits() {
        return units;
    }

    public void setUnits(PaperWeightUnit units) {
        this.units = units;
    }

    public List<MaterialRefining> getRefinings() {
        if (refinings == null) {
            refinings = new ArrayList<>();
        }
        return refinings;
    }

    public void setRefinings(List<MaterialRefining> refinings) {
        this.refinings = refinings;
    }

    public MaterialType getType() {
        return type;
    }

    public void setType(MaterialType type) {
        this.type = type;
    }
}
