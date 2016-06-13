package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a statement outcome
 */

public interface StatementOutcome { 

	/**
	 * @return null
	 */
	java.lang.String getCountry(); 

	/**
	 * @return null
	 */
	java.lang.String getPdfUrl(); 

	/**
	 * @return null
	 */
	java.util.Date getDate(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getAmount(); 

	/**
	 * @return null
	 */
	java.lang.String getPassword(); 

	/**
	 * @return null
	 */
	long getOrderId(); 

	/**
	 * @return null
	 */
	java.lang.String getUrl(); 

	/**
	 * @return null
	 */
	java.lang.String getStatementOutcomeId(); 

}
