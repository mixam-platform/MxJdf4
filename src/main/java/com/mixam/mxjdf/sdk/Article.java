package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)

public class Article {
    private List<Component> components;
    private ArticleTaxType type;
    private ProductGroupType product;
    private SubProductType subProduct;

    public List<Component> getComponents() {
        if (components == null) {
            components = new ArrayList<>();
        }
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public ArticleTaxType getType() {
        return type;
    }

    public void setType(ArticleTaxType type) {
        this.type = type;
    }

    public ProductGroupType getProduct() {
        return product;
    }

    public void setProduct(ProductGroupType product) {
        this.product = product;
    }

    public SubProductType getSubProduct() {
        return subProduct;
    }

    public void setSubProduct(SubProductType subProduct) {
        this.subProduct = subProduct;
    }
}
