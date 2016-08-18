package net.zyuiop.ovhapi.api.methods.cdn;

/**
 * A class to interact with OVH's /cdn/webstorage APIs
 */

public interface Webstorage { 

	/**
	 * Gives for customer credentials to accesss swift account
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Static offer
	*/
	net.zyuiop.ovhapi.api.objects.cdn.webstorage.AccountCredentials getServiceNameCredentials(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Static offer
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return stats about bandwidth consumption
	 * Facultative parameters ? false
	 * @param period null
	 * @param type null
	 * @param serviceName The internal name of your CDN Static offer
	*/
	net.zyuiop.ovhapi.api.objects.cdn.webstorage.StatsDataType[] getServiceNameStatistics(java.lang.String period, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your CDN Static offer
	*/
	net.zyuiop.ovhapi.api.objects.cdn.webstorage.Account getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your CDN Static offer
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getCdnWebstorage() throws java.io.IOException;

}
