package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Show the deconsolidation terms
 */

public interface DeconsolidationTerms { 

	/**
	 * @return New abo price after the deconsolidation
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getMonthlyPrice(); 

	/**
	 * @return Duration of month the access will be engaged
	 */
	double getEngagement(); 

	/**
	 * @return Price to pay
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getPrice(); 

}
