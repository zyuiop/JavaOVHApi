package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Plug & Phone function key
 */

public interface FunctionKey { 

	/**
	 * @return The function parameter
	 */
	java.lang.String getParameter(); 

	/**
	 * @return The function active on the key
	 */
	java.lang.String getFunction(); 

	/**
	 * @return The key label
	 */
	java.lang.String getLabel(); 

	/**
	 * @return The default function used by the key
	 */
	java.lang.String getDefault(); 

	/**
	 * @return The key type
	 */
	java.lang.String getType(); 

	/**
	 * @return The number of the function key
	 */
	long getKeyNum(); 

}
