package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about opened sockets on the server
 */

public interface RtmConnection { 

	/**
	 * @return System user ID
	 */
	long getUid(); 

	/**
	 * @return The IP address connected
	 */
	java.lang.String getIp(); 

	/**
	 * @return Complete command line used for starting this process
	 */
	java.lang.String getCmdline(); 

	/**
	 * @return Port opened
	 */
	long getPort(); 

	/**
	 * @return Username used to start the process
	 */
	java.lang.String getUsername(); 

	/**
	 * @return Name of the process
	 */
	java.lang.String getProcname(); 

	/**
	 * @return Domain used by the process
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Process ID
	 */
	long getPid(); 

	/**
	 * @return Path to the program
	 */
	java.lang.String getExe(); 

}
