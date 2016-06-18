package net.zyuiop.ovhapi.api.objects.cloud.storage;

/**
 * ContainerDetail
 */

public interface ContainerDetail { 

	/**
	 * @return Objects stored in container
	 */
	net.zyuiop.ovhapi.api.objects.cloud.storage.ContainerObject[] getObjects(); 

	/**
	 * @return Total bytes stored
	 */
	long getStoredBytes(); 

	/**
	 * @return Container name
	 */
	java.lang.String getName(); 

	/**
	 * @return Public container
	 */
	boolean getPublic(); 

	/**
	 * @return Container region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Total objects stored
	 */
	long getStoredObjects(); 

	/**
	 * @return Container static URL
	 */
	java.lang.String getStaticUrl(); 

}
