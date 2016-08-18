package net.zyuiop.ovhapi.api.objects.license;

/**
 * Allowed WorkLight versions per matching serviceTypes
 */

public class WorkLightOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos[] orderableVersions;

	public WorkLightOrderConfiguration() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public WorkLightOrderConfiguration serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos[] getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public WorkLightOrderConfiguration orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
