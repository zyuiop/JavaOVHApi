package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Scheduled action before the next renewal of the service
 */

public interface PendingAction { 

	/**
	 * @return null
	 */
	java.util.Date getDateTodo(); 

	/**
	 * @return null
	 */
	java.lang.String getAction(); 

}
