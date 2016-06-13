package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.OrderableCloudLinuxCompatibilityInfos;
/**
 * All versions available for CloudLinux products
 */

public class OrderableCloudLinuxCompatibilityInfosImpl implements OrderableCloudLinuxCompatibilityInfos { 

	private java.lang.String version;

	public OrderableCloudLinuxCompatibilityInfosImpl() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableCloudLinuxCompatibilityInfosImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
