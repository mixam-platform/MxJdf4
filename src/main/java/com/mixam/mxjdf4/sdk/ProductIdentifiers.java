package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * EU Product Identifiers (PIDs) for the item, required by EU customs for goods imported into the EU customs
 * territory (EU27 and Northern Ireland) from 1 November 2026. Suppliers who book their own carriers must send
 * these to the carrier on each customs line / commercial invoice line for the item.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductIdentifiers {

    /**
     * M-PID: Merchant Product Identifier, e.g. "7-100016".
     */
    private String merchantProductId;

    /**
     * NS-PID: Non-Standardised Manufacturer Product Identifier, e.g. "MX-7-100016".
     */
    private String nonStandardManufacturerProductId;

    /**
     * S-PID: Standardised Manufacturer Product Identifier (e.g. ISBN/GTIN). "NO" when the item doesn't have one.
     */
    private String standardManufacturerProductId;

    /**
     * The identifiers formatted for a commercial invoice / goods description, e.g.
     * "M-PID7-100016 NS-PIDMX-7-100016 S-PIDNO".
     */
    private String customsDescription;

    public String getMerchantProductId() {
        return merchantProductId;
    }

    public ProductIdentifiers setMerchantProductId(String merchantProductId) {
        this.merchantProductId = merchantProductId;
        return this;
    }

    public String getNonStandardManufacturerProductId() {
        return nonStandardManufacturerProductId;
    }

    public ProductIdentifiers setNonStandardManufacturerProductId(String nonStandardManufacturerProductId) {
        this.nonStandardManufacturerProductId = nonStandardManufacturerProductId;
        return this;
    }

    public String getStandardManufacturerProductId() {
        return standardManufacturerProductId;
    }

    public ProductIdentifiers setStandardManufacturerProductId(String standardManufacturerProductId) {
        this.standardManufacturerProductId = standardManufacturerProductId;
        return this;
    }

    public String getCustomsDescription() {
        return customsDescription;
    }

    public ProductIdentifiers setCustomsDescription(String customsDescription) {
        this.customsDescription = customsDescription;
        return this;
    }
}
