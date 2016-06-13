package net.zyuiop.ovhapi.api.methods.cdn;

/**
 * A class to interact with OVH's /cdn/website APIs
 */

public interface Website { 

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param taskId null
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Task getServiceNameZoneTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Backend associated to this zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	java.lang.String getServiceNameZoneBackends(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Remove a backend from the zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param ipv4 null
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Task deleteServiceNameZoneBackendsIpv4(java.lang.String serviceName, java.lang.String ipv4) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param ipv4 null
	 * @param taskId null
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Task getServiceNameZoneBackendsIpv4TasksTaskId(java.lang.String serviceName, java.lang.String ipv4, long taskId) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getCdnWebsite() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Domain getServiceNameZoneDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param domain null
	 * @param taskId null
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Task getServiceNameZoneDomainsDomainTasksTaskId(java.lang.String serviceName, java.lang.String domain, long taskId) throws java.io.IOException;

	/**
	 * Domain associated to this zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	java.lang.String getServiceNameZoneDomains(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param ipv4 null
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Backend getServiceNameZoneBackendsIpv4(java.lang.String serviceName, java.lang.String ipv4) throws java.io.IOException;

	/**
	 * Remove a zone from the CDN
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Task deleteServiceNameZone(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Zone getServiceNameZone(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Task associated to this backend
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param ipv4 null
	*/
	long[] getServiceNameZoneBackendsIpv4Tasks(java.lang.String serviceName, java.lang.String ipv4) throws java.io.IOException;

	/**
	 * Flush all cache
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Task postServiceNameZoneDomainsDomainFlush(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get statistics about request on CDN, bandwidth value in Bytes
	 * Facultative parameters ? false
	 * @param period null
	 * @param value null
	 * @param type null
	 * @param serviceName The internal name of your CDN Website offer
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.StatsDataType getServiceNameZoneDomainsDomainStatistics(java.lang.String period, java.lang.String value, java.lang.String type, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Task associated to this domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param domain null
	*/
	long[] getServiceNameZoneDomainsDomainTasks(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Remove a domain from the CDN
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Task deleteServiceNameZoneDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Configure a backend on the zone
	 * Facultative parameters ? false
	 * @param ipv4 ip to configure on the zone
	 * @param serviceName The internal name of your CDN Website offer
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Task postServiceNameZoneBackends(java.lang.String ipv4, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your CDN Website offer
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Task associated to this zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	long[] getServiceNameZoneTasks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Configure a domain on CDN
	 * Facultative parameters ? false
	 * @param domain domain to add on CDN
	 * @param serviceName The internal name of your CDN Website offer
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Domain postServiceNameZoneDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Website getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Configure a zone on CDN
	 * Facultative parameters ? false
	 * @param zone zone DNS name to add on CDN
	 * @param serviceName The internal name of your CDN Website offer
	*/
	net.zyuiop.ovhapi.api.objects.cdn.website.Zone postServiceNameZone(java.lang.String zone, java.lang.String serviceName) throws java.io.IOException;

}
