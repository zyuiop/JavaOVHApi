package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Represents an order of VoIP lines
 */

public interface VoIPLineOrder { 

	/**
	 * @return null
	 */
	long getOrderId(); 

	/**
	 * @return null
	 */
	java.lang.String getOrderUrl(); 

	/**
	 * @return null
	 */
	long[] getTaskIds(); 

	/**
	 * @return Whether or not this order need to be payed manually
	 */
	boolean getNeedPayment(); 

}
