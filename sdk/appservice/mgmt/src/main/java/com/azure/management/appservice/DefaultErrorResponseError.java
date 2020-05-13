// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DefaultErrorResponseError model. */
@Fluent
public final class DefaultErrorResponseError {
    /*
     * Standardized string to programmatically identify the error.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Detailed error description and debugging information.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Detailed error description and debugging information.
     */
    @JsonProperty(value = "target", access = JsonProperty.Access.WRITE_ONLY)
    private String target;

    /*
     * The details property.
     */
    @JsonProperty(value = "details")
    private List<DefaultErrorResponseErrorDetailsItem> details;

    /*
     * More information to debug error.
     */
    @JsonProperty(value = "innererror", access = JsonProperty.Access.WRITE_ONLY)
    private String innererror;

    /**
     * Get the code property: Standardized string to programmatically identify the error.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: Detailed error description and debugging information.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the target property: Detailed error description and debugging information.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Get the details property: The details property.
     *
     * @return the details value.
     */
    public List<DefaultErrorResponseErrorDetailsItem> details() {
        return this.details;
    }

    /**
     * Set the details property: The details property.
     *
     * @param details the details value to set.
     * @return the DefaultErrorResponseError object itself.
     */
    public DefaultErrorResponseError withDetails(List<DefaultErrorResponseErrorDetailsItem> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innererror property: More information to debug error.
     *
     * @return the innererror value.
     */
    public String innererror() {
        return this.innererror;
    }
}
