package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.WorkLightOrderConfiguration;
/**
 * Allowed WorkLight versions per matching serviceTypes
 */

public class WorkLightOrderConfigurationImpl implements WorkLightOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos orderableVersions;

	public WorkLightOrderConfigurationImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public WorkLightOrderConfigurationImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public WorkLightOrderConfigurationImpl orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
