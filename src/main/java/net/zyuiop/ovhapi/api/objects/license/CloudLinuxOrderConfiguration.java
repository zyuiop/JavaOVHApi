package net.zyuiop.ovhapi.api.objects.license;

/**
 * Allowed CloudLinux versions per matching serviceTypes
 */

public interface CloudLinuxOrderConfiguration { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.license.OrderableCloudLinuxCompatibilityInfos[] getOrderableVersions(); 

}
