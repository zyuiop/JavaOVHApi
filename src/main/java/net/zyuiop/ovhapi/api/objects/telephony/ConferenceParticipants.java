package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Conference service
 */

public interface ConferenceParticipants { 

	/**
	 * @return The current level of the participant audio transmission
	 */
	long getEnergy(); 

	/**
	 * @return Whether or not the participant is talking
	 */
	boolean getTalking(); 

	/**
	 * @return Whether or not the participant can talk in the conference
	 */
	boolean getSpeak(); 

	/**
	 * @return The caller number of the participant
	 */
	java.lang.String getCallerNumber(); 

	/**
	 * @return Whether or not the participant is active in the room
	 */
	boolean getFloor(); 

	/**
	 * @return Whether or not the participant can hear the conference
	 */
	boolean getHear(); 

	/**
	 * @return The caller name of the participant
	 */
	java.lang.String getCallerName(); 

	/**
	 * @return The id of the participant
	 */
	long getId(); 

}
