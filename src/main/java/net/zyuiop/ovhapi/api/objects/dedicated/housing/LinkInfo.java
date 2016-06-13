package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing the Bay`s link information
 */

public interface LinkInfo { 

	/**
	 * @return Router port number
	 */
	java.lang.String getPort(); 

	/**
	 * @return Router in charge of your network
	 */
	java.lang.String getRouter(); 

}
