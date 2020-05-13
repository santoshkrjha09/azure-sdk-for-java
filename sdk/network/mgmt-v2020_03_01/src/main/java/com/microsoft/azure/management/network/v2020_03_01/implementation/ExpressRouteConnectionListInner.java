/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpressRouteConnection list.
 */
public class ExpressRouteConnectionListInner {
    /**
     * The list of ExpressRoute connections.
     */
    @JsonProperty(value = "value")
    private List<ExpressRouteConnectionInner> value;

    /**
     * Get the list of ExpressRoute connections.
     *
     * @return the value value
     */
    public List<ExpressRouteConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the list of ExpressRoute connections.
     *
     * @param value the value value to set
     * @return the ExpressRouteConnectionListInner object itself.
     */
    public ExpressRouteConnectionListInner withValue(List<ExpressRouteConnectionInner> value) {
        this.value = value;
        return this;
    }

}
