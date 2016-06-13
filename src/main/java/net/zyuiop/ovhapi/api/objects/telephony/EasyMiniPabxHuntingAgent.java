package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Easy/Mini PABX agent
 */

public interface EasyMiniPabxHuntingAgent { 

	/**
	 * @return The phone number of the agent
	 */
	java.lang.String getAgentNumber(); 

	/**
	 * @return The maxium ringing time
	 */
	long getNoReplyTimer(); 

	/**
	 * @return True if the agent is logged
	 */
	boolean getLogged(); 

	/**
	 * @return The position in the hunting
	 */
	long getPosition(); 

}
