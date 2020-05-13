// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GroupMembershipClaimTypes. */
public final class GroupMembershipClaimTypes extends ExpandableStringEnum<GroupMembershipClaimTypes> {
    /** Static value None for GroupMembershipClaimTypes. */
    public static final GroupMembershipClaimTypes NONE = fromString("None");

    /** Static value SecurityGroup for GroupMembershipClaimTypes. */
    public static final GroupMembershipClaimTypes SECURITY_GROUP = fromString("SecurityGroup");

    /** Static value All for GroupMembershipClaimTypes. */
    public static final GroupMembershipClaimTypes ALL = fromString("All");

    /**
     * Creates or finds a GroupMembershipClaimTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GroupMembershipClaimTypes.
     */
    @JsonCreator
    public static GroupMembershipClaimTypes fromString(String name) {
        return fromString(name, GroupMembershipClaimTypes.class);
    }

    /** @return known GroupMembershipClaimTypes values. */
    public static Collection<GroupMembershipClaimTypes> values() {
        return values(GroupMembershipClaimTypes.class);
    }
}
