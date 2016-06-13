package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Operation on a SMS service
 */

public interface Task { 

	/**
	 * @return null
	 */
	java.lang.String getStep(); 

	/**
	 * @return null
	 */
	long getTaskId(); 

	/**
	 * @return null
	 */
	java.lang.String getFunction(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

}
