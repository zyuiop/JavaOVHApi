package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Domain tasks
 */

public interface DomainTask { 

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
	 * @return Domain of the task
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Comment about the task
	 */
	java.lang.String getComment(); 

	/**
	 * @return Last update date of the task
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Creation date of the task
	 */
	java.util.Date getCreationDate(); 

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
