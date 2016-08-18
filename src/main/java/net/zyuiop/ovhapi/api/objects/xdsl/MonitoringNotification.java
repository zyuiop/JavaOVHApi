package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Defines where and how the notifications will be sent
 */

public class MonitoringNotification { 

	private java.lang.String phone;
	private java.lang.String frequency;
	private java.lang.String email;
	private java.lang.String smsAccount;
	private long downThreshold;
	private boolean allowIncident;
	private long id;
	private java.lang.String type;
	private boolean enabled;

	public MonitoringNotification() {
	}

	public java.lang.String getPhone() { 
		return this.phone;
	} 

	public void setPhone(java.lang.String phone) { 
		this.phone = phone;
	} 

	public MonitoringNotification phone(java.lang.String phone) { 
		this.phone = phone;
		return this;
	} 

	public java.lang.String getFrequency() { 
		return this.frequency;
	} 

	public void setFrequency(java.lang.String frequency) { 
		this.frequency = frequency;
	} 

	public MonitoringNotification frequency(java.lang.String frequency) { 
		this.frequency = frequency;
		return this;
	} 

	public java.lang.String getEmail() { 
		return this.email;
	} 

	public void setEmail(java.lang.String email) { 
		this.email = email;
	} 

	public MonitoringNotification email(java.lang.String email) { 
		this.email = email;
		return this;
	} 

	public java.lang.String getSmsAccount() { 
		return this.smsAccount;
	} 

	public void setSmsAccount(java.lang.String smsAccount) { 
		this.smsAccount = smsAccount;
	} 

	public MonitoringNotification smsAccount(java.lang.String smsAccount) { 
		this.smsAccount = smsAccount;
		return this;
	} 

	public long getDownThreshold() { 
		return this.downThreshold;
	} 

	public void setDownThreshold(long downThreshold) { 
		this.downThreshold = downThreshold;
	} 

	public MonitoringNotification downThreshold(long downThreshold) { 
		this.downThreshold = downThreshold;
		return this;
	} 

	public boolean getAllowIncident() { 
		return this.allowIncident;
	} 

	public void setAllowIncident(boolean allowIncident) { 
		this.allowIncident = allowIncident;
	} 

	public MonitoringNotification allowIncident(boolean allowIncident) { 
		this.allowIncident = allowIncident;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public MonitoringNotification id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public MonitoringNotification type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public boolean getEnabled() { 
		return this.enabled;
	} 

	public void setEnabled(boolean enabled) { 
		this.enabled = enabled;
	} 

	public MonitoringNotification enabled(boolean enabled) { 
		this.enabled = enabled;
		return this;
	} 

}
