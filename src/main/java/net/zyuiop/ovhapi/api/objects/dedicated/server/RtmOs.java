package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about Rtm os
 */

public interface RtmOs { 

	/**
	 * @return OS release
	 */
	java.lang.String getRelease(); 

	/**
	 * @return OS kernel release
	 */
	java.lang.String getKernelRelease(); 

	/**
	 * @return OS kernel version
	 */
	java.lang.String getKernelVersion(); 

}
