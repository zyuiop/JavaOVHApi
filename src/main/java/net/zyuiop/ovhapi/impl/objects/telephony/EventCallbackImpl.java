package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.EventCallback;
/**
 * Callback url for each event
 */

public class EventCallbackImpl implements EventCallback { 

	private java.lang.String url;
	private java.lang.String emailError;

	public EventCallbackImpl() {
	}

	public java.lang.String getUrl() { 
		return this.url;
	} 

	public void setUrl(java.lang.String url) { 
		this.url = url;
	} 

	public EventCallbackImpl url(java.lang.String url) { 
		this.url = url;
		return this;
	} 

	public java.lang.String getEmailError() { 
		return this.emailError;
	} 

	public void setEmailError(java.lang.String emailError) { 
		this.emailError = emailError;
	} 

	public EventCallbackImpl emailError(java.lang.String emailError) { 
		this.emailError = emailError;
		return this;
	} 

}
