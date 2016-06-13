package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Task Pop List
 */

public interface TaskPop { 

	/**
	 * @return Domain name of task
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Creation date of task
	 */
	java.util.Date getDate(); 

	/**
	 * @return Account name of task
	 */
	java.lang.String getName(); 

	/**
	 * @return Action of task
	 */
	java.lang.String getAction(); 

	/**
	 * @return Id of task
	 */
	long getId(); 

}
