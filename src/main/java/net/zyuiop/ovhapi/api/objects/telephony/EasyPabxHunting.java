package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * EasyPabx Hunting
 */

public interface EasyPabxHunting { 

	/**
	 * @return null
	 */
	java.lang.String getStrategy(); 

	/**
	 * @return True if the tone on hold is enabled
	 */
	boolean getToneOnHold(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return Number of simultaneous calls
	 */
	long getNumberOfCalls(); 

	/**
	 * @return Reject anonymous calls
	 */
	boolean getAnonymousCallRejection(); 

	/**
	 * @return null
	 */
	java.lang.String getPattern(); 

	/**
	 * @return True if the tone on closure is enabled
	 */
	boolean getToneOnClosure(); 

	/**
	 * @return The maximum no-reply time before forwarding the call to the voicemail
	 */
	long getNoReplyTimer(); 

	/**
	 * @return The voicemail used by the EasyPABX
	 */
	java.lang.String getVoicemail(); 

	/**
	 * @return True if the ring back tone is enabled
	 */
	boolean getToneRingback(); 

}
