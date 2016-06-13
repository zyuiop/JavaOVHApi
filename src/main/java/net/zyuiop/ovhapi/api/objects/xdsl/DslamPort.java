package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Information about the port on the DSLAM
 */

public interface DslamPort { 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile getProfile(); 

	/**
	 * @return Last time the port synchronized
	 */
	java.util.Date getLastSyncDate(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Last time the port lost the synchronization
	 */
	java.util.Date getLastDesyncDate(); 

}
