package net.zyuiop.ovhapi.api.objects.router;

/**
 * Network
 */

public interface Network { 

	/**
	 * @return null
	 */
	long getVlanTag(); 

	/**
	 * @return null
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return Gateway IP / CIDR Netmask
	 */
	java.lang.String getIpNet(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

}
