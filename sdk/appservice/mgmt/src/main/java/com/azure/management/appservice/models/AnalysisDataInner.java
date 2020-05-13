// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.appservice.DiagnosticMetricSet;
import com.azure.management.appservice.NameValuePair;
import com.azure.management.appservice.ResponseMetaData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AnalysisData model. */
@Fluent
public final class AnalysisDataInner {
    /*
     * Name of the Detector
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * Detector Definition
     */
    @JsonProperty(value = "detectorDefinition")
    private DetectorDefinitionInner detectorDefinition;

    /*
     * Source Metrics
     */
    @JsonProperty(value = "metrics")
    private List<DiagnosticMetricSet> metrics;

    /*
     * Additional Source Data
     */
    @JsonProperty(value = "data")
    private List<List<NameValuePair>> data;

    /*
     * Detector Meta Data
     */
    @JsonProperty(value = "detectorMetaData")
    private ResponseMetaData detectorMetaData;

    /**
     * Get the source property: Name of the Detector.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Name of the Detector.
     *
     * @param source the source value to set.
     * @return the AnalysisDataInner object itself.
     */
    public AnalysisDataInner withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the detectorDefinition property: Detector Definition.
     *
     * @return the detectorDefinition value.
     */
    public DetectorDefinitionInner detectorDefinition() {
        return this.detectorDefinition;
    }

    /**
     * Set the detectorDefinition property: Detector Definition.
     *
     * @param detectorDefinition the detectorDefinition value to set.
     * @return the AnalysisDataInner object itself.
     */
    public AnalysisDataInner withDetectorDefinition(DetectorDefinitionInner detectorDefinition) {
        this.detectorDefinition = detectorDefinition;
        return this;
    }

    /**
     * Get the metrics property: Source Metrics.
     *
     * @return the metrics value.
     */
    public List<DiagnosticMetricSet> metrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: Source Metrics.
     *
     * @param metrics the metrics value to set.
     * @return the AnalysisDataInner object itself.
     */
    public AnalysisDataInner withMetrics(List<DiagnosticMetricSet> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the data property: Additional Source Data.
     *
     * @return the data value.
     */
    public List<List<NameValuePair>> data() {
        return this.data;
    }

    /**
     * Set the data property: Additional Source Data.
     *
     * @param data the data value to set.
     * @return the AnalysisDataInner object itself.
     */
    public AnalysisDataInner withData(List<List<NameValuePair>> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the detectorMetaData property: Detector Meta Data.
     *
     * @return the detectorMetaData value.
     */
    public ResponseMetaData detectorMetaData() {
        return this.detectorMetaData;
    }

    /**
     * Set the detectorMetaData property: Detector Meta Data.
     *
     * @param detectorMetaData the detectorMetaData value to set.
     * @return the AnalysisDataInner object itself.
     */
    public AnalysisDataInner withDetectorMetaData(ResponseMetaData detectorMetaData) {
        this.detectorMetaData = detectorMetaData;
        return this;
    }
}
