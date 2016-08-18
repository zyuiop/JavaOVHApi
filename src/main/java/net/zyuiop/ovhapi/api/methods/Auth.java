package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /auth APIs
 */

public interface Auth { 




	/**
	 * Get the current time of the OVH servers, since UNIX epoch
	 * Facultative parameters ? false
	*/
	long getTime() throws java.io.IOException;

	/**
	 * Expire current credential
	 * Facultative parameters ? false
	*/
	void postLogout() throws java.io.IOException;

}
