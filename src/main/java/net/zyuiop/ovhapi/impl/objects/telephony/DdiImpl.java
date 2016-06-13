package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Ddi;
/**
 * DDI (direct dial-in) service
 */

public class DdiImpl implements Ddi { 

	private java.lang.String serviceType;
	private java.lang.String featureType;
	private java.lang.String destination;
	private java.lang.String serviceName;
	private java.lang.String description;

	public DdiImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public DdiImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public java.lang.String getFeatureType() { 
		return this.featureType;
	} 

	public void setFeatureType(java.lang.String featureType) { 
		this.featureType = featureType;
	} 

	public DdiImpl featureType(java.lang.String featureType) { 
		this.featureType = featureType;
		return this;
	} 

	public java.lang.String getDestination() { 
		return this.destination;
	} 

	public void setDestination(java.lang.String destination) { 
		this.destination = destination;
	} 

	public DdiImpl destination(java.lang.String destination) { 
		this.destination = destination;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public DdiImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public DdiImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}