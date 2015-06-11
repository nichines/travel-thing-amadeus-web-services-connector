
package org.mule.modules.travelthingamadeuswebservices.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.travelthingamadeuswebservices.adapters.TravelThingAmadeusWebServicesConnectorTravelThingAmadeusWebServicesConnectorConnectionStrategyBasicAdapter;
import org.mule.modules.travelthingamadeuswebservices.strategy.TravelThingAmadeusWebServicesConnectorConnectionStrategy;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.6.1", date = "2015-06-11T11:55:03+01:00", comments = "Build UNNAMED.2405.44720b7")
public class TravelThingAmadeusWebServicesConnectorTravelThingAmadeusWebServicesConnectorConnectionStrategyConfigDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(TravelThingAmadeusWebServicesConnectorTravelThingAmadeusWebServicesConnectorConnectionStrategyConfigDefinitionParser.class);

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, TravelThingAmadeusWebServicesConnectorTravelThingAmadeusWebServicesConnectorConnectionStrategyBasicAdapter.class);
        setDestroyMethodIfNeeded(builder, TravelThingAmadeusWebServicesConnectorTravelThingAmadeusWebServicesConnectorConnectionStrategyBasicAdapter.class);
        BeanDefinitionBuilder basicStrategyBuilder = BeanDefinitionBuilder.rootBeanDefinition(TravelThingAmadeusWebServicesConnectorConnectionStrategy.class.getName());
        parseProperty(basicStrategyBuilder, element, "reply", "reply");
        builder.addPropertyValue("connection", basicStrategyBuilder.getBeanDefinition());
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(TravelThingAmadeusWebServicesConnectorTravelThingAmadeusWebServicesConnectorConnectionStrategyBasicAdapter.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the configuration [config-type] within the connector [travel-thing-amadeus-web-services] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the configuration [config-type] within the connector [travel-thing-amadeus-web-services] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

}
