package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange organization disclaimer
 */

public interface Disclaimer { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Disclaimer name
	 */
	java.lang.String getName(); 

	/**
	 * @return Signature, added at the bottom of your organization emails
	 */
	java.lang.String getContent(); 

	/**
	 * @return Activate the disclaimer only for external emails
	 */
	boolean getOutsideOnly(); 

	/**
	 * @return task pending id
	 */
	long getTaskPendingId(); 

}
