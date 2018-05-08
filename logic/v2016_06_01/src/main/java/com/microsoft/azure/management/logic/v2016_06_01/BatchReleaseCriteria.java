/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The batch release criteria.
 */
public class BatchReleaseCriteria {
    /**
     * The message count.
     */
    @JsonProperty(value = "messageCount")
    private Integer messageCount;

    /**
     * The batch size in bytes.
     */
    @JsonProperty(value = "batchSize")
    private Integer batchSize;

    /**
     * The recurrence.
     */
    @JsonProperty(value = "recurrence")
    private WorkflowTriggerRecurrence recurrence;

    /**
     * Get the messageCount value.
     *
     * @return the messageCount value
     */
    public Integer messageCount() {
        return this.messageCount;
    }

    /**
     * Set the messageCount value.
     *
     * @param messageCount the messageCount value to set
     * @return the BatchReleaseCriteria object itself.
     */
    public BatchReleaseCriteria withMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Get the batchSize value.
     *
     * @return the batchSize value
     */
    public Integer batchSize() {
        return this.batchSize;
    }

    /**
     * Set the batchSize value.
     *
     * @param batchSize the batchSize value to set
     * @return the BatchReleaseCriteria object itself.
     */
    public BatchReleaseCriteria withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Get the recurrence value.
     *
     * @return the recurrence value
     */
    public WorkflowTriggerRecurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence value.
     *
     * @param recurrence the recurrence value to set
     * @return the BatchReleaseCriteria object itself.
     */
    public BatchReleaseCriteria withRecurrence(WorkflowTriggerRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

}
