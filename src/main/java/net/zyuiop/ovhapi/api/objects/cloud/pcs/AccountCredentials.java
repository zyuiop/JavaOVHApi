package net.zyuiop.ovhapi.api.objects.cloud.pcs;

/**
 * A structure with credentials for using openstack account
 */

public interface AccountCredentials { 

	/**
	 * @return null
	 */
	java.lang.String getPassword(); 

	/**
	 * @return null
	 */
	java.lang.String getTenant(); 

	/**
	 * @return null
	 */
	java.lang.String getLogin(); 

	/**
	 * @return null
	 */
	java.lang.String getEndpoint(); 

}
