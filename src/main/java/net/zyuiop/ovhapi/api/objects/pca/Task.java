package net.zyuiop.ovhapi.api.objects.pca;

/**
 * cloud archives tasks
 */

public interface Task { 

	/**
	 * @return Task function
	 */
	java.lang.String getFunction(); 

	/**
	 * @return Task comments
	 */
	java.lang.String getComment(); 

	/**
	 * @return Task status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Task date
	 */
	java.util.Date getTodoDate(); 

	/**
	 * @return Host used for task
	 */
	java.lang.String getIpAddress(); 

	/**
	 * @return Task ID
	 */
	java.lang.String getId(); 

	/**
	 * @return Task login
	 */
	java.lang.String getLogin(); 

}
