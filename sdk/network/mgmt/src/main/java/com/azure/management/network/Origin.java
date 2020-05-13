// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Origin. */
public final class Origin extends ExpandableStringEnum<Origin> {
    /** Static value Local for Origin. */
    public static final Origin LOCAL = fromString("Local");

    /** Static value Inbound for Origin. */
    public static final Origin INBOUND = fromString("Inbound");

    /** Static value Outbound for Origin. */
    public static final Origin OUTBOUND = fromString("Outbound");

    /**
     * Creates or finds a Origin from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Origin.
     */
    @JsonCreator
    public static Origin fromString(String name) {
        return fromString(name, Origin.class);
    }

    /** @return known Origin values. */
    public static Collection<Origin> values() {
        return values(Origin.class);
    }
}
