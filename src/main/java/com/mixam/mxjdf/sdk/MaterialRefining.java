package com.mixam.mxjdf.sdk;

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

    public void setEffect(RefiningEffect effect) {
        this.effect = effect;
    }

    public RefiningSideType getSide() {
        return side;
    }

    public void setSide(RefiningSideType side) {
        this.side = side;
    }

    public RefiningType getType() {
        return type;
    }

    public void setType(RefiningType type) {
        this.type = type;
    }
}
