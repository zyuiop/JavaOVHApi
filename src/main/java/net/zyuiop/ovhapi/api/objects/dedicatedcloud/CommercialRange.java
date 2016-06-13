package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * The commercial ranges actually available in your Dedicated Cloud
 */

public interface CommercialRange { 

	/**
	 * @return The name of this commercial range
	 */
	java.lang.String getCommercialRangeName(); 

	/**
	 * @return The hypervisor versions compliant with this commercial Range
	 */
	java.lang.String getAllowedHypervisorVersions(); 

	/**
	 * @return The range of this Datacenter in this Dedicated Cloud version
	 */
	java.lang.String getRange(); 

	/**
	 * @return The list of NetworkRoles allowed for one user in this commercial range
	 */
	java.lang.String getAllowedNetworkRoles(); 

	/**
	 * @return The name of the dedicated Cloud version associated to this commercial range
	 */
	java.lang.String getDedicatedCloudVersion(); 

}
