/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_03_01.ServiceTags;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.ServiceTagsListResult;

class ServiceTagsImpl extends WrapperImpl<ServiceTagsInner> implements ServiceTags {
    private final NetworkManager manager;

    ServiceTagsImpl(NetworkManager manager) {
        super(manager.inner().serviceTags());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServiceTagsListResult> listAsync(String location) {
        ServiceTagsInner client = this.inner();
        return client.listAsync(location)
        .map(new Func1<ServiceTagsListResultInner, ServiceTagsListResult>() {
            @Override
            public ServiceTagsListResult call(ServiceTagsListResultInner inner) {
                return new ServiceTagsListResultImpl(inner, manager());
            }
        });
    }

}
