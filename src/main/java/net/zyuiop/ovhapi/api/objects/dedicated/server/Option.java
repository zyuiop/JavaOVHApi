package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Information about the options of a dedicated server
 */

public interface Option { 

	/**
	 * @return The option name
	 */
	java.lang.String getOption(); 

	/**
	 * @return The state of the option
	 */
	java.lang.String getState(); 

}
