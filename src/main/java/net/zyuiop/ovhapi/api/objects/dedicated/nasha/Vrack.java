package net.zyuiop.ovhapi.api.objects.dedicated.nasha;

/**
 * Partition Vrack
 */

public interface Vrack { 

	/**
	 * @return vrack name
	 */
	java.lang.String getVrackName(); 

	/**
	 * @return ID
	 */
	long getId(); 

	/**
	 * @return service ip
	 */
	java.lang.String getServiceIp(); 

	/**
	 * @return type of
	 */
	java.lang.String getType(); 

}
