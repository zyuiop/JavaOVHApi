package net.zyuiop.ovhapi.api.objects.router;

/**
 * Private Link to another service
 */

public interface PrivateLink { 

	/**
	 * @return Service name of the other side of this link
	 */
	java.lang.String getPeerServiceName(); 

	/**
	 * @return null
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Your memory-friendly name of this private link
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	long getId(); 

}
