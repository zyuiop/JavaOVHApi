package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Event of a conference (participant left/join)
 */

public interface ConferenceHistoryEvent { 

	/**
	 * @return The caller id of the participant
	 */
	java.lang.String getCallerid(); 

	/**
	 * @return The date of the conference event
	 */
	java.util.Date getDate(); 

	/**
	 * @return The nature of the event : left/join
	 */
	java.lang.String getType(); 

}
