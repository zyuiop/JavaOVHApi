package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * vrack (1.5) nasha server interfaces
 */

public interface Nasha { 

	/**
	 * @return service ip
	 */
	java.lang.String getServiceIp(); 

	/**
	 * @return Name of Nasha zpool
	 */
	java.lang.String getZpool(); 

}
