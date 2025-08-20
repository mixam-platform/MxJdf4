package com.mixam.mxjdf4.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

    @JacksonXmlElementWrapper(localName = "components-list")
    private List<Component> components;

    private ArticleTaxType type;

    private ProductGroupType product;

    private SubProductType subProduct;

    private boolean rightToLeft;

    private int productionDays;

    private Bundling bundling;

    @JacksonXmlElementWrapper(localName = "additional-files")
    private List<File> additionalFiles;

    public List<Component> getComponents() {
        if (components == null) {
            components = new ArrayList<>();
        }
        return components;
    }

    public Article setComponents(List<Component> components) {
        this.components = components;
        return this;
    }

    public ArticleTaxType getType() {
        return type;
    }

    public Article setType(ArticleTaxType type) {
        this.type = type;
        return this;
    }

    public ProductGroupType getProduct() {
        return product;
    }

    public Article setProduct(ProductGroupType product) {
        this.product = product;
        return this;
    }

    public SubProductType getSubProduct() {
        return subProduct;
    }

    public Article setSubProduct(SubProductType subProduct) {
        this.subProduct = subProduct;
        return this;
    }

    public boolean isRightToLeft() {
        return rightToLeft;
    }

    public Article setRightToLeft(boolean rightToLeft) {
        this.rightToLeft = rightToLeft;
        return this;
    }

    public int getProductionDays() {
        return productionDays;
    }

    public Article setProductionDays(int productionDays) {
        this.productionDays = productionDays;
        return this;
    }

    /**
     * Additional merged files that aren't specifically associated with a {@link Component}.
     */
    public List<File> getAdditionalFiles() {
        if (additionalFiles == null) {
            additionalFiles = new ArrayList<>();
        }
        return additionalFiles;
    }

    public Article setAdditionalFiles(List<File> additionalFiles) {
        this.additionalFiles = additionalFiles;
        return this;
    }

    public Bundling getBundling() {
        return bundling;
    }

    public Article setBundling(Bundling bundling) {
        this.bundling = bundling;
        return this;
    }
}
