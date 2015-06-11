
package org.mule.modules.travelthingamadeuswebservices.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.travelthingamadeuswebservices.TravelThingAmadeusWebServicesConnector;


/**
 * A <code>TravelThingAmadeusWebServicesConnectorCapabilitiesAdapter</code> is a wrapper around {@link TravelThingAmadeusWebServicesConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.6.1", date = "2015-06-11T11:20:03+01:00", comments = "Build UNNAMED.2405.44720b7")
public class TravelThingAmadeusWebServicesConnectorCapabilitiesAdapter
    extends TravelThingAmadeusWebServicesConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
