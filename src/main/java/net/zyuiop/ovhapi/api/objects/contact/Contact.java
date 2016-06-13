package net.zyuiop.ovhapi.api.objects.contact;

/**
 * Representation of a Contact
 */

public interface Contact { 

	/**
	 * @return Organisation name
	 */
	java.lang.String getOrganisationName(); 

	/**
	 * @return VAT number
	 */
	java.lang.String getVat(); 

	/**
	 * @return Birth date
	 */
	java.util.Date getBirthDay(); 

	/**
	 * @return National identification number of the contact
	 */
	java.lang.String getNationalIdentificationNumber(); 

	/**
	 * @return Spare email address
	 */
	java.lang.String getSpareEmail(); 

	/**
	 * @return Email address
	 */
	java.lang.String getEmail(); 

	/**
	 * @return Fax number
	 */
	java.lang.String getFax(); 

	/**
	 * @return Cellphone number
	 */
	java.lang.String getCellPhone(); 

	/**
	 * @return Birth Country
	 */
	java.lang.String getBirthCountry(); 

	/**
	 * @return Address for this contact
	 */
	net.zyuiop.ovhapi.api.objects.contact.Address getAddress(); 

	/**
	 * @return Contact Identifier
	 */
	long getId(); 

	/**
	 * @return Last name
	 */
	java.lang.String getLastName(); 

	/**
	 * @return National identification number of your company
	 */
	java.lang.String getCompanyNationalIdentificationNumber(); 

	/**
	 * @return Gender
	 */
	java.lang.String getGender(); 

	/**
	 * @return Birth city
	 */
	java.lang.String getBirthCity(); 

	/**
	 * @return First name
	 */
	java.lang.String getFirstName(); 

	/**
	 * @return Language
	 */
	java.lang.String getLanguage(); 

	/**
	 * @return Organisation type
	 */
	java.lang.String getOrganisationType(); 

	/**
	 * @return Legal form of the contact
	 */
	java.lang.String getLegalForm(); 

	/**
	 * @return Telephone number
	 */
	java.lang.String getPhone(); 

	/**
	 * @return Birth Zipcode
	 */
	java.lang.String getBirthZip(); 

	/**
	 * @return Nationality
	 */
	java.lang.String getNationality(); 

}
