
package org.mule.modules.travelthingamadeuswebservices.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.travelthingamadeuswebservices.TravelThingAmadeusWebServicesConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>TravelThingAmadeusWebServicesConnectorProcessAdapter</code> is a wrapper around {@link TravelThingAmadeusWebServicesConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.6.1", date = "2015-06-11T11:55:03+01:00", comments = "Build UNNAMED.2405.44720b7")
public class TravelThingAmadeusWebServicesConnectorProcessAdapter
    extends TravelThingAmadeusWebServicesConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<TravelThingAmadeusWebServicesConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, TravelThingAmadeusWebServicesConnectorCapabilitiesAdapter> getProcessTemplate() {
        final TravelThingAmadeusWebServicesConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,TravelThingAmadeusWebServicesConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, TravelThingAmadeusWebServicesConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, TravelThingAmadeusWebServicesConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
