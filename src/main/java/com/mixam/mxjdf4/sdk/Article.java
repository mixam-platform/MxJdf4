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

    @JacksonXmlElementWrapper(localName = "additional-files")
    private List<File> additionalFiles;

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

    /**
     * Additional merged files that aren't specifically associated with a {@link Component}.
     */
    public List<File> getAdditionalFiles() {
        if (additionalFiles == null) {
            additionalFiles = new ArrayList<>();
        }
        return additionalFiles;
    }

    public void setAdditionalFiles(List<File> additionalFiles) {
        this.additionalFiles = additionalFiles;
    }

}
