package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Phone book
 */

public interface Phonebook { 

	/**
	 * @return Set if phonebook is readonly
	 */
	boolean getIsReadonly(); 

	/**
	 * @return Phone key identifier between the phone and phonebooks
	 */
	java.lang.String getPhoneKey(); 

	/**
	 * @return Phonebook name
	 */
	java.lang.String getName(); 

	/**
	 * @return Identifier of the phonebook
	 */
	java.lang.String getBookKey(); 

}
