package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Operation on a Dedicated Cloud component
 */

public interface Task { 

	/**
	 * @return Maintenance task min allowed execution date
	 */
	java.util.Date getMaintenanceDateFrom(); 

	/**
	 * @return Task id
	 */
	long getTaskId(); 

	/**
	 * @return Maintenance task max allowed execution date
	 */
	java.util.Date getMaintenanceDateTo(); 

	/**
	 * @return Current progress
	 */
	long getProgress(); 

	/**
	 * @return Task name
	 */
	java.lang.String getName(); 

	/**
	 * @return Task last modification date
	 */
	java.util.Date getLastModificationDate(); 

	/**
	 * @return Current progress description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Current Task state
	 */
	java.lang.String getState(); 

	/**
	 * @return Task end date
	 */
	java.util.Date getEndDate(); 

	/**
	 * @return Task execution date
	 */
	java.util.Date getExecutionDate(); 

	/**
	 * @return Task type
	 */
	java.lang.String getType(); 

}
