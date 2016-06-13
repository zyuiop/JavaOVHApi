package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * VIP Status by Universe
 */

public interface VipStatus { 

	/**
	 * @return Is account VIP for Web Universe
	 */
	boolean getWeb(); 

	/**
	 * @return Is account VIP for Cloud Universe
	 */
	boolean getCloud(); 

	/**
	 * @return Is account VIP for Dedicated Universe
	 */
	boolean getDedicated(); 

	/**
	 * @return Is account VIP for Telecom Universe
	 */
	boolean getTelecom(); 

}
