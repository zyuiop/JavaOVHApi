package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * IVR Menu
 */

public interface OvhPabxMenu { 

	/**
	 * @return null
	 */
	long getMenuId(); 

	/**
	 * @return The name of the menu
	 */
	java.lang.String getName(); 

	/**
	 * @return The sound played when the caller uses an invalid DTMF
	 */
	long getInvalidSound(); 

	/**
	 * @return The sound played to greet
	 */
	long getGreetSound(); 

}
