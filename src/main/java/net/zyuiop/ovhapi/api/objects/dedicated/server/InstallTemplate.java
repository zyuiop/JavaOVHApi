package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing informations about an Installation templates
 */

public interface InstallTemplate { 

	/**
	 * @return Names list of ovh installationtemplates compatibles with this server
	 */
	java.lang.String getOvh(); 

	/**
	 * @return Names list of yours installation templates compatibles with this server
	 */
	java.lang.String getPersonal(); 

}
