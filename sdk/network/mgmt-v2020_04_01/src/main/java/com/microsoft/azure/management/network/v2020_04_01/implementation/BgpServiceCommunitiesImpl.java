/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_04_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_04_01.BgpServiceCommunities;
import com.microsoft.azure.management.network.v2020_04_01.BgpServiceCommunity;
import rx.Observable;
import rx.Completable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class BgpServiceCommunitiesImpl extends GroupableResourcesCoreImpl<BgpServiceCommunity, BgpServiceCommunityImpl, BgpServiceCommunityInner, BgpServiceCommunitiesInner, NetworkManager>  implements BgpServiceCommunities {
    protected BgpServiceCommunitiesImpl(NetworkManager manager) {
        super(manager.inner().bgpServiceCommunities(), manager);
    }

    @Override
    protected Observable<BgpServiceCommunityInner> getInnerAsync(String resourceGroupName, String name) {
        return null; // NOP Retrieve by resource group not supported
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        BgpServiceCommunitiesInner client = this.inner();
        return Completable.error(new Throwable("Delete by RG not supported for this resource")); // NOP Delete by RG not supported
    }

    @Override
    public PagedList<BgpServiceCommunity> list() {
        BgpServiceCommunitiesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<BgpServiceCommunity> listAsync() {
        BgpServiceCommunitiesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<BgpServiceCommunityInner>, Iterable<BgpServiceCommunityInner>>() {
            @Override
            public Iterable<BgpServiceCommunityInner> call(Page<BgpServiceCommunityInner> page) {
                return page.items();
            }
        })
        .map(new Func1<BgpServiceCommunityInner, BgpServiceCommunity>() {
            @Override
            public BgpServiceCommunity call(BgpServiceCommunityInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    protected BgpServiceCommunityImpl wrapModel(BgpServiceCommunityInner inner) {
        return  new BgpServiceCommunityImpl(inner.name(), inner, manager());
    }

    @Override
    protected BgpServiceCommunityImpl wrapModel(String name) {
        return null; // Model is not creatable
    }

}
