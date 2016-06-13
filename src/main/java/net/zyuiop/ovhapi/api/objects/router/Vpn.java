package net.zyuiop.ovhapi.api.objects.router;

/**
 * Virtual Private Network
 */

public interface Vpn { 

	/**
	 * @return IP you will be connecting from / NULL (allow all)
	 */
	java.lang.String getClientIp(); 

	/**
	 * @return Server's private network
	 */
	java.lang.String getServerPrivNet(); 

	/**
	 * @return Client's private network
	 */
	java.lang.String getClientPrivNet(); 

	/**
	 * @return Your VPN server IP
	 */
	java.lang.String getServerIp(); 

	/**
	 * @return null
	 */
	long getId(); 

}
