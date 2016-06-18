package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Voicemail Properties
 */

public interface VoicemailProperties { 

	/**
	 * @return Name from which emails will be sent
	 */
	java.lang.String getFromName(); 

	/**
	 * @return Don't allow callers to leave voicemails
	 */
	boolean getDoNotRecord(); 

	/**
	 * @return Email address from which emails will be sent
	 */
	java.lang.String getFromEmail(); 

	/**
	 * @return Quantity of unread voicemails
	 */
	long getUnreadMessages(); 

	/**
	 * @return Don't delete voicemails after they've been sent by email
	 */
	boolean getKeepMessage(); 

	/**
	 * @return Format of the voicemail audio file attached to emails
	 */
	java.lang.String getAudioFormat(); 

	/**
	 * @return Email addresses to notify when a new voicemail is left
	 */
	net.zyuiop.ovhapi.api.objects.telephony.ServiceVoicemailNotifications[] getRedirectionEmails(); 

	/**
	 * @return Force password request to access the voicemail panel
	 */
	boolean getForcePassword(); 

	/**
	 * @return Name of the voicemail panel announce file
	 */
	java.lang.String getAnnouceMessage(); 

	/**
	 * @return Current voicemail version
	 */
	boolean getIsNewVersion(); 

}
