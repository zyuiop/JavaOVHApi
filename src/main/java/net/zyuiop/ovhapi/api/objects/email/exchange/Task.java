package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange task details
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
	 * @return Creation date
	 */
	java.util.Date getTodoDate(); 

	/**
	 * @return Completion date
	 */
	java.util.Date getFinishDate(); 

	/**
	 * @return Task id
	 */
	long getId(); 

}
