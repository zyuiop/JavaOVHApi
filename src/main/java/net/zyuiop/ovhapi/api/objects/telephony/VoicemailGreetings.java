package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Voicemail greeting
 */

public interface VoicemailGreetings { 

	/**
	 * @return Callee number in international format
	 */
	java.lang.String getCallee(); 

	/**
	 * @return Uniq customized greeting identifier
	 */
	long getId(); 

	/**
	 * @return Customized greeting voicemail directory
	 */
	java.lang.String getDir(); 

}
