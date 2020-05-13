/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ConnectionMonitorTestConfigurationProtocol.
 */
public final class ConnectionMonitorTestConfigurationProtocol extends ExpandableStringEnum<ConnectionMonitorTestConfigurationProtocol> {
    /** Static value Tcp for ConnectionMonitorTestConfigurationProtocol. */
    public static final ConnectionMonitorTestConfigurationProtocol TCP = fromString("Tcp");

    /** Static value Http for ConnectionMonitorTestConfigurationProtocol. */
    public static final ConnectionMonitorTestConfigurationProtocol HTTP = fromString("Http");

    /** Static value Icmp for ConnectionMonitorTestConfigurationProtocol. */
    public static final ConnectionMonitorTestConfigurationProtocol ICMP = fromString("Icmp");

    /**
     * Creates or finds a ConnectionMonitorTestConfigurationProtocol from its string representation.
     * @param name a name to look for
     * @return the corresponding ConnectionMonitorTestConfigurationProtocol
     */
    @JsonCreator
    public static ConnectionMonitorTestConfigurationProtocol fromString(String name) {
        return fromString(name, ConnectionMonitorTestConfigurationProtocol.class);
    }

    /**
     * @return known ConnectionMonitorTestConfigurationProtocol values
     */
    public static Collection<ConnectionMonitorTestConfigurationProtocol> values() {
        return values(ConnectionMonitorTestConfigurationProtocol.class);
    }
}
