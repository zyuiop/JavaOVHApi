package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Zone Start Of Authority
 */

public interface Soa { 

	/**
	 * @return Email address of the DNS Administrator
	 */
	java.lang.String getEmail(); 

	/**
	 * @return Non-Existent Domain TTL, if the name server returns a negative response, the remote server should wait the number of seconds set in the nxDomainTtl field before trying again
	 */
	long getNxDomainTtl(); 

	/**
	 * @return The refresh value determines the interval in seconds between successful zone transfers of the entire zone file from a nameserver to another.
	 */
	long getRefresh(); 

	/**
	 * @return Time To Live in seconds
	 */
	long getTtl(); 

	/**
	 * @return The serial number is used to indicate which copy of the zone file is the most current. When editing zone files, you must increment the serial number
	 */
	long getSerial(); 

	/**
	 * @return Primary authoritative server
	 */
	java.lang.String getServer(); 

	/**
	 * @return When a zone transfer fails, a countdown clock begins. When the number of seconds set in the expire field elapses, the nameserver stops answering for that zone file
	 */
	long getExpire(); 

}
