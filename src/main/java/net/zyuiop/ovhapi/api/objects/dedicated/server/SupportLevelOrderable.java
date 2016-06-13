package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations support level orderable for this dedicated server
 */

public interface SupportLevelOrderable { 

	/**
	 * @return Support level  orderable
	 */
	java.lang.String getLevels(); 

	/**
	 * @return Is a support level is orderable for this server
	 */
	boolean getOrderable(); 

}
