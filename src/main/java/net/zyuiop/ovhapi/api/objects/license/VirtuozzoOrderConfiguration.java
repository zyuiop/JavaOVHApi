package net.zyuiop.ovhapi.api.objects.license;

/**
 * The serviceTypes allowed to Order a Virtuozzo version
 */

public class VirtuozzoOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos[] orderableVersions;

	public VirtuozzoOrderConfiguration() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public VirtuozzoOrderConfiguration serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos[] getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public VirtuozzoOrderConfiguration orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
