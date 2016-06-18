package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Line options
 */

public interface LineOptions { 

	/**
	 * @return null
	 */
	boolean getDoNotDisturb(); 

	/**
	 * @return Nature of the forward when the line is unavailable
	 */
	java.lang.String getForwardBackupNature(); 

	/**
	 * @return Destination of the forward on no-reply
	 */
	java.lang.String getForwardNoReplyNumber(); 

	/**
	 * @return Nature of the forward when the line is busy
	 */
	java.lang.String getForwardBusyNature(); 

	/**
	 * @return null
	 */
	boolean getAbsentSubscriber(); 

	/**
	 * @return Destination of the forward when the line is busy
	 */
	java.lang.String getForwardBusyNumber(); 

	/**
	 * @return Codecs preferences
	 */
	java.lang.String getCodecs(); 

	/**
	 * @return The ip restrictions of your line
	 */
	java.lang.String[] getIpRestrictions(); 

	/**
	 * @return The SIP domain of the line
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Disallow outgoing calls password
	 */
	java.lang.String getLockOutCallPassword(); 

	/**
	 * @return Do not display your number
	 */
	boolean getIdentificationRestriction(); 

	/**
	 * @return Nature of the forward on no-reply
	 */
	java.lang.String getForwardNoReplyNature(); 

	/**
	 * @return Intercom mode: takes automatically the call with the loudspeaker
	 */
	java.lang.String getIntercom(); 

	/**
	 * @return Enable calls forward when the line is unavailable
	 */
	boolean getForwardBackup(); 

	/**
	 * @return Destination of the forward when the line is unavailable
	 */
	java.lang.String getForwardBackupNumber(); 

	/**
	 * @return null
	 */
	java.lang.String getDisplayNumber(); 

	/**
	 * @return Enable calls forward when the line is busy
	 */
	boolean getForwardBusy(); 

	/**
	 * @return Destination of the unconditional forward
	 */
	java.lang.String getForwardUnconditionalNumber(); 

	/**
	 * @return Reject anonymous calls
	 */
	boolean getAnonymousCallRejection(); 

	/**
	 * @return Enable unconditional calls forward
	 */
	boolean getForwardUnconditional(); 

	/**
	 * @return Enable calls forward on no-reply
	 */
	boolean getForwardNoReply(); 

	/**
	 * @return If the line receives a new call and the line is already in communication, this new call is dispatched once the current call is completed
	 */
	boolean getCallWaiting(); 

	/**
	 * @return Nature of the unconditional forward
	 */
	java.lang.String getForwardUnconditionalNature(); 

	/**
	 * @return Delay before forward on no-reply
	 */
	long getForwardNoReplyDelay(); 

	/**
	 * @return Disallow outgoing calls
	 */
	boolean getLockOutCall(); 

}
