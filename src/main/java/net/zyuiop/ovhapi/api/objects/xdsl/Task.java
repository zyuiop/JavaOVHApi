package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Describes the current status of a task
 */

public interface Task { 

	/**
	 * @return null
	 */
	java.lang.String getFunction(); 

	/**
	 * @return null
	 */
	java.util.Date getUpdateDate(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	long getId(); 

}
