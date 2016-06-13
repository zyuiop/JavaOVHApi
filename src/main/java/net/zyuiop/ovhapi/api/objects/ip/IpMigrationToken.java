package net.zyuiop.ovhapi.api.objects.ip;

/**
 * IP migration to OVH
 */

public interface IpMigrationToken { 

	/**
	 * @return destination customer ID
	 */
	java.lang.String getCustomerId(); 

	/**
	 * @return migration token
	 */
	java.lang.String getToken(); 

}
