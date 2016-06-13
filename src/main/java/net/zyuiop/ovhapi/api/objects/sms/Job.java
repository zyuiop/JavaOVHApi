package net.zyuiop.ovhapi.api.objects.sms;

/**
 * Sms job
 */

public interface Job { 

	/**
	 * @return null
	 */
	java.lang.String getReceiver(); 

	/**
	 * @return null
	 */
	long getDeliveryReceipt(); 

	/**
	 * @return null
	 */
	long getMessageLength(); 

	/**
	 * @return null
	 */
	long getDifferedDelivery(); 

	/**
	 * @return null
	 */
	double getCredits(); 

	/**
	 * @return null
	 */
	java.lang.String getMessage(); 

	/**
	 * @return null
	 */
	long getPtt(); 

	/**
	 * @return null
	 */
	java.lang.String getSender(); 

	/**
	 * @return null
	 */
	long getNumberOfSms(); 

	/**
	 * @return null
	 */
	java.util.Date getCreationDatetime(); 

	/**
	 * @return null
	 */
	long getId(); 

}
