package net.zyuiop.ovhapi.api.objects.cloud.network;

/**
 * Network
 */

public interface Network { 

	/**
	 * @return Network status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Network name
	 */
	java.lang.String getName(); 

	/**
	 * @return Network region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Network id
	 */
	java.lang.String getId(); 

	/**
	 * @return Network type
	 */
	java.lang.String getType(); 

	/**
	 * @return Network VLAN id
	 */
	long getVlanId(); 

}
