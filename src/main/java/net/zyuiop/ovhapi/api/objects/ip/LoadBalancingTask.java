package net.zyuiop.ovhapi.api.objects.ip;

/**
 * List of tasks associated with your IP load balancing
 */

public interface LoadBalancingTask { 

	/**
	 * @return Creation date of your task
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Current status of your task
	 */
	java.lang.String getStatus(); 

	/**
	 * @return The action made
	 */
	java.lang.String getAction(); 

	/**
	 * @return Identifier of your task
	 */
	long getId(); 

}
