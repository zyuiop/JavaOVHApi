package net.zyuiop.ovhapi.api.objects.vps.ip;

/**
 * Port and state of a service on an IP
 */

public interface ServiceStatusService { 

	/**
	 * @return null
	 */
	long getPort(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

}
