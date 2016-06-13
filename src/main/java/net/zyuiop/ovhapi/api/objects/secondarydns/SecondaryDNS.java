package net.zyuiop.ovhapi.api.objects.secondarydns;

/**
 * Secondary dns infos
 */

public interface SecondaryDNS { 

	/**
	 * @return domain on slave server
	 */
	java.lang.String getDomain(); 

	/**
	 * @return secondary dns server
	 */
	java.lang.String getDns(); 

	/**
	 * @return 
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return master ip
	 */
	java.lang.String getIpMaster(); 

}
