package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Filter List
 */

public interface Filter { 

	/**
	 * @return Priority of filter
	 */
	long getPriority(); 

	/**
	 * @return Domain name of filter
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Action parameter of filter
	 */
	java.lang.String getActionParam(); 

	/**
	 * @return If true filter is active
	 */
	boolean getActive(); 

	/**
	 * @return Filter name
	 */
	java.lang.String getName(); 

	/**
	 * @return Action of filter
	 */
	java.lang.String getAction(); 

	/**
	 * @return Account name of filter
	 */
	java.lang.String getPop(); 

}
