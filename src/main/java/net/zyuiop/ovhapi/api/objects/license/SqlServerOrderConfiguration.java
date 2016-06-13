package net.zyuiop.ovhapi.api.objects.license;

/**
 * Allowed SQL Server versions and their compliant options per matching serviceTypes
 */

public interface SqlServerOrderConfiguration { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.license.OrderableSqlServerCompatibilityInfos getOrderableVersions(); 

}
