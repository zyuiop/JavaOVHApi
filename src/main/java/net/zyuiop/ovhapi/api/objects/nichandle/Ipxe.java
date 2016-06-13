package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * Customer IPXE scripts
 */

public interface Ipxe { 

	/**
	 * @return Content of your IPXE script
	 */
	java.lang.String getScript(); 

	/**
	 * @return Name of this script
	 */
	java.lang.String getName(); 

}
