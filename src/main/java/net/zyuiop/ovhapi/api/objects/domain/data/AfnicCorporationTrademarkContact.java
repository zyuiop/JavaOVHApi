package net.zyuiop.ovhapi.api.objects.domain.data;

/**
 * Representation of an Inpi additional information for a corporation
 */

public class AfnicCorporationTrademarkContact { 

	private long contactId;
	private java.lang.String inpiTrademarkOwner;
	private long id;
	private java.lang.String inpiNumber;

	public AfnicCorporationTrademarkContact() {
	}

	public long getContactId() { 
		return this.contactId;
	} 

	public void setContactId(long contactId) { 
		this.contactId = contactId;
	} 

	public AfnicCorporationTrademarkContact contactId(long contactId) { 
		this.contactId = contactId;
		return this;
	} 

	public java.lang.String getInpiTrademarkOwner() { 
		return this.inpiTrademarkOwner;
	} 

	public void setInpiTrademarkOwner(java.lang.String inpiTrademarkOwner) { 
		this.inpiTrademarkOwner = inpiTrademarkOwner;
	} 

	public AfnicCorporationTrademarkContact inpiTrademarkOwner(java.lang.String inpiTrademarkOwner) { 
		this.inpiTrademarkOwner = inpiTrademarkOwner;
		return this;
	} 

	public long getId() { 
		return this.id;
	} 

	public void setId(long id) { 
		this.id = id;
	} 

	public AfnicCorporationTrademarkContact id(long id) { 
		this.id = id;
		return this;
	} 

	public java.lang.String getInpiNumber() { 
		return this.inpiNumber;
	} 

	public void setInpiNumber(java.lang.String inpiNumber) { 
		this.inpiNumber = inpiNumber;
	} 

	public AfnicCorporationTrademarkContact inpiNumber(java.lang.String inpiNumber) { 
		this.inpiNumber = inpiNumber;
		return this;
	} 

}
