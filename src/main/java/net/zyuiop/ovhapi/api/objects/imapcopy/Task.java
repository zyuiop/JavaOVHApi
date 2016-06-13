package net.zyuiop.ovhapi.api.objects.imapcopy;

/**
 * Task of ImapCopy
 */

public interface Task { 

	/**
	 * @return Last update of task
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Status of task
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Creation date of task
	 */
	java.util.Date getTodoDate(); 

	/**
	 * @return Finished date of task
	 */
	java.util.Date getFinishDate(); 

	/**
	 * @return Id of task
	 */
	long getId(); 

	/**
	 * @return Return message of task
	 */
	java.lang.String getReturn(); 

}
