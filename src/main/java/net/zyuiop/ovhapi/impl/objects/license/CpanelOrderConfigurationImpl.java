package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.CpanelOrderConfiguration;
/**
 * The serviceTypes allowed to Order a CPanel version
 */

public class CpanelOrderConfigurationImpl implements CpanelOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.impl.objects.license.OrderableCpanelCompatibilityInfosImpl[] orderableVersions;

	public CpanelOrderConfigurationImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public CpanelOrderConfigurationImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.license.OrderableCpanelCompatibilityInfosImpl[] getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.impl.objects.license.OrderableCpanelCompatibilityInfosImpl[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public CpanelOrderConfigurationImpl orderableVersions(net.zyuiop.ovhapi.impl.objects.license.OrderableCpanelCompatibilityInfosImpl[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
