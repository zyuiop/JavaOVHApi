package net.zyuiop.ovhapi.api.objects.pack.xdsl.addressmove;

/**
 * The parameters needed to activate the access on a landline
 */

public interface Landline { 

	/**
	 * @return Whether or not tha lineNumber should be ported to OVH, if eligibile
	 */
	boolean getPortLineNumber(); 

	/**
	 * @return A token to prove the ownership of the line number, needed to port the number
	 */
	java.lang.String getRio(); 

	/**
	 * @return The status of the landline
	 */
	java.lang.String getStatus(); 

	/**
	 * @return The number of the landline
	 */
	java.lang.String getLineNumber(); 

	/**
	 * @return The unbundling of the landline
	 */
	java.lang.String getUnbundling(); 

}
