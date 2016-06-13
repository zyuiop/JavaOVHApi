package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Events triggered by the line
 */

public interface Event { 

	/**
	 * @return Protocol (mgcp or sip)
	 */
	java.lang.String getProtocol(); 

	/**
	 * @return Called referer, could be the msisdn or the label name
	 */
	java.lang.String getCalledIdentifier(); 

	/**
	 * @return Type of event
	 */
	java.lang.String getEventType(); 

	/**
	 * @return Duration of the call
	 */
	long getDuration(); 

	/**
	 * @return Datetime call establishment
	 */
	java.util.Date getDateTime(); 

	/**
	 * @return Incoming or outgoing call
	 */
	java.lang.String getDirection(); 

	/**
	 * @return Uniq identifier of the call
	 */
	java.lang.String getId(); 

	/**
	 * @return Calling referer, could be the msisdn or the label name
	 */
	java.lang.String getCallingIdentifier(); 

}
