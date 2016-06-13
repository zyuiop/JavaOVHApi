package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Calls agent
 */

public interface OvhPabxHuntingAgent { 

	/**
	 * @return null
	 */
	long getAgentId(); 

	/**
	 * @return The wrap up time (in seconds) after the calls
	 */
	long getWrapUpTime(); 

	/**
	 * @return The number of the agent
	 */
	java.lang.String getNumber(); 

	/**
	 * @return The waiting timeout (in seconds) before hangup an assigned called
	 */
	long getTimeout(); 

	/**
	 * @return The current status of the agent
	 */
	java.lang.String getStatus(); 

	/**
	 * @return The maximum of simultaneous calls that the agent will receive from the hunting
	 */
	long getSimultaneousLines(); 

}
