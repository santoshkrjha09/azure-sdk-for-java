// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The InstanceViewStatus model. */
@Fluent
public final class InstanceViewStatus {
    /*
     * The status code.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The level code.
     */
    @JsonProperty(value = "level")
    private StatusLevelTypes level;

    /*
     * The short localizable label for the status.
     */
    @JsonProperty(value = "displayStatus")
    private String displayStatus;

    /*
     * The detailed status message, including for alerts and error messages.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * The time of the status.
     */
    @JsonProperty(value = "time")
    private OffsetDateTime time;

    /**
     * Get the code property: The status code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Set the code property: The status code.
     *
     * @param code the code value to set.
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the level property: The level code.
     *
     * @return the level value.
     */
    public StatusLevelTypes level() {
        return this.level;
    }

    /**
     * Set the level property: The level code.
     *
     * @param level the level value to set.
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withLevel(StatusLevelTypes level) {
        this.level = level;
        return this;
    }

    /**
     * Get the displayStatus property: The short localizable label for the status.
     *
     * @return the displayStatus value.
     */
    public String displayStatus() {
        return this.displayStatus;
    }

    /**
     * Set the displayStatus property: The short localizable label for the status.
     *
     * @param displayStatus the displayStatus value to set.
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }

    /**
     * Get the message property: The detailed status message, including for alerts and error messages.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The detailed status message, including for alerts and error messages.
     *
     * @param message the message value to set.
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the time property: The time of the status.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Set the time property: The time of the status.
     *
     * @param time the time value to set.
     * @return the InstanceViewStatus object itself.
     */
    public InstanceViewStatus withTime(OffsetDateTime time) {
        this.time = time;
        return this;
    }
}
