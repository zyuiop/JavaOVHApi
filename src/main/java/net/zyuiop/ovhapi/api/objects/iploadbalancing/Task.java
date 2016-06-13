package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Task of your iplb
 */

public interface Task { 

	/**
	 * @return Creation date of your task
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Current status of your task
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Task progress percentage
	 */
	long getProgress(); 

	/**
	 * @return The action made
	 */
	java.lang.String getAction(); 

	/**
	 * @return Id of the task
	 */
	long getId(); 

}
