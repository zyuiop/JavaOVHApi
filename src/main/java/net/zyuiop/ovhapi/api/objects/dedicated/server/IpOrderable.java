package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about orderable IP address
 */

public interface IpOrderable { 

	/**
	 * @return Orderable IP v6 details
	 */
	net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails getIpv6(); 

	/**
	 * @return Orderable IP v4 details
	 */
	net.zyuiop.ovhapi.api.objects.dedicated.server.IpOrderableDetails getIpv4(); 

}
