package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Intervention made on this server
 */

public interface Intervention { 

	/**
	 * @return the intervention start date
	 */
	java.util.Date getDate(); 

	/**
	 * @return the intervention type
	 */
	java.lang.String getType(); 

	/**
	 * @return The intervention id
	 */
	long getInterventionId(); 

}
