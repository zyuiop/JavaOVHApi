package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Live statistics of the queue
 */

public interface OvhPabxHuntingAgentLiveStatus { 

	/**
	 * @return Last status change date
	 */
	java.util.Date getLastStatusChange(); 

	/**
	 * @return Current status of the agent
	 */
	java.lang.String getStatus(); 

}
