// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VirtualMachineScaleSetVMListResult model. */
@Fluent
public final class VirtualMachineScaleSetVMListResultInner {
    /*
     * The list of virtual machine scale sets VMs.
     */
    @JsonProperty(value = "value", required = true)
    private List<VirtualMachineScaleSetVMInner> value;

    /*
     * The uri to fetch the next page of Virtual Machine Scale Set VMs. Call
     * ListNext() with this to fetch the next page of VMSS VMs
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of virtual machine scale sets VMs.
     *
     * @return the value value.
     */
    public List<VirtualMachineScaleSetVMInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of virtual machine scale sets VMs.
     *
     * @param value the value value to set.
     * @return the VirtualMachineScaleSetVMListResultInner object itself.
     */
    public VirtualMachineScaleSetVMListResultInner withValue(List<VirtualMachineScaleSetVMInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of Virtual Machine Scale Set VMs. Call ListNext() with
     * this to fetch the next page of VMSS VMs.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of Virtual Machine Scale Set VMs. Call ListNext() with
     * this to fetch the next page of VMSS VMs.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineScaleSetVMListResultInner object itself.
     */
    public VirtualMachineScaleSetVMListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
