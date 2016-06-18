package net.zyuiop.ovhapi.api.objects.license;

/**
 * Allowed windows versions and their compliant options per matching serviceTypes
 */

public interface WindowsOrderConfiguration { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.license.OrderableWindowsCompatibilityInfos[] getOrderableVersions(); 

}
