package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Tasks
 */

public interface Task { 

	/**
	 * @return Function name
	 */
	java.lang.String getFunction(); 

	/**
	 * @return Task status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return DumpId on which the task is working
	 */
	long getDumpId(); 

	/**
	 * @return Database name on which the task is working
	 */
	java.lang.String getDatabaseName(); 

	/**
	 * @return Last update
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return The id of the task
	 */
	long getId(); 

	/**
	 * @return User name on which the task is working
	 */
	java.lang.String getUserName(); 

	/**
	 * @return Task Creation date
	 */
	java.util.Date getStartDate(); 

	/**
	 * @return Completion date
	 */
	java.util.Date getDoneDate(); 

}
