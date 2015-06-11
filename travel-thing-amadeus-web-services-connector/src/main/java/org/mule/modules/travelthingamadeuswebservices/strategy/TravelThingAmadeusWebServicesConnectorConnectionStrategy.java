/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.travelthingamadeuswebservices.strategy;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

/**
 * Configuration type Strategy
 *
 * @author MuleSoft, Inc.
 */
@Configuration(configElementName = "config-type", friendlyName = "Configuration type strategy")
public class TravelThingAmadeusWebServicesConnectorConnectionStrategy {

    /**
     * Configurable
     */
    @Configurable
    @Default("How are you?")
    private String reply;

    /**
     * Set strategy property
     *
     * @param reply my strategy property
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * Get property
     */
    public String getReply() {
        return this.reply;
    }

}