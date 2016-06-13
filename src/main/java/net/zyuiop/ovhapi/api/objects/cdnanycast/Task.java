package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * Task on a CDN
 */

public interface Task { 

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
	java.lang.String getComment(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

}
