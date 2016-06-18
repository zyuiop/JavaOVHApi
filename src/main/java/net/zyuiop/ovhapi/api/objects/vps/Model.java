package net.zyuiop.ovhapi.api.objects.vps;

/**
 * A structure describing characteristics of a VPS model
 */

public interface Model { 

	/**
	 * @return null
	 */
	long getMaximumAdditionnalIp(); 

	/**
	 * @return null
	 */
	java.lang.String[] getDatacenter(); 

	/**
	 * @return null
	 */
	long getDisk(); 

	/**
	 * @return null
	 */
	java.lang.String getOffer(); 

	/**
	 * @return null
	 */
	java.lang.String getVersion(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	java.lang.String[] getAvailableOptions(); 

	/**
	 * @return null
	 */
	long getMemory(); 

	/**
	 * @return null
	 */
	long getVcore(); 

}
