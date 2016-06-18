package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * OpenstackToken
 */

public interface OpenstackToken { 

	/**
	 * @return 
	 */
	net.zyuiop.ovhapi.api.objects.cloud.identity.Role[] getRoles(); 

	/**
	 * @return 
	 */
	net.zyuiop.ovhapi.api.objects.cloud.identity.Catalog[] getCatalog(); 

	/**
	 * @return 
	 */
	java.util.Date getExpires_at(); 

	/**
	 * @return 
	 */
	net.zyuiop.ovhapi.api.objects.cloud.identity.TokenProject getProject(); 

	/**
	 * @return 
	 */
	java.util.Date getIssued_at(); 

	/**
	 * @return 
	 */
	java.lang.String[] getMethods(); 

	/**
	 * @return 
	 */
	net.zyuiop.ovhapi.api.objects.cloud.identity.UserToken getUser(); 

}
