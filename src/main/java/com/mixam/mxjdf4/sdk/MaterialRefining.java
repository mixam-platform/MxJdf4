package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class MaterialRefining {
    private RefiningEffect effect;
    private RefiningSideType side;
    private RefiningType type;

    public RefiningEffect getEffect() {
        return effect;
    }

    public MaterialRefining setEffect(RefiningEffect effect) {
        this.effect = effect;
        return this;
    }

    public RefiningSideType getSide() {
        return side;
    }

    public MaterialRefining setSide(RefiningSideType side) {
        this.side = side;
        return this;
    }

    public RefiningType getType() {
        return type;
    }

    public MaterialRefining setType(RefiningType type) {
        this.type = type;
        return this;
    }
}
