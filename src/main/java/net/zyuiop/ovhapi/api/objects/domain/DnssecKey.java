package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Domain's DNSSEC Key
 */

public interface DnssecKey { 

	/**
	 * @return Algorithm number of the DNSSEC key
	 */
	long getAlgorithm(); 

	/**
	 * @return Flag of the DNSSEC key
	 */
	long getFlags(); 

	/**
	 * @return Key status of the DNSSEC key
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Id of the DNSSEC key
	 */
	long getId(); 

	/**
	 * @return Tag of the DNSSEC key
	 */
	long getTag(); 

	/**
	 * @return Public key
	 */
	java.lang.String getPublicKey(); 

}
