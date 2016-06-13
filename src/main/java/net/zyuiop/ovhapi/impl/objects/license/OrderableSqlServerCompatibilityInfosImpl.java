package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.OrderableSqlServerCompatibilityInfos;
/**
 * All options available for SQL Server products
 */

public class OrderableSqlServerCompatibilityInfosImpl implements OrderableSqlServerCompatibilityInfos { 

	private java.lang.String version;

	public OrderableSqlServerCompatibilityInfosImpl() {
	}

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableSqlServerCompatibilityInfosImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
