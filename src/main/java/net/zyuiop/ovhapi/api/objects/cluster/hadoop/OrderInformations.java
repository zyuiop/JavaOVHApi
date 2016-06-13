package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Detailed information on the order of one Hadoop Cluster
 */

public interface OrderInformations { 

	/**
	 * @return Minimum number of Node allowed in one order
	 */
	long getMinimumOrderableNodes(); 

	/**
	 * @return Maximal number of Node allowed in one order
	 */
	long getMaximumOrderableNodes(); 

}
