/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */


package org.mule.modules.travelthingamadeuswebservices;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import org.mule.api.annotations.ConnectionStrategy;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;
import org.mule.api.annotations.param.Default;
import org.mule.modules.travelthingamadeuswebservices.api.AirMultiAvailability;
import org.mule.modules.travelthingamadeuswebservices.api.AirMultiAvailability.RequestSection;
import org.mule.modules.travelthingamadeuswebservices.api.AirMultiAvailabilityReply;
import org.mule.modules.travelthingamadeuswebservices.api.AvailabilityOptionsType;
import org.mule.modules.travelthingamadeuswebservices.api.AvailabilityProductionInfoType;
import org.mule.modules.travelthingamadeuswebservices.api.LocationDetailsType;
import org.mule.modules.travelthingamadeuswebservices.api.MessageActionDetailsType;
import org.mule.modules.travelthingamadeuswebservices.api.MessageFunctionBusinessDetailsType;
import org.mule.modules.travelthingamadeuswebservices.api.ProductDateTimeType;
import org.mule.modules.travelthingamadeuswebservices.api.ProductTypeDetailsType;
import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticateReply;
import org.mule.modules.travelthingamadeuswebservices.strategy.TravelThingAmadeusWebServicesConnectorConnectionStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Anypoint Connector.
 * 
 * No description available
 * 
 * @author MuleSoft, Inc.
 * 
 */
@Connector(name = "travel-thing-amadeus-web-services", friendlyName = "TravelThingAmadeusWebServices", schemaVersion = "1.0")
public class TravelThingAmadeusWebServicesConnector {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@ConnectionStrategy
    private TravelThingAmadeusWebServicesConnectorConnectionStrategy connection;

	/**
	 * @return the connection
	 */
	public TravelThingAmadeusWebServicesConnectorConnectionStrategy getConnection() {
		return connection;
	}

	/**
	 * @param connection a connection
	 */
	public void setConnection(TravelThingAmadeusWebServicesConnectorConnectionStrategy connection) {
		this.connection = connection;
	}

	/**
     * No summary available
     * 
     * {@sample.xml ../../../doc/travel-thing-amadeus-web-services-connector.xml.sample travel-thing-amadeus-web-services:air-multi-availability}
     * 
     * @param airMultiAvailability - No description available
     * @return Return value
     */
    @Processor
    public AirMultiAvailabilityReply airMultiAvailability(
        @Default("#[payload]") org.mule.module.json.JsonData payload
        /*AirMultiAvailability airMultiAvailability*/) {

    	try {
    		
			ServiceHandler serviceHandler = new ServiceHandler();
	
			try {
				SecurityAuthenticateReply securityAuthenticateReply = serviceHandler.logIn();
				
				if (securityAuthenticateReply.getErrorSection() != null) {
					logger.warn("SecurityAuthenticate Error : " + securityAuthenticateReply.getErrorSection().getInteractiveFreeText().getFreeText().get(0));
					return null;
				}
			} catch (Exception e) {
				logger.error("SecurityAuthenticate Exception : ",e);
				return null;
			}			
	
	    	AirMultiAvailability airMultiAvailability = new AirMultiAvailability();
	
	    	airMultiAvailability.setMessageActionDetails(new MessageActionDetailsType());
	    	airMultiAvailability.getMessageActionDetails().setFunctionDetails(new MessageFunctionBusinessDetailsType());
	    	airMultiAvailability.getMessageActionDetails().getFunctionDetails().setActionCode("44");
	    	
			List<String> departureDates = Arrays.asList(payload.get("Transport/date").getTextValue());
			List<String> boardPoints = Arrays.asList(payload.get("Transport/from").getTextValue());
			List<String> offPoints = Arrays.asList(payload.get("Transport/to").getTextValue());
			
			for (int i = 0; i < departureDates.size(); i++) {
				
				RequestSection requestSection = new RequestSection();
				AvailabilityProductionInfoType availabilityProductionInfoType = new AvailabilityProductionInfoType();
				ProductDateTimeType productDateTimeType = new ProductDateTimeType();
				LocationDetailsType boardPoint = new LocationDetailsType();
				LocationDetailsType offPoint = new LocationDetailsType();
	
	//			productDateTimeType.setDepartureDate(new FastDateFormat().format(departureDates.get(i)));
				productDateTimeType.setDepartureDate(departureDates.get(i));
				
				boardPoint.setCityAirport(boardPoints.get(i));
				offPoint.setCityAirport(offPoints.get(i));
				
				availabilityProductionInfoType.getAvailabilityDetails().add(productDateTimeType);
				availabilityProductionInfoType.setDepartureLocationInfo(boardPoint);
				availabilityProductionInfoType.setArrivalLocationInfo(offPoint);
	
				requestSection.setAvailabilityProductInfo(availabilityProductionInfoType);
				
				requestSection.setAvailabilityOptions(new AvailabilityOptionsType());
				requestSection.getAvailabilityOptions().setProductTypeDetails(new ProductTypeDetailsType());
				requestSection.getAvailabilityOptions().getProductTypeDetails().setTypeOfRequest("TN");
				
				airMultiAvailability.getRequestSection().add(requestSection);	
			}
	
			AirMultiAvailabilityReply airMultiAvailabilityReply = serviceHandler.air_MultiAvailabilityInfo(airMultiAvailability);
			
			try {
				serviceHandler.logOut();
			}
			catch (Exception e) {
				logger.error("SecuritySignOut Exception : ",e);
			}

	    	return airMultiAvailabilityReply;
    	}
    	catch (RemoteException e) {
			logger.error("AirMultiAvailability Exception : ",e);
    	}

    	return null;
    }

//    /**
//     * Connect
//     * 
//     * @param username A username
//     * @param password A password
//     * @throws ConnectionException 
//     * @throws Exception 
//     */
//    @Connect
//    @TestConnectivity
//    public void connect(
//        @ConnectionKey
//        java.lang.String username,
//        @Password
//        java.lang.String password) throws ConnectionException
//    {
//    	try {
//        	ServiceHandler serviceHandler = new ServiceHandler();
//        	serviceHandler.logIn();
//        	serviceHandler.logOut();
//    	}
//    	catch (Exception e) {
//    		throw new ConnectionException(ConnectionExceptionCode.UNKNOWN, "", "Connect failed: " + e.getMessage(), e);
//    	}
//    }
//
//    /**
//     * Disconnect
//     * 
//     */
//    @Disconnect
//    public void disconnect() {
//        //TODO: Add disconnection logic
//    }
//
//    /**
//     * Are we connected
//     * 
//     */
//    @ValidateConnection
//    public boolean isConnected() {
//        //TODO: Add some logic
//    	return true;
//    }
//
//    /**
//     * Connection Id
//     * 
//     */
//    @ConnectionIdentifier
//    public String connectionId() {
//        //TODO: put real code to generate it.
//		return "001";
//    }
}