/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.logic.v2016_06_01.implementation.CertificatesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Certificates.
 */
public interface Certificates extends SupportsCreating<IntegrationAccountCertificate.DefinitionStages.Blank>, HasInner<CertificatesInner> {

    /**
     * Gets a list of integration account certificates.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationAccountCertificate> listByIntegrationAccountAsync(final String resourceGroupName, final String integrationAccountName);

    /**
     * Gets an integration account certificate.
    *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param certificateName The integration account certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<IntegrationAccountCertificate> getByIntegrationAccountAsync(String resourceGroupName, String integrationAccountName, String certificateName);

    /**
     * Deletes an integration account certificate.
     *
     * @param resourceGroupName The resource group name.
     * @param integrationAccountName The integration account name.
     * @param certificateName The integration account certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteByIntegrationAccountAsync(String resourceGroupName, String integrationAccountName, String certificateName);
}
