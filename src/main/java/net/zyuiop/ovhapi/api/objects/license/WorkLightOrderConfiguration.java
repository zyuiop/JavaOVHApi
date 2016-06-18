package net.zyuiop.ovhapi.api.objects.license;

/**
 * Allowed WorkLight versions per matching serviceTypes
 */

public interface WorkLightOrderConfiguration { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.license.OrderableWorkLightCompatibilityInfos[] getOrderableVersions(); 

}
