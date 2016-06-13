package net.zyuiop.ovhapi.api.objects.cloud.image;

/**
 * Image
 */

public interface Image { 

	/**
	 * @return Image visibility
	 */
	java.lang.String getVisibility(); 

	/**
	 * @return Image status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Image name
	 */
	java.lang.String getName(); 

	/**
	 * @return Image region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Minimum disks required to use image
	 */
	long getMinDisk(); 

	/**
	 * @return Image creation date
	 */
	java.lang.String getCreationDate(); 

	/**
	 * @return Minimum RAM required to use image
	 */
	long getMinRam(); 

	/**
	 * @return User to connect with
	 */
	java.lang.String getUser(); 

	/**
	 * @return Image type
	 */
	java.lang.String getType(); 

	/**
	 * @return Image id
	 */
	java.lang.String getId(); 

}
