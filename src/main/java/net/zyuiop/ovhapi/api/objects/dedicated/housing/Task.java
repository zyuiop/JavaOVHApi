package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * Housing tasks
 */

public interface Task { 

	/**
	 * @return the id of the task
	 */
	long getTaskId(); 

	/**
	 * @return Function name
	 */
	java.lang.String getFunction(); 

	/**
	 * @return last update
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Details of this task
	 */
	java.lang.String getComment(); 

	/**
	 * @return Task status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Task Creation date
	 */
	java.util.Date getStartDate(); 

	/**
	 * @return Completion date
	 */
	java.util.Date getDoneDate(); 

}
