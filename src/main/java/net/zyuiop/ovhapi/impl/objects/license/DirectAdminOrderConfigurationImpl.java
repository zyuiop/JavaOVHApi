package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.DirectAdminOrderConfiguration;
/**
 * The serviceTypes allowed to Order a DirectAdmin version
 */

public class DirectAdminOrderConfigurationImpl implements DirectAdminOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos orderableVersions;

	public DirectAdminOrderConfigurationImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public DirectAdminOrderConfigurationImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public DirectAdminOrderConfigurationImpl orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
