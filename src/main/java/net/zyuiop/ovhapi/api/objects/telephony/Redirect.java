package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Redirect service
 */

public class Redirect { 

	private java.lang.String serviceType;
	private java.lang.String featureType;
	private java.lang.String destination;
	private java.lang.String serviceName;
	private java.lang.String description;

	public Redirect() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public Redirect serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public java.lang.String getFeatureType() { 
		return this.featureType;
	} 

	public void setFeatureType(java.lang.String featureType) { 
		this.featureType = featureType;
	} 

	public Redirect featureType(java.lang.String featureType) { 
		this.featureType = featureType;
		return this;
	} 

	public java.lang.String getDestination() { 
		return this.destination;
	} 

	public void setDestination(java.lang.String destination) { 
		this.destination = destination;
	} 

	public Redirect destination(java.lang.String destination) { 
		this.destination = destination;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public Redirect serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public Redirect description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
