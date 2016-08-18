package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Voicemail configuration
 */

public class ServiceVoicemailNotifications { 

	private java.lang.String email;
	private java.lang.String type;

	public ServiceVoicemailNotifications() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public ServiceVoicemailNotifications email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ServiceVoicemailNotifications type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
