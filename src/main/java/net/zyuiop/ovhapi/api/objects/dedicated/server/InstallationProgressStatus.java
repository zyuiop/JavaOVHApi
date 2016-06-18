package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about this dedicated server installation status
 */

public interface InstallationProgressStatus { 

	/**
	 * @return Installation steps
	 */
	net.zyuiop.ovhapi.api.objects.dedicated.server.InstallationProgressSteps[] getProgress(); 

	/**
	 * @return Elapsed time in seconds since installation beggining
	 */
	long getElapsedTime(); 

}
