package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Export PST file request
 */

public interface Export { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Percentage of export PST request completion
	 */
	long getPercentComplete(); 

	/**
	 * @return Task pending id
	 */
	long getTaskPendingId(); 

}
