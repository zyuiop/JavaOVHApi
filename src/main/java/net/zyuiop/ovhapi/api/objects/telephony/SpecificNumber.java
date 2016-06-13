package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Specific number available
 */

public interface SpecificNumber { 

	/**
	 * @return The number
	 */
	java.lang.String getNumber(); 

	/**
	 * @return Set if number is premium
	 */
	boolean getIsPremium(); 

}
