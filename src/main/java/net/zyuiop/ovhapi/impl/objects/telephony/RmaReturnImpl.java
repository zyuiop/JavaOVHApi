package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.RmaReturn;
/**
 * Post-creation return information structure
 */

public class RmaReturnImpl implements RmaReturn { 

	private java.lang.String id;

	public RmaReturnImpl() {
	}

	public java.lang.String getId() { 
		return this.id;
	} 

	public void setId(java.lang.String id) { 
		this.id = id;
	} 

	public RmaReturnImpl id(java.lang.String id) { 
		this.id = id;
		return this;
	} 

}
