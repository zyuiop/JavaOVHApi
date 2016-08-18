package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Backup configured on a given Datacenter
 */

public class Backup { 

	private java.lang.String mailOnLevel;
	private java.lang.String mailAddress;
	private java.lang.String state;

	public Backup() {
	}

	public java.lang.String getMailOnLevel() { 
		return this.mailOnLevel;
	} 

	public void setMailOnLevel(java.lang.String mailOnLevel) { 
		this.mailOnLevel = mailOnLevel;
	} 

	public Backup mailOnLevel(java.lang.String mailOnLevel) { 
		this.mailOnLevel = mailOnLevel;
		return this;
	} 

	public java.lang.String getMailAddress() { 
		return this.mailAddress;
	} 

	public void setMailAddress(java.lang.String mailAddress) { 
		this.mailAddress = mailAddress;
	} 

	public Backup mailAddress(java.lang.String mailAddress) { 
		this.mailAddress = mailAddress;
		return this;
	} 

	public java.lang.String getState() { 
		return this.state;
	} 

	public void setState(java.lang.String state) { 
		this.state = state;
	} 

	public Backup state(java.lang.String state) { 
		this.state = state;
		return this;
	} 

}
