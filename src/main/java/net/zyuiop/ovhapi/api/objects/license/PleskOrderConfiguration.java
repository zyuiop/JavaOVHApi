package net.zyuiop.ovhapi.api.objects.license;

/**
 * The serviceTypes allowed to Order a plesk version and associated Versions
 */

public class PleskOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderablePleskCompatibilityInfos[] orderableVersions;

	public PleskOrderConfiguration() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public PleskOrderConfiguration serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderablePleskCompatibilityInfos[] getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderablePleskCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public PleskOrderConfiguration orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderablePleskCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
