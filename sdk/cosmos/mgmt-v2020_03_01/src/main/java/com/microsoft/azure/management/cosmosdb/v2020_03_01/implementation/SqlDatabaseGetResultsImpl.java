/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlDatabaseGetResults;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlDatabaseCreateUpdateParameters;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlDatabaseGetPropertiesOptions;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlDatabaseGetPropertiesResource;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.CreateUpdateOptions;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlDatabaseResource;
import rx.functions.Func1;

class SqlDatabaseGetResultsImpl extends CreatableUpdatableImpl<SqlDatabaseGetResults, SqlDatabaseGetResultsInner, SqlDatabaseGetResultsImpl> implements SqlDatabaseGetResults, SqlDatabaseGetResults.Definition, SqlDatabaseGetResults.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseName;
    private SqlDatabaseCreateUpdateParameters createOrUpdateParameter;

    SqlDatabaseGetResultsImpl(String name, CosmosDBManager manager) {
        super(name, new SqlDatabaseGetResultsInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
        this.createOrUpdateParameter = new SqlDatabaseCreateUpdateParameters();
    }

    SqlDatabaseGetResultsImpl(SqlDatabaseGetResultsInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "sqlDatabases");
        //
        this.createOrUpdateParameter = new SqlDatabaseCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SqlDatabaseGetResults> createResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlDatabaseAsync(this.resourceGroupName, this.accountName, this.databaseName, this.createOrUpdateParameter)
            .map(new Func1<SqlDatabaseGetResultsInner, SqlDatabaseGetResultsInner>() {
               @Override
               public SqlDatabaseGetResultsInner call(SqlDatabaseGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlDatabaseGetResults> updateResourceAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.createUpdateSqlDatabaseAsync(this.resourceGroupName, this.accountName, this.databaseName, this.createOrUpdateParameter)
            .map(new Func1<SqlDatabaseGetResultsInner, SqlDatabaseGetResultsInner>() {
               @Override
               public SqlDatabaseGetResultsInner call(SqlDatabaseGetResultsInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlDatabaseGetResultsInner> getInnerAsync() {
        SqlResourcesInner client = this.manager().inner().sqlResources();
        return client.getSqlDatabaseAsync(this.resourceGroupName, this.accountName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SqlDatabaseCreateUpdateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public SqlDatabaseGetPropertiesOptions options() {
        return this.inner().options();
    }

    @Override
    public SqlDatabaseGetPropertiesResource resource() {
        return this.inner().resource();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SqlDatabaseGetResultsImpl withExistingDatabaseAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public SqlDatabaseGetResultsImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public SqlDatabaseGetResultsImpl withOptions(CreateUpdateOptions options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public SqlDatabaseGetResultsImpl withResource(SqlDatabaseResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

    @Override
    public SqlDatabaseGetResultsImpl withTags(Map<String, String> tags) {
        this.createOrUpdateParameter.withTags(tags);
        return this;
    }

}
