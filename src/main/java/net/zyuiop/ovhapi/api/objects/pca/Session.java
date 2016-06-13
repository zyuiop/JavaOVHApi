package net.zyuiop.ovhapi.api.objects.pca;

/**
 * cloud archives sessions
 */

public interface Session { 

	/**
	 * @return Session friendly name
	 */
	java.lang.String getName(); 

	/**
	 * @return This is your login
	 */
	java.lang.String getLogin(); 

	/**
	 * @return Session size, in bytes
	 */
	long getSize(); 

	/**
	 * @return IP session was made from
	 */
	java.lang.String getSrcIp(); 

	/**
	 * @return Session state
	 */
	java.lang.String getState(); 

	/**
	 * @return Session end date
	 */
	java.util.Date getEndDate(); 

	/**
	 * @return Session ID
	 */
	java.lang.String getId(); 

	/**
	 * @return Session start date
	 */
	java.util.Date getStartDate(); 

}
