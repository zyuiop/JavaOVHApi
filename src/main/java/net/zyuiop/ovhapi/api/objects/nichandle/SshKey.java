package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Customer public SSH key, can be used for rescue netboot or server access after reinstallation
 */

public interface SshKey { 

	/**
	 * @return True when this public SSH key is used for rescue mode and reinstallations
	 */
	boolean getDefault(); 

	/**
	 * @return Name of this public SSH key
	 */
	java.lang.String getKeyName(); 

	/**
	 * @return ASCII encoded public SSH key
	 */
	java.lang.String getKey(); 

}
