package net.zyuiop.ovhapi.api.objects.dedicated.nastask;

/**
 * Storage task
 */

public interface Task { 

	/**
	 * @return id of the task
	 */
	long getTaskId(); 

	/**
	 * @return the name of your service
	 */
	java.lang.String getStorageName(); 

	/**
	 * @return The actual state of the task
	 */
	java.lang.String getStatus(); 

	/**
	 * @return information about operation
	 */
	java.lang.String getDetails(); 

	/**
	 * @return last modification of task
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Insertion of task in the todo
	 */
	java.util.Date getTodoDate(); 

	/**
	 * @return Task type of operation
	 */
	java.lang.String getOperation(); 

	/**
	 * @return the date when the task finished
	 */
	java.util.Date getDoneDate(); 

}
