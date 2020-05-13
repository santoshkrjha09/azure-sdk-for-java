/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2020_03_01.implementation.SecurityRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2020_03_01.implementation.NetworkManager;
import java.util.List;

/**
 * Type representing NetworkSecurityGroupSecurityRuleModel.
 */
public interface NetworkSecurityGroupSecurityRuleModel extends HasInner<SecurityRuleInner>, Indexable, Refreshable<NetworkSecurityGroupSecurityRuleModel>, HasManager<NetworkManager> {
    /**
     * @return the access value.
     */
    SecurityRuleAccess access();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the destinationAddressPrefix value.
     */
    String destinationAddressPrefix();

    /**
     * @return the destinationAddressPrefixes value.
     */
    List<String> destinationAddressPrefixes();

    /**
     * @return the destinationApplicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> destinationApplicationSecurityGroups();

    /**
     * @return the destinationPortRange value.
     */
    String destinationPortRange();

    /**
     * @return the destinationPortRanges value.
     */
    List<String> destinationPortRanges();

    /**
     * @return the direction value.
     */
    SecurityRuleDirection direction();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the priority value.
     */
    Integer priority();

    /**
     * @return the protocol value.
     */
    SecurityRuleProtocol protocol();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the sourceAddressPrefix value.
     */
    String sourceAddressPrefix();

    /**
     * @return the sourceAddressPrefixes value.
     */
    List<String> sourceAddressPrefixes();

    /**
     * @return the sourceApplicationSecurityGroups value.
     */
    List<ApplicationSecurityGroup> sourceApplicationSecurityGroups();

    /**
     * @return the sourcePortRange value.
     */
    String sourcePortRange();

    /**
     * @return the sourcePortRanges value.
     */
    List<String> sourcePortRanges();

}
