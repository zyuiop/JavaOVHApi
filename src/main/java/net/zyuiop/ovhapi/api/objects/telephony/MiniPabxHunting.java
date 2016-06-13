package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * MiniPabx Hunting
 */

public interface MiniPabxHunting { 

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
	 * @return null
	 */
	java.lang.String getPattern(); 

	/**
	 * @return Reject anonymous calls
	 */
	boolean getAnonymousCallRejection(); 

	/**
	 * @return The maximum waiting time in the calls queue
	 */
	long getOnHoldTimer(); 

	/**
	 * @return True if the tone on closure is enabled
	 */
	boolean getToneOnClosure(); 

	/**
	 * @return True if the ring back tone is enabled
	 */
	boolean getToneRingback(); 

}
