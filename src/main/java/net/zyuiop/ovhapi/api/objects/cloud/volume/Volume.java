package net.zyuiop.ovhapi.api.objects.cloud.volume;

/**
 * Volume
 */

public interface Volume { 

	/**
	 * @return Volume attached to instances id
	 */
	java.lang.String getAttachedTo(); 

	/**
	 * @return Volume status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Volume name
	 */
	java.lang.String getName(); 

	/**
	 * @return Volume region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Volume description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Volume size (in GB)
	 */
	long getSize(); 

	/**
	 * @return Volume creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Volume id
	 */
	java.lang.String getId(); 

	/**
	 * @return Volume type
	 */
	java.lang.String getType(); 

	/**
	 * @return Volume bootable
	 */
	boolean getBootable(); 

}
