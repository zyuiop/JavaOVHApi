package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Previous tollfree bill
 */

public interface HistoryTollfreeConsumption { 

	/**
	 * @return date of the bill
	 */
	java.util.Date getDate(); 

	/**
	 * @return status of the bill
	 */
	java.lang.String getStatus(); 

	/**
	 * @return the amount which is paid by the called number
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
