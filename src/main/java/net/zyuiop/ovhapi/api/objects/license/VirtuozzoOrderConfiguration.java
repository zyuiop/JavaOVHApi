package net.zyuiop.ovhapi.api.objects.license;

/**
 * The serviceTypes allowed to Order a Virtuozzo version
 */

public interface VirtuozzoOrderConfiguration { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.license.OrderableVirtuozzoCompatibilityInfos[] getOrderableVersions(); 

}
