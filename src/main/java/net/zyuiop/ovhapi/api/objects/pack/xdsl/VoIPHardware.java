package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Hardware for VoIP line
 */

public interface VoIPHardware { 

	/**
	 * @return null
	 */
	boolean getNeedShipping(); 

	/**
	 * @return null
	 */
	java.lang.String getUrl(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	long getMax(); 

	/**
	 * @return null
	 */
	java.lang.String getLabel(); 

	/**
	 * @return null
	 */
	java.lang.String getImage(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getDeposit(); 

}
