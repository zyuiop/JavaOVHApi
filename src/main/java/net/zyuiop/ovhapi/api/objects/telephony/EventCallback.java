package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Callback url for each event
 */

public class EventCallback { 

	private java.lang.String url;
	private java.lang.String emailError;

	public EventCallback() {
	}

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public EventCallback url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getEmailError() { 
		return this.emailError;
	} 

	public void setEmailError(java.lang.String emailError) { 
		this.emailError = emailError;
	} 

	public EventCallback emailError(java.lang.String emailError) { 
		this.emailError = emailError;
		return this;
	} 

}
