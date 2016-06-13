package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Available clusterIp by country
 */

public interface CountriesIp { 

	/**
	 * @return The whois country of the ip
	 */
	java.lang.String getCountry(); 

	/**
	 * @return The cluster ipv6
	 */
	java.lang.String getIpv6(); 

	/**
	 * @return The cluster ip
	 */
	java.lang.String getIp(); 

}
