package net.zyuiop.ovhapi.api.objects.vrack;

/**
 * A structure given all service allowed for this vrack
 */

public interface AllowedServices { 

	/**
	 * @return list of dedicated servers allowed to be connected to vrack
	 */
	java.lang.String[] getDedicatedServer(); 

	/**
	 * @return list of dedicated cloud allowed to be connected to vrack
	 */
	java.lang.String[] getDedicatedCloud(); 

	/**
	 * @return list of dedicated connect links allowed to be connected to vrack
	 */
	java.lang.String[] getDedicatedConnect(); 

	/**
	 * @return list of legacy vrack (1.0) allowed to be connected to vrack
	 */
	java.lang.String[] getLegacyVrack(); 

	/**
	 * @return list of blocks allowed to be connected to vrack
	 */
	java.lang.String[] getIp(); 

	/**
	 * @return list of publicCloud projects allowed to be connected to vrack
	 */
	java.lang.String[] getCloudProject(); 

}
