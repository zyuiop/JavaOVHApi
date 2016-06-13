package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Service monitoring details
 */

public interface ServiceMonitoring { 

	/**
	 * @return This monitoring id
	 */
	long getMonitoringId(); 

	/**
	 * @return The protocol to use
	 */
	java.lang.String getProtocol(); 

	/**
	 * @return The ip to monitor
	 */
	java.lang.String getIp(); 

	/**
	 * @return The service port to monitor
	 */
	long getPort(); 

	/**
	 * @return The test interval in seconds
	 */
	java.lang.String getInterval(); 

	/**
	 * @return The expected return
	 */
	java.lang.String getChallengeText(); 

	/**
	 * @return The URL to test
	 */
	java.lang.String getUrl(); 

	/**
	 * @return Is this service monitoring is enabled
	 */
	boolean getEnabled(); 

}
