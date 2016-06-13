package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * DynHost record
 */

public interface DynHostRecord { 

	/**
	 * @return Ip address of the DynHost record
	 */
	java.lang.String getIp(); 

	/**
	 * @return Zone of the DynHost record
	 */
	java.lang.String getZone(); 

	/**
	 * @return Id of the DynHost record
	 */
	long getId(); 

	/**
	 * @return Subdomain of the DynHost record
	 */
	java.lang.String getSubDomain(); 

}
