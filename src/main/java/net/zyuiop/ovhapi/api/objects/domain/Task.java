package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Tasks associated to domain
 */

public interface Task { 

	/**
	 * @return Function of the task
	 */
	java.lang.String getFunction(); 

	/**
	 * @return Status of the task
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Can accelerate the task
	 */
	boolean getCanAccelerate(); 

	/**
	 * @return Last update date of the task
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Creation date of the task
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Comment about the task
	 */
	java.lang.String getComment(); 

	/**
	 * @return Todo date of the task
	 */
	java.util.Date getTodoDate(); 

	/**
	 * @return Id of the task
	 */
	long getId(); 

	/**
	 * @return Can cancel the task
	 */
	boolean getCanCancel(); 

	/**
	 * @return Done date of the task
	 */
	java.util.Date getDoneDate(); 

	/**
	 * @return Can relaunch the task
	 */
	boolean getCanRelaunch(); 

}
