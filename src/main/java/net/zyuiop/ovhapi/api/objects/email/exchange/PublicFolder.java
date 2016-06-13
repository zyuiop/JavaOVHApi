package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange organization public folder
 */

public interface PublicFolder { 

	/**
	 * @return Quota for public folder in MB
	 */
	long getQuota(); 

	/**
	 * @return Time for which public folder was accessed for the last time
	 */
	java.util.Date getLastAccessTime(); 

	/**
	 * @return Time for which public folder was modified for the last time 
	 */
	java.util.Date getLastModificationTime(); 

	/**
	 * @return Access right for the guest users
	 */
	java.lang.String getAnonymousPermission(); 

	/**
	 * @return Sum of all items in public folder in MB
	 */
	long getTotalItemSize(); 

	/**
	 * @return Path for public folder
	 */
	java.lang.String getPath(); 

	/**
	 * @return If true, this public folder has subfolders
	 */
	boolean getHasSubFolders(); 

	/**
	 * @return Number of items in public folder
	 */
	long getItemCount(); 

	/**
	 * @return null
	 */
	java.lang.String getState(); 

	/**
	 * @return Time for which public folder was accessed for the last time by the user
	 */
	java.util.Date getLastUserAccessTime(); 

	/**
	 * @return Time for which public folder was modified for the last time by the user
	 */
	java.util.Date getLastUserModificationTime(); 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Type for public folder
	 */
	java.lang.String getType(); 

	/**
	 * @return Default access right
	 */
	java.lang.String getDefaultPermission(); 

	/**
	 * @return task pending id
	 */
	long getTaskPendingId(); 

}
