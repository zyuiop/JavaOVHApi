package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Dialplan extension
 */

public interface OvhPabxDialplanExtension { 

	/**
	 * @return The position of the extension in the dialplan (the extensions are executed following this order)
	 */
	long getPosition(); 

	/**
	 * @return The type of the screenlist
	 */
	java.lang.String getScreenListType(); 

	/**
	 * @return null
	 */
	long getExtensionId(); 

	/**
	 * @return True if the extension is enabled
	 */
	boolean getEnabled(); 

	/**
	 * @return Additionnal conditions are used from this chosen scheduler category
	 */
	java.lang.String getSchedulerCategory(); 

}
