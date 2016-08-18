package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * OVH calls queues and OVH IVRs (Interactive Voice Response)
 */

public class OvhPabx { 

	private java.lang.String serviceType;
	private java.lang.String featureType;
	private java.lang.String serviceName;
	private java.lang.String description;

	public OvhPabx() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public OvhPabx serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public java.lang.String getFeatureType() { 
		return this.featureType;
	} 

	public void setFeatureType(java.lang.String featureType) { 
		this.featureType = featureType;
	} 

	public OvhPabx featureType(java.lang.String featureType) { 
		this.featureType = featureType;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public OvhPabx serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getDescription() { 
		return this.description;
	} 

	public void setDescription(java.lang.String description) { 
		this.description = description;
	} 

	public OvhPabx description(java.lang.String description) { 
		this.description = description;
		return this;
	} 

}
