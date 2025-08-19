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
    private PreDrilledHoles preDrilledHoles;

    public FeatureType getFeature() {
        return feature;
    }

    public Processing setFeature(FeatureType feature) {
        this.feature = feature;
        return this;
    }

    public RibbonType getRibbon() {
        return ribbon;
    }

    public Processing setRibbon(RibbonType ribbon) {
        this.ribbon = ribbon;
        return this;
    }

    public Binding getBinding() {
        return binding;
    }

    public Processing setBinding(Binding binding) {
        this.binding = binding;
        return this;
    }

    public CreasingType getCreasing() {
        return creasing;
    }

    public Processing setCreasing(CreasingType creasing) {
        this.creasing = creasing;
        return this;
    }

    public FoldingType getFolding() {
        return folding;
    }

    public Processing setFolding(FoldingType folding) {
        this.folding = folding;
        return this;
    }

    public BandType getHeadTailBand() {
        return headTailBand;
    }

    public Processing setHeadTailBand(BandType headTailBand) {
        this.headTailBand = headTailBand;
        return this;
    }

    public WindowType getWindow() {
        return window;
    }

    public Processing setWindow(WindowType window) {
        this.window = window;
        return this;
    }

    public FrameDepth getFrameDepth() {
        return frameDepth;
    }

    public Processing setFrameDepth(FrameDepth frameDepth) {
        this.frameDepth = frameDepth;
        return this;
    }

    public SubstrateDesign getSubstrateDesign() {
        return substrateDesign;
    }

    public Processing setSubstrateDesign(SubstrateDesign substrateDesign) {
        this.substrateDesign = substrateDesign;
        return this;
    }

    public PreDrilledHoles getPreDrilledHoles() {
        return preDrilledHoles;
    }

    public Processing setPreDrilledHoles(PreDrilledHoles preDrilledHoles) {
        this.preDrilledHoles = preDrilledHoles;
        return this;
    }
}
