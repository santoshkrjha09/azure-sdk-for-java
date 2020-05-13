/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2020_03_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties pertained to UnknownTarget.
 */
public class UnknownTarget {
    /**
     * Dictionary of string-&gt;string pairs containing information about the
     * Storage Target.
     */
    @JsonProperty(value = "unknownMap")
    private Map<String, String> unknownMap;

    /**
     * Get dictionary of string-&gt;string pairs containing information about the Storage Target.
     *
     * @return the unknownMap value
     */
    public Map<String, String> unknownMap() {
        return this.unknownMap;
    }

    /**
     * Set dictionary of string-&gt;string pairs containing information about the Storage Target.
     *
     * @param unknownMap the unknownMap value to set
     * @return the UnknownTarget object itself.
     */
    public UnknownTarget withUnknownMap(Map<String, String> unknownMap) {
        this.unknownMap = unknownMap;
        return this;
    }

}
