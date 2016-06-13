package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * List of all your contact with support
 */

public interface Support { 

	/**
	 * @return this thread domain
	 */
	java.lang.String getDomain(); 

	/**
	 * @return this thread Id
	 */
	long getThreadId(); 

	/**
	 * @return this thread subject
	 */
	java.lang.String getSubject(); 

	/**
	 * @return Support thread current status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Thread open date
	 */
	java.util.Date getOpenDate(); 

	/**
	 * @return this thread category
	 */
	java.lang.String getCategory(); 

	/**
	 * @return Thread close date
	 */
	java.util.Date getCloseDate(); 

}
