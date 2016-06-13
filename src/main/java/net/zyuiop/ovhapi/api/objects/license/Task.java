package net.zyuiop.ovhapi.api.objects.license;

/**
 * licenses Todos
 */

public interface Task { 

	/**
	 * @return This Task id
	 */
	long getTaskId(); 

	/**
	 * @return The last time this Task was updated
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Current Taks status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return When was this Task created
	 */
	java.util.Date getTodoDate(); 

	/**
	 * @return This Task description
	 */
	java.lang.String getAction(); 

	/**
	 * @return This Task name
	 */
	java.lang.String getName(); 

	/**
	 * @return When was this Task done
	 */
	java.util.Date getDoneDate(); 

}
