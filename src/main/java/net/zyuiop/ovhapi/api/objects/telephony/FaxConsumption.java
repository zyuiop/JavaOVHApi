package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Fax delivery record
 */

public interface FaxConsumption { 

	/**
	 * @return null
	 */
	java.lang.String getCalling(); 

	/**
	 * @return null
	 */
	long getConsumptionId(); 

	/**
	 * @return null
	 */
	java.util.Date getCreationDatetime(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPriceWithoutTax(); 

	/**
	 * @return null
	 */
	java.lang.String getWayType(); 

	/**
	 * @return null
	 */
	java.lang.String getCalled(); 

	/**
	 * @return null
	 */
	long getPages(); 

}
