package net.zyuiop.ovhapi.api.objects.license;

/**
 * All options available for SQL Server products
 */

public class OrderableSqlServerCompatibilityInfos { 

	private java.lang.String version;

	public OrderableSqlServerCompatibilityInfos() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableSqlServerCompatibilityInfos version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
