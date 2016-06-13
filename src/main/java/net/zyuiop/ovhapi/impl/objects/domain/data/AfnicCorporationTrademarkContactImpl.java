package net.zyuiop.ovhapi.impl.objects.domain.data;

import net.zyuiop.ovhapi.api.objects.domain.data.AfnicCorporationTrademarkContact;
/**
 * Representation of an Inpi additional information for a corporation
 */

public class AfnicCorporationTrademarkContactImpl implements AfnicCorporationTrademarkContact { 

	private long contactId;
	private java.lang.String inpiTrademarkOwner;
	private long id;
	private java.lang.String inpiNumber;

	public AfnicCorporationTrademarkContactImpl() {
	}

	public long getContactId() { 
		return this.contactId;
	} 

	public void setContactId(long contactId) { 
		this.contactId = contactId;
	} 

	public AfnicCorporationTrademarkContactImpl contactId(long contactId) { 
		this.contactId = contactId;
		return this;
	} 

	public java.lang.String getInpiTrademarkOwner() { 
		return this.inpiTrademarkOwner;
	} 

	public void setInpiTrademarkOwner(java.lang.String inpiTrademarkOwner) { 
		this.inpiTrademarkOwner = inpiTrademarkOwner;
	} 

	public AfnicCorporationTrademarkContactImpl inpiTrademarkOwner(java.lang.String inpiTrademarkOwner) { 
		this.inpiTrademarkOwner = inpiTrademarkOwner;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public AfnicCorporationTrademarkContactImpl id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getInpiNumber() { 
		return this.inpiNumber;
	} 

	public void setInpiNumber(java.lang.String inpiNumber) { 
		this.inpiNumber = inpiNumber;
	} 

	public AfnicCorporationTrademarkContactImpl inpiNumber(java.lang.String inpiNumber) { 
		this.inpiNumber = inpiNumber;
		return this;
	} 

}
