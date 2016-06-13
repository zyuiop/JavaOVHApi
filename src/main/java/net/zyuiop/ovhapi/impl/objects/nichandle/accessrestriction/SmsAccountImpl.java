package net.zyuiop.ovhapi.impl.objects.nichandle.accessrestriction;

import net.zyuiop.ovhapi.api.objects.nichandle.accessrestriction.SmsAccount;
/**
 * Sms Two-Factor Authentication
 */

public class SmsAccountImpl implements SmsAccount { 

	private java.lang.String status;
	private long id;
	private java.lang.String phoneNumber;

	public SmsAccountImpl() {
	}

	public java.lang.String getStatus() { 
		return this.status;
	} 

	public void setStatus(java.lang.String status) { 
		this.status = status;
	} 

	public SmsAccountImpl status(java.lang.String status) { 
		this.status = status;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public SmsAccountImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getPhoneNumber() { 
		return this.phoneNumber;
	} 

	public void setPhoneNumber(java.lang.String phoneNumber) { 
		this.phoneNumber = phoneNumber;
	} 

	public SmsAccountImpl phoneNumber(java.lang.String phoneNumber) { 
		this.phoneNumber = phoneNumber;
		return this;
	} 

}
