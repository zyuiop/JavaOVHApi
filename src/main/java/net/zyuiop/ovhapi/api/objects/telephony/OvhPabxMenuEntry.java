package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * IVR menu entry
 */

public interface OvhPabxMenuEntry { 

	/**
	 * @return null
	 */
	long getEntryId(); 

	/**
	 * @return The additionnal parameter of the action
	 */
	java.lang.String getActionParam(); 

	/**
	 * @return The position of the entry in the menu
	 */
	long getPosition(); 

	/**
	 * @return The action triggered by the DTMF
	 */
	java.lang.String getAction(); 

	/**
	 * @return The DTMF that triggers the action
	 */
	java.lang.String getDtmf(); 

}
