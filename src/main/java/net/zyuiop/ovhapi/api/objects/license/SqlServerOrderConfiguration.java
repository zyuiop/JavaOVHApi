package net.zyuiop.ovhapi.api.objects.license;

/**
 * Allowed SQL Server versions and their compliant options per matching serviceTypes
 */

public class SqlServerOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.api.objects.license.OrderableSqlServerCompatibilityInfos[] orderableVersions;

	public SqlServerOrderConfiguration() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public SqlServerOrderConfiguration serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.api.objects.license.OrderableSqlServerCompatibilityInfos[] getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableSqlServerCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public SqlServerOrderConfiguration orderableVersions(net.zyuiop.ovhapi.api.objects.license.OrderableSqlServerCompatibilityInfos[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
