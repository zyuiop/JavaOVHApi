package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /dedicatedCloud APIs
 */

public interface DedicatedCloud { 

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	 * @param taskId Task id
	*/
	void putServiceNameTaskTaskId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task param0, java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Create a new Allowed network for your dedicatedCloud
	 * Facultative parameters ? false
	 * @param network Network name, e.g. 123.100.200.0/32
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameAllowedNetwork(java.lang.String network, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Filers mounted on all Datacenters of your Dedicated Cloud Vsphere
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameFiler(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Order a new hourly Filer mounted in every Datacenter of a given Dedicated Cloud
	 * Facultative parameters ? false
	 * @param name Filer profile you want to order
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameOrderNewFilerHourly(java.lang.String name, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Remove this Backup from your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task deleteServiceNameDatacenterDatacenterIdBackup(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Enable a Backup on this dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenterDatacenterIdBackup(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Create a new User in your Dedicated Cloud
	 * Facultative parameters ? true
	 * @param name The user name
	 * @param serviceName Domain of the service
	 * @param canAddRessource Is this User able to add ressources in the Datacenter he has access ? (default is no right to add ressource)
	 * @param email The user email. If this field is empty, user informations will be sent to the dedicatedCloud administrator contact.
	 * @param right Determine what kind of access the User will have in all Datacenters of your Dedicated Cloud (default is disabled)
	 * @param password The user password. It must fits your Dedicated Cloud password policy. If this field is empty, a random password will be generated and sent by email.
	 * @param vmNetworkRole Determine how this user will be able to act on this Dedicated Cloud VM Nertwork
	 * @param networkRole Determine how this user will be able to act on this Dedicated Cloud v(x)Lans
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUser(java.lang.String name, java.lang.String serviceName, boolean canAddRessource, java.lang.String email, java.lang.String right, java.lang.String password, java.lang.String vmNetworkRole, java.lang.String networkRole) throws java.io.IOException;

	/**
	 * Create a new User in your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param name The user name
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUser(java.lang.String name, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Tasks associated with this Dedicated Cloud
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param state Filter the value of state property (=)
	*/
	long[] getServiceNameTask(java.lang.String serviceName, java.lang.String state) throws java.io.IOException;

	/**
	 * Tasks associated with this Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameTask(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	 * @param rightId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Right getServiceNameUserUserIdRightRightId(java.lang.String serviceName, long userId, long rightId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	void putServiceNameDatacenterDatacenterId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Datacenter param0, java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Dedicated Cloud vlans
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameVlan(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the new Prices for your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.ResourceNewPrices getServiceNameNewPrices(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available hosts in a given Dedicated Cloud Datacenter
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.host.Profile[] getServiceNameDatacenterDatacenterIdOrderableHostProfiles(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param filerId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Filer getServiceNameFilerFilerId(java.lang.String serviceName, long filerId) throws java.io.IOException;

	/**
	 * Get the current password policy for your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.PasswordPolicy getServiceNamePasswordPolicy(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param vrack vrack name
	*/
	net.zyuiop.ovhapi.api.objects.vrack.DedicatedCloud getServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException;

	/**
	 * Get the countries you can select in /order/dedicatedCloud/{serviceName}/ip
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String[] getServiceNameOrderableIpCountries(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Change Dedicated Cloud user properties
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param userId null
	 * @param email null
	 * @param fullAdminRo null
	 * @param canManageIpFailOvers null
	 * @param canManageNetwork null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdChangeProperties(java.lang.String serviceName, long userId, java.lang.String email, boolean fullAdminRo, boolean canManageIpFailOvers, boolean canManageNetwork) throws java.io.IOException;

	/**
	 * Change Dedicated Cloud user properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdChangeProperties(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	 * @param userId null
	 * @param taskId Task id
	*/
	void putServiceNameUserUserIdTaskTaskId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task param0, java.lang.String serviceName, long userId, long taskId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.DedicatedCloud getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List available filers in a given Dedicated Cloud Datacenter
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.filer.Profile[] getServiceNameDatacenterDatacenterIdOrderableFilerProfiles(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Upgrade your hypervisor to the next released version
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUpgradeHypervisor(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param networkAccessId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.AllowedNetwork getServiceNameAllowedNetworkNetworkAccessId(java.lang.String serviceName, long networkAccessId) throws java.io.IOException;

	/**
	 * Reset the password for a given Dedicated Cloud user - Deprecated, use POST /dedicatedCloud/{serviceName}/user/{userId}/changePassword instead
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdResetPassword(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Tasks associated with this User
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param userId null
	 * @param state Filter the value of state property (=)
	*/
	long[] getServiceNameUserUserIdTask(java.lang.String serviceName, long userId, java.lang.String state) throws java.io.IOException;

	/**
	 * Tasks associated with this User
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	long[] getServiceNameUserUserIdTask(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Tasks associated with this Datacenter
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	 * @param state Filter the value of state property (=)
	*/
	long[] getServiceNameDatacenterDatacenterIdTask(java.lang.String serviceName, long datacenterId, java.lang.String state) throws java.io.IOException;

	/**
	 * Tasks associated with this Datacenter
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	long[] getServiceNameDatacenterDatacenterIdTask(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Datacenters associated with this Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameDatacenter(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Hosts associated with this Datacenter
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	long[] getServiceNameDatacenterDatacenterIdHost(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	 * @param taskId Task id
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task getServiceNameUserUserIdTaskTaskId(java.lang.String serviceName, long userId, long taskId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.User getServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Order a new hourly Filer in a given Datacenter
	 * Facultative parameters ? false
	 * @param name Filer profile you want to order
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenterDatacenterIdOrderNewFilerHourly(java.lang.String name, java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	void putServiceNameUserUserId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.User param0, java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param commercialRangeName The name of this commercial range
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.CommercialRange getCommercialRangeCommercialRangeName(java.lang.String commercialRangeName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param network IP ex: 213.186.33.34/24
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Ip getServiceNameIpNetwork(java.lang.String serviceName, java.lang.String network) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.dedicatedcloud.DedicatedCloud param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Datacenter getServiceNameDatacenterDatacenterId(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Get the name of the commercial ranges orderable in your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String[] getServiceNameCommercialRangeOrderable(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a new Datacenter in your Dedicated Cloud
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param commercialRangeName The commercial range of this new datacenter (if not set dedicatedCloud2013v1 is the default value). You can see what commercial ranges are orderable on this API section : /dedicatedCloud/commercialRange/
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenter(java.lang.String serviceName, java.lang.String commercialRangeName) throws java.io.IOException;

	/**
	 * Add a new Datacenter in your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenter(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param vlanId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Vlan getServiceNameVlanVlanId(java.lang.String serviceName, long vlanId) throws java.io.IOException;

	/**
	 * This Dedicated Cloud vrack
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String[] getServiceNameVrack(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Terminate your service
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String postServiceNameTerminate(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Capabilities getServiceNameCapabilities(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Disable the given Dedicated Cloud user 
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdDisable(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Change Dedicated Cloud user password
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param userId null
	 * @param password New password for this Dedicated Cloud user. It must fits your Dedicated Cloud password policy. If this field is empty, a random password will be generated and sent by email.
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdChangePassword(java.lang.String serviceName, long userId, java.lang.String password) throws java.io.IOException;

	/**
	 * Change Dedicated Cloud user password
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdChangePassword(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * List of commercial Ranges available in a Dedicated Cloud
	 * Facultative parameters ? false
	*/
	java.lang.String[] getCommercialRange() throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Enable the given Dedicated Cloud user 
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameUserUserIdEnable(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * remove this a dedicatedCloud from this vrack
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param vrack vrack name
	*/
	net.zyuiop.ovhapi.api.objects.vrack.Task deleteServiceNameVrackVrack(java.lang.String serviceName, java.lang.String vrack) throws java.io.IOException;

	/**
	 * Get the name of the commercial ranges compliant with your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String[] getServiceNameCommercialRangeCompliance(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Order a new hourly Host in a given Datacenter
	 * Facultative parameters ? false
	 * @param name Host profile you want to order
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task postServiceNameDatacenterDatacenterIdOrderNewHostHourly(java.lang.String name, java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	 * @param taskId Task id
	*/
	void putServiceNameDatacenterDatacenterIdTaskTaskId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task param0, java.lang.String serviceName, long datacenterId, long taskId) throws java.io.IOException;

	/**
	 * User rights in a given Datacenters
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	long[] getServiceNameUserUserIdRight(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	 * @param networkAccessId null
	*/
	void putServiceNameAllowedNetworkNetworkAccessId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.AllowedNetwork param0, java.lang.String serviceName, long networkAccessId) throws java.io.IOException;

	/**
	 * Remove a given user from your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param userId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task deleteServiceNameUserUserId(java.lang.String serviceName, long userId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	 * @param hostId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Host getServiceNameDatacenterDatacenterIdHostHostId(java.lang.String serviceName, long datacenterId, long hostId) throws java.io.IOException;

	/**
	 * Dedicated Cloud users
	 * Facultative parameters ? true
	 * @param serviceName Domain of the service
	 * @param name Filter the value of name property (like)
	*/
	long[] getServiceNameUser(java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Dedicated Cloud users
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Filers associated with this Datacenter
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	long[] getServiceNameDatacenterDatacenterIdFiler(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Backup getServiceNameDatacenterDatacenterIdBackup(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Remove this network from your Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param networkAccessId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task deleteServiceNameAllowedNetworkNetworkAccessId(java.lang.String serviceName, long networkAccessId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	 * @param filerId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Filer getServiceNameDatacenterDatacenterIdFilerFilerId(java.lang.String serviceName, long datacenterId, long filerId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName Domain of the service
	 * @param userId null
	 * @param rightId null
	*/
	void putServiceNameUserUserIdRightRightId(net.zyuiop.ovhapi.api.objects.dedicatedcloud.Right param0, java.lang.String serviceName, long userId, long rightId) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDedicatedCloud() throws java.io.IOException;

	/**
	 * Networks allowed to access to this Dedicated Cloud management interface
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	long[] getServiceNameAllowedNetwork(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param taskId Task id
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task getServiceNameTaskTaskId(java.lang.String serviceName, long taskId) throws java.io.IOException;

	/**
	 * Remove this Datacenter from your Dedicated Cloud. (It has to be empty in order to be removable)
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task deleteServiceNameDatacenterDatacenterId(java.lang.String serviceName, long datacenterId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	 * @param datacenterId null
	 * @param taskId Task id
	*/
	net.zyuiop.ovhapi.api.objects.dedicatedcloud.Task getServiceNameDatacenterDatacenterIdTaskTaskId(java.lang.String serviceName, long datacenterId, long taskId) throws java.io.IOException;

	/**
	 * Ip Blocks attached to this Dedicated Cloud
	 * Facultative parameters ? false
	 * @param serviceName Domain of the service
	*/
	java.lang.String[] getServiceNameIp(java.lang.String serviceName) throws java.io.IOException;

}
