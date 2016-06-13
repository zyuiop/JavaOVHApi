package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a statement income
 */

public interface StatementIncome { 

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
	java.lang.String getPdfUrl(); 

	/**
	 * @return null
	 */
	java.lang.String getStatementIncomeId(); 

	/**
	 * @return null
	 */
	long getOrderId(); 

	/**
	 * @return null
	 */
	java.util.Date getDate(); 

	/**
	 * @return null
	 */
	java.lang.String getUrl(); 

}
