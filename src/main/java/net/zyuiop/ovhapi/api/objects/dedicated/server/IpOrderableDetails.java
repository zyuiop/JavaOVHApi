package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about orderable IP address
 */

public interface IpOrderableDetails { 

	/**
	 * @return Orderable IP blocks sizes
	 */
	long[] getBlockSizes(); 

	/**
	 * @return Which option is required to order this type of IP
	 */
	java.lang.String getOptionRequired(); 

	/**
	 * @return Total number of prefixes that can be routed to this server
	 */
	long getNumber(); 

	/**
	 * @return Total number of IP that can be routed to this server
	 */
	long getIpNumber(); 

	/**
	 * @return Are those IP included with your offer
	 */
	boolean getIncluded(); 

	/**
	 * @return this IP type
	 */
	java.lang.String getType(); 

}
