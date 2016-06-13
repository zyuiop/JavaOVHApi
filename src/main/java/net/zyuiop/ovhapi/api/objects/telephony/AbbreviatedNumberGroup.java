package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Abbreviated number
 */

public interface AbbreviatedNumberGroup { 

	/**
	 * @return The destination of the abbreviated number
	 */
	java.lang.String getDestinationNumber(); 

	/**
	 * @return The abbreviated number which must start with "7" and must have a length of 3 or 4 digits
	 */
	long getAbbreviatedNumber(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	java.lang.String getSurname(); 

}
