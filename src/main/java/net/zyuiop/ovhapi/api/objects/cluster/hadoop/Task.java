package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Operation on a Hadoop Cluster component
 */

public interface Task { 

	/**
	 * @return null
	 */
	long getTaskId(); 

	/**
	 * @return Current Task state
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Operation name
	 */
	java.lang.String getName(); 

}
