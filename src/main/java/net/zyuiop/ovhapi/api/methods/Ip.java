package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /ip APIs
 */

public interface Ip { 

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param ip null
	*/
	void putIpRipe(net.zyuiop.ovhapi.api.objects.ip.RipeInfos param0, java.lang.String ip) throws java.io.IOException;

	/**
	 * Ip spamming
	 * Facultative parameters ? true
	 * @param ip null
	 * @param state Filter the value of state property (=)
	*/
	java.lang.String getIpSpam(java.lang.String ip, java.lang.String state) throws java.io.IOException;

	/**
	 * Ip spamming
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpSpam(java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnMitigation null
	*/
	net.zyuiop.ovhapi.api.objects.ip.MitigationIp getIpMitigationIpOnMitigation(java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException;

	/**
	 * Manage mitigation profile on your IPs
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpMitigationProfiles(java.lang.String ip) throws java.io.IOException;

	/**
	 * Delete mitigation profile
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipMitigationProfile null
	*/
	void deleteIpMitigationProfilesIpMitigationProfile(java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException;

	/**
	 * Unblock this IP
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipBlocked your IP
	*/
	void postIpAntihackIpBlockedUnblock(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnGame null
	*/
	net.zyuiop.ovhapi.api.objects.ip.GameMitigation getIpGameIpOnGame(java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipReverse null
	*/
	net.zyuiop.ovhapi.api.objects.ip.ReverseIp getIpReverseIpReverse(java.lang.String ip, java.lang.String ipReverse) throws java.io.IOException;

	/**
	 * IDs of rules configured for this IP
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnGame null
	*/
	long[] getIpGameIpOnGameRule(java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException;


	/**
	 * Unblock this IP
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipBlocked your IP
	*/
	void postIpArpIpBlockedUnblock(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException;

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
	 * Generate a migration token
	 * Facultative parameters ? false
	 * @param customerId destination customer ID
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.IpMigrationToken postIpMigrationToken(java.lang.String customerId, java.lang.String ip) throws java.io.IOException;

	/**
	 * AntiDDOS option. Add new IP on permanent mitigation
	 * Facultative parameters ? false
	 * @param ipOnMitigation null
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.MitigationIp postIpMitigation(java.lang.String ipOnMitigation, java.lang.String ip) throws java.io.IOException;


	/**
	 * Anti-Hack blocked IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param state Filter the value of state property (=)
	*/
	java.lang.String getIpAntihack(java.lang.String ip, java.lang.String state) throws java.io.IOException;

	/**
	 * Anti-Hack blocked IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpAntihack(java.lang.String ip) throws java.io.IOException;

	/**
	 * Ip subnet used by OVH to nat requests on your ip lb to your backends. You must ensure that your backends are not part of a network that overlap with this one.
	 * Facultative parameters ? false
	 * @param zone one of your ip loadbalancing's zone
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String getLoadBalancingServiceNameInternalNatIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Windows licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String getIpLicenseWindows(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Windows licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpLicenseWindows(java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.Ip getIp(java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.RipeInfos getIpRipe(java.lang.String ip) throws java.io.IOException;

	/**
	 * Park this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.IpTask postIpPark(java.lang.String ip) throws java.io.IOException;

	/**
	 * AntiDDOS option. Delete IP and rules from firewall
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnFirewall null
	*/
	java.lang.String deleteIpFirewallIpOnFirewall(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param ip null
	 * @param ipOnFirewall null
	*/
	void putIpFirewallIpOnFirewall(net.zyuiop.ovhapi.api.objects.ip.FirewallIp param0, java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException;

	/**
	 * Change organisation of this IP
	 * Facultative parameters ? false
	 * @param organisation Your organisation id (RIPE_XXXX) to add on block informations
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.IpTask postIpChangeOrg(java.lang.String organisation, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipSpamming IP address which is sending spam
	*/
	net.zyuiop.ovhapi.api.objects.ip.SpamIp getIpSpamIpSpamming(java.lang.String ip, java.lang.String ipSpamming) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnFirewall null
	*/
	net.zyuiop.ovhapi.api.objects.ip.FirewallIp getIpFirewallIpOnFirewall(java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException;

	/**
	 * Release the ip from anti-spam system
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipSpamming IP address which is sending spam
	*/
	net.zyuiop.ovhapi.api.objects.ip.SpamIp postIpSpamIpSpammingUnblock(java.lang.String ip, java.lang.String ipSpamming) throws java.io.IOException;


	/**
	 * Plesk licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String getIpLicensePlesk(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Plesk licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpLicensePlesk(java.lang.String ip) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your IP load balancing
	*/
	void putLoadBalancingServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param ip null
	 * @param ipOnMitigation null
	*/
	void putIpMitigationIpOnMitigation(net.zyuiop.ovhapi.api.objects.ip.MitigationIp param0, java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingIp getLoadBalancingServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a failover IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.IpTask postIpTerminate(java.lang.String ip) throws java.io.IOException;

	/**
	 * Reverse on your ip
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpReverse(java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param backend IP of your backend
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingBackendIp getLoadBalancingServiceNameBackendBackend(java.lang.String serviceName, java.lang.String backend) throws java.io.IOException;

	/**
	 * AntiDDOS option. Delete rule
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnFirewall null
	 * @param sequence null
	*/
	net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule deleteIpFirewallIpOnFirewallRuleSequence(java.lang.String ip, java.lang.String ipOnFirewall, long sequence) throws java.io.IOException;

	/**
	 * Set Stickiness type. 'ipSource' will stick clients to a backend by their source ip, 'cookie' will stick them by inserting a cookie, 'none' is to set no stickiness
	 * Facultative parameters ? false
	 * @param stickiness The stickiness you want on your IP LoadBalancing
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameStickiness(java.lang.String stickiness, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a reverse on one IP
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipReverse null
	*/
	void deleteIpReverseIpReverse(java.lang.String ip, java.lang.String ipReverse) throws java.io.IOException;

	/**
	 * WorkLight licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String getIpLicenseWorklight(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * WorkLight licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpLicenseWorklight(java.lang.String ip) throws java.io.IOException;

	/**
	 * Ip under game anti-ddos
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpGame(java.lang.String ip) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your IP load balancing
	 * @param backend IP of your backend
	*/
	void putLoadBalancingServiceNameBackendBackend(net.zyuiop.ovhapi.api.objects.ip.LoadBalancingBackendIp param0, java.lang.String serviceName, java.lang.String backend) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipMitigationProfile null
	*/
	net.zyuiop.ovhapi.api.objects.ip.MitigationProfile getIpMitigationProfilesIpMitigationProfile(java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException;

	/**
	 * Get all srcPort
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] getLoadBalancingServiceNamePortsRedirection(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add reverse on an ip
	 * Facultative parameters ? false
	 * @param ipReverse null
	 * @param reverse null
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.ReverseIp postIpReverse(java.lang.String ipReverse, java.lang.String reverse, java.lang.String ip) throws java.io.IOException;

	/**
	 * Ip subnet used to send probes to your backends
	 * Facultative parameters ? false
	 * @param zone one of your ip loadbalancing's zone
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String getLoadBalancingServiceNameProbeIp(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param ip null
	 * @param ipMitigationProfile null
	*/
	void putIpMitigationProfilesIpMitigationProfile(net.zyuiop.ovhapi.api.objects.ip.MitigationProfile param0, java.lang.String ip, java.lang.String ipMitigationProfile) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param taskId Identifier of your task
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask getLoadBalancingServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Create new profile for one of your ip
	 * Facultative parameters ? false
	 * @param ipMitigationProfile null
	 * @param autoMitigationTimeOut Delay to wait before remove ip from auto mitigation after an attack
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.MitigationProfile postIpMitigationProfiles(java.lang.String ipMitigationProfile, long autoMitigationTimeOut, java.lang.String ip) throws java.io.IOException;

	/**
	 * AntiDDOS option. Delete IP from mitigation
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnMitigation null
	*/
	net.zyuiop.ovhapi.api.objects.ip.MitigationIp deleteIpMitigationIpOnMitigation(java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param id Internal ID of the phishing entry
	*/
	net.zyuiop.ovhapi.api.objects.ip.Antiphishing getIpPhishingId(java.lang.String ip, long id) throws java.io.IOException;

	/**
	 * SQL Server licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String getIpLicenseSqlserver(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * SQL Server licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpLicenseSqlserver(java.lang.String ip) throws java.io.IOException;

	/**
	 * Add target for reverse delegation on IPv6 subnet
	 * Facultative parameters ? false
	 * @param target Target for reverse delegation on IPv6
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.ReverseDelegation postIpDelegation(java.lang.String target, java.lang.String ip) throws java.io.IOException;

	/**
	 * DirectAdmin licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String getIpLicenseDirectadmin(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * DirectAdmin licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpLicenseDirectadmin(java.lang.String ip) throws java.io.IOException;


	/**
	 * AntiDDOS option. Add new rule on your IP
	 * Facultative parameters ? false
	 * @param protocol Network protocol
	 * @param sequence Sequence number of your rule
	 * @param action Action on this rule
	 * @param ip null
	 * @param ipOnFirewall null
	*/
	net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule postIpFirewallIpOnFirewallRule(java.lang.String protocol, long sequence, java.lang.String action, java.lang.String ip, java.lang.String ipOnFirewall) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param target NS target for delegation
	*/
	net.zyuiop.ovhapi.api.objects.ip.ReverseDelegation getIpDelegationTarget(java.lang.String ip, java.lang.String target) throws java.io.IOException;

	/**
	 * Your OVH IPs
	 * Facultative parameters ? true
	 * @param ip Filter the value of ip property (contains or equals)
	 * @param routedTo.serviceName Filter the value of routedTo.serviceName property (like)
	 * @param type Filter the value of type property (=)
	 * @param description Filter the value of description property (like)
	*/
	java.lang.String getIp(java.lang.String ip, java.lang.String routedToServiceName, java.lang.String type, java.lang.String description) throws java.io.IOException;

	/**
	 * Your OVH IPs
	 * Facultative parameters ? false
	*/
	java.lang.String getIp() throws java.io.IOException;

	/**
	 * Import your own ssl certificate on your IP load balancing. Ssl option is needed to use this url.
	 * Facultative parameters ? true
	 * @param certificate certificate
	 * @param key certificate key
	 * @param serviceName The internal name of your IP load balancing
	 * @param chain certificate chain
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameImportCustomSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException;

	/**
	 * Import your own ssl certificate on your IP load balancing. Ssl option is needed to use this url.
	 * Facultative parameters ? false
	 * @param certificate certificate
	 * @param key certificate key
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameImportCustomSsl(java.lang.String certificate, java.lang.String key, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Set the weight of a backend. For instance, if backend A has a weight of 8 and backup B was a weight of 16, backend B will receive twice more connections as backend A. Backends must be on the same POP for the weight parameter to take effect between them.
	 * Facultative parameters ? false
	 * @param weight weight of the backend, must be between 1 and 100, default is 8
	 * @param serviceName The internal name of your IP load balancing
	 * @param backend IP of your backend
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackendBackendSetWeight(long weight, java.lang.String serviceName, java.lang.String backend) throws java.io.IOException;

	/**
	 * Task list associated with this IP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	long[] getLoadBalancingServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * AntiDDOS option. Get statistics about your traffic in and out during this mitigation
	 * Facultative parameters ? false
	 * @param to End date
	 * @param from Start date
	 * @param scale Scale of aggregation
	 * @param ip null
	 * @param ipOnMitigation null
	*/
	net.zyuiop.ovhapi.api.objects.ip.MitigationStats getIpMitigationIpOnMitigationStats(java.util.Date to, java.util.Date from, java.lang.String scale, java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException;

	/**
	 * AntiDDOS option. Get top stream on your ip on a specific timestamp
	 * Facultative parameters ? false
	 * @param date Date to view top traffic
	 * @param scale Scale of aggregation
	 * @param ip null
	 * @param ipOnMitigation null
	*/
	net.zyuiop.ovhapi.api.objects.ip.MitigationDetailedStats getIpMitigationIpOnMitigationTopStream(java.util.Date date, java.lang.String scale, java.lang.String ip, java.lang.String ipOnMitigation) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param taskId the id of the task
	*/
	net.zyuiop.ovhapi.api.objects.ip.IpTask getIpTaskTaskId(java.lang.String ip, long taskId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipOnFirewall null
	 * @param sequence null
	*/
	net.zyuiop.ovhapi.api.objects.ip.FirewallNetworkRule getIpFirewallIpOnFirewallRuleSequence(java.lang.String ip, java.lang.String ipOnFirewall, long sequence) throws java.io.IOException;

	/**
	 * Remove a backend IP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param backend IP of your backend
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask deleteLoadBalancingServiceNameBackendBackend(java.lang.String serviceName, java.lang.String backend) throws java.io.IOException;

	/**
	 * Delete a target for reverse delegation on IPv6 subnet
	 * Facultative parameters ? false
	 * @param ip null
	 * @param target NS target for delegation
	*/
	void deleteIpDelegationTarget(java.lang.String ip, java.lang.String target) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.IpMigrationToken getIpMigrationToken(java.lang.String ip) throws java.io.IOException;

	/**
	 * Ip under mitigation
	 * Facultative parameters ? true
	 * @param ip null
	 * @param auto Filter the value of auto property (=)
	 * @param state Filter the value of state property (=)
	*/
	java.lang.String getIpMitigation(java.lang.String ip, boolean auto, java.lang.String state) throws java.io.IOException;

	/**
	 * Ip under mitigation
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpMitigation(java.lang.String ip) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getLoadBalancing() throws java.io.IOException;

	/**
	 * Cpanel licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String getIpLicenseCpanel(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Cpanel licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpLicenseCpanel(java.lang.String ip) throws java.io.IOException;


	/**
	 * Move this IP to another service
	 * Facultative parameters ? false
	 * @param to Service destination
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.IpTask postIpMove(java.lang.String to, java.lang.String ip) throws java.io.IOException;

	/**
	 * Add a new backend on your IP load balancing
	 * Facultative parameters ? true
	 * @param ipBackend IP of your backend
	 * @param probe The type of probe used
	 * @param serviceName The internal name of your IP load balancing
	 * @param weight Weight of the backend on its zone, must be between 1 and 100
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackend(java.lang.String ipBackend, java.lang.String probe, java.lang.String serviceName, long weight) throws java.io.IOException;

	/**
	 * Add a new backend on your IP load balancing
	 * Facultative parameters ? false
	 * @param ipBackend IP of your backend
	 * @param probe The type of probe used
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackend(java.lang.String ipBackend, java.lang.String probe, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete a port redirection
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	 * @param srcPort The port you want to redirect from
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask deleteLoadBalancingServiceNamePortsRedirectionSrcPort(java.lang.String serviceName, long srcPort) throws java.io.IOException;

	/**
	 * AntiDDOS option. Add new IP on firewall
	 * Facultative parameters ? false
	 * @param ipOnFirewall null
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.ip.FirewallIp postIpFirewall(java.lang.String ipOnFirewall, java.lang.String ip) throws java.io.IOException;

	/**
	 * Backends for this IP load balancing
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String getLoadBalancingServiceNameBackend(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipBlocked your IP
	*/
	net.zyuiop.ovhapi.api.objects.ip.BlockedIp getIpAntihackIpBlocked(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException;

	/**
	 * Reverse delegation on IPv6 subnet
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpDelegation(java.lang.String ip) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getLoadBalancingServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Restore OVH' ssl certificate on your IP load balancing. Ssl option is needed to use this url. (A DCV mail will be sent to postmaster@your-domain.abc)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameRestoreSsl(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get statistics about the email traffic
	 * Facultative parameters ? false
	 * @param to End date
	 * @param from Start date
	 * @param ip null
	 * @param ipSpamming IP address which is sending spam
	*/
	net.zyuiop.ovhapi.api.objects.ip.SpamStats getIpSpamIpSpammingStats(java.util.Date to, java.util.Date from, java.lang.String ip, java.lang.String ipSpamming) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ip null
	 * @param ipBlocked your IP
	*/
	net.zyuiop.ovhapi.api.objects.ip.ArpBlockedIp getIpArpIpBlocked(java.lang.String ip, java.lang.String ipBlocked) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param ip null
	*/
	void putIp(net.zyuiop.ovhapi.api.objects.ip.Ip param0, java.lang.String ip) throws java.io.IOException;

	/**
	 * Ip under firewall
	 * Facultative parameters ? true
	 * @param ip null
	 * @param state Filter the value of state property (=)
	 * @param enabled Filter the value of enabled property (=)
	*/
	java.lang.String getIpFirewall(java.lang.String ip, java.lang.String state, boolean enabled) throws java.io.IOException;

	/**
	 * Ip under firewall
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpFirewall(java.lang.String ip) throws java.io.IOException;

	/**
	 * ARP blocked IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param state Filter the value of state property (=)
	*/
	java.lang.String getIpArp(java.lang.String ip, java.lang.String state) throws java.io.IOException;

	/**
	 * ARP blocked IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpArp(java.lang.String ip) throws java.io.IOException;

	/**
	 * Virtuozzo licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String getIpLicenseVirtuozzo(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Virtuozzo licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpLicenseVirtuozzo(java.lang.String ip) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param ip null
	 * @param ipOnGame null
	*/
	void putIpGameIpOnGame(net.zyuiop.ovhapi.api.objects.ip.GameMitigation param0, java.lang.String ip, java.lang.String ipOnGame) throws java.io.IOException;

	/**
	 * List of backends you can attach to your IP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your IP load balancing
	*/
	java.lang.String getLoadBalancingServiceNameAllowedBackends(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Set or unset the backend as a backup of another backend. Requests will be directed to the backup only if the main backend is in probe fail
	 * Facultative parameters ? true
	 * @param backupStateSet Set or unset the backend as backup. mainBackendIp is optional in case of unset
	 * @param serviceName The internal name of your IP load balancing
	 * @param backend IP of your backend
	 * @param mainBackendIp Main backend ip, must be in the same zone as the backup
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackendBackendBackupState(boolean backupStateSet, java.lang.String serviceName, java.lang.String backend, java.lang.String mainBackendIp) throws java.io.IOException;

	/**
	 * Set or unset the backend as a backup of another backend. Requests will be directed to the backup only if the main backend is in probe fail
	 * Facultative parameters ? false
	 * @param backupStateSet Set or unset the backend as backup. mainBackendIp is optional in case of unset
	 * @param serviceName The internal name of your IP load balancing
	 * @param backend IP of your backend
	*/
	net.zyuiop.ovhapi.api.objects.ip.LoadBalancingTask postLoadBalancingServiceNameBackendBackendBackupState(boolean backupStateSet, java.lang.String serviceName, java.lang.String backend) throws java.io.IOException;

	/**
	 * Cloud Linux licenses associated to this IP
	 * Facultative parameters ? true
	 * @param ip null
	 * @param ipAddress Filter the value of ipAddress property (=)
	*/
	java.lang.String getIpLicenseCloudLinux(java.lang.String ip, java.lang.String ipAddress) throws java.io.IOException;

	/**
	 * Cloud Linux licenses associated to this IP
	 * Facultative parameters ? false
	 * @param ip null
	*/
	java.lang.String getIpLicenseCloudLinux(java.lang.String ip) throws java.io.IOException;

}
