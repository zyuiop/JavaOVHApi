package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Screenlist condition
 */

public interface OvhPabxDialplanExtensionConditionScreenList { 

	/**
	 * @return Screenlist based on the presented caller number
	 */
	java.lang.String getCallerIdNumber(); 

	/**
	 * @return null
	 */
	long getConditionId(); 

}
