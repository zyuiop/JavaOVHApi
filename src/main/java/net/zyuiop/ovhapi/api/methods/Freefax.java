package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /freefax APIs
 */

public interface Freefax { 

	/**
	 * Disable/Enable voicemail. Available only if the line has fax capabilities
	 * Facultative parameters ? false
	 * @param routing Activate or Desactivate voicemail on the line
	 * @param serviceName Freefax number
	*/
	void postServiceNameVoicemailChangeRouting(java.lang.String routing, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Freefax number
	*/
	void putServiceNameVoicemail(net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Change the voicemail password. It must be 4 digit
	 * Facultative parameters ? false
	 * @param password The password
	 * @param serviceName Freefax number
	*/
	void postServiceNameVoicemailChangePassword(java.lang.String password, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Freefax number
	*/
	net.zyuiop.ovhapi.api.objects.freefax.FreefaxProperties getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Generates a new password for your fax account
	 * Facultative parameters ? false
	 * @param serviceName Freefax number
	*/
	java.lang.String postServiceNameChangePassword(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Freefax number
	*/
	net.zyuiop.ovhapi.api.objects.telephony.VoicemailProperties getServiceNameVoicemail(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the credit balance and the remaining pages available for all our freefax
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.freefax.BalanceInformations getCredits() throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Freefax number
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the status of the voicemail. Available only if the line has fax capabilities
	 * Facultative parameters ? false
	 * @param serviceName Freefax number
	*/
	java.lang.String getServiceNameVoicemailRouting(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Freefax number
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.freefax.FreefaxProperties param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Freefax number
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Main service attached to freefax
	 * Facultative parameters ? false
	 * @param serviceName Freefax number
	*/
	java.lang.String getServiceNameMainService(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getFreefax() throws java.io.IOException;

}
