package org.mule.modules.travelthingamadeuswebservices;

import java.math.BigDecimal;

import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticate;
import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticate.DutyCode;
import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticate.DutyCode.DutyCodeDetails;
import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticate.PasswordInfo;
import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticate.SystemDetails;
import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticate.SystemDetails.OrganizationDetails;
import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticate.UserIdentifier;
import org.mule.modules.travelthingamadeuswebservices.api.SecurityAuthenticate.UserIdentifier.OriginIdentification;

public class MessageFactory {

	public static SecurityAuthenticate buildAuthenticationRequest() {
		
		UserIdentifier ui = new UserIdentifier();
		ui.setOriginator("WSTRMOSI");
		ui.setOriginatorTypeCode("U");
		OriginIdentification originident = new OriginIdentification();
		originident.setSourceOffice("LON1A0983");
		ui.setOriginIdentification(originident);
		
		DutyCode dutyCode = new DutyCode();
		DutyCodeDetails dutyCodeDetails = new DutyCodeDetails();
		dutyCodeDetails.setReferenceIdentifier("SU");
		dutyCodeDetails.setReferenceQualifier("DUT");
		dutyCode.setDutyCodeDetails(dutyCodeDetails);
		
		SystemDetails systemDetails = new SystemDetails();
		systemDetails.setOrganizationDetails(new OrganizationDetails());
		systemDetails.getOrganizationDetails().setOrganizationId("NMC-UK");
		
		PasswordInfo pi = new PasswordInfo();
		pi.setBinaryData("QU1BREVVUw==");
		pi.setDataLength(new BigDecimal(7));
		pi.setDataType("E");		
		
		SecurityAuthenticate authenticate_request = new SecurityAuthenticate();
		authenticate_request.setDutyCode(dutyCode);
		authenticate_request.setSystemDetails(systemDetails);
		authenticate_request.getPasswordInfo().add(pi);
		authenticate_request.getUserIdentifier().add(ui);
		
		return authenticate_request;
	}
	
}