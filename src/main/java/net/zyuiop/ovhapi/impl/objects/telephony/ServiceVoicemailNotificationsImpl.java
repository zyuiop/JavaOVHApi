package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.ServiceVoicemailNotifications;
/**
 * Voicemail configuration
 */

public class ServiceVoicemailNotificationsImpl implements ServiceVoicemailNotifications { 

	private java.lang.String email;
	private java.lang.String type;

	public ServiceVoicemailNotificationsImpl() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public ServiceVoicemailNotificationsImpl email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public ServiceVoicemailNotificationsImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

}
