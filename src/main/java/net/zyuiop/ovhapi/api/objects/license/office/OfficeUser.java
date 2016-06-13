package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * Office user
 */

public interface OfficeUser { 

	/**
	 * @return User's first name
	 */
	java.lang.String getFirstName(); 

	/**
	 * @return User state
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Licenses attributed to the user
	 */
	java.lang.String getLicences(); 

	/**
	 * @return User's last name
	 */
	java.lang.String getLastName(); 

	/**
	 * @return Email used to activate Microsoft Office
	 */
	java.lang.String getActivationEmail(); 

	/**
	 * @return Pending task id
	 */
	long getTaskPendingId(); 

}
