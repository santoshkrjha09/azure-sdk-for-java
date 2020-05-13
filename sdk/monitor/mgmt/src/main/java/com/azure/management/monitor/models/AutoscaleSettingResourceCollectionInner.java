// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AutoscaleSettingResourceCollection model. */
@Fluent
public final class AutoscaleSettingResourceCollectionInner {
    /*
     * the values for the autoscale setting resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<AutoscaleSettingResourceInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: the values for the autoscale setting resources.
     *
     * @return the value value.
     */
    public List<AutoscaleSettingResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the values for the autoscale setting resources.
     *
     * @param value the value value to set.
     * @return the AutoscaleSettingResourceCollectionInner object itself.
     */
    public AutoscaleSettingResourceCollectionInner withValue(List<AutoscaleSettingResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the AutoscaleSettingResourceCollectionInner object itself.
     */
    public AutoscaleSettingResourceCollectionInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
