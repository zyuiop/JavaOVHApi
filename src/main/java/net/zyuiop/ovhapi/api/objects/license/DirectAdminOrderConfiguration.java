package net.zyuiop.ovhapi.api.objects.license;

/**
 * The serviceTypes allowed to Order a DirectAdmin version
 */

public class DirectAdminOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos[] orderableVersions;

	public DirectAdminOrderConfiguration() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public DirectAdminOrderConfiguration serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos[] getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public DirectAdminOrderConfiguration orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
