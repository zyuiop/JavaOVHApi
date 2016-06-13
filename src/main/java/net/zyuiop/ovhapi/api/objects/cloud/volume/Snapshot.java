package net.zyuiop.ovhapi.api.objects.cloud.volume;

/**
 * Snapshot
 */

public interface Snapshot { 

	/**
	 * @return Volume source id
	 */
	java.lang.String getVolumeId(); 

	/**
	 * @return Snapshot status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Snapshot name
	 */
	java.lang.String getName(); 

	/**
	 * @return Snapshot region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Snapshot description
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Snapshot size
	 */
	long getSize(); 

	/**
	 * @return Snapshot creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Snapshot id
	 */
	java.lang.String getId(); 

}
