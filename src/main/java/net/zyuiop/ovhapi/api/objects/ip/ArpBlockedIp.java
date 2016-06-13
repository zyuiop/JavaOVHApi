package net.zyuiop.ovhapi.api.objects.ip;

/**
 * ARP blocked IP information
 */

public interface ArpBlockedIp { 

	/**
	 * @return your IP
	 */
	java.lang.String getIpBlocked(); 

	/**
	 * @return The last blocking date
	 */
	java.util.Date getBlockedSince(); 

	/**
	 * @return Time (in seconds) remaining before you can request your IP to be unblocked
	 */
	long getTime(); 

	/**
	 * @return ARP logs
	 */
	java.lang.String getLogs(); 

	/**
	 * @return this IP address state
	 */
	java.lang.String getState(); 

}
