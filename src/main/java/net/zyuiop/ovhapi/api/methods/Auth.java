package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /auth APIs
 */

public interface Auth { 

	/**
	 * Request a new credential for your application
	 * Facultative parameters ? true
	 * @param accessRules Access required for your application
	 * @param redirection Where you want to redirect the user after sucessfull authentication
	*/
	net.zyuiop.ovhapi.api.objects.auth.Credential postCredential(net.zyuiop.ovhapi.api.objects.auth.AccessRule accessRules, java.lang.String redirection) throws java.io.IOException;

	/**
	 * Request a new credential for your application
	 * Facultative parameters ? false
	 * @param accessRules Access required for your application
	*/
	net.zyuiop.ovhapi.api.objects.auth.Credential postCredential(net.zyuiop.ovhapi.api.objects.auth.AccessRule accessRules) throws java.io.IOException;

	/**
	 * Get the current time of the OVH servers, since UNIX epoch
	 * Facultative parameters ? false
	*/
	long getTime() throws java.io.IOException;

	/**
	 * Get the current credential details
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.api.Credential getCurrentCredential() throws java.io.IOException;

	/**
	 * Expire current credential
	 * Facultative parameters ? false
	*/
	void postLogout() throws java.io.IOException;

}
