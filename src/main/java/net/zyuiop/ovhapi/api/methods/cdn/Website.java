package net.zyuiop.ovhapi.api.methods.cdn;

/**
 * A class to interact with OVH's /cdn/website APIs
 */

public interface Website { 



	/**
	 * Task associated to this domain
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param domain null
	*/
	long[] getServiceNameZoneDomainsDomainTasks(java.lang.String serviceName, java.lang.String domain) throws java.io.IOException;



	/**
	 * Task associated to this zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	long[] getServiceNameZoneTasks(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Task associated to this backend
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	 * @param ipv4 null
	*/
	long[] getServiceNameZoneBackendsIpv4Tasks(java.lang.String serviceName, java.lang.String ipv4) throws java.io.IOException;




	/**
	 * Domain associated to this zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	java.lang.String[] getServiceNameZoneDomains(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Backend associated to this zone
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Website offer
	*/
	java.lang.String[] getServiceNameZoneBackends(java.lang.String serviceName) throws java.io.IOException;







	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getCdnWebsite() throws java.io.IOException;

}
