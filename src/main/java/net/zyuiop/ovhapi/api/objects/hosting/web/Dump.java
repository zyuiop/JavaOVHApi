package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Dump
 */

public interface Dump { 

	/**
	 * @return Creation date of the dump
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
	 * @return Dump type
	 */
	java.lang.String getType(); 

	/**
	 * @return Automatic deletion date of the dump
	 */
	java.util.Date getDeletionDate(); 

}
