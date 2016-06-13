package net.zyuiop.ovhapi.api.objects.cloud.flavor;

/**
 * Flavor
 */

public interface Flavor { 

	/**
	 * @return Max capacity of outbound traffic in Mbit/s
	 */
	long getOutboundBandwidth(); 

	/**
	 * @return Number of disks
	 */
	long getDisk(); 

	/**
	 * @return Flavor name
	 */
	java.lang.String getName(); 

	/**
	 * @return Flavor region
	 */
	java.lang.String getRegion(); 

	/**
	 * @return OS to install on
	 */
	java.lang.String getOsType(); 

	/**
	 * @return Number of VCPUs
	 */
	long getVcpus(); 

	/**
	 * @return Flavor type
	 */
	java.lang.String getType(); 

	/**
	 * @return Flavor id
	 */
	java.lang.String getId(); 

	/**
	 * @return Max capacity of inbound traffic in Mbit/s
	 */
	long getInboundBandwidth(); 

	/**
	 * @return Ram quantity (Gio)
	 */
	long getRam(); 

}
