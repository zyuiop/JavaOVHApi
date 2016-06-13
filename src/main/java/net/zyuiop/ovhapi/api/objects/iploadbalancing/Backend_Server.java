package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Backend_Server
 */

public interface Backend_Server { 

	/**
	 * @return Backend id
	 */
	long getBackendId(); 

	/**
	 * @return SSL ciphering. Probes will also be sent ciphered
	 */
	boolean getSsl(); 

	/**
	 * @return Server cookie value configured for cookie stickiness
	 */
	java.lang.String getCookie(); 

	/**
	 * @return Enforce use of the PROXY protocol version over any connection established to this server (disabled if null)
	 */
	java.lang.String getProxyProtocolVersion(); 

	/**
	 * @return Server id
	 */
	long getServerId(); 

	/**
	 * @return Certificate chain. Allow server certificate verification (Avoid man-in-the-middle attacks)
	 */
	java.lang.String getChain(); 

	/**
	 * @return Weight value (1 if null)
	 */
	long getWeight(); 

	/**
	 * @return Id of your backend/server link
	 */
	long getId(); 

	/**
	 * @return Probe state
	 */
	boolean getProbe(); 

	/**
	 * @return Backup state
	 */
	boolean getBackup(); 

}
