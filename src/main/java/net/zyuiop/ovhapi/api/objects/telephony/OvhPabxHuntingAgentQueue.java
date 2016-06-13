package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Agent assigned to a queue
 */

public interface OvhPabxHuntingAgentQueue { 

	/**
	 * @return null
	 */
	long getAgentId(); 

	/**
	 * @return null
	 */
	long getQueueId(); 

	/**
	 * @return The position in the queue
	 */
	long getPosition(); 

}
