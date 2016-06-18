package net.zyuiop.ovhapi.api.objects.cloud.subnet;

/**
 * Subnet
 */

public interface Subnet { 

	/**
	 * @return Subnet name
	 */
	java.lang.String getName(); 

	/**
	 * @return Subnet id
	 */
	java.lang.String getId(); 

	/**
	 * @return Subnet CIDR
	 */
	java.lang.String getCidr(); 

	/**
	 * @return List of ip pools allocated in subnet
	 */
	net.zyuiop.ovhapi.api.objects.cloud.network.IPPool[] getIpPools(); 

}
