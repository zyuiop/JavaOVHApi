package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Detected incident
 */

public interface Incident { 

	/**
	 * @return Task ID on travaux.ovh.com
	 */
	long getTaskId(); 

	/**
	 * @return Department list
	 */
	java.lang.String getDepartments(); 

	/**
	 * @return Estimated start date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return null
	 */
	java.lang.String getComment(); 

	/**
	 * @return Estimated end date
	 */
	java.util.Date getEndDate(); 

	/**
	 * @return ID of the incident
	 */
	long getId(); 

	/**
	 * @return NRA list
	 */
	java.lang.String getNra(); 

	/**
	 * @return Operator
	 */
	java.lang.String getOperators(); 

}
