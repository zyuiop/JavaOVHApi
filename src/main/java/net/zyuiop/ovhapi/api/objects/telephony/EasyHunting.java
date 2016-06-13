package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * OVH easy calls queues
 */

public interface EasyHunting { 

	/**
	 * @return Max wait time when caller is in queue (in seconds)
	 */
	long getMaxWaitTime(); 

	/**
	 * @return null
	 */
	java.lang.String getFeatureType(); 

	/**
	 * @return The calls dispatching strategy
	 */
	java.lang.String getStrategy(); 

	/**
	 * @return Max number of callers in queue
	 */
	long getQueueSize(); 

	/**
	 * @return Tone played when caller is put on hold
	 */
	long getToneOnHold(); 

	/**
	 * @return null
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return The presented number when bridging calls
	 */
	java.lang.String getShowCallerNumber(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Reject (hangup) anonymous calls
	 */
	boolean getAnonymousRejection(); 

	/**
	 * @return Tone played when call is picked up
	 */
	long getToneOnOpening(); 

	/**
	 * @return null
	 */
	java.lang.String getServiceType(); 

	/**
	 * @return The voicemail used by the EasyPABX
	 */
	java.lang.String getVoicemail(); 

	/**
	 * @return Tone played just before call is hang up
	 */
	long getToneOnClosing(); 

}
