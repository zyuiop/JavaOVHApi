package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Task filter List
 */

public interface TaskFilter { 

	/**
	 * @return Domain name of task
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Creation date of task
	 */
	java.util.Date getTimestamp(); 

	/**
	 * @return Account name of task
	 */
	java.lang.String getAccount(); 

	/**
	 * @return Action of task
	 */
	java.lang.String getAction(); 

	/**
	 * @return Id of task
	 */
	long getId(); 

}
