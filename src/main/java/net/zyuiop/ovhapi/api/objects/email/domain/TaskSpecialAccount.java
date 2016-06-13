package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Task special account List
 */

public interface TaskSpecialAccount { 

	/**
	 * @return Domain name of task
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Account name of task
	 */
	java.lang.String getAccount(); 

	/**
	 * @return Creation date of task
	 */
	java.util.Date getDate(); 

	/**
	 * @return Action of task
	 */
	java.lang.String getAction(); 

	/**
	 * @return Id of task
	 */
	long getId(); 

	/**
	 * @return Type of action filter
	 */
	java.lang.String getType(); 

}
