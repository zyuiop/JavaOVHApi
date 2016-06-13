package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * Freedoms linked to this hosting account
 */

public interface Freedom { 

	/**
	 * @return Freedom domain
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Available status for freedom
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Freedom type
	 */
	java.lang.String getType(); 

}
