package net.zyuiop.ovhapi.impl.objects.license;

import net.zyuiop.ovhapi.api.objects.license.SqlServerOrderConfiguration;
/**
 * Allowed SQL Server versions and their compliant options per matching serviceTypes
 */

public class SqlServerOrderConfigurationImpl implements SqlServerOrderConfiguration { 

	private java.lang.String serviceType;
	private net.zyuiop.ovhapi.impl.objects.license.OrderableSqlServerCompatibilityInfosImpl[] orderableVersions;

	public SqlServerOrderConfigurationImpl() {
	}

	public java.lang.String getServiceType() { 
		return this.serviceType;
	} 

	public void setServiceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
	} 

	public SqlServerOrderConfigurationImpl serviceType(java.lang.String serviceType) { 
		this.serviceType = serviceType;
		return this;
	} 

	public net.zyuiop.ovhapi.impl.objects.license.OrderableSqlServerCompatibilityInfosImpl[] getOrderableVersions() { 
		return this.orderableVersions;
	} 

	public void setOrderableVersions(net.zyuiop.ovhapi.impl.objects.license.OrderableSqlServerCompatibilityInfosImpl[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
	} 

	public SqlServerOrderConfigurationImpl orderableVersions(net.zyuiop.ovhapi.impl.objects.license.OrderableSqlServerCompatibilityInfosImpl[] orderableVersions) { 
		this.orderableVersions = orderableVersions;
		return this;
	} 

}
