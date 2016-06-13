package net.zyuiop.ovhapi.api.objects.cloud.ip;

/**
 * FailoverIp
 */

public interface FailoverIp { 

	/**
	 * @return Ip continent
	 */
	java.lang.String getContinentCode(); 

	/**
	 * @return Ip
	 */
	java.lang.String getIp(); 

	/**
	 * @return Current operation progress in percent
	 */
	long getProgress(); 

	/**
	 * @return Ip status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Instance where ip is routed to
	 */
	java.lang.String getRoutedTo(); 

	/**
	 * @return IP sub type
	 */
	java.lang.String getSubType(); 

	/**
	 * @return IP block
	 */
	java.lang.String getBlock(); 

	/**
	 * @return Ip id
	 */
	java.lang.String getId(); 

	/**
	 * @return Ip location
	 */
	java.lang.String getGeoloc(); 

}
