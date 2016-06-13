package net.zyuiop.ovhapi.api.objects.ip;

/**
 * IP tasks
 */

public interface IpTask { 

	/**
	 * @return the id of the task
	 */
	long getTaskId(); 

	/**
	 * @return Function name
	 */
	java.lang.String getFunction(); 

	/**
	 * @return Task status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Destination for moveFloatingIp tasks
	 */
	net.zyuiop.ovhapi.api.objects.ip.RoutedTo getDestination(); 

	/**
	 * @return last update
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return Details of this task
	 */
	java.lang.String getComment(); 

	/**
	 * @return Task Creation date
	 */
	java.util.Date getStartDate(); 

	/**
	 * @return Completion date
	 */
	java.util.Date getDoneDate(); 

}
