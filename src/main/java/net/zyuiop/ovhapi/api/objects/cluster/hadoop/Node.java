package net.zyuiop.ovhapi.api.objects.cluster.hadoop;

/**
 * Physical or Virtual Node
 */

public interface Node { 

	/**
	 * @return Name of the billing profile attached to the node
	 */
	java.lang.String getBillingProfileName(); 

	/**
	 * @return Profile of the Node
	 */
	java.lang.String getSoftwareProfile(); 

	/**
	 * @return Wether or not the Node is removable
	 */
	boolean getIsRemovable(); 

	/**
	 * @return IP of the Node
	 */
	java.lang.String getIp(); 

	/**
	 * @return Hostname of the node
	 */
	java.lang.String getHostname(); 

	/**
	 * @return State of the Node
	 */
	java.lang.String getState(); 

}
