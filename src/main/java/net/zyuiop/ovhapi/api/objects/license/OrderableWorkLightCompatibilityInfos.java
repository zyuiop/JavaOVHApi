package net.zyuiop.ovhapi.api.objects.license;

/**
 * All versions available for WorkLight products
 */

public class OrderableWorkLightCompatibilityInfos { 

	private java.lang.String version;

	public OrderableWorkLightCompatibilityInfos() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableWorkLightCompatibilityInfos version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
