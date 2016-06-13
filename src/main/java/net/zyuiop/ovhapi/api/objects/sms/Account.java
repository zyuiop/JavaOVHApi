package net.zyuiop.ovhapi.api.objects.sms;

/**
 * SMS details
 */

public interface Account { 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.sms.Response getSmsResponse(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	double getCreditsLeft(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	long getUserQuantityWithQuota(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

	/**
	 * @return URL called when state of a sent SMS changes
	 */
	java.lang.String getCallBack(); 

	/**
	 * @return Credit threshold after which an automatic recredit is launched
	 */
	double getCreditThresholdForAutomaticRecredit(); 

	/**
	 * @return URL called when a STOP is received after a receiver replied stop to a SMS
	 */
	java.lang.String getStopCallBack(); 

	/**
	 * @return null
	 */
	double getCreditsHoldByQuota(); 

	/**
	 * @return null
	 */
	long getAutomaticRecreditAmount(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.sms.Templates getTemplates(); 

}
