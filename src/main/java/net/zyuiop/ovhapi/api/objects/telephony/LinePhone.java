package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Informations related to phone capabilities
 */

public interface LinePhone { 

	/**
	 * @return Phone protocol
	 */
	java.lang.String getProtocol(); 

	/**
	 * @return Maximum number of lines managed by a phone
	 */
	long getMaxline(); 

	/**
	 * @return Brand name of the phone
	 */
	java.lang.String getBrand(); 

}
