package net.zyuiop.ovhapi.api.objects.dedicated.housing;

/**
 * A structure describing informations for APC orderable for this housing bay
 */

public interface ApcOrderable { 

	/**
	 * @return Is this APC free
	 */
	boolean getFree(); 

	/**
	 * @return Is an APC is orderable for this housing bay
	 */
	boolean getOrderable(); 

}
