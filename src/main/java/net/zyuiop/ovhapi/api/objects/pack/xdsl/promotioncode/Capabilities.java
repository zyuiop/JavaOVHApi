package net.zyuiop.ovhapi.api.objects.pack.xdsl.promotioncode;

/**
 * Informations about a promotion code
 */

public interface Capabilities { 

	/**
	 * @return Amount of the promotion code
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getAmount(); 

	/**
	 * @return Enum of the possible errors
	 */
	java.lang.String getReasonCodes(); 

	/**
	 * @return True if the promotion code generation is available
	 */
	boolean getCanGenerate(); 

	/**
	 * @return Number of months of engagement
	 */
	long getEngagement(); 

}
