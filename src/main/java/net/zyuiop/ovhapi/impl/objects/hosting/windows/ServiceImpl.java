package net.zyuiop.ovhapi.impl.objects.hosting.windows;

import net.zyuiop.ovhapi.api.objects.hosting.windows.Service;
/**
 * Windows web Hosting
 */

public class ServiceImpl implements Service { 

	private java.lang.String resourceType;
	private java.lang.String offer;
	private java.lang.String serviceName;
	private java.lang.String operatingSystem;

	public ServiceImpl() {
	}

	public java.lang.String getResourceType() { 
		return this.resourceType;
	} 

	public void setResourceType(java.lang.String resourceType) { 
		this.resourceType = resourceType;
	} 

	public ServiceImpl resourceType(java.lang.String resourceType) { 
		this.resourceType = resourceType;
		return this;
	} 

	public java.lang.String getOffer() { 
		return this.offer;
	} 

	public void setOffer(java.lang.String offer) { 
		this.offer = offer;
	} 

	public ServiceImpl offer(java.lang.String offer) { 
		this.offer = offer;
		return this;
	} 

	public java.lang.String getServiceName() { 
		return this.serviceName;
	} 

	public void setServiceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
	} 

	public ServiceImpl serviceName(java.lang.String serviceName) { 
		this.serviceName = serviceName;
		return this;
	} 

	public java.lang.String getOperatingSystem() { 
		return this.operatingSystem;
	} 

	public void setOperatingSystem(java.lang.String operatingSystem) { 
		this.operatingSystem = operatingSystem;
	} 

	public ServiceImpl operatingSystem(java.lang.String operatingSystem) { 
		this.operatingSystem = operatingSystem;
		return this;
	} 

}
