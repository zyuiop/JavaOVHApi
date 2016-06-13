package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * Catalog
 */

public interface Catalog { 

	/**
	 * @return 
	 */
	java.lang.String getId(); 

	/**
	 * @return 
	 */
	java.lang.String getType(); 

	/**
	 * @return 
	 */
	net.zyuiop.ovhapi.api.objects.cloud.identity.Endpoint getEndpoints(); 

}
