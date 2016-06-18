package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Hosting indys
 */

public interface Indy { 

	/**
	 * @return AttachedDomain ids linked to this multidomain
	 */
	java.lang.String[] getAttachedDomains(); 

	/**
	 * @return Home directory
	 */
	java.lang.String getHome(); 

	/**
	 * @return Login of the multidomain independent user
	 */
	java.lang.String getLogin(); 

	/**
	 * @return User status
	 */
	java.lang.String getState(); 

}
