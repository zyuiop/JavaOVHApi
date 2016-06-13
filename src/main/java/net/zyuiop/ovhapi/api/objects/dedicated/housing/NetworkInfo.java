package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing the Bay`s network configuration
 */

public interface NetworkInfo { 

	/**
	 * @return Router related information
	 */
	net.zyuiop.ovhapi.api.objects.dedicated.housing.LinkInfo getLink(); 

	/**
	 * @return IPv6 network information
	 */
	net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo getIpv6(); 

	/**
	 * @return IPv4 network information
	 */
	net.zyuiop.ovhapi.api.objects.dedicated.housing.IpInfo getIpv4(); 

}
