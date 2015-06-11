package org.mule.modules.travelthingamadeuswebservices;

import java.rmi.RemoteException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.mule.modules.travelthingamadeuswebservices.api.AirMultiAvailability;
import org.mule.modules.travelthingamadeuswebservices.api.AirMultiAvailabilityReply;
import org.mule.modules.travelthingamadeuswebservices.api.AmadeusWebServices;
import org.mule.modules.travelthingamadeuswebservices.api.AmadeusWebServicesPT;
import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticateReply;
import org.mule.modules.travelthingamadeuswebservices.api.SecuritySignOut;
import org.mule.modules.travelthingamadeuswebservices.api.SecuritySignOutReply;

public class ServiceHandler {
	
	AmadeusWebServicesPT mProxy;
	SessionHandler mSession;

	public ServiceHandler() throws RemoteException
	{
		AmadeusWebServices aws = new AmadeusWebServices();

		mProxy = aws.getAmadeusWebServicesPort();			

		Client client = ClientProxy.getClient(aws.getPort(AmadeusWebServicesPT.class));
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor()); 
        
		mSession = new SessionHandler();
	}
	
	public SecurityAuthenticateReply logIn() throws Exception 
	{
		SecurityAuthenticateReply reply;
		reply = mProxy.securityAuthenticate(MessageFactory.buildAuthenticationRequest(), mSession.getSession());				
		return reply;		
	}
	
	public SecuritySignOutReply logOut() throws RemoteException
	{
		SecuritySignOutReply signOutReply = null;
		mSession.incrementSequenceNumber();
		signOutReply = mProxy.securitySignOut(new SecuritySignOut(), mSession.getSession());
		mSession.resetSession();		
		return signOutReply;
	}
	
	public AirMultiAvailabilityReply air_MultiAvailabilityInfo(AirMultiAvailability airMultiAvailability) throws RemoteException
	{
		mSession.incrementSequenceNumber();		
		return mProxy.airMultiAvailability(airMultiAvailability, mSession.getSession());		
	}
}
