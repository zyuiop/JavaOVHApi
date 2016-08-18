package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /allDom APIs
 */

public interface AllDom { 


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getAllDom() throws java.io.IOException;

	/**
	 * Domains attached to this allDom
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your allDom
	 * @param domain Filter the value of domain property (like)
	*/
	java.lang.String[] getServiceNameDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Domains attached to this allDom
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your allDom
	*/
	java.lang.String[] getServiceNameDomain(java.lang.String serviceName) throws java.io.IOException;




}
