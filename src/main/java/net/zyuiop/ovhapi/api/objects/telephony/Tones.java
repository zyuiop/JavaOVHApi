package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Line tones
 */

public interface Tones { 

	/**
	 * @return Tone played when caller is put on hold
	 */
	java.lang.String getOnHold(); 

	/**
	 * @return Tone played when callee is ending call
	 */
	java.lang.String getEndCall(); 

	/**
	 * @return Tone played when caller is waiting in queue
	 */
	java.lang.String getCallWaiting(); 

	/**
	 * @return Ringback tone
	 */
	java.lang.String getRingback(); 

}
