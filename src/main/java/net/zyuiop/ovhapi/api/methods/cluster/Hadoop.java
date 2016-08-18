package net.zyuiop.ovhapi.api.methods.cluster;

/**
 * A class to interact with OVH's /cluster/hadoop APIs
 */

public interface Hadoop { 


	/**
	 * Roles (ie set of Hadoop services) of the Node
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	*/
	java.lang.String[] getServiceNameNodeHostnameRole(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException;

	/**
	 * Tasks associated with this Hadoop Cluster
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your cluster
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String status) throws java.io.IOException;

	/**
	 * Tasks associated with this Hadoop Cluster
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;









	/**
	 * Network ACL associated with this Hadoop Cluster
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	java.lang.String[] getServiceNameNetworkAcl(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of orderable Node profiles
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	java.lang.String[] getServiceNameOrderableNodeProfiles(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getClusterHadoop() throws java.io.IOException;

	/**
	 * Nodes of the Cluster
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your cluster
	 * @param softwareProfile Filter the value of softwareProfile property (=)
	*/
	java.lang.String[] getServiceNameNode(java.lang.String serviceName, java.lang.String softwareProfile) throws java.io.IOException;

	/**
	 * Nodes of the Cluster
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	java.lang.String[] getServiceNameNode(java.lang.String serviceName) throws java.io.IOException;













	/**
	 * Users associated with this Hadoop Cluster
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException;














}
