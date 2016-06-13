package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Live statistics of the queue
 */

public interface OvhPabxHuntingQueueLiveStatistics { 

	/**
	 * @return Total waiting duration in seconds
	 */
	long getTotalWaitingDuration(); 

	/**
	 * @return Total of calls
	 */
	long getCallsTotal(); 

	/**
	 * @return Total of calls lost
	 */
	long getCallsLost(); 

	/**
	 * @return Total of calls answered
	 */
	long getCallsAnswered(); 

	/**
	 * @return Last reset datetime of queue's statistics
	 */
	java.util.Date getLastReset(); 

	/**
	 * @return Total call duration in seconds
	 */
	long getTotalCallDuration(); 

}
