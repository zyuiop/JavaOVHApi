package net.zyuiop.ovhapi.api.objects.dnssec;

/**
 * Key type
 */

public interface Key { 

	/**
	 * @return Algorithm
	 */
	long getAlgorithm(); 

	/**
	 * @return Flag of the dnssec key
	 */
	long getFlags(); 

	/**
	 * @return Key tag
	 */
	long getTag(); 

	/**
	 * @return Public key
	 */
	java.lang.String getPublicKey(); 

}
