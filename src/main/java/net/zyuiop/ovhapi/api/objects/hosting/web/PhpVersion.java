package net.zyuiop.ovhapi.api.objects.hosting.web;

/**
 * State of available php versions for this account
 */

public interface PhpVersion { 

	/**
	 * @return Current support of this php version
	 */
	java.lang.String getSupport(); 

	/**
	 * @return PHP version
	 */
	java.lang.String getVersion(); 

}
