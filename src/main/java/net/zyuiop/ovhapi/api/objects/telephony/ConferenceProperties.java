package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Conference properties
 */

public interface ConferenceProperties { 

	/**
	 * @return The conference pin number
	 */
	java.lang.String getPin(); 

	/**
	 * @return Whether or not announce file is played before entrance
	 */
	boolean getAnnounceFile(); 

	/**
	 * @return The email address to send conference report to
	 */
	java.lang.String getReportEmail(); 

	/**
	 * @return The status of the reporting
	 */
	java.lang.String getReportStatus(); 

	/**
	 * @return The conference sounds language
	 */
	java.lang.String getLanguage(); 

	/**
	 * @return Whether or not conference is recorded
	 */
	boolean getRecordStatus(); 

	/**
	 * @return The events channel hash
	 */
	java.lang.String getEventsChannel(); 

	/**
	 * @return Whether or not anonmyous participants are allowed
	 */
	boolean getAnonymousRejection(); 

	/**
	 * @return Whether or not participants enter conference room muted
	 */
	boolean getEnterMuted(); 

}
