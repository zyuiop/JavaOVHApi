package net.zyuiop.ovhapi.api.objects.license;

/**
 * All versions available for CloudLinux products
 */

public class OrderableCloudLinuxCompatibilityInfos { 

	private java.lang.String version;

	public OrderableCloudLinuxCompatibilityInfos() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableCloudLinuxCompatibilityInfos version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
