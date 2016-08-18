package net.zyuiop.ovhapi.api.methods.email;

/**
 * A class to interact with OVH's /email/exchange APIs
 */

public interface Exchange { 








	/**
	 * Accounts associated to this exchange service
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Filter the value of primaryEmailAddress property (like)
	 * @param accountLicense Filter the value of accountLicense property (=)
	 * @param id Filter the value of id property (like)
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, java.lang.String accountLicense, long id) throws java.io.IOException;

	/**
	 * Accounts associated to this exchange service
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceAccount(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;






	/**
	 * Full access granted users for this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressFullAccess(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;



	/**
	 * Send as granted users for this shared mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendAs(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;


	/**
	 * Shared accounts associated to this exchange service
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Filter the value of sharedEmailAddress property (like)
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceSharedAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Shared accounts associated to this exchange service
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceSharedAccount(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;






	/**
	 * Exchange account id subscribed to ActiveSync quarantine notifications
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	long[] getOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotification(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;





	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getEmailExchange() throws java.io.IOException;

	/**
	 * Domains associated to this service
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param main Filter the value of main property (like)
	 * @param state Filter the value of state property (=)
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceDomain(java.lang.String organizationName, java.lang.String exchangeService, boolean main, java.lang.String state) throws java.io.IOException;

	/**
	 * Domains associated to this service
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceDomain(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;








	/**
	 * Send as granted users for this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendAs(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Resource account manager
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param resourceEmailAddress resource as email
	*/
	long[] getOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddressDelegate(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException;















	/**
	 * Public folders associated to this service
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Filter the value of path property (like)
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServicePublicFolder(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException;

	/**
	 * Public folders associated to this service
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServicePublicFolder(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Mailing list account member
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;


	/**
	 * List available services
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	*/
	java.lang.String[] getOrganizationNameService(java.lang.String organizationName) throws java.io.IOException;



	/**
	 * Terminate account at expiration date
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	java.lang.String postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressTerminate(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;




	/**
	 * External contacts for this service
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param firstName Filter the value of firstName property (like)
	 * @param id Filter the value of id property (like)
	 * @param lastName Filter the value of lastName property (like)
	 * @param displayName Filter the value of displayName property (like)
	 * @param externalEmailAddress Filter the value of externalEmailAddress property (like)
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceExternalContact(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String firstName, long id, java.lang.String lastName, java.lang.String displayName, java.lang.String externalEmailAddress) throws java.io.IOException;

	/**
	 * External contacts for this service
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceExternalContact(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;





	/**
	 * Get DCV emails if your ssl will expire in next 30 days
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceDcvEmails(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Pending task for this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressTasks(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * SendOnBehalfTo granted users for this shared mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendOnBehalfTo(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;



	/**
	 * sendOnBehalfTo
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendOnBehalfTo(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Pending task for this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressTasks(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Mailing list account manager
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressManagerAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;


















	/**
	 * Mailing list contact member
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContact(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;








	/**
	 * Full access granted users for this shared mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressFullAccess(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;












	/**
	 * Mailing list for this service
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress Filter the value of mailingListAddress property (like)
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceMailingList(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Mailing list for this service
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceMailingList(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

















	/**
	 * Aliases associated to this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;


	/**
	 * Resource account associated to this service
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param resourceEmailAddress Filter the value of resourceEmailAddress property (like)
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceResourceAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException;

	/**
	 * Resource account associated to this service
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceResourceAccount(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;



	/**
	 * List of your ActiveSync devices registered on this Exchange service
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param identity Filter the value of identity property (like)
	 * @param IMEI Filter the value of IMEI property (like)
	 * @param deviceState Filter the value of deviceState property (=)
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceDevice(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String identity, java.lang.String IMEI, java.lang.String deviceState) throws java.io.IOException;

	/**
	 * List of your ActiveSync devices registered on this Exchange service
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceDevice(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;




	/**
	 * Aliases associated to this mailingList
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;





	/**
	 * Public folder permission
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Path for public folder
	*/
	long[] getOrganizationNameServiceExchangeServicePublicFolderPathPermission(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException;



	/**
	 * SendOnBehalfTo granted users for this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendOnBehalfTo(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;


	/**
	 * Pending actions
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	long[] getOrganizationNameServiceExchangeServiceTask(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;


	/**
	 * Get diclaimer attributes to substitute with Active Directory properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimerAttribute(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException;


	/**
	 * sendAs
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendAs(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;



}
