package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * IP Restriction default rule
 */

public interface IpRestrictionDefaultRule { 

	/**
	 * @return Send an email if someone try to access
	 */
	boolean getWarning(); 

	/**
	 * @return Accept or deny access
	 */
	java.lang.String getRule(); 

}
