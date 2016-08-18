package net.zyuiop.ovhapi.api.methods.cdn;

/**
 * A class to interact with OVH's /cdn/dedicated APIs
 */

public interface Dedicated { 


	/**
	 * Remove a backend IP
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param ip null
	*/
	java.lang.String deleteServiceNameDomainsDomainBackendsIp(java.lang.String serviceName, java.lang.String domain, java.lang.String ip) throws java.io.IOException;

	/**
	 * Task associated to the cache rule
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	 * @param cacheRuleId Id for this cache rule
	*/
	long[] getServiceNameDomainsDomainCacheRulesCacheRuleIdTasks(java.lang.String serviceName, java.lang.String domain, long cacheRuleId) throws java.io.IOException;



	/**
	 * Domains associated to this anycast
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	*/
	java.lang.String[] getServiceNameDomains(java.lang.String serviceName) throws java.io.IOException;




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
	 * Task associated to the domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	long[] getServiceNameDomainsDomainTasks(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;






	/**
	 * List of CDN Pops
	 * Facultative parameters ? false
	*/
	java.lang.String[] getPops() throws java.io.IOException;



	/**
	 * Backend associated to the domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN offer
	 * @param domain Domain of this object
	*/
	java.lang.String[] getServiceNameDomainsDomainBackends(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;






	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getCdnDedicated() throws java.io.IOException;


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

}
