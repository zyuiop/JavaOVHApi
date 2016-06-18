package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure describing how to manage an sms Response
 */

public interface Response { 

	/**
	 * @return Automatic notification sent by text in case of customer reply.
	 */
	java.lang.String getText(); 

	/**
	 * @return Default url callback used for a given response.
	 */
	java.lang.String getCgiUrl(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.sms.ResponseTrackingOptions[] getTrackingOptions(); 

	/**
	 * @return null
	 */
	java.lang.String getTrackingDefaultSmsSender(); 

	/**
	 * @return null
	 */
	java.lang.String getResponseType(); 

}
