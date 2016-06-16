package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.CloudLinuxOrderConfiguration;
/**
 * Allowed CloudLinux versions per matching serviceTypes
 */

public class CloudLinuxOrderConfigurationImpl implements CloudLinuxOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.impl.objects.license.OrderableCloudLinuxCompatibilityInfosImpl orderableVersions;

	public CloudLinuxOrderConfigurationImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public CloudLinuxOrderConfigurationImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.license.OrderableCloudLinuxCompatibilityInfosImpl getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.impl.objects.license.OrderableCloudLinuxCompatibilityInfosImpl orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public CloudLinuxOrderConfigurationImpl orderableVersions(net.zyuiop.ovhapi.impl.objects.license.OrderableCloudLinuxCompatibilityInfosImpl orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
