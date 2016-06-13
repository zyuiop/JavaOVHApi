package net.zyuiop.ovhapi.api.objects.license;

/**
 * The serviceTypes allowed to Order a DirectAdmin version
 */

public interface DirectAdminOrderConfiguration { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.license.OrderableDirectAdminCompatibilityInfos getOrderableVersions(); 

}
