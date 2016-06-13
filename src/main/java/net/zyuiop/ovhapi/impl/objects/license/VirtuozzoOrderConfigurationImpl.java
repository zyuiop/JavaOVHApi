package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.VirtuozzoOrderConfiguration;
/**
 * The serviceTypes allowed to Order a Virtuozzo version
 */

public class VirtuozzoOrderConfigurationImpl implements VirtuozzoOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos orderableVersions;

	public VirtuozzoOrderConfigurationImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public VirtuozzoOrderConfigurationImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public VirtuozzoOrderConfigurationImpl orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
