package net.zyuiop.ovhapi.api.objects.sms;

/**
 * SMS users
 */

public interface User { 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.sms.Quota getQuotaInformations(); 

	/**
	 * @return null
	 */
	java.lang.String getPassword(); 

	/**
	 * @return URL called when a STOP is received after a receiver replied stop to a SMS
	 */
	java.lang.String getStopCallBack(); 

	/**
	 * @return null
	 */
	java.lang.String getIpRestrictions(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.sms.AlertThreshold getAlertThresholdInformations(); 

	/**
	 * @return The sms user login
	 */
	java.lang.String getLogin(); 

	/**
	 * @return URL called when state of a sent SMS changes
	 */
	java.lang.String getCallBack(); 

}
