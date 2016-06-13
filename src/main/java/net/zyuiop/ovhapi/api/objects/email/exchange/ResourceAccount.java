package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange resource account
 */

public interface ResourceAccount { 

	/**
	 * @return resource as email
	 */
	java.lang.String getResourceEmailAddress(); 

	/**
	 * @return resource can be scheduled by more than one person during the same time period
	 */
	boolean getAllowConflict(); 

	/**
	 * @return number of the same equipment or capacity of a room
	 */
	long getCapacity(); 

	/**
	 * @return account state
	 */
	java.lang.String getState(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return resource type
	 */
	java.lang.String getType(); 

	/**
	 * @return task pending id
	 */
	long getTaskPendingId(); 

	/**
	 * @return name of resource
	 */
	java.lang.String getDisplayName(); 

}
