package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about this dedicated server installation steps
 */

public interface InstallationProgressSteps { 

	/**
	 * @return Informations about this installation step
	 */
	java.lang.String getComment(); 

	/**
	 * @return Status of this installation step
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Error details if state is error
	 */
	java.lang.String getError(); 

}
