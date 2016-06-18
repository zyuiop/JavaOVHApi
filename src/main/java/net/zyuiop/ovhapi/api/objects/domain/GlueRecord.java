package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Glue record
 */

public interface GlueRecord { 

	/**
	 * @return Ips of the glue record
	 */
	java.lang.String[] getIps(); 

	/**
	 * @return Host of the glue record
	 */
	java.lang.String getHost(); 

}
