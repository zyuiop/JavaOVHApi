package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Dump
 */

public interface Dump { 

	/**
	 * @return Dump of this database name
	 */
	java.lang.String getDatabaseName(); 

	/**
	 * @return Creation date of the database
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Dump url access
	 */
	java.lang.String getUrl(); 

	/**
	 * @return Dump id
	 */
	long getId(); 

	/**
	 * @return Automatic deletion date of the database
	 */
	java.util.Date getDeletionDate(); 

}
