// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.appservice.GlobalCsmSkuDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SkuInfos model. */
@Fluent
public final class SkuInfosInner {
    /*
     * Resource type that this SKU applies to.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * List of SKUs the subscription is able to use.
     */
    @JsonProperty(value = "skus")
    private List<GlobalCsmSkuDescription> skus;

    /**
     * Get the resourceType property: Resource type that this SKU applies to.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource type that this SKU applies to.
     *
     * @param resourceType the resourceType value to set.
     * @return the SkuInfosInner object itself.
     */
    public SkuInfosInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the skus property: List of SKUs the subscription is able to use.
     *
     * @return the skus value.
     */
    public List<GlobalCsmSkuDescription> skus() {
        return this.skus;
    }

    /**
     * Set the skus property: List of SKUs the subscription is able to use.
     *
     * @param skus the skus value to set.
     * @return the SkuInfosInner object itself.
     */
    public SkuInfosInner withSkus(List<GlobalCsmSkuDescription> skus) {
        this.skus = skus;
        return this;
    }
}
