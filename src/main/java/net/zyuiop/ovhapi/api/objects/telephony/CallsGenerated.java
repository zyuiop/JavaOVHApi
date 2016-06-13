package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Automatic Call made by Call Generator on this line
 */

public interface CallsGenerated { 

	/**
	 * @return answer date
	 */
	java.util.Date getAnswerDatetime(); 

	/**
	 * @return creation date of the call
	 */
	java.util.Date getCallCreatedDatetime(); 

	/**
	 * @return number called
	 */
	java.lang.String getCallee(); 

	/**
	 * @return Application and dialplan running for call
	 */
	java.lang.String getApplication(); 

	/**
	 * @return call duration on seconds
	 */
	long getCallDuration(); 

	/**
	 * @return DTMF received during the call separate by commas
	 */
	java.lang.String getDtmf(); 

	/**
	 * @return unique call id
	 */
	java.lang.String getUuid(); 

	/**
	 * @return billingNumber (service used)
	 */
	java.lang.String getBillingNumber(); 

	/**
	 * @return Generated call identifier
	 */
	java.lang.String getIdentifier(); 

	/**
	 * @return end status of application
	 */
	java.lang.String getApplicationResult(); 

	/**
	 * @return original call uuid if it's a transfer
	 */
	java.lang.String getTransferFrom(); 

	/**
	 * @return number where the call come from
	 */
	java.lang.String getCaller(); 

	/**
	 * @return hangup date
	 */
	java.util.Date getHangupDatetime(); 

	/**
	 * @return hangup cause
	 */
	java.lang.String getHangupCause(); 

}
