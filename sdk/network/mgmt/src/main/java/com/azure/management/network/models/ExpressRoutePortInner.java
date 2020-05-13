// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.management.network.ExpressRoutePortsEncapsulation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ExpressRoute Portnull. */
@JsonFlatten
@Fluent
public class ExpressRoutePortInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The name of the peering location that the ExpressRoutePort is mapped to
     * physically.
     */
    @JsonProperty(value = "properties.peeringLocation")
    private String peeringLocation;

    /*
     * Bandwidth of procured ports in Gbps.
     */
    @JsonProperty(value = "properties.bandwidthInGbps")
    private Integer bandwidthInGbps;

    /*
     * Aggregate Gbps of associated circuit bandwidths.
     */
    @JsonProperty(value = "properties.provisionedBandwidthInGbps", access = JsonProperty.Access.WRITE_ONLY)
    private Float provisionedBandwidthInGbps;

    /*
     * Maximum transmission unit of the physical port pair(s).
     */
    @JsonProperty(value = "properties.mtu", access = JsonProperty.Access.WRITE_ONLY)
    private String mtu;

    /*
     * Encapsulation method on physical ports.
     */
    @JsonProperty(value = "properties.encapsulation")
    private ExpressRoutePortsEncapsulation encapsulation;

    /*
     * Ether type of the physical port.
     */
    @JsonProperty(value = "properties.etherType", access = JsonProperty.Access.WRITE_ONLY)
    private String etherType;

    /*
     * Date of the physical port allocation to be used in Letter of
     * Authorization.
     */
    @JsonProperty(value = "properties.allocationDate", access = JsonProperty.Access.WRITE_ONLY)
    private String allocationDate;

    /*
     * The set of physical links of the ExpressRoutePort resource.
     */
    @JsonProperty(value = "properties.links")
    private List<ExpressRouteLinkInner> links;

    /*
     * Reference the ExpressRoute circuit(s) that are provisioned on this
     * ExpressRoutePort resource.
     */
    @JsonProperty(value = "properties.circuits", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> circuits;

    /*
     * The provisioning state of the ExpressRoutePort resource. Possible values
     * are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The resource GUID property of the ExpressRoutePort resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the peeringLocation property: The name of the peering location that the ExpressRoutePort is mapped to
     * physically.
     *
     * @return the peeringLocation value.
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the peeringLocation property: The name of the peering location that the ExpressRoutePort is mapped to
     * physically.
     *
     * @param peeringLocation the peeringLocation value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the bandwidthInGbps property: Bandwidth of procured ports in Gbps.
     *
     * @return the bandwidthInGbps value.
     */
    public Integer bandwidthInGbps() {
        return this.bandwidthInGbps;
    }

    /**
     * Set the bandwidthInGbps property: Bandwidth of procured ports in Gbps.
     *
     * @param bandwidthInGbps the bandwidthInGbps value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withBandwidthInGbps(Integer bandwidthInGbps) {
        this.bandwidthInGbps = bandwidthInGbps;
        return this;
    }

    /**
     * Get the provisionedBandwidthInGbps property: Aggregate Gbps of associated circuit bandwidths.
     *
     * @return the provisionedBandwidthInGbps value.
     */
    public Float provisionedBandwidthInGbps() {
        return this.provisionedBandwidthInGbps;
    }

    /**
     * Get the mtu property: Maximum transmission unit of the physical port pair(s).
     *
     * @return the mtu value.
     */
    public String mtu() {
        return this.mtu;
    }

    /**
     * Get the encapsulation property: Encapsulation method on physical ports.
     *
     * @return the encapsulation value.
     */
    public ExpressRoutePortsEncapsulation encapsulation() {
        return this.encapsulation;
    }

    /**
     * Set the encapsulation property: Encapsulation method on physical ports.
     *
     * @param encapsulation the encapsulation value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withEncapsulation(ExpressRoutePortsEncapsulation encapsulation) {
        this.encapsulation = encapsulation;
        return this;
    }

    /**
     * Get the etherType property: Ether type of the physical port.
     *
     * @return the etherType value.
     */
    public String etherType() {
        return this.etherType;
    }

    /**
     * Get the allocationDate property: Date of the physical port allocation to be used in Letter of Authorization.
     *
     * @return the allocationDate value.
     */
    public String allocationDate() {
        return this.allocationDate;
    }

    /**
     * Get the links property: The set of physical links of the ExpressRoutePort resource.
     *
     * @return the links value.
     */
    public List<ExpressRouteLinkInner> links() {
        return this.links;
    }

    /**
     * Set the links property: The set of physical links of the ExpressRoutePort resource.
     *
     * @param links the links value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withLinks(List<ExpressRouteLinkInner> links) {
        this.links = links;
        return this;
    }

    /**
     * Get the circuits property: Reference the ExpressRoute circuit(s) that are provisioned on this ExpressRoutePort
     * resource.
     *
     * @return the circuits value.
     */
    public List<SubResource> circuits() {
        return this.circuits;
    }

    /**
     * Get the provisioningState property: The provisioning state of the ExpressRoutePort resource. Possible values are:
     * 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the ExpressRoutePort resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid property: The resource GUID property of the ExpressRoutePort resource.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the ExpressRoutePortInner object itself.
     */
    public ExpressRoutePortInner withId(String id) {
        this.id = id;
        return this;
    }
}
