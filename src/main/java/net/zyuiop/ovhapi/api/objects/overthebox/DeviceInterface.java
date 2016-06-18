package net.zyuiop.ovhapi.api.objects.overthebox;

/**
 * Infos about a network interface
 */

public interface DeviceInterface { 

	/**
	 * @return Public IP of the interface
	 */
	java.lang.String getPublicIp(); 

	/**
	 * @return Status of MPTCP on this interface
	 */
	java.lang.String getMultipathStatus(); 

	/**
	 * @return IP of the interface
	 */
	java.lang.String getIp(); 

	/**
	 * @return Gateway of the interface
	 */
	java.lang.String getGateway(); 

	/**
	 * @return Name of the interface
	 */
	java.lang.String getName(); 

	/**
	 * @return The DNS servers of this interface
	 */
	java.lang.String[] getDnsServers(); 

	/**
	 * @return Netmask of the interface
	 */
	java.lang.String getNetmask(); 

}
