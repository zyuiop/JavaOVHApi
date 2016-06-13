package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations bandwidth orderable for this dedicated server
 */

public interface BandwidthOrderable { 

	/**
	 * @return Bandwidth "ultimate" orderable in mbps
	 */
	long[] getUltimate(); 

	/**
	 * @return Bandwidth "premium" orderable in mbps
	 */
	long[] getPremium(); 

	/**
	 * @return Is bandwidth orderable for this server
	 */
	boolean getOrderable(); 

	/**
	 * @return Bandwidth "platinum" orderable in mbps
	 */
	long[] getPlatinum(); 

}
