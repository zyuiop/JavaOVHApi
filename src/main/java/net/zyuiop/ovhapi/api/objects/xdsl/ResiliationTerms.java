package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Show the resiliation terms
 */

public interface ResiliationTerms { 

	/**
	 * @return Minumum resiliationDate
	 */
	java.util.Date getMinResiliationDate(); 

	/**
	 * @return Price due at resiliationDate
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getDue(); 

	/**
	 * @return Date at which the access will be resiliated
	 */
	java.util.Date getResiliationDate(); 

	/**
	 * @return Date until which the customer is engaged
	 */
	java.util.Date getEngageDate(); 

}
