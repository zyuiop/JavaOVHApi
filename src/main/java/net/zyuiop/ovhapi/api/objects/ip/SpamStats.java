package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Spam statistics about an IP address
 */

public interface SpamStats { 

	/**
	 * @return Time when the IP address was blocked
	 */
	long getTimestamp(); 

	/**
	 * @return Average spam score.
	 */
	long getAverageSpamscore(); 

	/**
	 * @return Detailed list of the spams
	 */
	net.zyuiop.ovhapi.api.objects.ip.SpamTarget getDetectedSpams(); 

	/**
	 * @return Number of emails sent
	 */
	long getTotal(); 

	/**
	 * @return Number of spams sent
	 */
	long getNumberOfSpams(); 

}
