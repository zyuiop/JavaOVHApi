package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Rule on ip
 */

public interface FirewallNetworkRule { 

	/**
	 * @return Network protocol
	 */
	java.lang.String getProtocol(); 

	/**
	 * @return Source ip for your rule
	 */
	java.lang.String getSource(); 

	/**
	 * @return Destination port range for your rule. Only with TCP/UDP protocol
	 */
	java.lang.String getDestinationPort(); 

	/**
	 * @return null
	 */
	long getSequence(); 

	/**
	 * @return Destination ip for your rule
	 */
	java.lang.String getDestination(); 

	/**
	 * @return null
	 */
	java.lang.String getRule(); 

	/**
	 * @return Source port range for your rule. Only with TCP/UDP protocol
	 */
	java.lang.String getSourcePort(); 

	/**
	 * @return Current state of your rule
	 */
	java.lang.String getState(); 

	/**
	 * @return TCP option on your rule
	 */
	java.lang.String getTcpOption(); 

	/**
	 * @return null
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Action on this rule
	 */
	java.lang.String getAction(); 

	/**
	 * @return Fragments option
	 */
	boolean getFragments(); 

}
