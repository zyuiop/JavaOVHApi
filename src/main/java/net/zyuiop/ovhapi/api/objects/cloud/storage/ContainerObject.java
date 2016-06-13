package net.zyuiop.ovhapi.api.objects.cloud.storage;

/**
 * ContainerObject
 */

public interface ContainerObject { 

	/**
	 * @return Last modification date
	 */
	java.util.Date getLastModified(); 

	/**
	 * @return Object name
	 */
	java.lang.String getName(); 

	/**
	 * @return Object content type
	 */
	java.lang.String getContentType(); 

	/**
	 * @return Object size
	 */
	long getSize(); 

}
