package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Contact informations structure
 */

public interface Contact { 

	/**
	 * @return Contact firstname
	 */
	java.lang.String getFirstname(); 

	/**
	 * @return Contact country
	 */
	java.lang.String getCountry(); 

	/**
	 * @return Contact organisation
	 */
	java.lang.String getOrganisation(); 

	/**
	 * @return Contact name
	 */
	java.lang.String getName(); 

	/**
	 * @return Contact phone
	 */
	java.lang.String getPhone(); 

	/**
	 * @return null
	 */
	java.lang.String getEmail(); 

	/**
	 * @return Contact zip
	 */
	java.lang.String getZip(); 

	/**
	 * @return Contact city
	 */
	java.lang.String getCity(); 

	/**
	 * @return Contact address
	 */
	java.lang.String getAddress(); 

}
