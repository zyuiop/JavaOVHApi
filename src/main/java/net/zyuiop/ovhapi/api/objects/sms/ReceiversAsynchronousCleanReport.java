package net.zyuiop.ovhapi.api.objects.sms;

/**
 * A structure giving operation price and asynchronous task ID
 */

public interface ReceiversAsynchronousCleanReport { 

	/**
	 * @return null
	 */
	double getTotalCreditsRemoved(); 

	/**
	 * @return null
	 */
	long getTaskId(); 

}
