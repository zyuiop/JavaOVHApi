package net.zyuiop.ovhapi.api.objects.hosting.privatedatabase;

/**
 * Grants
 */

public interface Grant { 

	/**
	 * @return Database name where grant is set
	 */
	java.lang.String getDatabaseName(); 

	/**
	 * @return Creation date of the grant
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Grant set
	 */
	java.lang.String getGrant(); 

}
