package net.zyuiop.ovhapi.api.objects.cloud.storage;

/**
 * Container
 */

public interface Container { 

	/**
	 * @return Total bytes stored
	 */
	long getStoredBytes(); 

	/**
	 * @return Storage name
	 */
	java.lang.String getName(); 

	/**
	 * @return 
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Storage id
	 */
	java.lang.String getId(); 

	/**
	 * @return Total objects stored
	 */
	long getStoredObjects(); 

}
