package net.zyuiop.ovhapi.api.objects.router;

/**
 * Outgoing routes configured inside a Private Link
 */

public interface PrivateLinkRoute { 

	/**
	 * @return Network allowed to be routed outside
	 */
	java.lang.String getNetwork(); 

	/**
	 * @return null
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	long getId(); 

}
