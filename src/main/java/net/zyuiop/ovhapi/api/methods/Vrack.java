package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /vrack APIs
 */

public interface Vrack { 

	/**
	 * add an IP block to this vrack
	 * Facultative parameters ? false
	 * @param block Your IP block
	 * @param serviceName The internal name of your vrack
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameIp(java.lang.String block, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param taskId null
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Zone available to announce your block
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param ip Your IP block
	*/
	java.lang.String getServiceNameIpIpAvailableZone(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * remove this a dedicatedCloud from this vrack
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param dedicatedCloud your dedicated cloud service
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameDedicatedCloudDedicatedCloud(java.lang.String serviceName, java.lang.String dedicatedCloud) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param project publicCloud project
	*/
	net.zyuiop.ovhapi.api.objects.vrack.CloudProject getServiceNameCloudProjectProject(java.lang.String serviceName, java.lang.String project) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Vrack getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param ip Your IP block
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Ip getServiceNameIpIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param dedicatedServer Dedicated Server
	*/
	net.zyuiop.ovhapi.api.objects.vrack.DedicatedServer getServiceNameDedicatedServerDedicatedServer(java.lang.String serviceName, java.lang.String dedicatedServer) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param name A name for your dedicatedConnect link
	*/
	net.zyuiop.ovhapi.api.objects.vrack.DedicatedConnect getServiceNameDedicatedConnectName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException;


	/**
	 * List all services allowed in this vrack
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	net.zyuiop.ovhapi.api.objects.vrack.AllowedServices getServiceNameAllowedServices(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * add a dedicatedCloud to this vrack
	 * Facultative parameters ? false
	 * @param dedicatedCloud 
	 * @param serviceName The internal name of your vrack
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameDedicatedCloud(java.lang.String dedicatedCloud, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * vrack dedicated cloud 
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String getServiceNameDedicatedCloud(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * vrack for dedicated server
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String getServiceNameDedicatedServer(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * remove this IP block from this vrack
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param ip Your IP block
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameIpIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * vrack dedicated connect
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String getServiceNameDedicatedConnect(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * add a dedicated server to this vrack
	 * Facultative parameters ? false
	 * @param dedicatedServer Dedicated server to add 
	 * @param serviceName The internal name of your vrack
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameDedicatedServer(java.lang.String dedicatedServer, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param dedicatedCloud your dedicated cloud service
	*/
	net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud getServiceNameDedicatedCloudDedicatedCloud(java.lang.String serviceName, java.lang.String dedicatedCloud) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your vrack
	 * @param name A name for your dedicatedConnect link
	*/
	void putServiceNameDedicatedConnectName(net.zyuiop.ovhapi.api.objects.vrack.DedicatedConnect param0, java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * vrack for publicCloud project
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String getServiceNameCloudProject(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * vrack for IP blocks
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String getServiceNameIp(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * vrack for legacy vrack
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	java.lang.String getServiceNameLegacyVrack(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getVrack() throws java.io.IOException;

	/**
	 * add a legacy vrack (vrackXXXX) to this vrack (pn-XXXX)
	 * Facultative parameters ? false
	 * @param legacyVrack 
	 * @param serviceName The internal name of your vrack
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameLegacyVrack(java.lang.String legacyVrack, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * remove this publicCloud project from this vrack
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param project publicCloud project
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameCloudProjectProject(java.lang.String serviceName, java.lang.String project) throws java.io.IOException;

	/**
	 * Announce IP to zone for vrack
	 * Facultative parameters ? false
	 * @param zone Zone to announce in
	 * @param serviceName The internal name of your vrack
	 * @param ip Your IP block
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task postServiceNameIpIpAnnounceInZone(java.lang.String zone, java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * remove this server from this vrack
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param dedicatedServer Dedicated Server
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameDedicatedServerDedicatedServer(java.lang.String serviceName, java.lang.String dedicatedServer) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your vrack
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.vrack.Vrack param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param legacyVrack your legacy vrack service
	*/
	net.zyuiop.ovhapi.api.objects.vrack.LegacyVrack getServiceNameLegacyVrackLegacyVrack(java.lang.String serviceName, java.lang.String legacyVrack) throws java.io.IOException;

	/**
	 * remove this legacy vrack (vrackXXXX) from this vrack (pn-XXXX)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	 * @param legacyVrack your legacy vrack service
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameLegacyVrackLegacyVrack(java.lang.String serviceName, java.lang.String legacyVrack) throws java.io.IOException;

	/**
	 * vrack tasks
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your vrack
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

}
