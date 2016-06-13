package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos;
/**
 * All versions available for WorkLight products
 */

public class OrderableWorkLightCompatibilityInfosImpl implements OrderableWorkLightCompatibilityInfos { 

	private java.lang.String version;

	public OrderableWorkLightCompatibilityInfosImpl() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableWorkLightCompatibilityInfosImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
