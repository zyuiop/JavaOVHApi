package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.OrderableCpanelCompatibilityInfos;
/**
 * All versions available for Cpanel products
 */

public class OrderableCpanelCompatibilityInfosImpl implements OrderableCpanelCompatibilityInfos { 

	private java.lang.String version;

	public OrderableCpanelCompatibilityInfosImpl() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableCpanelCompatibilityInfosImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
