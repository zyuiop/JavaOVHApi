package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Voicemail message
 */

public interface VoicemailMessages { 

	/**
	 * @return Callee number in international format
	 */
	java.lang.String getCallee(); 

	/**
	 * @return Message datetime creation
	 */
	java.util.Date getCreationDatetime(); 

	/**
	 * @return Uniq voicemail message identifier
	 */
	long getId(); 

	/**
	 * @return Caller number in international format
	 */
	java.lang.String getCaller(); 

	/**
	 * @return Message duration (in seconds)
	 */
	long getDuration(); 

	/**
	 * @return Voicemessage directory
	 */
	java.lang.String getDir(); 

}
