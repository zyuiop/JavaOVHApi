package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Rule List
 */

public interface Rule { 

	/**
	 * @return Rule parameter of filter
	 */
	java.lang.String getValue(); 

	/**
	 * @return Rule of filter
	 */
	java.lang.String getOperand(); 

	/**
	 * @return 
	 */
	long getId(); 

	/**
	 * @return Header to be filtered
	 */
	java.lang.String getHeader(); 

}
