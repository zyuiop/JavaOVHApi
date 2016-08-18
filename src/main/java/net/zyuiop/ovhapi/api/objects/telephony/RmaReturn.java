package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Post-creation return information structure
 */

public class RmaReturn { 

	private java.lang.String id;

	public RmaReturn() {
	}

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public RmaReturn id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
