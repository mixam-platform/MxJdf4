package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Export {
    private double customsValueSum;
    private String customsValueCurrency;

    public double getCustomsValueSum() {
        return customsValueSum;
    }

    public Export setCustomsValueSum(double customsValueSum) {
        this.customsValueSum = customsValueSum;
        return this;
    }

    public String getCustomsValueCurrency() {
        return customsValueCurrency;
    }

    public Export setCustomsValueCurrency(String customsValueCurrency) {
        this.customsValueCurrency = customsValueCurrency;
        return this;
    }
}
