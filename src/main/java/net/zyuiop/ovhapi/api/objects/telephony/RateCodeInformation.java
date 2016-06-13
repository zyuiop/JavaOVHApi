package net.zyuiop.ovhapi.api.objects.telephony;

/**
 * Informations related to the rate code
 */

public interface RateCodeInformation { 

	/**
	 * @return Price per call
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPricePerCallWithoutTax(); 

	/**
	 * @return The Rsva rate code
	 */
	java.lang.String getCode(); 

	/**
	 * @return Price per minute
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPricePerMinuteWithoutTax(); 

}
