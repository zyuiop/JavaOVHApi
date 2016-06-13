package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Screenlist condition
 */

public interface EasyHuntingScreenListsConditions { 

	/**
	 * @return Screenlist based on the presented caller number
	 */
	java.lang.String getCallerIdNumber(); 

	/**
	 * @return Type of screenlist
	 */
	java.lang.String getScreenListType(); 

	/**
	 * @return null
	 */
	long getConditionId(); 

}
