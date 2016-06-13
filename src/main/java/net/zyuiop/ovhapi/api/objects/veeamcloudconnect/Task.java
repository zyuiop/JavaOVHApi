package net.zyuiop.ovhapi.api.objects.veeamcloudconnect;

/**
 * Operation with the Cloud Tenant Account
 */

public interface Task { 

	/**
	 * @return null
	 */
	long getTaskId(); 

	/**
	 * @return Current progress
	 */
	long getProgress(); 

	/**
	 * @return When was this Task done
	 */
	java.util.Date getEndDate(); 

	/**
	 * @return Task name
	 */
	java.lang.String getName(); 

	/**
	 * @return When the task has been created
	 */
	java.util.Date getStartDate(); 

	/**
	 * @return Current Task state
	 */
	java.lang.String getState(); 

}
