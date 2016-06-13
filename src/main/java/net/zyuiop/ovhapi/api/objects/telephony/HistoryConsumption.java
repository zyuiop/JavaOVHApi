package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Previous billed consumptions
 */

public interface HistoryConsumption { 

	/**
	 * @return null
	 */
	java.util.Date getDate(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPriceOutplan(); 

}
