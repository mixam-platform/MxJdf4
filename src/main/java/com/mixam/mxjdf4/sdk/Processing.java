package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Processing {

    private Binding binding;
    private CreasingType creasing;
    private FoldingType folding;
    private BandType headTailBand;
    private WindowType window;
    private RibbonType ribbon;
    private FeatureType feature;
    private FrameDepth frameDepth;
    private SubstrateDesign substrateDesign;

    public FeatureType getFeature() {
        return feature;
    }

    public void setFeature(FeatureType feature) {
        this.feature = feature;
    }

    public RibbonType getRibbon() {
        return ribbon;
    }

    public void setRibbon(RibbonType ribbon) {
        this.ribbon = ribbon;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    public CreasingType getCreasing() {
        return creasing;
    }

    public void setCreasing(CreasingType creasing) {
        this.creasing = creasing;
    }

    public FoldingType getFolding() {
        return folding;
    }

    public void setFolding(FoldingType folding) {
        this.folding = folding;
    }

    public BandType getHeadTailBand() {
        return headTailBand;
    }

    public void setHeadTailBand(BandType headTailBand) {
        this.headTailBand = headTailBand;
    }

    public WindowType getWindow() {
        return window;
    }

    public void setWindow(WindowType window) {
        this.window = window;
    }

    public FrameDepth getFrameDepth() {
        return frameDepth;
    }

    public void setFrameDepth(FrameDepth frameDepth) {
        this.frameDepth = frameDepth;
    }

    public SubstrateDesign getSubstrateDesign() {
        return substrateDesign;
    }

    public void setSubstrateDesign(SubstrateDesign substrateDesign) {
        this.substrateDesign = substrateDesign;
    }
}
