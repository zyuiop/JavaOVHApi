package net.zyuiop.ovhapi.api.objects.license;

/**
 * The serviceTypes allowed to Order a CPanel version
 */

public interface CpanelOrderConfiguration { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.license.OrderableCpanelCompatibilityInfos[] getOrderableVersions(); 

}
