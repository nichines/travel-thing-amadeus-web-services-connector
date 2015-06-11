
package org.mule.modules.travelthingamadeuswebservices.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/travel-thing-amadeus-web-services</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.6.1", date = "2015-06-11T11:55:03+01:00", comments = "Build UNNAMED.2405.44720b7")
public class TravelThingAmadeusWebServicesNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(TravelThingAmadeusWebServicesNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [travel-thing-amadeus-web-services] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [travel-thing-amadeus-web-services] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config-type", new TravelThingAmadeusWebServicesConnectorTravelThingAmadeusWebServicesConnectorConnectionStrategyConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config-type", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("air-multi-availability", new AirMultiAvailabilityDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("air-multi-availability", "@Processor", ex);
        }
    }

}
