package net.zyuiop.ovhapi.api.objects.license;

/**
 * The serviceTypes allowed to Order a plesk version and associated Versions
 */

public interface PleskOrderConfiguration { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.license.OrderablePleskCompatibilityInfos getOrderableVersions(); 

}
