package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /vrack APIs
 */

public interface Vrack { 






	/**
	 * vrack dedicated cloud 
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String[] getServiceNameDedicatedCloud(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getVrack() throws java.io.IOException;




	/**
	 * Zone available to announce your block
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param ip Your IP block
	*/
	java.lang.String[] getServiceNameIpIpAvailableZone(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * vrack for dedicated server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String[] getServiceNameDedicatedServer(java.lang.String serviceName) throws java.io.IOException;






	/**
	 * vrack tasks
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * vrack dedicated connect
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String[] getServiceNameDedicatedConnect(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * vrack for publicCloud project
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String[] getServiceNameCloudProject(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * vrack for legacy vrack
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String[] getServiceNameLegacyVrack(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * vrack for IP blocks
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String[] getServiceNameIp(java.lang.String serviceName) throws java.io.IOException;



}
