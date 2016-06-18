package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.OrderableWindowsCompatibilityInfos;
/**
 * All SQL options available for Windows products
 */

public class OrderableWindowsCompatibilityInfosImpl implements OrderableWindowsCompatibilityInfos { 

	private java.lang.String[] compliantSql;
	private java.lang.String version;

	public OrderableWindowsCompatibilityInfosImpl() {
	}

	public java.lang.String[] getCompliantSql() { 
		return this.compliantSql;
	} 

	public void setCompliantSql(java.lang.String[] compliantSql) { 
		this.compliantSql = compliantSql;
	} 

	public OrderableWindowsCompatibilityInfosImpl compliantSql(java.lang.String[] compliantSql) { 
		this.compliantSql = compliantSql;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableWindowsCompatibilityInfosImpl version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
