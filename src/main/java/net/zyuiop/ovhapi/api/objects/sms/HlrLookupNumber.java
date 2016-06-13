package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Home Location Register informations. Give informations about a given cellular phone.
 */

public interface HlrLookupNumber { 

	/**
	 * @return Is the MSISDN currently roaming outside its natinal network
	 */
	boolean getRoaming(); 

	/**
	 * @return Has the MSISDN been ported from its original network
	 */
	boolean getPorted(); 

	/**
	 * @return Is the MSISDN currently reachable
	 */
	boolean getReachable(); 

	/**
	 * @return Status of the HLR request
	 */
	java.lang.String getStatus(); 

	/**
	 * @return HLR creation datetime
	 */
	java.util.Date getDatetime(); 

	/**
	 * @return Is the MSISDN valid
	 */
	boolean getValid(); 

	/**
	 * @return The {Mobile Country Code, Mobile Network Code} unique identifier
	 */
	java.lang.String getOperatorCode(); 

	/**
	 * @return HLR id
	 */
	long getId(); 

}
