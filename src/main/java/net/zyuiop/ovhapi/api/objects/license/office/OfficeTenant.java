package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * Office tenant
 */

public interface OfficeTenant { 

	/**
	 * @return Contact's fisrt name
	 */
	java.lang.String getFirstName(); 

	/**
	 * @return Contact's zip code
	 */
	java.lang.String getZipCode(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Primary phone number
	 */
	java.lang.String getPhone(); 

	/**
	 * @return Contact's city
	 */
	java.lang.String getCity(); 

	/**
	 * @return Contact's fisrt name
	 */
	java.lang.String getLastName(); 

	/**
	 * @return Contact's address line
	 */
	java.lang.String getAddress(); 

	/**
	 * @return Tenant's display name
	 */
	java.lang.String getDisplayName(); 

}
