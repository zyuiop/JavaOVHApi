package net.zyuiop.ovhapi.api.objects.cloud.storage;

/**
 * ContainerAccess
 */

public interface ContainerAccess { 

	/**
	 * @return Storage access token
	 */
	java.lang.String getToken(); 

	/**
	 * @return Storage access endpoints
	 */
	net.zyuiop.ovhapi.api.objects.cloud.storage.Endpoint[] getEndpoints(); 

}
