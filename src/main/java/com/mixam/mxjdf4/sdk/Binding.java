package com.mixam.mxjdf4.sdk;

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
    private boolean sewn;
    private BindingEdge edge;

    public Double getSpineWidth() {
        return spineWidth;
    }

    public Binding setSpineWidth(Double spineWidth) {
        this.spineWidth = spineWidth;
        return this;
    }

    public EndPaperColorType getEndPaperColor() {
        return endPaperColor;
    }

    public Binding setEndPaperColor(EndPaperColorType endPaperColor) {
        this.endPaperColor = endPaperColor;
        return this;
    }

    public BindingType getType() {
        return type;
    }

    public Binding setType(BindingType type) {
        this.type = type;
        return this;
    }

    public BindingColorType getColor() {
        return color;
    }

    public Binding setColor(BindingColorType color) {
        this.color = color;
        return this;
    }

    public LoopsType getLoops() {
        return loops;
    }

    public Binding setLoops(LoopsType loops) {
        this.loops = loops;
        return this;
    }

    public boolean isSewn() {
        return sewn;
    }

    public Binding setSewn(boolean sewn) {
        this.sewn = sewn;
        return this;
    }

    public BindingEdge getEdge() {
        return edge;
    }

    public Binding setEdge(BindingEdge edge) {
        this.edge = edge;
        return this;
    }
}
