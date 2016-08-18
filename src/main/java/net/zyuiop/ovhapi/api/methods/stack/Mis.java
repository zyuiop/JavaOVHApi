package net.zyuiop.ovhapi.api.methods.stack;

/**
 * A class to interact with OVH's /stack/mis APIs
 */

public interface Mis { 



	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getStackMis() throws java.io.IOException;


}
