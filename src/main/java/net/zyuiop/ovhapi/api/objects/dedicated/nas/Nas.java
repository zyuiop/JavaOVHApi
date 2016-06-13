package net.zyuiop.ovhapi.api.objects.dedicated.nas;

/**
 * Storage nas
 */

public interface Nas { 

	/**
	 * @return area of nas
	 */
	java.lang.String getDatacenter(); 

	/**
	 * @return True, if partition creation is allowed on this nas
	 */
	boolean getCanCreatePartition(); 

	/**
	 * @return The storage mount path
	 */
	java.lang.String getMountPath(); 

	/**
	 * @return The name you give to the nas
	 */
	java.lang.String getCustomName(); 

	/**
	 * @return Access ip of nas
	 */
	java.lang.String getIp(); 

	/**
	 * @return The storage service name
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return the size of the nas
	 */
	long getZpoolSize(); 

}
