package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /ip APIs
 */

public interface Ip { 


	/**
	 * Ip under game anti-ddos
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpGame(java.lang.String ip) throws java.io.IOException;


	/**
	 * Cloud Linux licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String[] getIpLicenseCloudLinux(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Cloud Linux licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpLicenseCloudLinux(java.lang.String ip) throws java.io.IOException;


	/**
	 * Ip under mitigation
	 * Facultative parameters ? true
	 * @param ip null
	 * @param auto Filter the value of auto property (=)
	 * @param state Filter the value of state property (=)
	*/
	java.lang.String[] getIpMitigation(java.lang.String ip, boolean auto, java.lang.String state) throws java.io.IOException;

	/**
	 * Ip under mitigation
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpMitigation(java.lang.String ip) throws java.io.IOException;


	/**
	 * Virtuozzo licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String[] getIpLicenseVirtuozzo(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Virtuozzo licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpLicenseVirtuozzo(java.lang.String ip) throws java.io.IOException;

	/**
	 * Ip under firewall
	 * Facultative parameters ? true
	 * @param ip null
	 * @param state Filter the value of state property (=)
	 * @param enabled Filter the value of enabled property (=)
	*/
	java.lang.String[] getIpFirewall(java.lang.String ip, java.lang.String state, boolean enabled) throws java.io.IOException;

	/**
	 * Ip under firewall
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpFirewall(java.lang.String ip) throws java.io.IOException;

	/**
	 * Delete mitigation profile
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipMitigationProfile null
	*/
	void deleteIpMitigationProfilesIpMitigationProfile(java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException;




	/**
	 * Plesk licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String[] getIpLicensePlesk(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Plesk licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpLicensePlesk(java.lang.String ip) throws java.io.IOException;





	/**
	 * Backends for this IP load balancing
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getLoadBalancingServiceNameBackend(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * Rules for this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipOnFirewall null
	 * @param state Filter the value of state property (=)
	*/
	long[] getIpFirewallIpOnFirewallRule(java.lang.String ip, java.lang.String ipOnFirewall, java.lang.String state) throws java.io.IOException;

	/**
	 * Rules for this IP
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnFirewall null
	*/
	long[] getIpFirewallIpOnFirewallRule(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException;







	/**
	 * Ip subnet used by OVH to nat requests on your ip lb to your backends. You must ensure that your backends are not part of a network that overlap with this one.
	 * Facultative parameters ? false
	 * @param zone one of your ip loadbalancing's zone
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String getLoadBalancingServiceNameInternalNatIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Your OVH IPs
	 * Facultative parameters ? true
	 * @param ip Filter the value of ip property (contains or equals)
	 * @param routedTo.serviceName Filter the value of routedTo.serviceName property (like)
	 * @param type Filter the value of type property (=)
	 * @param description Filter the value of description property (like)
	*/
	java.lang.String[] getIp(java.lang.String ip, java.lang.String routedToServiceName, java.lang.String type, java.lang.String description) throws java.io.IOException;

	/**
	 * Your OVH IPs
	 * Facultative parameters ? false
	*/
	java.lang.String[] getIp() throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getLoadBalancing() throws java.io.IOException;




	/**
	 * SQL Server licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String[] getIpLicenseSqlserver(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * SQL Server licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpLicenseSqlserver(java.lang.String ip) throws java.io.IOException;

	/**
	 * Delete a reverse on one IP
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipReverse null
	*/
	void deleteIpReverseIpReverse(java.lang.String ip, java.lang.String ipReverse) throws java.io.IOException;



	/**
	 * Unblock this IP
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipBlocked your IP
	*/
	void postIpAntihackIpBlockedUnblock(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException;

	/**
	 * Ip spamming
	 * Facultative parameters ? true
	 * @param ip null
	 * @param state Filter the value of state property (=)
	*/
	java.lang.String[] getIpSpam(java.lang.String ip, java.lang.String state) throws java.io.IOException;

	/**
	 * Ip spamming
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpSpam(java.lang.String ip) throws java.io.IOException;


	/**
	 * IP tasks
	 * Facultative parameters ? true
	 * @param ip null
	 * @param function Filter the value of function property (=)
	 * @param status Filter the value of status property (=)
	*/
	long[] getIpTask(java.lang.String ip, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * IP tasks
	 * Facultative parameters ? false
	 * @param ip null
	*/
	long[] getIpTask(java.lang.String ip) throws java.io.IOException;


	/**
	 * Windows licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String[] getIpLicenseWindows(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Windows licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpLicenseWindows(java.lang.String ip) throws java.io.IOException;





	/**
	 * Anti-Hack blocked IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param state Filter the value of state property (=)
	*/
	java.lang.String[] getIpAntihack(java.lang.String ip, java.lang.String state) throws java.io.IOException;

	/**
	 * Anti-Hack blocked IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpAntihack(java.lang.String ip) throws java.io.IOException;






	/**
	 * DirectAdmin licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String[] getIpLicenseDirectadmin(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * DirectAdmin licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpLicenseDirectadmin(java.lang.String ip) throws java.io.IOException;

	/**
	 * IDs of rules configured for this IP
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnGame null
	*/
	long[] getIpGameIpOnGameRule(java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException;






	/**
	 * Reverse on your ip
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpReverse(java.lang.String ip) throws java.io.IOException;

	/**
	 * Ip under anti-phishing
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipOnAntiphishing Filter the value of ipOnAntiphishing property (within or equals)
	 * @param state Filter the value of state property (=)
	*/
	long[] getIpPhishing(java.lang.String ip, java.lang.String ipOnAntiphishing, java.lang.String state) throws java.io.IOException;

	/**
	 * Ip under anti-phishing
	 * Facultative parameters ? false
	 * @param ip null
	*/
	long[] getIpPhishing(java.lang.String ip) throws java.io.IOException;




	/**
	 * Delete a target for reverse delegation on IPv6 subnet
	 * Facultative parameters ? false
	 * @param ip null
	 * @param target NS target for delegation
	*/
	void deleteIpDelegationTarget(java.lang.String ip, java.lang.String target) throws java.io.IOException;


	/**
	 * ARP blocked IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param state Filter the value of state property (=)
	*/
	java.lang.String[] getIpArp(java.lang.String ip, java.lang.String state) throws java.io.IOException;

	/**
	 * ARP blocked IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpArp(java.lang.String ip) throws java.io.IOException;

	/**
	 * Get all srcPort
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] getLoadBalancingServiceNamePortsRedirection(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Ip subnet used to send probes to your backends
	 * Facultative parameters ? false
	 * @param zone one of your ip loadbalancing's zone
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getLoadBalancingServiceNameProbeIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * WorkLight licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String[] getIpLicenseWorklight(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * WorkLight licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpLicenseWorklight(java.lang.String ip) throws java.io.IOException;




	/**
	 * List of backends you can attach to your IP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String[] getLoadBalancingServiceNameAllowedBackends(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Manage mitigation profile on your IPs
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpMitigationProfiles(java.lang.String ip) throws java.io.IOException;

	/**
	 * Cpanel licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String[] getIpLicenseCpanel(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Cpanel licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpLicenseCpanel(java.lang.String ip) throws java.io.IOException;

	/**
	 * Unblock this IP
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipBlocked your IP
	*/
	void postIpArpIpBlockedUnblock(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException;








	/**
	 * Reverse delegation on IPv6 subnet
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String[] getIpDelegation(java.lang.String ip) throws java.io.IOException;



	/**
	 * AntiDDOS option. Delete IP and rules from firewall
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnFirewall null
	*/
	java.lang.String deleteIpFirewallIpOnFirewall(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException;


	/**
	 * Task list associated with this IP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] getLoadBalancingServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

}
