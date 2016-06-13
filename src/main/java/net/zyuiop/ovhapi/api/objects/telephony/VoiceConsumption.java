package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Call delivery record
 */

public interface VoiceConsumption { 

	/**
	 * @return null
	 */
	java.lang.String getCalling(); 

	/**
	 * @return null
	 */
	java.lang.String getPlanType(); 

	/**
	 * @return null
	 */
	long getConsumptionId(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPriceWithoutTax(); 

	/**
	 * @return null
	 */
	long getDuration(); 

	/**
	 * @return null
	 */
	java.lang.String getDestinationType(); 

	/**
	 * @return null
	 */
	java.util.Date getCreationDatetime(); 

	/**
	 * @return null
	 */
	java.lang.String getWayType(); 

	/**
	 * @return null
	 */
	java.lang.String getCalled(); 

}
