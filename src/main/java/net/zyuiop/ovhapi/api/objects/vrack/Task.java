package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * vrack tasks
 */

public interface Task { 

	/**
	 * @return null
	 */
	java.lang.String getFunction(); 

	/**
	 * @return null
	 */
	java.lang.String getTargetDomain(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return null
	 */
	long getOrderId(); 

	/**
	 * @return null
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return null
	 */
	java.util.Date getTodoDate(); 

	/**
	 * @return null
	 */
	long getId(); 

}
