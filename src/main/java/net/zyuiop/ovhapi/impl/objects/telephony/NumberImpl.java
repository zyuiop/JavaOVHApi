package net.zyuiop.ovhapi.impl.objects.telephony;

import net.zyuiop.ovhapi.api.objects.telephony.Number;
/**
 * Additional number
 */

public class NumberImpl implements Number { 

	private java.lang.String serviceType;
	private java.lang.String featureType;
	private java.lang.String serviceName;
	private java.lang.String description;

	public NumberImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public NumberImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public java.lang.String getFeatureType() { 
		return this.featureType;
	} 

	public void setFeatureType(java.lang.String featureType) { 
		this.featureType = featureType;
	} 

	public NumberImpl featureType(java.lang.String featureType) { 
		this.featureType = featureType;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public NumberImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public NumberImpl description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
