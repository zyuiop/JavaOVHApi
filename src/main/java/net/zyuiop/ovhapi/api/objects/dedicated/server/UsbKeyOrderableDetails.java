package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about orderable USB keys
 */

public interface UsbKeyOrderableDetails { 

	/**
	 * @return Which option is required to order an USB key
	 */
	java.lang.String getOptionRequired(); 

	/**
	 * @return Number of USB keys that can be ordered for this server
	 */
	long getNumber(); 

	/**
	 * @return Is USB keys orderable for this server
	 */
	boolean getOrderable(); 

	/**
	 * @return Orderable USB keys capacity in gigabytes
	 */
	long[] getCapacity(); 

}
