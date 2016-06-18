package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Conference;
/**
 * Conference
 */

public class ConferenceImpl implements Conference { 

	private java.lang.String serviceType;
	private java.lang.String[] offers;
	private java.lang.String serviceName;
	private java.lang.String description;

	public ConferenceImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public ConferenceImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public java.lang.String[] getOffers() { 
		return this.offers;
	} 

	public void setOffers(java.lang.String[] offers) { 
		this.offers = offers;
	} 

	public ConferenceImpl offers(java.lang.String[] offers) { 
		this.offers = offers;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public ConferenceImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public ConferenceImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
