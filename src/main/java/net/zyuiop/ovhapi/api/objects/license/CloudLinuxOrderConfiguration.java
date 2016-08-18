package net.zyuiop.ovhapi.api.objects.license;

/**
 * Allowed CloudLinux versions per matching serviceTypes
 */

public class CloudLinuxOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderableCloudLinuxCompatibilityInfos[] orderableVersions;

	public CloudLinuxOrderConfiguration() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public CloudLinuxOrderConfiguration serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderableCloudLinuxCompatibilityInfos[] getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableCloudLinuxCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public CloudLinuxOrderConfiguration orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableCloudLinuxCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
