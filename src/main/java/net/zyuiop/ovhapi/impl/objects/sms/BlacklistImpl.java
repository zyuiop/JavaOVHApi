package net.zyuiop.ovhapi.impl.objects.sms;

import net.zyuiop.ovhapi.api.objects.sms.Blacklist;
/**
 * SMS blacklist
 */

public class BlacklistImpl implements Blacklist { 

	private java.util.Date dateCreation;
	private java.lang.String number;

	public BlacklistImpl() {
	}

	public java.util.Date getDateCreation() { 
		return this.dateCreation;
	} 

	public void setDateCreation(java.util.Date dateCreation) { 
		this.dateCreation = dateCreation;
	} 

	public BlacklistImpl dateCreation(java.util.Date dateCreation) { 
		this.dateCreation = dateCreation;
		return this;
	} 

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public BlacklistImpl number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

}
