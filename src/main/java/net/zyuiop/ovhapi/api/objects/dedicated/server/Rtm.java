package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Servers statistics sent by RTM (Real Time Monitoring)
 */

public interface Rtm { 

	/**
	 * @return RTM current version
	 */
	java.lang.String getCurrentVersion(); 

	/**
	 * @return RTM currently installed version
	 */
	java.lang.String getInstalledVersion(); 

	/**
	 * @return You need to update RTM script on your server
	 */
	boolean getNeedsUpdate(); 

}
