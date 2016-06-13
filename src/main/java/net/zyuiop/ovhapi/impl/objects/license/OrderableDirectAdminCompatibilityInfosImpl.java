package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos;
/**
 * All versions available for DirectAdmin products
 */

public class OrderableDirectAdminCompatibilityInfosImpl implements OrderableDirectAdminCompatibilityInfos { 

	private java.lang.String version;

	public OrderableDirectAdminCompatibilityInfosImpl() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableDirectAdminCompatibilityInfosImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
