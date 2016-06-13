package net.zyuiop.ovhapi.api.objects.cloud.identity;

/**
 * Token
 */

public interface Token { 

	/**
	 * @return 
	 */
	java.lang.String getX-Auth-Token(); 

	/**
	 * @return 
	 */
	net.zyuiop.ovhapi.api.objects.cloud.identity.OpenstackToken getToken(); 

}
