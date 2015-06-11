package org.mule.modules.travelthingamadeuswebservices;

import javax.xml.ws.Holder;

import org.mule.modules.travelthingamadeuswebservices.api.Session;

public class SessionHandler {

	private Holder<Session> mSession;
	
	public SessionHandler() {
		mSession = new Holder<Session>();
		resetSession();
	}
	
	public Holder<Session> getSession() {
		return mSession;
	}
	
	// create an empty header where all elements are set to empty one by
	// one. necessary to make JaxWS send a valid empty header.
	public void resetSession() {
		mSession.value = new Session();
		mSession.value.setSecurityToken("");
		mSession.value.setSequenceNumber("");
		mSession.value.setSessionId("");
	}
	
	protected void incrementSequenceNumber() {
		Integer sequenceNumber = Integer.parseInt(mSession.value.getSequenceNumber());
		sequenceNumber++;
		mSession.value.setSequenceNumber(sequenceNumber.toString());
	}
	
}
