package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Token associated to the service for live event
 */

public class EventToken { 

	private java.lang.String token;

	public EventToken() {
	}

	public java.lang.String getToken() { 
		return this.token;
	} 

	public void setToken(java.lang.String token) { 
		this.token = token;
	} 

	public EventToken token(java.lang.String token) { 
		this.token = token;
		return this;
	} 

}
