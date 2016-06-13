package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange server
 */

public interface Server { 

	/**
	 * @return ipV4
	 */
	java.lang.String getIp(); 

	/**
	 * @return ipV6
	 */
	java.lang.String getIpV6(); 

	/**
	 * @return If true your dns ptr record is valid
	 */
	boolean getIsPtrValid(); 

	/**
	 * @return If true your dns A record is valid
	 */
	boolean getIsAValid(); 

	/**
	 * @return ExchangeServer version
	 */
	long getVersion(); 

	/**
	 * @return Total disk size in MB
	 */
	long getDiskSize(); 

	/**
	 * @return Current disk usage in MB
	 */
	long getCurrentDiskUsage(); 

	/**
	 * @return Server state
	 */
	java.lang.String getState(); 

	/**
	 * @return Exchange commercial version
	 */
	java.lang.String getCommercialVersion(); 

	/**
	 * @return If true your dns ptrV6 record is valid
	 */
	boolean getIsPtrV6Valid(); 

	/**
	 * @return If true your dns AAAA record is valid
	 */
	boolean getIsAaaaValid(); 

	/**
	 * @return Task pending id
	 */
	long getTaskPendingId(); 

	/**
	 * @return If true server is 2010 individual offer
	 */
	boolean getIndividual2010(); 

}
