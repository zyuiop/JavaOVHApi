package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.EventToken;
/**
 * Token associated to the service for live event
 */

public class EventTokenImpl implements EventToken { 

	private java.lang.String token;

	public EventTokenImpl() {
	}

	public java.lang.String getToken() { 
		return this.token;
	} 

	public void setToken(java.lang.String token) { 
		this.token = token;
	} 

	public EventTokenImpl token(java.lang.String token) { 
		this.token = token;
		return this;
	} 

}
