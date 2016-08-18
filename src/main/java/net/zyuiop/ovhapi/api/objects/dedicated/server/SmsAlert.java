package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Monitoring SMS alert details, This service is currently not supported for servers at BHS 
 */

public class SmsAlert { 

	private java.lang.String phoneNumberTo;
	private java.lang.String smsAccount;
	private java.lang.String language;
	private long toHour;
	private long alertId;
	private long fromHour;
	private boolean enabled;

	public SmsAlert() {
	}

	public java.lang.String getPhoneNumberTo() { 
		return this.phoneNumberTo;
	} 

	public void setPhoneNumberTo(java.lang.String phoneNumberTo) { 
		this.phoneNumberTo = phoneNumberTo;
	} 

	public SmsAlert phoneNumberTo(java.lang.String phoneNumberTo) { 
		this.phoneNumberTo = phoneNumberTo;
		return this;
	} 

	public java.lang.String getSmsAccount() { 
		return this.smsAccount;
	} 

	public void setSmsAccount(java.lang.String smsAccount) { 
		this.smsAccount = smsAccount;
	} 

	public SmsAlert smsAccount(java.lang.String smsAccount) { 
		this.smsAccount = smsAccount;
		return this;
	} 

	public java.lang.String getLanguage() { 
		return this.language;
	} 

	public void setLanguage(java.lang.String language) { 
		this.language = language;
	} 

	public SmsAlert language(java.lang.String language) { 
		this.language = language;
		return this;
	} 

	public long getToHour() { 
		return this.toHour;
	} 

	public void setToHour(long toHour) { 
		this.toHour = toHour;
	} 

	public SmsAlert toHour(long toHour) { 
		this.toHour = toHour;
		return this;
	} 

	public long getAlertId() { 
		return this.alertId;
	} 

	public void setAlertId(long alertId) { 
		this.alertId = alertId;
	} 

	public SmsAlert alertId(long alertId) { 
		this.alertId = alertId;
		return this;
	} 

	public long getFromHour() { 
		return this.fromHour;
	} 

	public void setFromHour(long fromHour) { 
		this.fromHour = fromHour;
	} 

	public SmsAlert fromHour(long fromHour) { 
		this.fromHour = fromHour;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public SmsAlert enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

}
