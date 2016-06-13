package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud
 */

public interface DedicatedCloud { 

	/**
	 * @return The maximum amount of connected users allowed on the Dedicated Cloud management interface
	 */
	long getUserLimitConcurrentSession(); 

	/**
	 * @return The management interface name
	 */
	java.lang.String getManagementInterface(); 

	/**
	 * @return Billing type of your Dedicated Cloud
	 */
	java.lang.String getBillingType(); 

	/**
	 * @return Datacenter where your Dedicated Cloud is physically located
	 */
	java.lang.String getLocation(); 

	/**
	 * @return Enable SSL v3 support. Warning : this option is not recommended as it was recognized as a security breach. If this is enabled, we advise you to enable the filtered User access policy
	 */
	boolean getSslV3(); 

	/**
	 * @return Service name of your Dedicated Cloud
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return The timeout (in seconds) for the user sessions on the Dedicated Cloud management interface. 0 value disable the timeout
	 */
	long getUserSessionTimeout(); 

	/**
	 * @return Description of your Dedicated Cloud
	 */
	java.lang.String getDescription(); 

	/**
	 * @return The current version of your Dedicated Cloud
	 */
	java.lang.String getCommercialRange(); 

	/**
	 * @return Current state of your Dedicated Cloud
	 */
	java.lang.String getState(); 

	/**
	 * @return SPLA licensing state
	 */
	boolean getSpla(); 

	/**
	 * @return Access policy of your Dedicated Cloud : opened to every IPs or filtered
	 */
	java.lang.String getUserAccessPolicy(); 

	/**
	 * @return The current bandwidth of your Dedicated Cloud
	 */
	java.lang.String getBandwidth(); 

	/**
	 * @return null
	 */
	java.lang.String getUserLogoutPolicy(); 

	/**
	 * @return Url to the vScope associated to this Dedicated Cloud
	 */
	java.lang.String getVScopeUrl(); 

}
