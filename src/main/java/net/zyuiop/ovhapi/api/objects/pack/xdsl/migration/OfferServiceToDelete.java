package net.zyuiop.ovhapi.api.objects.pack.xdsl.migration;

/**
 * Option of Offer
 */

public class OfferServiceToDelete { 

	private java.lang.String type;
	private java.lang.String service;

	public OfferServiceToDelete() {
	}

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public OfferServiceToDelete type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getService() { 
		return this.service;
	} 

	public void setService(java.lang.String service) { 
		this.service = service;
	} 

	public OfferServiceToDelete service(java.lang.String service) { 
		this.service = service;
		return this;
	} 

}
