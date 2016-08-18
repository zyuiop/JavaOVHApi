package net.zyuiop.ovhapi.api.objects.license;

/**
 * All versions available for Cpanel products
 */

public class OrderableCpanelCompatibilityInfos { 

	private java.lang.String version;

	public OrderableCpanelCompatibilityInfos() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableCpanelCompatibilityInfos version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
