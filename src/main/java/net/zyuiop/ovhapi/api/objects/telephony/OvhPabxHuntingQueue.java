package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Calls queue
 */

public interface OvhPabxHuntingQueue { 

	/**
	 * @return The maximum of people waiting in the queue
	 */
	long getMaxMember(); 

	/**
	 * @return The maximum waiting time (in seconds) in the queue
	 */
	long getMaxWaitTime(); 

	/**
	 * @return null
	 */
	long getQueueId(); 

	/**
	 * @return The calls dispatching strategy
	 */
	java.lang.String getStrategy(); 

}
