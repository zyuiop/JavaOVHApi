package net.zyuiop.ovhapi.api.methods.cdn;

/**
 * A class to interact with OVH's /cdn/dedicated APIs
 */

public interface Dedicated { 

	/**
	 * Add a cache rule to a domain
	 * Facultative parameters ? false
	 * @param cacheType Type of cache rule to add to the domain
	 * @param ttl ttl for cache rule to add to the domain
	 * @param fileMatch File match for cache rule to add to the domain
	 * @param fileType File type for cache rule to add to the domain
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule postServiceNameDomainsDomainCacheRules(java.lang.String cacheType, long ttl, java.lang.String fileMatch, java.lang.String fileType, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param cacheRuleId Id for this cache rule
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule getServiceNameDomainsDomainCacheRulesCacheRuleId(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException;

	/**
	 * Remove cache rule
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param cacheRuleId Id for this cache rule
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task deleteServiceNameDomainsDomainCacheRulesCacheRuleId(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Domain getServiceNameDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Domains associated to this anycast
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	*/
	java.lang.String[] getServiceNameDomains(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Anycast getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return quota history
	 * Facultative parameters ? false
	 * @param period null
	 * @param serviceName The internal name of your CDN offer
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.StatsDataType[] getServiceNameQuota(java.lang.String period, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a backend IP
	 * Facultative parameters ? false
	 * @param ip IP to add to backends list
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Backend postServiceNameDomainsDomainBackends(java.lang.String ip, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param cacheRuleId Id for this cache rule
	 * @param taskId null
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task getServiceNameDomainsDomainCacheRulesCacheRuleIdTasksTaskId(java.lang.String serviceName, java.lang.String domain, long cacheRuleId, long taskId) throws java.io.IOException;

	/**
	 * Remove SSL of the CDN
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task deleteServiceNameSsl(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return stats about a domain
	 * Facultative parameters ? false
	 * @param period null
	 * @param value null
	 * @param type null
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.StatsDataType[] getServiceNameDomainsDomainStatistics(java.lang.String period, java.lang.String value, java.lang.String type, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param cacheRuleId Id for this cache rule
	*/
	void putServiceNameDomainsDomainCacheRulesCacheRuleId(net.zyuiop.ovhapi.api.objects.cdnanycast.CacheRule param0, java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param name Name of the pop
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Pop getPopsName(java.lang.String name) throws java.io.IOException;

	/**
	 * Flush all cache
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameDomainsDomainFlush(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Task associated to the ssl
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your CDN offer
	 * @param function Filter the value of function property (=)
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameSslTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * Task associated to the ssl
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	*/
	long[] getServiceNameSslTasks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getCdnDedicated() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param ip null
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Backend getServiceNameDomainsDomainBackendsIp(java.lang.String serviceName, java.lang.String domain, java.lang.String ip) throws java.io.IOException;

	/**
	 * Add a domain on CDN
	 * Facultative parameters ? false
	 * @param domain domain name to add on CDN
	 * @param serviceName The internal name of your CDN offer
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Domain postServiceNameDomains(java.lang.String domain, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Task associated to the domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	long[] getServiceNameDomainsDomainTasks(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	void putServiceNameDomainsDomain(net.zyuiop.ovhapi.api.objects.cdnanycast.Domain param0, java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Cache rules associated to the domain
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param fileMatch Filter the value of fileMatch property (like)
	*/
	long[] getServiceNameDomainsDomainCacheRules(java.lang.String serviceName, java.lang.String domain, java.lang.String fileMatch) throws java.io.IOException;

	/**
	 * Cache rules associated to the domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	long[] getServiceNameDomainsDomainCacheRules(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Add a SSL on CDN
	 * Facultative parameters ? true
	 * @param certificate certificate
	 * @param name ssl name to add on CDN
	 * @param key certificate key
	 * @param serviceName The internal name of your CDN offer
	 * @param chain certificate chain
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String name, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException;

	/**
	 * Add a SSL on CDN
	 * Facultative parameters ? false
	 * @param certificate certificate
	 * @param name ssl name to add on CDN
	 * @param key certificate key
	 * @param serviceName The internal name of your CDN offer
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl postServiceNameSsl(java.lang.String certificate, java.lang.String name, java.lang.String key, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Remove a domain from the CDN
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task deleteServiceNameDomainsDomain(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Remove a backend IP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param ip null
	*/
	java.lang.String deleteServiceNameDomainsDomainBackendsIp(java.lang.String serviceName, java.lang.String domain, java.lang.String ip) throws java.io.IOException;

	/**
	 * List of CDN Pops
	 * Facultative parameters ? false
	*/
	java.lang.String[] getPops() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Ssl getServiceNameSsl(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Flush the cache
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param cacheRuleId Id for this cache rule
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameDomainsDomainCacheRulesCacheRuleIdFlush(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException;

	/**
	 * Task associated to the cache rule
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param cacheRuleId Id for this cache rule
	*/
	long[] getServiceNameDomainsDomainCacheRulesCacheRuleIdTasks(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param taskId null
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task getServiceNameDomainsDomainTasksTaskId(java.lang.String serviceName, java.lang.String domain, long taskId) throws java.io.IOException;

	/**
	 * Backend associated to the domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	java.lang.String[] getServiceNameDomainsDomainBackends(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your CDN offer
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Update an existing SSL
	 * Facultative parameters ? true
	 * @param certificate certificate
	 * @param key certificate key
	 * @param serviceName The internal name of your CDN offer
	 * @param chain certificate chain
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameSslUpdate(java.lang.String certificate, java.lang.String key, java.lang.String serviceName, java.lang.String chain) throws java.io.IOException;

	/**
	 * Update an existing SSL
	 * Facultative parameters ? false
	 * @param certificate certificate
	 * @param key certificate key
	 * @param serviceName The internal name of your CDN offer
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task postServiceNameSslUpdate(java.lang.String certificate, java.lang.String key, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param taskId null
	*/
	net.zyuiop.ovhapi.api.objects.cdnanycast.Task getServiceNameSslTasksTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

}
