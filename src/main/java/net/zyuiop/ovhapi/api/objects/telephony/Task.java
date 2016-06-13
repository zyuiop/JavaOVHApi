package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Operation on a telephony service
 */

public interface Task { 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return null
	 */
	long getTaskId(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	java.lang.String getAction(); 

	/**
	 * @return null
	 */
	java.lang.String getMessage(); 

}
