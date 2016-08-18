package net.zyuiop.ovhapi.api.objects.license;

/**
 * All SQL options available for Windows products
 */

public class OrderableWindowsCompatibilityInfos { 

	private java.lang.String[] compliantSql;
	private java.lang.String version;

	public OrderableWindowsCompatibilityInfos() {
	}

	public java.lang.String[] getCompliantSql() { 
		return this.compliantSql;
	} 

	public void setCompliantSql(java.lang.String[] compliantSql) { 
		this.compliantSql = compliantSql;
	} 

	public OrderableWindowsCompatibilityInfos compliantSql(java.lang.String[] compliantSql) { 
		this.compliantSql = compliantSql;
		return this;
	} 

	public java.lang.String getVersion() { 
		return this.version;
	} 

	public void setVersion(java.lang.String version) { 
		this.version = version;
	} 

	public OrderableWindowsCompatibilityInfos version(java.lang.String version) { 
		this.version = version;
		return this;
	} 

}
