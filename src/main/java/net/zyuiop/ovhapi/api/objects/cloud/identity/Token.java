package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * Token
 */

public interface Token { 

	/**
	 * @return 
	 */
	java.lang.String getXAuthToken(); 

	/**
	 * @return 
	 */
	net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken getToken(); 

}
