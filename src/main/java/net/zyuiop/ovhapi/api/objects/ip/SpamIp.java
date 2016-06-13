package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Your IP spam stats
 */

public interface SpamIp { 

	/**
	 * @return Time (in seconds) while the IP will be blocked
	 */
	long getTime(); 

	/**
	 * @return Last date the ip was blocked
	 */
	java.util.Date getDate(); 

	/**
	 * @return IP address which is sending spam
	 */
	java.lang.String getIpSpamming(); 

	/**
	 * @return Current state of the ip
	 */
	java.lang.String getState(); 

}
