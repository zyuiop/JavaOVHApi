package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /xdsl APIs
 */

public interface Xdsl { 

	/**
	 * The lines of the access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameLines(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param ip The IP address
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.IP getServiceNameIpsIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param id Return merchandise authorisation identifier
	*/
	net.zyuiop.ovhapi.api.objects.telephony.Rma getServiceNameRmaId(java.lang.String serviceName, java.lang.String id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param number The number of the line
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Line getServiceNameLinesNumber(java.lang.String serviceName, java.lang.String number) throws java.io.IOException;

	/**
	 * Get the status of the order
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.orderfollowup.Step[] getServiceNameOrderFollowup(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param name Name of the port mapping entry
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.PortMapping getServiceNameModemPortMappingsName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Renew PPP password and send the PPP login informations to the e-mail of the nicAdmin
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	void postServiceNameRequestPPPLoginMail(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.LAN getServiceNameModemLanLanName(java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.AccessDiagnostic getServiceNameDiagnostic(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a DHCP static lease
	 * Facultative parameters ? true
	 * @param MACAddress The MAC address of the device
	 * @param IPAddress The IP address of the device
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	 * @param dhcpName Name of the DHCP
	 * @param name Name of the DHCP static lease
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress postServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String MACAddress, java.lang.String IPAddress, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String name) throws java.io.IOException;

	/**
	 * Add a DHCP static lease
	 * Facultative parameters ? false
	 * @param MACAddress The MAC address of the device
	 * @param IPAddress The IP address of the device
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	 * @param dhcpName Name of the DHCP
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress postServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String MACAddress, java.lang.String IPAddress, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException;

	/**
	 * List of PortMappings on this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameModemPortMappings(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id ID of the incident
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Incident getIncidentsId(long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	 * @param dhcpName Name of the DHCP
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.DHCP getServiceNameModemLanLanNameDhcpDhcpName(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException;

	/**
	 * List all availables profiles for this port
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param number The number of the line
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.DslamLineProfile[] getServiceNameLinesNumberDslamPortAvailableProfiles(java.lang.String serviceName, java.lang.String number) throws java.io.IOException;

	/**
	 * Informations about the extra IP range during address move
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.ExtraIpRangeMove getServiceNameAddressMoveExtraIpRange(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of LANs on this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameModemLan(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Initiate the extra IP range migration
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameAddressMoveExtraIpRangeMove(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	*/
	void putServiceNameModemLanLanName(net.zyuiop.ovhapi.api.objects.xdsl.LAN param0, java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException;

	/**
	 * Get various statistics about the line
	 * Facultative parameters ? false
	 * @param period null
	 * @param type null
	 * @param serviceName The internal name of your XDSL offer
	 * @param number The number of the line
	*/
	net.zyuiop.ovhapi.api.objects.complextype.UnitAndValues getServiceNameLinesNumberStatistics(java.lang.String period, java.lang.String type, java.lang.String serviceName, java.lang.String number) throws java.io.IOException;

	/**
	 * Return the broken equipment in instantRefund
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	void postSpareSpareReturnMerchandise(java.lang.String spare) throws java.io.IOException;

	/**
	 * Run diagnostic on the access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameDiagnostic(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get resiliation terms
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your XDSL offer
	 * @param resiliationDate The desired resiliation date
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms getServiceNameResiliationTerms(java.lang.String serviceName, java.util.Date resiliationDate) throws java.io.IOException;

	/**
	 * Get resiliation terms
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.ResiliationTerms getServiceNameResiliationTerms(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get various statistics about this access
	 * Facultative parameters ? false
	 * @param period null
	 * @param type null
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.complextype.UnitAndValues getServiceNameStatistics(java.lang.String period, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of DHCP Static Address of this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	 * @param dhcpName Name of the DHCP
	*/
	java.lang.String[] getServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your XDSL offer
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	long[] postServiceNameChangeContact(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get all available spare brands
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSpareBrands() throws java.io.IOException;

	/**
	 * Stop renewing this extra IPv4 option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param ip The IP address
	*/
	void deleteServiceNameIpsIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task getServiceNameTasksId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Get information about the ongoing resiliation
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail getServiceNameResiliationFollowup(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of WLANs on this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameModemWifi(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List of incidents
	 * Facultative parameters ? true
	 * @param creationDate Filter the value of creationDate property (>)
	 * @param endDate Filter the value of endDate property (<)
	*/
	long[] getIncidents(java.util.Date creationDate, java.util.Date endDate) throws java.io.IOException;

	/**
	 * List of incidents
	 * Facultative parameters ? false
	*/
	long[] getIncidents() throws java.io.IOException;

	/**
	 * Add a notification
	 * Facultative parameters ? true
	 * @param frequency null
	 * @param type null
	 * @param serviceName The internal name of your XDSL offer
	 * @param smsAccount The SMS account which will be debited for each sent SMS, if the type is sms
	 * @param email The e-mail address, if type is mail
	 * @param downThreshold The number of seconds the access has to be down to trigger the alert
	 * @param allowIncident Whether or not to allow notifications concerning generic incidents
	 * @param phone The phone number, if type is sms
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification postServiceNameMonitoringNotifications(java.lang.String frequency, java.lang.String type, java.lang.String serviceName, java.lang.String smsAccount, java.lang.String email, long downThreshold, boolean allowIncident, java.lang.String phone) throws java.io.IOException;

	/**
	 * Add a notification
	 * Facultative parameters ? false
	 * @param frequency null
	 * @param type null
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification postServiceNameMonitoringNotifications(java.lang.String frequency, java.lang.String type, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Resiliate the access
	 * Facultative parameters ? true
	 * @param resiliationSurvey Comment about resiliation reasons
	 * @param serviceName The internal name of your XDSL offer
	 * @param resiliationDate The desired resiliation date
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail postServiceNameResiliate(net.zyuiop.ovhapi.api.objects.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String serviceName, java.util.Date resiliationDate) throws java.io.IOException;

	/**
	 * Resiliate the access
	 * Facultative parameters ? false
	 * @param resiliationSurvey Comment about resiliation reasons
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.ResiliationFollowUpDetail postServiceNameResiliate(net.zyuiop.ovhapi.api.objects.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Add a port mapping
	 * Facultative parameters ? true
	 * @param protocol Protocol of the port mapping (TCP / UDP)
	 * @param name Name of the port mapping entry
	 * @param externalPortStart External Port that the modem will listen on
	 * @param internalClient The IP address of the destination of the packets
	 * @param internalPort The port on the Internal Client that will get the connections
	 * @param serviceName The internal name of your XDSL offer
	 * @param description Description of the Port Mapping
	 * @param externalPortEnd The last port of the interval on the External Client that will get the connections
	 * @param allowedRemoteIp An ip which will access to the defined rule. Default : no restriction applied
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.PortMapping postServiceNameModemPortMappings(java.lang.String protocol, java.lang.String name, long externalPortStart, java.lang.String internalClient, long internalPort, java.lang.String serviceName, java.lang.String description, long externalPortEnd, java.lang.String allowedRemoteIp) throws java.io.IOException;

	/**
	 * Add a port mapping
	 * Facultative parameters ? false
	 * @param protocol Protocol of the port mapping (TCP / UDP)
	 * @param name Name of the port mapping entry
	 * @param externalPortStart External Port that the modem will listen on
	 * @param internalClient The IP address of the destination of the packets
	 * @param internalPort The port on the Internal Client that will get the connections
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.PortMapping postServiceNameModemPortMappings(java.lang.String protocol, java.lang.String name, long externalPortStart, java.lang.String internalClient, long internalPort, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Refresh the list of connected devices on the modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameModemRefreshConnectedDevices(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete this notification
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param id Id of the object
	*/
	void deleteServiceNameMonitoringNotificationsId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	 * @param name Name of the port mapping entry
	*/
	void putServiceNameModemPortMappingsName(net.zyuiop.ovhapi.api.objects.xdsl.PortMapping param0, java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param macAddress MAC address of the device
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.ConnectedDevice getServiceNameModemConnectedDevicesMacAddress(java.lang.String serviceName, java.lang.String macAddress) throws java.io.IOException;

	/**
	 * Switch this access to total deconsolidation
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your XDSL offer
	 * @param rio A token to prove the ownership of the line number, needed to port the number
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameRequestTotalDeconsolidation(java.lang.String serviceName, java.lang.String rio) throws java.io.IOException;

	/**
	 * Switch this access to total deconsolidation
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameRequestTotalDeconsolidation(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Reset the port on the DSLAM
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param number The number of the line
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameLinesNumberDslamPortReset(java.lang.String serviceName, java.lang.String number) throws java.io.IOException;

	/**
	 * List of DHCP on this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	*/
	java.lang.String[] getServiceNameModemLanLanNameDhcp(java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException;

	/**
	 * Change the LNS of the access
	 * Facultative parameters ? false
	 * @param lnsName The name from xdsl.Lns
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameChangeLns(java.lang.String lnsName, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Give the price to requestTotalDeconsolidation on the access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.DeconsolidationTerms getServiceNameTotalDeconsolidationTerms(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.PendingAction getServiceNamePendingAction(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param spare The internal name of your spare
	*/
	void putSpareSpareServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String spare) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Cancel the ongoing resiliation
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	void postServiceNameCancelResiliation(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	 * @param wifiName Name of the Wifi
	*/
	void putServiceNameModemWifiWifiName(net.zyuiop.ovhapi.api.objects.xdsl.WLAN param0, java.lang.String serviceName, java.lang.String wifiName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Incident getServiceNameIncident(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	*/
	void putServiceNameModem(net.zyuiop.ovhapi.api.objects.xdsl.Modem param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	 * @param dhcpName Name of the DHCP
	 * @param MACAddress The MAC address of the device
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress getServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddressesMACAddress(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String MACAddress) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	 * @param id Return merchandise authorisation identifier
	*/
	void putServiceNameRmaId(net.zyuiop.ovhapi.api.objects.telephony.Rma param0, java.lang.String serviceName, java.lang.String id) throws java.io.IOException;

	/**
	 * Reboot the modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameModemReboot(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Modem getServiceNameModem(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Order an extra /29 range of IPv4 addresses
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameIps(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	 * @param id Id of the object
	*/
	void putServiceNameMonitoringNotificationsId(net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification param0, java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete the task in problem from the results
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param id Id of the object
	*/
	void postServiceNameTasksIdArchive(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Change the profile of the port
	 * Facultative parameters ? false
	 * @param dslamProfileId The id of the xdsl.DslamLineProfile
	 * @param serviceName The internal name of your XDSL offer
	 * @param number The number of the line
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameLinesNumberDslamPortChangeProfile(long dslamProfileId, java.lang.String serviceName, java.lang.String number) throws java.io.IOException;

	/**
	 * List of devices connected on this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameModemConnectedDevices(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the cities from a zipCode
	 * Facultative parameters ? false
	 * @param zipCode The zipCode of the city
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.City[] getEligibilityCities(java.lang.String zipCode) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	 * @param dhcpName Name of the DHCP
	 * @param MACAddress The MAC address of the device
	*/
	void putServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddressesMACAddress(net.zyuiop.ovhapi.api.objects.xdsl.DHCPStaticAddress param0, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String MACAddress) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getXdsl() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param wifiName Name of the Wifi
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.WLAN getServiceNameModemWifiWifiName(java.lang.String serviceName, java.lang.String wifiName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	 * @param dhcpName Name of the DHCP
	*/
	void putServiceNameModemLanLanNameDhcpDhcpName(net.zyuiop.ovhapi.api.objects.xdsl.DHCP param0, java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException;

	/**
	 * Return the list of brand compatible to be replaced
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	java.lang.String[] getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getSpareSpareServiceInfos(java.lang.String spare) throws java.io.IOException;

	/**
	 * Get information about the ongoing resiliation
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	boolean getServiceNameCanCancelResiliation(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Access getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.MonitoringNotification getServiceNameMonitoringNotificationsId(java.lang.String serviceName, long id) throws java.io.IOException;

	/**
	 * Delete this port mapping
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	 * @param dhcpName Name of the DHCP
	 * @param MACAddress The MAC address of the device
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task deleteServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddressesMACAddress(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName, java.lang.String MACAddress) throws java.io.IOException;

	/**
	 * Change the status of the IPv6 for this access
	 * Facultative parameters ? false
	 * @param enabled Should the IPv6 be enabled ?
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameIpv6(boolean enabled, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	net.zyuiop.ovhapi.api.objects.spare.xdsl.XdslSpare getSpareSpare(java.lang.String spare) throws java.io.IOException;

	/**
	 * List available LNS for this access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Lns[] getServiceNameAvailableLns(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get the logs emitted by the DSLAM for this port
	 * Facultative parameters ? false
	 * @param limit null
	 * @param serviceName The internal name of your XDSL offer
	 * @param number The number of the line
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.DslamPortLog[] getServiceNameLinesNumberDslamPortLogs(long limit, java.lang.String serviceName, java.lang.String number) throws java.io.IOException;

	/**
	 * Get the streets from a city inseeCode and partial street name
	 * Facultative parameters ? false
	 * @param partialName The partial name to match against the name of the street
	 * @param inseeCode The inseeCode of the city
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.eligibility.Street[] getEligibilityStreets(java.lang.String partialName, java.lang.String inseeCode) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSpare() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param number The number of the line
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.DslamPort getServiceNameLinesNumberDslamPort(java.lang.String serviceName, java.lang.String number) throws java.io.IOException;

	/**
	 * List of IPs addresses for this access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameIps(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List the radius connection logs
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.RadiusConnectionLog[] getServiceNameRadiusConnectionLogs(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Reset the modem to its default configuration
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task postServiceNameModemReset(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete this port mapping
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param name Name of the port mapping entry
	*/
	net.zyuiop.ovhapi.api.objects.xdsl.Task deleteServiceNameModemPortMappingsName(java.lang.String serviceName, java.lang.String name) throws java.io.IOException;

	/**
	 * Replace the modem by its spare
	 * Facultative parameters ? false
	 * @param domain The modem to replace by the spare
	 * @param spare The internal name of your spare
	*/
	void postSpareSpareReplace(java.lang.String domain, java.lang.String spare) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The internal name of your XDSL offer
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.xdsl.Access param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Tasks scheduled for this access
	 * Facultative parameters ? true
	 * @param serviceName The internal name of your XDSL offer
	 * @param function Filter the value of function property (=)
	 * @param status Filter the value of status property (=)
	*/
	long[] getServiceNameTasks(java.lang.String serviceName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * Tasks scheduled for this access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	long[] getServiceNameTasks(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Return Merchandise Authorisation associated
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameRma(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * List the notifications for this access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	long[] getServiceNameMonitoringNotifications(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete the spare as if it was not belonging to OVH anymore
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	void deleteSpareSpare(java.lang.String spare) throws java.io.IOException;

}
