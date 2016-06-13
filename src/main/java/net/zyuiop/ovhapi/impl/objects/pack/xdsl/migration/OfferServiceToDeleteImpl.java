package net.zyuiop.ovhapi.impl.objects.pack.xdsl.migration;

import net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferServiceToDelete;
/**
 * Option of Offer
 */

public class OfferServiceToDeleteImpl implements OfferServiceToDelete { 

	private java.lang.String type;
	private java.lang.String service;

	public OfferServiceToDeleteImpl() {
	}

	public java.lang.String getType() { 
		return this.type;
	} 

	public void setType(java.lang.String type) { 
		this.type = type;
	} 

	public OfferServiceToDeleteImpl type(java.lang.String type) { 
		this.type = type;
		return this;
	} 

	public java.lang.String getService() { 
		return this.service;
	} 

	public void setService(java.lang.String service) { 
		this.service = service;
	} 

	public OfferServiceToDeleteImpl service(java.lang.String service) { 
		this.service = service;
		return this;
	} 

}
