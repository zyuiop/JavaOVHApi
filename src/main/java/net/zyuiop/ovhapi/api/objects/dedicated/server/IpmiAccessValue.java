package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing ipmi access value
 */

public interface IpmiAccessValue { 

	/**
	 * @return value
	 */
	java.lang.String getValue(); 

	/**
	 * @return Session expiration date
	 */
	java.util.Date getExpiration(); 

}
