package net.zyuiop.ovhapi.impl.objects.dedicated.server;

import net.zyuiop.ovhapi.api.objects.dedicated.server.EmailAlert;
/**
 * Service monitoring Email alert
 */

public class EmailAlertImpl implements EmailAlert { 

	private java.lang.String email;
	private java.lang.String language;
	private long alertId;
	private boolean enabled;

	public EmailAlertImpl() {
	}

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public EmailAlertImpl email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public EmailAlertImpl language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public long getAlertId() { 
		return this.alertId;
	} 

	public void setAlertId(long alertId) { 
		this.alertId = alertId;
	} 

	public EmailAlertImpl alertId(long alertId) { 
		this.alertId = alertId;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public EmailAlertImpl enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

}
