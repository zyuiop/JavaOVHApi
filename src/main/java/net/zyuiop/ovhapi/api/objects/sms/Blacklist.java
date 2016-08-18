package net.zyuiop.ovhapi.api.objects.sms;

/**
 * SMS blacklist
 */

public class Blacklist { 

	private java.util.Date dateCreation;
	private java.lang.String number;

	public Blacklist() {
	}

	public java.util.Date getDateCreation() { 
		return this.dateCreation;
	} 

	public void setDateCreation(java.util.Date dateCreation) { 
		this.dateCreation = dateCreation;
	} 

	public Blacklist dateCreation(java.util.Date dateCreation) { 
		this.dateCreation = dateCreation;
		return this;
	} 

	public java.lang.String getNumber() { 
		return this.number;
	} 

	public void setNumber(java.lang.String number) { 
		this.number = number;
	} 

	public Blacklist number(java.lang.String number) { 
		this.number = number;
		return this;
	} 

}
