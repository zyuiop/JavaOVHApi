package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Previous repayment bill
 */

public interface HistoryRepaymentConsumption { 

	/**
	 * @return the number of the bill
	 */
	java.lang.String getBillingNumber(); 

	/**
	 * @return date of the bill
	 */
	java.util.Date getDate(); 

	/**
	 * @return status of the bill
	 */
	java.lang.String getStatus(); 

	/**
	 * @return the amout which is repayed
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
