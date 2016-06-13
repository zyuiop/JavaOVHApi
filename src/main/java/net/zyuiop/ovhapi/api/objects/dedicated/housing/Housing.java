package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * Housing bay
 */

public interface Housing { 

	/**
	 * @return Housing bay network
	 */
	net.zyuiop.ovhapi.api.objects.dedicated.housing.NetworkInfo getNetwork(); 

	/**
	 * @return Housing bay datacenter
	 */
	java.lang.String getDatacenter(); 

	/**
	 * @return Housing bay options
	 */
	net.zyuiop.ovhapi.api.objects.dedicated.housing.Options getOptions(); 

	/**
	 * @return Bay Security code
	 */
	java.lang.String getSecurityCode(); 

	/**
	 * @return The bay's description
	 */
	java.lang.String getRack(); 

	/**
	 * @return The name you give to the bay
	 */
	java.lang.String getName(); 

}
