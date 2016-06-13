package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * List past conferences on your number
 */

public interface ConferenceHistory { 

	/**
	 * @return The date the conference end
	 */
	java.util.Date getDateEnd(); 

	/**
	 * @return The duration of the conference in seconds
	 */
	long getDuration(); 

	/**
	 * @return The count of connections to the conference
	 */
	long getCountConnections(); 

	/**
	 * @return The audio record url if you set recording
	 */
	java.lang.String getRecordUrl(); 

	/**
	 * @return The date the conference began
	 */
	java.util.Date getDateBegin(); 

	/**
	 * @return The events of the conference (participants joining/left)
	 */
	net.zyuiop.ovhapi.api.objects.telephony.ConferenceHistoryEvent getEvents(); 

	/**
	 * @return The id of the conference history
	 */
	long getId(); 

	/**
	 * @return The count of unique participants of the conference
	 */
	long getCountParticipants(); 

}
