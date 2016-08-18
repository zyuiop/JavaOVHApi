package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Voicemail service
 */

public class Voicemail { 

	private java.lang.String serviceType;
	private java.lang.String[] offers;
	private java.lang.String serviceName;
	private java.lang.String description;

	public Voicemail() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public Voicemail serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public java.lang.String[] getOffers() { 
		return this.offers;
	} 

	public void setOffers(java.lang.String[] offers) { 
		this.offers = offers;
	} 

	public Voicemail offers(java.lang.String[] offers) { 
		this.offers = offers;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Voicemail serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Voicemail description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
