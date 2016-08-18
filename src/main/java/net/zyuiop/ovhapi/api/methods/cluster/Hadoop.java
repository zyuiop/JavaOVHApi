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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param taskId null
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Order a new node in the cluster
	 * Facultative parameters ? false
	 * @param nodeProfile Node profile you want to order
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameOrderNewNodeHourly(java.lang.String nodeProfile, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add an ACL to your cluster
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your cluster
	 * @param block IP block to allow
	 * @param description Free description
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNetworkAcl(java.lang.String serviceName, java.lang.String block, java.lang.String description) throws java.io.IOException;

	/**
	 * Add an ACL to your cluster
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNetworkAcl(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Remove this Role from the Node
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	 * @param type Role name
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameNodeHostnameRoleType(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getClusterHadoop() throws java.io.IOException;

	/**
	 * Decommission the node and all the services on it
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameDecommission(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException;

	/**
	 * Recommission the node and all the services on it
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRecommission(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Node getServiceNameNodeHostname(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException;

	/**
	 * Remove this User
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param username The username of the User
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameUserUsername(java.lang.String serviceName, java.lang.String username) throws java.io.IOException;

	/**
	 * Remove this Node from the Cluster
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameNodeHostname(java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException;

	/**
	 * Restart the Cloudera Manager Hadoop Cluster (THIS ACTION WILL RESTART EVERY SERVICE)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameRestart(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your cluster
	 * @param block IP Block to allow
	*/
	void putServiceNameNetworkAclBlock(net.zyuiop.ovhapi.api.objects.cluster.hadoop.NetworkAcl param0, java.lang.String serviceName, java.lang.String block) throws java.io.IOException;

	/**
	 * Stop a Cloudera Manager Hadoop Cluster (THIS ACTION WILL STOP EVERY SERVICE)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameStop(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Restart a Cloudera Manager service (THIS ACTION WILL RESTART OTHER DEPENDANT SERVICES)
	 * Facultative parameters ? false
	 * @param service Name of the service to be restarted
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameServiceRestart(java.lang.String service, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Hadoop getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add an User to your cluster
	 * Facultative parameters ? false
	 * @param hue Whether or not the User is allowed to access to the Hue interface
	 * @param clouderaManager Whether or not the User is allowed to access to the Cloudera Manager interface
	 * @param password Password of the User
	 * @param httpFrontend Whether or not the User is allowed to access to the WebUI interfaces
	 * @param username Username of the User
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameUser(boolean hue, boolean clouderaManager, java.lang.String password, boolean httpFrontend, java.lang.String username, java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	 * @param type Role name
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Role getServiceNameNodeHostnameRoleType(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException;

	/**
	 * Reset the password for a given Hadoop Cluster User
	 * Facultative parameters ? false
	 * @param password Password of the User
	 * @param serviceName The internal name of your cluster
	 * @param username The username of the User
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameUserUsernameResetPassword(java.lang.String password, java.lang.String serviceName, java.lang.String username) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param username The username of the User
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.User getServiceNameUserUsername(java.lang.String serviceName, java.lang.String username) throws java.io.IOException;

	/**
	 * Add the Role to the Node
	 * Facultative parameters ? false
	 * @param type Role name
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRole(java.lang.String type, java.lang.String serviceName, java.lang.String hostname) throws java.io.IOException;

	/**
	 * Stop the role on the node (THIS ACTION WILL STOP OTHER DEPENDANT ROLES)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	 * @param type Role name
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRoleTypeStop(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param block IP Block to allow
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.NetworkAcl getServiceNameNetworkAclBlock(java.lang.String serviceName, java.lang.String block) throws java.io.IOException;

	/**
	 * Users associated with this Hadoop Cluster
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Restart the role on the node (THIS ACTION WILL RESTART OTHER DEPENDANT ROLES)
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	 * @param type Role name
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRoleTypeRestart(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your cluster
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Network ACL associated with this Hadoop Cluster
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	java.lang.String[] getServiceNameNetworkAcl(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Terminate your service. THE CLUSTER WILL BE DELETED. ALL YOUR DATA WILL BE LOST
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;

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
	 * Start the role on the node
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param hostname Hostname of the node
	 * @param type Role name
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameNodeHostnameRoleTypeStart(java.lang.String serviceName, java.lang.String hostname, java.lang.String type) throws java.io.IOException;

	/**
	 * Remove this ACL
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	 * @param block IP Block to allow
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task deleteServiceNameNetworkAclBlock(java.lang.String serviceName, java.lang.String block) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your cluster
	 * @param username The username of the User
	*/
	void putServiceNameUserUsername(net.zyuiop.ovhapi.api.objects.cluster.hadoop.User param0, java.lang.String serviceName, java.lang.String username) throws java.io.IOException;

	/**
	 * Stop a Cloudera Manager service (THIS ACTION WILL STOP OTHER DEPENDANT SERVICES)
	 * Facultative parameters ? false
	 * @param service Name of the service to be stopped
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameServiceStop(java.lang.String service, java.lang.String serviceName) throws java.io.IOException;

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
	 * Start a Cloudera Manager service
	 * Facultative parameters ? false
	 * @param service Name of the service to be started
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameServiceStart(java.lang.String service, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Start the Cloudera Manager Hadoop Cluster
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.Task postServiceNameStart(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * Get informations about the order of one cluster
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.cluster.hadoop.OrderInformations getOrderInformations() throws java.io.IOException;

	/**
	 * List of orderable Node profiles
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your cluster
	*/
	java.lang.String[] getServiceNameOrderableNodeProfiles(java.lang.String serviceName) throws java.io.IOException;

}
