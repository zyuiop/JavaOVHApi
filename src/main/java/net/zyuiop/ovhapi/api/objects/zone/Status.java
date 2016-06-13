package net.zyuiop.ovhapi.api.objects.zone;

/**
 * Zone status
 */

public interface Status { 

	/**
	 * @return Warning list
	 */
	java.lang.String getWarnings(); 

	/**
	 * @return Error list
	 */
	java.lang.String getErrors(); 

	/**
	 * @return True if the zone has successfully been deployed
	 */
	boolean getIsDeployed(); 

}
