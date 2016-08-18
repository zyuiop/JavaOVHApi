package net.zyuiop.ovhapi.api.objects.license;

/**
 * All versions available for DirectAdmin products
 */

public class OrderableDirectAdminCompatibilityInfos { 

	private java.lang.String version;

	public OrderableDirectAdminCompatibilityInfos() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableDirectAdminCompatibilityInfos version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
