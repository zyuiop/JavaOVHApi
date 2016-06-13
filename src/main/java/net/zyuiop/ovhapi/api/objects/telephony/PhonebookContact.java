package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Phone book contact
 */

public interface PhonebookContact { 

	/**
	 * @return Mobile phone office number of the contact
	 */
	java.lang.String getWorkMobile(); 

	/**
	 * @return Contact name
	 */
	java.lang.String getName(); 

	/**
	 * @return Landline phone office number of the contact
	 */
	java.lang.String getWorkPhone(); 

	/**
	 * @return Contact surname
	 */
	java.lang.String getSurname(); 

	/**
	 * @return Home mobile phone number of the contact
	 */
	java.lang.String getHomeMobile(); 

	/**
	 * @return Group name of the phonebook
	 */
	java.lang.String getGroup(); 

	/**
	 * @return Contact identifier
	 */
	long getId(); 

	/**
	 * @return Home landline phone number of the contact
	 */
	java.lang.String getHomePhone(); 

}
