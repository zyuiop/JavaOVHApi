package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about server PCI devices
 */

public interface RtmPci { 

	/**
	 * @return PCI bus device
	 */
	java.lang.String getBus(); 

	/**
	 * @return PCI device information
	 */
	java.lang.String getDevice(); 

}
