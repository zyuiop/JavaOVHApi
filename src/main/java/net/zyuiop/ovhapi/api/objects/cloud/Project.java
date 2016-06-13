package net.zyuiop.ovhapi.api.objects.cloud;

/**
 * Project
 */

public interface Project { 

	/**
	 * @return Project unleashed
	 */
	boolean getUnleash(); 

	/**
	 * @return Project creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Project order id
	 */
	long getOrderId(); 

	/**
	 * @return Current status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Project access
	 */
	java.lang.String getAccess(); 

	/**
	 * @return Description of your project
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Project id
	 */
	java.lang.String getProject_id(); 

}
