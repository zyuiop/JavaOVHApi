package net.zyuiop.ovhapi.api.objects.xdsl;

/**
 * Port Mappings
 */

public interface PortMapping { 

	/**
	 * @return Protocol of the port mapping (TCP / UDP)
	 */
	java.lang.String getProtocol(); 

	/**
	 * @return ID of the ongoing todo (NULL if none)
	 */
	long getTaskId(); 

	/**
	 * @return Name of the port mapping entry
	 */
	java.lang.String getName(); 

	/**
	 * @return External Port that the modem will listen on. List of externalPorts not available for now in the API : 8, 21, 68, 5060, 21800-21805, 51005
	 */
	long getExternalPortStart(); 

	/**
	 * @return The last port of the interval on the External Client that will get the connections
	 */
	long getExternalPortEnd(); 

	/**
	 * @return Description of the Port Mapping
	 */
	java.lang.String getDescription(); 

	/**
	 * @return The IP address of the destination of the packets
	 */
	java.lang.String getInternalClient(); 

	/**
	 * @return An ip which will access to the defined rule. Default : no restriction applied
	 */
	java.lang.String getAllowedRemoteIp(); 

	/**
	 * @return The port on the Internal Client that will get the connections
	 */
	long getInternalPort(); 

	/**
	 * @return ID of the port mapping entry
	 */
	long getId(); 

}
