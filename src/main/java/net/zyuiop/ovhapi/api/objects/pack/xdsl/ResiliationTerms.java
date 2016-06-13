package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Show the resiliation terms
 */

public interface ResiliationTerms { 

	/**
	 * @return List of available resiliation reasons
	 */
	java.lang.String getResiliationReasons(); 

	/**
	 * @return Minimum date at which the pack can be resiliated
	 */
	java.util.Date getMinResiliationDate(); 

	/**
	 * @return Price due at resiliationDate
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getDue(); 

	/**
	 * @return Date at which the pack will be resiliated
	 */
	java.util.Date getResiliationDate(); 

	/**
	 * @return Date until which the customer is engaged
	 */
	java.util.Date getEngageDate(); 

}
