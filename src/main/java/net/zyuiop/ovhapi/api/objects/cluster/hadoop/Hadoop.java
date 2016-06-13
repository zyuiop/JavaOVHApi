package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Managed Hadoop Cluster
 */

public interface Hadoop { 

	/**
	 * @return CDH and Cloudera Manager version
	 */
	java.lang.String getClouderaVersion(); 

	/**
	 * @return Maximum quantity of nodes allowed to be ordered in the cluster
	 */
	long getMaxOrderableNodes(); 

	/**
	 * @return Service name of your Cluster
	 */
	java.lang.String getName(); 

	/**
	 * @return State of the Hadoop Cluster
	 */
	java.lang.String getState(); 

}
