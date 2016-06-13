package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud Datacenter
 */

public interface Datacenter { 

	/**
	 * @return The commercial range associated to this Datacenter
	 */
	java.lang.String getCommercialRangeName(); 

	/**
	 * @return Check if this datacenter is removable (Need to be Empty)
	 */
	boolean getIsRemovable(); 

	/**
	 * @return Os version installed on your Dedicated Cloud
	 */
	java.lang.String getVersion(); 

	/**
	 * @return null
	 */
	java.lang.String getName(); 

	/**
	 * @return null
	 */
	long getDatacenterId(); 

	/**
	 * @return null
	 */
	java.lang.String getDescription(); 

}
