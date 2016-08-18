package net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction;

/**
 * Sms Two-Factor Authentication
 */

public class SmsAccount { 

	private java.lang.String status;
	private long id;
	private java.lang.String phoneNumber;

	public SmsAccount() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public SmsAccount status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SmsAccount id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getPhoneNumber() { 
		return this.phoneNumber;
	} 

	public void setPhoneNumber(java.lang.String phoneNumber) { 
		this.phoneNumber = phoneNumber;
	} 

	public SmsAccount phoneNumber(java.lang.String phoneNumber) { 
		this.phoneNumber = phoneNumber;
		return this;
	} 

}
