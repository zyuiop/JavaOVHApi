package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /allDom APIs
 */

public interface AllDom { 

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your allDom
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

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

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your allDom
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getAllDom() throws java.io.IOException;



}
