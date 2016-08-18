package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /xdsl APIs
 */

public interface Xdsl { 

	/**
	 * List of IPs addresses for this access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameIps(java.lang.String serviceName) throws java.io.IOException;





	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getXdsl() throws java.io.IOException;


	/**
	 * Renew PPP password and send the PPP login informations to the e-mail of the nicAdmin
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	void postServiceNameRequestPPPLoginMail(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * The lines of the access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameLines(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Get all available spare brands
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSpareBrands() throws java.io.IOException;

	/**
	 * List of DHCP on this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	*/
	java.lang.String[] getServiceNameModemLanLanNameDhcp(java.lang.String serviceName, java.lang.String lanName) throws java.io.IOException;

	/**
	 * List of PortMappings on this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameModemPortMappings(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Replace the modem by its spare
	 * Facultative parameters ? false
	 * @param domain The modem to replace by the spare
	 * @param spare The internal name of your spare
	*/
	void postSpareSpareReplace(java.lang.String domain, java.lang.String spare) throws java.io.IOException;



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
	 * List of devices connected on this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameModemConnectedDevices(java.lang.String serviceName) throws java.io.IOException;








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
	 * Delete the spare as if it was not belonging to OVH anymore
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	void deleteSpareSpare(java.lang.String spare) throws java.io.IOException;


	/**
	 * List of LANs on this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameModemLan(java.lang.String serviceName) throws java.io.IOException;



	/**
	 * List of DHCP Static Address of this modem
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param lanName Name of the LAN
	 * @param dhcpName Name of the DHCP
	*/
	java.lang.String[] getServiceNameModemLanLanNameDhcpDhcpNameDHCPStaticAddresses(java.lang.String serviceName, java.lang.String lanName, java.lang.String dhcpName) throws java.io.IOException;


	/**
	 * List the notifications for this access
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	long[] getServiceNameMonitoringNotifications(java.lang.String serviceName) throws java.io.IOException;


	/**
	 * Cancel the ongoing resiliation
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	void postServiceNameCancelResiliation(java.lang.String serviceName) throws java.io.IOException;




	/**
	 * Delete this notification
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param id Id of the object
	*/
	void deleteServiceNameMonitoringNotificationsId(java.lang.String serviceName, long id) throws java.io.IOException;


	/**
	 * Get information about the ongoing resiliation
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	boolean getServiceNameCanCancelResiliation(java.lang.String serviceName) throws java.io.IOException;










	/**
	 * Return the list of brand compatible to be replaced
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	java.lang.String[] getSpareSpareCompatibleReplacement(java.lang.String spare) throws java.io.IOException;





	/**
	 * Return the broken equipment in instantRefund
	 * Facultative parameters ? false
	 * @param spare The internal name of your spare
	*/
	void postSpareSpareReturnMerchandise(java.lang.String spare) throws java.io.IOException;


	/**
	 * Delete the task in problem from the results
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param id Id of the object
	*/
	void postServiceNameTasksIdArchive(java.lang.String serviceName, long id) throws java.io.IOException;

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
	 * Stop renewing this extra IPv4 option
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	 * @param ip The IP address
	*/
	void deleteServiceNameIpsIp(java.lang.String serviceName, java.lang.String ip) throws java.io.IOException;









	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSpare() throws java.io.IOException;











	/**
	 * Return Merchandise Authorisation associated
	 * Facultative parameters ? false
	 * @param serviceName The internal name of your XDSL offer
	*/
	java.lang.String[] getServiceNameRma(java.lang.String serviceName) throws java.io.IOException;




}
