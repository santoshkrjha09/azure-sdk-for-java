// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HttpMessage model. */
@Fluent
public final class HttpMessage {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HttpMessage.class);

    /*
     * HTTP message content.
     */
    @JsonProperty(value = "content")
    private Object content;

    /**
     * Get the content property: HTTP message content.
     *
     * @return the content value.
     */
    public Object content() {
        return this.content;
    }

    /**
     * Set the content property: HTTP message content.
     *
     * @param content the content value to set.
     * @return the HttpMessage object itself.
     */
    public HttpMessage withContent(Object content) {
        this.content = content;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
