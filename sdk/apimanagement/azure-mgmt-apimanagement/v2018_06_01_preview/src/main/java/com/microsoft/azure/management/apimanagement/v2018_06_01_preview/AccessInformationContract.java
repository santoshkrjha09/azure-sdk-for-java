/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.AccessInformationContractInner;

/**
 * Type representing AccessInformationContract.
 */
public interface AccessInformationContract extends HasInner<AccessInformationContractInner>, HasManager<ApiManagementManager> {
    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

}