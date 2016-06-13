package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.WindowsOrderConfiguration;
/**
 * Allowed windows versions and their compliant options per matching serviceTypes
 */

public class WindowsOrderConfigurationImpl implements WindowsOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderableWindowsCompatibilityInfos orderableVersions;

	public WindowsOrderConfigurationImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public WindowsOrderConfigurationImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderableWindowsCompatibilityInfos getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableWindowsCompatibilityInfos orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public WindowsOrderConfigurationImpl orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableWindowsCompatibilityInfos orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
