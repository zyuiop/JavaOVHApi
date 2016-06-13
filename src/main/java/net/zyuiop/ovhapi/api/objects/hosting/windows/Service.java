package net.zyuiop.ovhapi.api.objects.hosting.windows;

/**
 * Windows web Hosting
 */

public interface Service { 

	/**
	 * @return Hosting resource type
	 */
	java.lang.String getResourceType(); 

	/**
	 * @return Hosting offer
	 */
	java.lang.String getOffer(); 

	/**
	 * @return Service name
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return Hosting's OS
	 */
	java.lang.String getOperatingSystem(); 

}
