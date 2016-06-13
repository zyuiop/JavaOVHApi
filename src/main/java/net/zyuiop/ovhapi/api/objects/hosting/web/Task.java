package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Tasks
 */

public interface Task { 

	/**
	 * @return Function name
	 */
	java.lang.String getFunction(); 

	/**
	 * @return last update
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Task status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return the id of the task
	 */
	long getId(); 

	/**
	 * @return Task Creation date
	 */
	java.util.Date getStartDate(); 

	/**
	 * @return Completion date
	 */
	java.util.Date getDoneDate(); 

}
