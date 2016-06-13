package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * A structure describing IPMI test result
 */

public interface IpmiTestResult { 

	/**
	 * @return Test result
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Test running date
	 */
	java.util.Date getDate(); 

}
