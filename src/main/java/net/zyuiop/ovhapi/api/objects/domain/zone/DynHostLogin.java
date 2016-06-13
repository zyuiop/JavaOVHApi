package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Manage DynHost login
 */

public interface DynHostLogin { 

	/**
	 * @return Zone
	 */
	java.lang.String getZone(); 

	/**
	 * @return Subdomain that the login will be allowed to update (* to allow all)
	 */
	java.lang.String getSubDomain(); 

	/**
	 * @return Login
	 */
	java.lang.String getLogin(); 

}
