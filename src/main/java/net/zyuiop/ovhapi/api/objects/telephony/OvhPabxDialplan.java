package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Dialplan
 */

public interface OvhPabxDialplan { 

	/**
	 * @return null
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return The dialplan name
	 */
	java.lang.String getName(); 

	/**
	 * @return The presented number when bridging calls
	 */
	java.lang.String getShowCallerNumber(); 

	/**
	 * @return The timeout (in seconds) when bridging calls
	 */
	long getTransferTimeout(); 

	/**
	 * @return null
	 */
	long getDialplanId(); 

	/**
	 * @return Reject (hangup) anonymous calls
	 */
	boolean getAnonymousRejection(); 

}
