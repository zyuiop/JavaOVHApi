package net.zyuiop.ovhapi.api.objects.cdn.website;

/**
 * Task on CDN
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
