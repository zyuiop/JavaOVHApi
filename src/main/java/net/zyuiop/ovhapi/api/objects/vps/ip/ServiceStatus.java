package net.zyuiop.ovhapi.api.objects.vps.ip;

/**
 * Service states for an Ip
 */

public interface ServiceStatus { 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getDns(); 

	/**
	 * @return null
	 */
	java.lang.String getPing(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getHttp(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getHttps(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getSmtp(); 

	/**
	 * @return null
	 */
	java.lang.String getTools(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.vps.ip.ServiceStatusService getSsh(); 

}
