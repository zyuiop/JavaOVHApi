package net.zyuiop.ovhapi.api.methods.license;

/**
 * A class to interact with OVH's /license/office APIs
 */

public interface Office { 

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The unique identifier of your Office service
	*/
	void putServiceName(net.zyuiop.ovhapi.api.objects.license.office.OfficeTenant param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Delete existing office user
	 * Facultative parameters ? false
	 * @param serviceName The unique identifier of your Office service
	 * @param activationEmail Email used to activate Microsoft Office
	*/
	net.zyuiop.ovhapi.api.objects.license.office.OfficeTask deleteServiceNameUserActivationEmail(java.lang.String serviceName, java.lang.String activationEmail) throws java.io.IOException;

	/**
	 * Change or reset  user's password
	 * Facultative parameters ? true
	 * @param shouldSendMail Specify if the new password should be send via email or not.
	 * @param serviceName The unique identifier of your Office service
	 * @param activationEmail Email used to activate Microsoft Office
	 * @param password New password or empty to receive a generated password by email
	 * @param notifyEmail Email to send the new password to. Default is nicAdmin's email.
	*/
	net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUserActivationEmailChangePassword(boolean shouldSendMail, java.lang.String serviceName, java.lang.String activationEmail, java.lang.String password, java.lang.String notifyEmail) throws java.io.IOException;

	/**
	 * Change or reset  user's password
	 * Facultative parameters ? false
	 * @param shouldSendMail Specify if the new password should be send via email or not.
	 * @param serviceName The unique identifier of your Office service
	 * @param activationEmail Email used to activate Microsoft Office
	*/
	net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUserActivationEmailChangePassword(boolean shouldSendMail, java.lang.String serviceName, java.lang.String activationEmail) throws java.io.IOException;

	/**
	 * Domain associated to this office tenant
	 * Facultative parameters ? false
	 * @param serviceName The unique identifier of your Office service
	*/
	java.lang.String[] getServiceNameDomain(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The unique identifier of your Office service
	*/
	net.zyuiop.ovhapi.api.objects.license.office.OfficeTenant getServiceName(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param serviceName The unique identifier of your Office service
	*/
	void putServiceNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Accounts associated to this office tenant
	 * Facultative parameters ? false
	 * @param serviceName The unique identifier of your Office service
	*/
	java.lang.String[] getServiceNameUser(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The unique identifier of your Office service
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getServiceNameServiceInfos(java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The unique identifier of your Office service
	 * @param activationEmail Email used to activate Microsoft Office
	*/
	net.zyuiop.ovhapi.api.objects.license.office.OfficeUser getServiceNameUserActivationEmail(java.lang.String serviceName, java.lang.String activationEmail) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getLicenseOffice() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param serviceName The unique identifier of your Office service
	 * @param domainName Domain name
	*/
	net.zyuiop.ovhapi.api.objects.license.office.OfficeDomain getServiceNameDomainDomainName(java.lang.String serviceName, java.lang.String domainName) throws java.io.IOException;

	/**
	 * Shows the licenses usage statistics for the given time period.
	 * Facultative parameters ? false
	 * @param to Period's end point.
	 * @param from Period's start point.
	 * @param serviceName The unique identifier of your Office service
	*/
	net.zyuiop.ovhapi.api.objects.license.office.Statistics[] getServiceNameUsageStatistics(java.util.Date to, java.util.Date from, java.lang.String serviceName) throws java.io.IOException;

	/**
	 * Create new office user
	 * Facultative parameters ? true
	 * @param domain Office domain
	 * @param licence Office licence
	 * @param login Account login
	 * @param serviceName The unique identifier of your Office service
	 * @param firstName Account first name
	 * @param lastName Account last name
	*/
	net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUser(java.lang.String domain, java.lang.String licence, java.lang.String login, java.lang.String serviceName, java.lang.String firstName, java.lang.String lastName) throws java.io.IOException;

	/**
	 * Create new office user
	 * Facultative parameters ? false
	 * @param domain Office domain
	 * @param licence Office licence
	 * @param login Account login
	 * @param serviceName The unique identifier of your Office service
	*/
	net.zyuiop.ovhapi.api.objects.license.office.OfficeTask postServiceNameUser(java.lang.String domain, java.lang.String licence, java.lang.String login, java.lang.String serviceName) throws java.io.IOException;

}
