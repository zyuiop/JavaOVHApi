package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.PleskOrderConfiguration;
/**
 * The serviceTypes allowed to Order a plesk version and associated Versions
 */

public class PleskOrderConfigurationImpl implements PleskOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.impl.objects.license.OrderablePleskCompatibilityInfosImpl[] orderableVersions;

	public PleskOrderConfigurationImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public PleskOrderConfigurationImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.license.OrderablePleskCompatibilityInfosImpl[] getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.impl.objects.license.OrderablePleskCompatibilityInfosImpl[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public PleskOrderConfigurationImpl orderableVersions(net.zyuiop.ovhapi.impl.objects.license.OrderablePleskCompatibilityInfosImpl[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
