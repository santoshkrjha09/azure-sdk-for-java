/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.management.network.v2020_03_01.OutboundRule;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.LoadBalancerOutboundRuleProtocol;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;

class OutboundRuleImpl extends IndexableRefreshableWrapperImpl<OutboundRule, OutboundRuleInner> implements OutboundRule {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String loadBalancerName;
    private String outboundRuleName;

    OutboundRuleImpl(OutboundRuleInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.loadBalancerName = IdParsingUtils.getValueFromIdByName(inner.id(), "loadBalancers");
        this.outboundRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "outboundRules");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<OutboundRuleInner> getInnerAsync() {
        LoadBalancerOutboundRulesInner client = this.manager().inner().loadBalancerOutboundRules();
        return client.getAsync(this.resourceGroupName, this.loadBalancerName, this.outboundRuleName);
    }



    @Override
    public Integer allocatedOutboundPorts() {
        return this.inner().allocatedOutboundPorts();
    }

    @Override
    public SubResource backendAddressPool() {
        return this.inner().backendAddressPool();
    }

    @Override
    public Boolean enableTcpReset() {
        return this.inner().enableTcpReset();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<SubResource> frontendIPConfigurations() {
        return this.inner().frontendIPConfigurations();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer idleTimeoutInMinutes() {
        return this.inner().idleTimeoutInMinutes();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public LoadBalancerOutboundRuleProtocol protocol() {
        return this.inner().protocol();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
