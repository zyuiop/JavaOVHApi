package net.zyuiop.ovhapi.api.objects.dedicated.nasha;

/**
 * Storage nas HA
 */

public interface Storage { 

	/**
	 * @return area of nas
	 */
	java.lang.String getDatacenter(); 

	/**
	 * @return True, if partition creation is allowed on this nas HA
	 */
	boolean getCanCreatePartition(); 

	/**
	 * @return Send an email to customer if any issue is detected
	 */
	boolean getMonitored(); 

	/**
	 * @return percentage of nas space used in %
	 */
	long getZpoolCapacity(); 

	/**
	 * @return Access ip of nas
	 */
	java.lang.String getIp(); 

	/**
	 * @return The storage service name
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return The name you give to the nas
	 */
	java.lang.String getCustomName(); 

	/**
	 * @return the size of the nas
	 */
	long getZpoolSize(); 

}
