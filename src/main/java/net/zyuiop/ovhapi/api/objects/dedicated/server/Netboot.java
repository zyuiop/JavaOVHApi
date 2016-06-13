package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Available boots
 */

public interface Netboot { 

	/**
	 * @return the boot system
	 */
	java.lang.String getBootType(); 

	/**
	 * @return The boot kernel
	 */
	java.lang.String getKernel(); 

	/**
	 * @return boot id
	 */
	long getBootId(); 

	/**
	 * @return the boot description
	 */
	java.lang.String getDescription(); 

}
