package net.zyuiop.ovhapi.api.objects.vps;

/**
 * Information about the options of a VPS Virtual Machine
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
