package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Live statistics of the queue
 */

public interface OvhPabxHuntingQueueLiveCalls { 

	/**
	 * @return Phone number of the caller (or anonymous if unknown)
	 */
	java.lang.String getCallerIdNumber(); 

	/**
	 * @return Name of the caller (or anonymous if unknown)
	 */
	java.lang.String getCallerIdName(); 

	/**
	 * @return Current state of the call
	 */
	java.lang.String getState(); 

	/**
	 * @return End date of the call
	 */
	java.util.Date getEnd(); 

	/**
	 * @return Name or number of the agent who answered the call
	 */
	java.lang.String getAgent(); 

	/**
	 * @return null
	 */
	long getId(); 

	/**
	 * @return Begin date of the call
	 */
	java.util.Date getBegin(); 

	/**
	 * @return Answer date of the call
	 */
	java.util.Date getAnswered(); 

}
