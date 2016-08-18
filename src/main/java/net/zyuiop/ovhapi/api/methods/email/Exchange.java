package net.zyuiop.ovhapi.api.methods.email;

/**
 * A class to interact with OVH's /email/exchange APIs
 */

public interface Exchange { 

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	 * @param allowedAccountId Account id to give send on behalf to
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountSendOnBehalfTo getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	void putOrganizationNameServiceExchangeServiceProtocol(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceProtocol param0, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Delete allowed user for SendOnBehalfTo
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	 * @param allowedAccountId Account id to give send on behalf to
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Get diclaimer attributes to substitute with Active Directory properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimerAttribute(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	void putOrganizationNameServiceExchangeServiceMailingListMailingListAddress(net.zyuiop.ovhapi.api.objects.email.exchange.MailingList param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.MailingList getOrganizationNameServiceExchangeServiceMailingListMailingListAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.SharedAccount getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Delete allowed user for SendOnBehalfTo
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param allowedAccountId Account id to give send on behalf to
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	 * @param id Task id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressTasksId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long id) throws java.io.IOException;

	/**
	 * Generate outlook url
	 * Facultative parameters ? false
	 * @param language Language of outlook
	 * @param version Version of outlook
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressOutlookURL(java.lang.String language, java.lang.String version, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Delete mailing list manager
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param managerAccountId Manager account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressManagerAccountManagerAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long managerAccountId) throws java.io.IOException;

	/**
	 * Get active licenses for specific period of time
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param license License type
	 * @param toDate Get active licenses until date
	 * @param fromDate Get active licenses since date 
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.DailyLicense[] getOrganizationNameServiceExchangeServiceLicense(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String license, java.util.Date toDate, java.util.Date fromDate) throws java.io.IOException;

	/**
	 * Get active licenses for specific period of time
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.DailyLicense[] getOrganizationNameServiceExchangeServiceLicense(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param managerAccountId Manager account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupManager getOrganizationNameServiceExchangeServiceMailingListMailingListAddressManagerAccountManagerAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long managerAccountId) throws java.io.IOException;

	/**
	 * Get shared account quota usage in total available space
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.SharedAccountQuota getOrganizationNameServiceExchangeServiceSharedAccountQuota(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Request PST file for the account
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExport(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Delete existing organization public folder
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Path for public folder
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServicePublicFolderPath(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	*/
	void putOrganizationNameServiceExchangeServiceDomainDomainName(net.zyuiop.ovhapi.api.objects.email.exchange.Domain param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException;

	/**
	 * Generate temporary url to PST file
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExportURL(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * SendOnBehalfTo granted users for this shared mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendOnBehalfTo(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Get public folder quota usage in total available space
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.PublicFolderQuota getOrganizationNameServiceExchangeServicePublicFolderQuota(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountDiagnosis getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressDiagnostics(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Delete existing alias
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param alias Alias
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressAliasAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, java.lang.String alias) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	*/
	void putOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(net.zyuiop.ovhapi.api.objects.email.exchange.Disclaimer param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException;

	/**
	 * Add new mailing list member
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param memberContactId Member contact id
	 * @param memberAccountId Member account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberContactId, long memberAccountId) throws java.io.IOException;

	/**
	 * Add new mailing list member
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

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
	 * sendOnBehalfTo
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendOnBehalfTo(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Allow full access to a user
	 * Facultative parameters ? false
	 * @param allowedAccountId User to give full access
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressFullAccess(long allowedAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	void putOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressProtocol(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountProtocol param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param id Task id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task getOrganizationNameServiceExchangeServiceTaskId(java.lang.String organizationName, java.lang.String exchangeService, long id) throws java.io.IOException;

	/**
	 * Add mailing list
	 * Facultative parameters ? true
	 * @param joinRestriction Join restriction policy
	 * @param departRestriction Depart restriction policy
	 * @param mailingListAddress The mailing list address
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param hiddenFromGAL If true mailing list is hiddend in Global Address List
	 * @param senderAuthentification If true sender has to authenticate
	 * @param maxSendSize Maximum send email size in MB
	 * @param maxReceiveSize Maximum receive email size in MB
	 * @param displayName Name displayed in Global Access List
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingList(java.lang.String joinRestriction, java.lang.String departRestriction, java.lang.String mailingListAddress, java.lang.String organizationName, java.lang.String exchangeService, boolean hiddenFromGAL, boolean senderAuthentification, long maxSendSize, long maxReceiveSize, java.lang.String displayName) throws java.io.IOException;

	/**
	 * Add mailing list
	 * Facultative parameters ? false
	 * @param joinRestriction Join restriction policy
	 * @param departRestriction Depart restriction policy
	 * @param mailingListAddress The mailing list address
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingList(java.lang.String joinRestriction, java.lang.String departRestriction, java.lang.String mailingListAddress, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Add new mailing list manager
	 * Facultative parameters ? false
	 * @param managerAccountId Manager account id
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressManagerAccount(long managerAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Delete existing permission from public folder
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Path for public folder
	 * @param allowedAccountId Account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServicePublicFolderPathPermissionAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path, long allowedAccountId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param notifiedAccountId Notified Account Id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceActiveSyncNotification getOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotificationNotifiedAccountId(java.lang.String organizationName, java.lang.String exchangeService, long notifiedAccountId) throws java.io.IOException;

	/**
	 * delete external contact
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param externalEmailAddress Contact email
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceExternalContactExternalEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String externalEmailAddress) throws java.io.IOException;

	/**
	 * Delete existing organization disclaimer
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException;

	/**
	 * Create organization public folder
	 * Facultative parameters ? true
	 * @param quota Quota for public folder in MB
	 * @param type Type for public folder
	 * @param path Path for public folder
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param anonymousPermission Access right for the guest users
	 * @param defaultPermission Default access right
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServicePublicFolder(long quota, java.lang.String type, java.lang.String path, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String anonymousPermission, java.lang.String defaultPermission) throws java.io.IOException;

	/**
	 * Create organization public folder
	 * Facultative parameters ? false
	 * @param quota Quota for public folder in MB
	 * @param type Type for public folder
	 * @param path Path for public folder
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServicePublicFolder(long quota, java.lang.String type, java.lang.String path, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Delete existing shared mailbox in exchange server
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	 * @param allowedAccountId Account id to give send on behalf to
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountSendOnBehalfTo getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param memberAccountId Member account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupMember getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccountMemberAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberAccountId) throws java.io.IOException;

	/**
	 * Create new alias
	 * Facultative parameters ? false
	 * @param alias Alias
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressAlias(java.lang.String alias, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param resourceEmailAddress resource as email
	*/
	void putOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddress(net.zyuiop.ovhapi.api.objects.email.exchange.ResourceAccount param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException;

	/**
	 * Update device list
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceUpdateDeviceList(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

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
	 * Full access granted users for this shared mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressFullAccess(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Create new diagnosis request
	 * Facultative parameters ? false
	 * @param password Account password
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressDiagnostics(java.lang.String password, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Mailing list account member
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Subscribe new address to ActiveSync quarantine notifications
	 * Facultative parameters ? false
	 * @param notifiedAccountId Exchange Account Id
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotification(long notifiedAccountId, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * create new external contact
	 * Facultative parameters ? true
	 * @param externalEmailAddress Contact email address
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param initials Contact initials
	 * @param firstName Contact first name
	 * @param hiddenFromGAL Hide the contact in Global Address List
	 * @param organization2010 Indicates to which organization this newly created external contact will belongs (Exchange 2010 only)
	 * @param lastName Contact last name
	 * @param displayName Contact display name
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceExternalContact(java.lang.String externalEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String initials, java.lang.String firstName, boolean hiddenFromGAL, java.lang.String organization2010, java.lang.String lastName, java.lang.String displayName) throws java.io.IOException;

	/**
	 * create new external contact
	 * Facultative parameters ? false
	 * @param externalEmailAddress Contact email address
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceExternalContact(java.lang.String externalEmailAddress, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Create organization disclaimer of each email
	 * Facultative parameters ? true
	 * @param content Signature, added at the bottom of your organization emails
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	 * @param outsideOnly Activate the disclaimer only for external emails
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(java.lang.String content, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName, boolean outsideOnly) throws java.io.IOException;

	/**
	 * Create organization disclaimer of each email
	 * Facultative parameters ? false
	 * @param content Signature, added at the bottom of your organization emails
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(java.lang.String content, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException;

	/**
	 * SendOnBehalfTo granted users for this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendOnBehalfTo(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	 * @param allowedAccountId Account id to give send as
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountSendAs getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Revoke full access
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	 * @param allowedAccountId Account id to give full access
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressFullAccessAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Path for public folder
	*/
	void putOrganizationNameServiceExchangeServicePublicFolderPath(net.zyuiop.ovhapi.api.objects.email.exchange.PublicFolder param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException;

	/**
	 * Allow another user to send mails from this shared mailbox
	 * Facultative parameters ? false
	 * @param allowAccountId Account id to allow to send mails from this shared mailbox
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendAs(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Revoke full access
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	 * @param allowedAccountId Account id to give full access
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressFullAccessAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Path for public folder
	 * @param allowedAccountId Account id
	*/
	void putOrganizationNameServiceExchangeServicePublicFolderPathPermissionAllowedAccountId(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangePublicFolderPermission param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path, long allowedAccountId) throws java.io.IOException;

	/**
	 * Create new mailbox in exchange server
	 * Facultative parameters ? true
	 * @param license Exchange license
	 * @param login Account login
	 * @param password Account password
	 * @param domain Email domain
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param initials Account initials
	 * @param firstName Account first name
	 * @param hiddenFromGAL Hide the account in Global Address List
	 * @param SAMAccountName SAM account name (exchange 2010 login)
	 * @param mailingFilter Enable mailing filtrering
	 * @param lastName Account last name
	 * @param outlookLicense Buy outlook license
	 * @param displayName Account display name
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccount(java.lang.String license, java.lang.String login, java.lang.String password, java.lang.String domain, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String initials, java.lang.String firstName, boolean hiddenFromGAL, java.lang.String SAMAccountName, java.lang.String mailingFilter, java.lang.String lastName, boolean outlookLicense, java.lang.String displayName) throws java.io.IOException;

	/**
	 * Create new mailbox in exchange server
	 * Facultative parameters ? false
	 * @param license Exchange license
	 * @param login Account login
	 * @param password Account password
	 * @param domain Email domain
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccount(java.lang.String license, java.lang.String login, java.lang.String password, java.lang.String domain, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Unubscribe address from ActiveSync quarantine notifications
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param notifiedAccountId Notified Account Id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotificationNotifiedAccountId(java.lang.String organizationName, java.lang.String exchangeService, long notifiedAccountId) throws java.io.IOException;

	/**
	 * sendAs
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendAs(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

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
	 * Delete allowed user for sendAs
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	 * @param allowedAccountId Account id to give send as
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	void putOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddress(net.zyuiop.ovhapi.api.objects.email.exchange.Account param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Allow another user to Send aso mails from this mailing list
	 * Facultative parameters ? false
	 * @param allowAccountId Account id to allow to send as mails from this mailing list
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendOnBehalfTo(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param externalEmailAddress Contact email
	*/
	void putOrganizationNameServiceExchangeServiceExternalContactExternalEmailAddress(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeExternalContact param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String externalEmailAddress) throws java.io.IOException;

	/**
	 * Show available outlooks
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param outlookLanguage Language version of outlook
	 * @param outlookVersion OS version of outlook
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.OutlookVersions[] getOrganizationNameServiceExchangeServiceOutlookAvailability(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String outlookLanguage, java.lang.String outlookVersion) throws java.io.IOException;

	/**
	 * Show available outlooks
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.OutlookVersions[] getOrganizationNameServiceExchangeServiceOutlookAvailability(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceProtocol getOrganizationNameServiceExchangeServiceProtocol(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param resourceEmailAddress resource as email
	 * @param allowedAccountId delegate's account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeResourceAccountDelegate getOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddressDelegateAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Allow another user to Send On Behalf To mails from this mailbox
	 * Facultative parameters ? false
	 * @param allowAccountId Account id to allow to send On Behalf To mails from this mailbox
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendOnBehalfTo(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Delete allowed user for SendOnBehalfTo
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	 * @param allowedAccountId Account id to give send on behalf to
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Mailing list account manager
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressManagerAccount(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	*/
	java.lang.String[] getOrganizationNameService(java.lang.String organizationName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Path for public folder
	 * @param allowedAccountId Account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangePublicFolderPermission getOrganizationNameServiceExchangeServicePublicFolderPathPermissionAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path, long allowedAccountId) throws java.io.IOException;

	/**
	 * Delete allowed user for SendAs
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param allowedAccountId Account id to give send on behalf to
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param identity Exchange identity
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceDevice getOrganizationNameServiceExchangeServiceDeviceIdentity(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String identity) throws java.io.IOException;

	/**
	 * Create public folder permission
	 * Facultative parameters ? false
	 * @param allowedAccountId Account id to have access to public folder
	 * @param accessRights Access rights to be set for the account
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Path for public folder
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServicePublicFolderPathPermission(long allowedAccountId, java.lang.String accessRights, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException;

	/**
	 * Allow another user to Send aso mails from this mailing list
	 * Facultative parameters ? false
	 * @param allowAccountId Account id to allow to send as mails from this mailing list
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendAs(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Pending task for this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressTasks(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param memberContactId Member account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupMember getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContactMemberContactId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberContactId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeService getOrganizationNameServiceExchangeService(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * delete existing resource account in exchange server
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param resourceEmailAddress resource as email
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	 * @param allowedAccountId Account id to give send as
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountSendAs getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Change mailbox password
	 * Facultative parameters ? false
	 * @param password new password
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressChangePassword(java.lang.String password, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Server getOrganizationNameServiceExchangeServiceServer(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Pending actions
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	long[] getOrganizationNameServiceExchangeServiceTask(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param allowedAccountId Account id to give send on behalf to
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupSendOnBehalfTo getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendOnBehalfToAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Path for public folder
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.PublicFolder getOrganizationNameServiceExchangeServicePublicFolderPath(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException;

	/**
	 * Full access granted users for this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressFullAccess(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	void putOrganizationNameServiceExchangeService(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeService param0, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountProtocol getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressProtocol(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Allow full access to a user
	 * Facultative parameters ? false
	 * @param allowedAccountId User to give full access
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressFullAccess(long allowedAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Delete mailing list
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	void putOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddress(net.zyuiop.ovhapi.api.objects.email.exchange.SharedAccount param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Public folder permission
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param path Path for public folder
	*/
	long[] getOrganizationNameServiceExchangeServicePublicFolderPathPermission(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String path) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	 * @param id Task id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressTasksId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long id) throws java.io.IOException;

	/**
	 * Renew SSL if it will expire in next 30 days
	 * Facultative parameters ? false
	 * @param dcv DCV email require for order ssl varification process
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceRenewSSL(java.lang.String dcv, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	void putOrganizationNameServiceExchangeServiceServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param resourceEmailAddress resource as email
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ResourceAccount getOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException;

	/**
	 * Create new shared mailbox in exchange server
	 * Facultative parameters ? true
	 * @param quota Shared account maximum size
	 * @param sharedEmailAddress Shared account email address
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param initials Shared account initials
	 * @param firstName Shared account first name
	 * @param hiddenFromGAL Hide the shared account in Global Address List
	 * @param lastName Shared account last name
	 * @param mailingFilter Enable mailing filtrering
	 * @param displayName Shared account display name
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccount(long quota, java.lang.String sharedEmailAddress, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String initials, java.lang.String firstName, boolean hiddenFromGAL, java.lang.String lastName, java.lang.String mailingFilter, java.lang.String displayName) throws java.io.IOException;

	/**
	 * Create new shared mailbox in exchange server
	 * Facultative parameters ? false
	 * @param quota Shared account maximum size
	 * @param sharedEmailAddress Shared account email address
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccount(long quota, java.lang.String sharedEmailAddress, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Send as granted users for this shared mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendAs(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Terminate account at expiration date
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	java.lang.String postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressTerminate(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	 * @param alias Alias
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountAlias getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressAliasAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, java.lang.String alias) throws java.io.IOException;

	/**
	 * Mailing list contact member
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	long[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContact(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Domain getOrganizationNameServiceExchangeServiceDomainDomainName(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException;

	/**
	 * Create new domain in exchange services
	 * Facultative parameters ? true
	 * @param name Domain to install on server
	 * @param type Type of domain that You want to install
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mxRelay If specified, emails to not existing address will be redirected to that domain
	 * @param configureAutodiscover If you host domain in OVH we can configure autodiscover record automatically
	 * @param organization2010 If specified, indicates which organization this newly created domain will be part of (Exchange 2010 only)
	 * @param configureMx If you host domain in OVH we can configure mx record automatically
	 * @param main This newly created domain will be an organization (Exchange 2010 only)
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDomain(java.lang.String name, java.lang.String type, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mxRelay, boolean configureAutodiscover, java.lang.String organization2010, boolean configureMx, boolean main) throws java.io.IOException;

	/**
	 * Create new domain in exchange services
	 * Facultative parameters ? false
	 * @param name Domain to install on server
	 * @param type Type of domain that You want to install
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDomain(java.lang.String name, java.lang.String type, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Delete allowed user for sendAs
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	 * @param allowedAccountId Account id to give send as
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Delete mailing list member
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param memberAccountId Member account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberAccountMemberAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberAccountId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getOrganizationNameServiceExchangeServiceServiceInfos(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * create new resource account in exchange server
	 * Facultative parameters ? true
	 * @param resourceEmailAddress resource address
	 * @param type field of your reservation
	 * @param capacity number of the same equipment or capacity of a room
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param allowConflict resource can be scheduled by more than one person during the same time period
	 * @param displayName resource account display name
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceResourceAccount(java.lang.String resourceEmailAddress, java.lang.String type, long capacity, java.lang.String organizationName, java.lang.String exchangeService, boolean allowConflict, java.lang.String displayName) throws java.io.IOException;

	/**
	 * create new resource account in exchange server
	 * Facultative parameters ? false
	 * @param resourceEmailAddress resource address
	 * @param type field of your reservation
	 * @param capacity number of the same equipment or capacity of a room
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceResourceAccount(java.lang.String resourceEmailAddress, java.lang.String type, long capacity, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Executes a factory reset on the device. THIS OPERATION CANNOT BE REVERSED, ALL DATA ON THE DEVICE WILL BE LOST.
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param identity Exchange identity
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceDeviceIdentityClearDevice(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String identity) throws java.io.IOException;

	/**
	 * Allow another user to Send On Behalf To mails from this shared mailbox
	 * Facultative parameters ? false
	 * @param allowAccountId Account id to allow to send On Behalf To mails from this shared mailbox
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressSendOnBehalfTo(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress) throws java.io.IOException;

	/**
	 * Aliases associated to this mailingList
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceMailingListMailingListAddressAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Remove request of PST file
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExport(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Create new alias
	 * Facultative parameters ? false
	 * @param alias Alias
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressAlias(java.lang.String alias, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Delete existing alias
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	 * @param alias Alias
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressAliasAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, java.lang.String alias) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	 * @param allowedAccountId Account id to give full access
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeAccountFullAccess getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressFullAccessAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress, long allowedAccountId) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Disclaimer getOrganizationNameServiceExchangeServiceDomainDomainNameDisclaimer(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param sharedEmailAddress Default email for this shared mailbox
	 * @param allowedAccountId Account id to give full access
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeSharedAccountFullAccess getOrganizationNameServiceExchangeServiceSharedAccountSharedEmailAddressFullAccessAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String sharedEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param externalEmailAddress Contact email
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeExternalContact getOrganizationNameServiceExchangeServiceExternalContactExternalEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String externalEmailAddress) throws java.io.IOException;

	/**
	 * Allow another user to send mails from this mailbox
	 * Facultative parameters ? false
	 * @param allowAccountId Account id to allow to send mails from this mailbox
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressSendAs(long allowAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * add new resource account delegate in exchange server
	 * Facultative parameters ? false
	 * @param allowedAccountId delegate's account id
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param resourceEmailAddress resource as email
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddressDelegate(long allowedAccountId, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress) throws java.io.IOException;

	/**
	 * Delete mailing list member
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param memberContactId Member account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContactMemberContactId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberContactId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param identity Exchange identity
	*/
	void putOrganizationNameServiceExchangeServiceDeviceIdentity(net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeServiceDevice param0, java.lang.String organizationName, java.lang.String exchangeService, java.lang.String identity) throws java.io.IOException;

	/**
	 * Activate Sharepoint infra connected to this exchange service
	 * Facultative parameters ? false
	 * @param primaryEmailAddress primary email address of a user that will be admin of sharepoint (You will not be able to change it!)
	 * @param subDomain sub domain that will be used for Your sharepoint infra (You will not be able to change it!)
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceActivateSharepoint(java.lang.String primaryEmailAddress, java.lang.String subDomain, java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getEmailExchange() throws java.io.IOException;

	/**
	 * Get DCV emails if your ssl will expire in next 30 days
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceDcvEmails(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Exchange account id subscribed to ActiveSync quarantine notifications
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	*/
	long[] getOrganizationNameServiceExchangeServiceProtocolActiveSyncMailNotification(java.lang.String organizationName, java.lang.String exchangeService) throws java.io.IOException;

	/**
	 * Pending task for this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	long[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressTasks(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExportUrl getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExportURL(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Delete existing mailbox in exchange server
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param alias Alias
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeMailingListAlias getOrganizationNameServiceExchangeServiceMailingListMailingListAddressAliasAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, java.lang.String alias) throws java.io.IOException;

	/**
	 * Aliases associated to this mailbox
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	java.lang.String[] getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressAlias(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Delete existing domain in exchange services
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param domainName Domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceDomainDomainName(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String domainName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.OutlookUrl getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressOutlookURL(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * delete existing resource account delegate in exchange server
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param resourceEmailAddress resource as email
	 * @param allowedAccountId delegate's account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task deleteOrganizationNameServiceExchangeServiceResourceAccountResourceEmailAddressDelegateAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String resourceEmailAddress, long allowedAccountId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Account getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddress(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param primaryEmailAddress Default email for this mailbox
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Export getOrganizationNameServiceExchangeServiceAccountPrimaryEmailAddressExport(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String primaryEmailAddress) throws java.io.IOException;

	/**
	 * Add new mailing list member
	 * Facultative parameters ? true
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param memberContactId Member contact id
	 * @param memberAccountId Member account id
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContact(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long memberContactId, long memberAccountId) throws java.io.IOException;

	/**
	 * Add new mailing list member
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.Task postOrganizationNameServiceExchangeServiceMailingListMailingListAddressMemberContact(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organizationName The internal name of your exchange organization
	 * @param exchangeService The internal name of your exchange service
	 * @param mailingListAddress The mailing list address
	 * @param allowedAccountId Account id to give send on behalf to
	*/
	net.zyuiop.ovhapi.api.objects.email.exchange.ExchangeDistributionGroupSendAs getOrganizationNameServiceExchangeServiceMailingListMailingListAddressSendAsAllowedAccountId(java.lang.String organizationName, java.lang.String exchangeService, java.lang.String mailingListAddress, long allowedAccountId) throws java.io.IOException;

}
