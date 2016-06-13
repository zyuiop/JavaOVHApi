package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Information about a Bill entry
 */

public interface BillDetail { 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getTotalPrice(); 

	/**
	 * @return null
	 */
	java.util.Date getPeriodStart(); 

	/**
	 * @return null
	 */
	java.lang.String getQuantity(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getUnitPrice(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

	/**
	 * @return null
	 */
	java.lang.String getBillDetailId(); 

	/**
	 * @return null
	 */
	java.lang.String getDomain(); 

	/**
	 * @return null
	 */
	java.util.Date getPeriodEnd(); 

}
