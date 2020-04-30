package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Binding {
    private BindingType type;
    private BindingColorType color;
    private LoopsType loops;
    private EndPaperColorType endPaperColor;
    private Double spineWidth;

    public Double getSpineWidth() {
        return spineWidth;
    }

    public void setSpineWidth(Double spineWidth) {
        this.spineWidth = spineWidth;
    }

    public EndPaperColorType getEndPaperColor() {
        return endPaperColor;
    }

    public void setEndPaperColor(EndPaperColorType endPaperColor) {
        this.endPaperColor = endPaperColor;
    }

    public BindingType getType() {
        return type;
    }

    public void setType(BindingType type) {
        this.type = type;
    }

    public BindingColorType getColor() {
        return color;
    }

    public void setColor(BindingColorType color) {
        this.color = color;
    }

    public LoopsType getLoops() {
        return loops;
    }

    public void setLoops(LoopsType loops) {
        this.loops = loops;
    }
}
