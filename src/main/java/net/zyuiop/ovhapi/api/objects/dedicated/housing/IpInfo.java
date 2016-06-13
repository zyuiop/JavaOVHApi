package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing the Bay's network configuration
 */

public interface IpInfo { 

	/**
	 * @return Network address of the bay
	 */
	java.lang.String getNetwork(); 

	/**
	 * @return Network gateway of the bay
	 */
	java.lang.String getGateway(); 

	/**
	 * @return Reserved addresses. You should not use them in your network
	 */
	java.lang.String getReservedAddresses(); 

}
