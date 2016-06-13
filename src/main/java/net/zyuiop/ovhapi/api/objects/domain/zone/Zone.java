package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Zone dns Management
 */

public interface Zone { 

	/**
	 * @return Last update date of the DNS zone
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return hasDnsAnycast flag of the DNS zone
	 */
	boolean getHasDnsAnycast(); 

	/**
	 * @return Name servers that host the DNS zone
	 */
	java.lang.String getNameServers(); 

	/**
	 * @return Is DNSSEC supported by this zone
	 */
	boolean getDnssecSupported(); 

}
