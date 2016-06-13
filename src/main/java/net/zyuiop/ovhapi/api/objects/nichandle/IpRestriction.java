package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * List of all IP Restrictions
 */

public interface IpRestriction { 

	/**
	 * @return An IP range where we will apply the rule
	 */
	java.lang.String getIp(); 

	/**
	 * @return Send an email if someone try to access with this IP address
	 */
	boolean getWarning(); 

	/**
	 * @return The Id of the restriction
	 */
	long getId(); 

	/**
	 * @return Accept or deny IP access
	 */
	java.lang.String getRule(); 

}
