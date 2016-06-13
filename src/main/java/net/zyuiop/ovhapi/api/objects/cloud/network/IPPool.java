package net.zyuiop.ovhapi.api.objects.cloud.network;

/**
 * IPPool
 */

public interface IPPool { 

	/**
	 * @return Region for this pool
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Pool ip end
	 */
	java.lang.String getEnd(); 

	/**
	 * @return Pool ip start
	 */
	java.lang.String getStart(); 

}
