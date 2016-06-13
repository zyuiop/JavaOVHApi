package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Server
 */

public interface CustomerServer { 

	/**
	 * @return Zone of your server
	 */
	java.lang.String getZone(); 

	/**
	 * @return Status attached to your server
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Id of your server
	 */
	long getId(); 

	/**
	 * @return Address of your server
	 */
	java.lang.String getAddress(); 

	/**
	 * @return Type of your server
	 */
	java.lang.String getType(); 

}
