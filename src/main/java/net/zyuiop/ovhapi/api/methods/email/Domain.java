package net.zyuiop.ovhapi.api.methods.email;

/**
 * A class to interact with OVH's /email/domain APIs
 */

public interface Domain { 

	/**
	 * Domain MX records
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param subDomain Sub domain
	*/
	java.lang.String[] getDomainDnsMXRecords(java.lang.String domain, java.lang.String subDomain) throws java.io.IOException;

	/**
	 * Domain MX records
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	java.lang.String[] getDomainDnsMXRecords(java.lang.String domain) throws java.io.IOException;

	/**
	 * Update usage of account
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	void postDomainAccountAccountNameUpdateUsage(java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Delete an existing delegation
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param accountId OVH customer unique identifier
	*/
	java.lang.String deleteDomainAccountAccountNameDelegationAccountId(java.lang.String domain, java.lang.String accountName, java.lang.String accountId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.DomainService getDomain(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param name Filter name
	 * @param id 
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Rule getDomainAccountAccountNameFilterNameRuleId(java.lang.String domain, java.lang.String accountName, java.lang.String name, long id) throws java.io.IOException;

	/**
	 * Delete an existing filter
	 * Facultative parameters ? false
	 * @param email Email
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter[] deleteDelegatedAccountEmailFilterName(java.lang.String email, java.lang.String name) throws java.io.IOException;

	/**
	 * Get rules
	 * Facultative parameters ? false
	 * @param email Email
	 * @param name Filter name
	*/
	long[] getDelegatedAccountEmailFilterNameRule(java.lang.String email, java.lang.String name) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postDomainChangeContact(java.lang.String domain, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	long[] postDomainChangeContact(java.lang.String domain) throws java.io.IOException;

	/**
	 * Create new filter for account
	 * Facultative parameters ? true
	 * @param priority Priority of filter
	 * @param value Rule parameter of filter
	 * @param active If true filter is active
	 * @param operand Rule of filter
	 * @param name Filter name
	 * @param action Action of filter
	 * @param header Header to be filtered
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param actionParam Action parameter of filter
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String domain, java.lang.String accountName, java.lang.String actionParam) throws java.io.IOException;

	/**
	 * Create new filter for account
	 * Facultative parameters ? false
	 * @param priority Priority of filter
	 * @param value Rule parameter of filter
	 * @param active If true filter is active
	 * @param operand Rule of filter
	 * @param name Filter name
	 * @param action Action of filter
	 * @param header Header to be filtered
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.MailingList getDomainMailingListName(java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Delete existing Mailing list
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl deleteDomainMailingListName(java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Change filter priority
	 * Facultative parameters ? false
	 * @param priority New priority
	 * @param email Email
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilterNameChangePriority(long priority, java.lang.String email, java.lang.String name) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	void putDomainAccountAccountName(net.zyuiop.ovhapi.api.objects.email.domain.Account param0, java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Create delegation of domain with same nic than V3
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	void postDomainMigrateDelegationV3toV6(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get delegations
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	java.lang.String getDomainAccountAccountNameDelegation(java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Delete existing subscriber
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	 * @param email null
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl deleteDomainMailingListNameSubscriberEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Account getDomainAccountAccountName(java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Get accounts
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param accountName Account name
	*/
	java.lang.String[] getDomainAccount(java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Get accounts
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	java.lang.String[] getDomainAccount(java.lang.String domain) throws java.io.IOException;

	/**
	 * Change filter priority
	 * Facultative parameters ? false
	 * @param priority New priority
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilterNameChangePriority(long priority, java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException;

	/**
	 * Get Mailing List tasks
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param account Account name
	*/
	long[] getDomainTaskMailinglist(java.lang.String domain, java.lang.String account) throws java.io.IOException;

	/**
	 * Get Mailing List tasks
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	long[] getDomainTaskMailinglist(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get filters
	 * Facultative parameters ? false
	 * @param email Email
	*/
	java.lang.String[] getDelegatedAccountEmailFilter(java.lang.String email) throws java.io.IOException;

	/**
	 * Get rules
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param name Filter name
	*/
	long[] getDomainAccountAccountNameFilterNameRule(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException;

	/**
	 * Get ACL on your domain
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	java.lang.String getDomainAcl(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param accountId OVH customer unique identifier
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Delegation getDomainAccountAccountNameDelegationAccountId(java.lang.String domain, java.lang.String accountName, java.lang.String accountId) throws java.io.IOException;

	/**
	 * Delete an existing mailbox in server
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskPop deleteDomainAccountAccountName(java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	 * @param email null
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Subscriber getDomainMailingListNameSubscriberEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException;

	/**
	 * Delegated emails
	 * Facultative parameters ? true
	 * @param domain Domain of email address
	 * @param accountName Name of email address
	*/
	java.lang.String[] getDelegatedAccount(java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Delegated emails
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDelegatedAccount() throws java.io.IOException;

	/**
	 * Get mailing lists
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param name Mailing list name
	*/
	java.lang.String[] getDomainMailingList(java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Get mailing lists
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	java.lang.String[] getDomainMailingList(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param email Email
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Filter getDelegatedAccountEmailFilterName(java.lang.String email, java.lang.String name) throws java.io.IOException;

	/**
	 * Get redirections
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param to Email of redirection target
	 * @param from Name of redirection
	*/
	java.lang.String[] getDomainRedirection(java.lang.String domain, java.lang.String to, java.lang.String from) throws java.io.IOException;

	/**
	 * Get redirections
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	java.lang.String[] getDomainRedirection(java.lang.String domain) throws java.io.IOException;

	/**
	 * usage of account
	 * Facultative parameters ? false
	 * @param email Email
	*/
	net.zyuiop.ovhapi.api.objects.domain.DomainUsageAccountStruct postDelegatedAccountEmailUsage(java.lang.String email) throws java.io.IOException;

	/**
	 * Create new rule for filter
	 * Facultative parameters ? false
	 * @param value Rule parameter of filter
	 * @param operand Rule of filter
	 * @param header Header to be filtered
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilterNameRule(java.lang.String value, java.lang.String operand, java.lang.String header, java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException;

	/**
	 * Get responders
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param account Responder name
	*/
	java.lang.String[] getDomainResponder(java.lang.String domain, java.lang.String account) throws java.io.IOException;

	/**
	 * Get responders
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	java.lang.String[] getDomainResponder(java.lang.String domain) throws java.io.IOException;

	/**
	 * Summary for this domain
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	net.zyuiop.ovhapi.api.objects.domain.DomainSummary getDomainSummary(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param id Id of task
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount getDomainTaskRedirectionId(java.lang.String domain, long id) throws java.io.IOException;

	/**
	 * Change mailbox password (length : [9;30], no space at begin and end, no accent)
	 * Facultative parameters ? false
	 * @param password New password
	 * @param email Email
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDelegatedAccountEmailChangePassword(java.lang.String password, java.lang.String email) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	 * @param email null
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Moderator getDomainMailingListNameModeratorEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param account Name of account
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Responder getDomainResponderAccount(java.lang.String domain, java.lang.String account) throws java.io.IOException;

	/**
	 * usage of account
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	net.zyuiop.ovhapi.api.objects.domain.DomainUsageAccountStruct getDomainAccountAccountNameUsage(java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Filter getDomainAccountAccountNameFilterName(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param email Email
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.AccountDelegated getDelegatedAccountEmail(java.lang.String email) throws java.io.IOException;

	/**
	 * Get account tasks
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param name Account name
	*/
	long[] getDomainTaskAccount(java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Get account tasks
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	long[] getDomainTaskAccount(java.lang.String domain) throws java.io.IOException;

	/**
	 * Send moderators list and subscribers list of this mailing list by email
	 * Facultative parameters ? false
	 * @param email Email destination
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameSendListByEmail(java.lang.String email, java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Create new rule for filter
	 * Facultative parameters ? false
	 * @param value Rule parameter of filter
	 * @param operand Rule of filter
	 * @param header Header to be filtered
	 * @param email Email
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilterNameRule(java.lang.String value, java.lang.String operand, java.lang.String header, java.lang.String email, java.lang.String name) throws java.io.IOException;

	/**
	 * Change mailing list options
	 * Facultative parameters ? false
	 * @param options Options of mailing list
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameChangeOptions(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options, java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Create delegation for this account
	 * Facultative parameters ? false
	 * @param accountId OVH customer unique identifier
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	java.lang.String postDomainAccountAccountNameDelegation(java.lang.String accountId, java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * List of moderators
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	 * @param email Moderator email
	*/
	java.lang.String[] getDomainMailingListNameModerator(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException;

	/**
	 * List of moderators
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	*/
	java.lang.String[] getDomainMailingListNameModerator(java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Domain MX filter
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param subDomain Sub domain
	*/
	java.lang.String getDomainDnsMXFilter(java.lang.String domain, java.lang.String subDomain) throws java.io.IOException;

	/**
	 * Domain MX filter
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	java.lang.String getDomainDnsMXFilter(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.RedirectionGlobal getDomainRedirectionId(java.lang.String domain, java.lang.String id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param id Id of task
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount getDomainTaskResponderId(java.lang.String domain, long id) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getEmailDomain() throws java.io.IOException;

	/**
	 * Create new mailingList
	 * Facultative parameters ? true
	 * @param options Options of mailing list
	 * @param language Language of mailing list
	 * @param name Mailing list name
	 * @param ownerEmail Owner Email
	 * @param domain Name of your domain name
	 * @param replyTo Email to reply of mailing list
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingList(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options, java.lang.String language, java.lang.String name, java.lang.String ownerEmail, java.lang.String domain, java.lang.String replyTo) throws java.io.IOException;

	/**
	 * Create new mailingList
	 * Facultative parameters ? false
	 * @param options Options of mailing list
	 * @param language Language of mailing list
	 * @param name Mailing list name
	 * @param ownerEmail Owner Email
	 * @param domain Name of your domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingList(net.zyuiop.ovhapi.api.objects.domain.DomainMlOptionsStruct options, java.lang.String language, java.lang.String name, java.lang.String ownerEmail, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get filters
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	java.lang.String[] getDomainAccountAccountNameFilter(java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Create new ACL
	 * Facultative parameters ? false
	 * @param accountId Deleguates rights to
	 * @param domain Name of your domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Acl postDomainAcl(java.lang.String accountId, java.lang.String domain) throws java.io.IOException;

	/**
	 * Delete an existing filter
	 * Facultative parameters ? false
	 * @param email Email
	 * @param name Filter name
	 * @param id 
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter[] deleteDelegatedAccountEmailFilterNameRuleId(java.lang.String email, java.lang.String name, long id) throws java.io.IOException;

	/**
	 * Change mailbox password (length : [9;30], no space at begin and end, no accent)
	 * Facultative parameters ? false
	 * @param password New password
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDomainAccountAccountNameChangePassword(java.lang.String password, java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Create new responder in server
	 * Facultative parameters ? true
	 * @param copy If true, emails will be copy to emailToCopy address
	 * @param account Account of domain
	 * @param content Content of responder
	 * @param domain Name of your domain name
	 * @param copyTo Account where copy emails
	 * @param to Date of end responder
	 * @param from Date of start responder
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainResponder(boolean copy, java.lang.String account, java.lang.String content, java.lang.String domain, java.lang.String copyTo, java.util.Date to, java.util.Date from) throws java.io.IOException;

	/**
	 * Create new responder in server
	 * Facultative parameters ? false
	 * @param copy If true, emails will be copy to emailToCopy address
	 * @param account Account of domain
	 * @param content Content of responder
	 * @param domain Name of your domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainResponder(boolean copy, java.lang.String account, java.lang.String content, java.lang.String domain) throws java.io.IOException;

	/**
	 * List of subscribers
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	 * @param email Subscriber email
	*/
	java.lang.String[] getDomainMailingListNameSubscriber(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException;

	/**
	 * List of subscribers
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	*/
	java.lang.String[] getDomainMailingListNameSubscriber(java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Delete an existing redirection in server
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount deleteDomainRedirectionId(java.lang.String domain, java.lang.String id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param email Email
	*/
	void putDelegatedAccountEmail(net.zyuiop.ovhapi.api.objects.email.domain.AccountDelegated param0, java.lang.String email) throws java.io.IOException;

	/**
	 * Delete an existing filter
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param name Filter name
	 * @param id 
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter[] deleteDomainAccountAccountNameFilterNameRuleId(java.lang.String domain, java.lang.String accountName, java.lang.String name, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl getDomainTaskMailinglistId(java.lang.String domain, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param id Id of task
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter getDomainTaskFilterId(java.lang.String domain, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param id Id of task
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskPop getDomainTaskAccountId(java.lang.String domain, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	*/
	void putDomainMailingListName(net.zyuiop.ovhapi.api.objects.email.domain.MailingList param0, java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param email Email
	 * @param name Filter name
	 * @param id 
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Rule getDelegatedAccountEmailFilterNameRuleId(java.lang.String email, java.lang.String name, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountId OVH customer unique identifier
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.Acl getDomainAclAccountId(java.lang.String domain, java.lang.String accountId) throws java.io.IOException;

	/**
	 * Get responder tasks
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param account Name of responder
	*/
	long[] getDomainTaskResponder(java.lang.String domain, java.lang.String account) throws java.io.IOException;

	/**
	 * Get responder tasks
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	long[] getDomainTaskResponder(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get filter tasks
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param account Account name
	*/
	long[] getDomainTaskFilter(java.lang.String domain, java.lang.String account) throws java.io.IOException;

	/**
	 * Get filter tasks
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	long[] getDomainTaskFilter(java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getDomainServiceInfos(java.lang.String domain) throws java.io.IOException;

	/**
	 * Create new filter for account
	 * Facultative parameters ? true
	 * @param priority Priority of filter
	 * @param value Rule parameter of filter
	 * @param active If true filter is active
	 * @param operand Rule of filter
	 * @param name Filter name
	 * @param action Action of filter
	 * @param header Header to be filtered
	 * @param email Email
	 * @param actionParam Action parameter of filter
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String email, java.lang.String actionParam) throws java.io.IOException;

	/**
	 * Create new filter for account
	 * Facultative parameters ? false
	 * @param priority Priority of filter
	 * @param value Rule parameter of filter
	 * @param active If true filter is active
	 * @param operand Rule of filter
	 * @param name Filter name
	 * @param action Action of filter
	 * @param header Header to be filtered
	 * @param email Email
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilter(long priority, java.lang.String value, boolean active, java.lang.String operand, java.lang.String name, java.lang.String action, java.lang.String header, java.lang.String email) throws java.io.IOException;

	/**
	 * Add subscriber to mailing list
	 * Facultative parameters ? false
	 * @param email Email of subscriber
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameSubscriber(java.lang.String email, java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Delete an existing responder in server
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param account Name of account
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount deleteDomainResponderAccount(java.lang.String domain, java.lang.String account) throws java.io.IOException;

	/**
	 * Change redirection
	 * Facultative parameters ? false
	 * @param to Target of account
	 * @param domain Name of your domain name
	 * @param id null
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainRedirectionIdChangeRedirection(java.lang.String to, java.lang.String domain, java.lang.String id) throws java.io.IOException;

	/**
	 * Change filter activity
	 * Facultative parameters ? false
	 * @param activity New activity
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDomainAccountAccountNameFilterNameChangeActivity(boolean activity, java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException;

	/**
	 * Add moderator to mailing list
	 * Facultative parameters ? false
	 * @param email Email of moderator
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl postDomainMailingListNameModerator(java.lang.String email, java.lang.String domain, java.lang.String name) throws java.io.IOException;

	/**
	 * Get redirection tasks
	 * Facultative parameters ? true
	 * @param domain Name of your domain name
	 * @param account Account name
	*/
	long[] getDomainTaskRedirection(java.lang.String domain, java.lang.String account) throws java.io.IOException;

	/**
	 * Get redirection tasks
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	long[] getDomainTaskRedirection(java.lang.String domain) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param domain Name of your domain name
	 * @param account Name of account
	*/
	void putDomainResponderAccount(net.zyuiop.ovhapi.api.objects.email.domain.Responder param0, java.lang.String domain, java.lang.String account) throws java.io.IOException;

	/**
	 * Delete an existing filter
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter[] deleteDomainAccountAccountNameFilterName(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException;

	/**
	 * Create new mailbox in server
	 * Facultative parameters ? true
	 * @param password Account password
	 * @param accountName Account name
	 * @param domain Name of your domain name
	 * @param description Description Account
	 * @param size Account size in bytes (default : 5000000000) (possible values : /email/domain/{domain}/allowedAccountSize )
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDomainAccount(java.lang.String password, java.lang.String accountName, java.lang.String domain, java.lang.String description, long size) throws java.io.IOException;

	/**
	 * Create new mailbox in server
	 * Facultative parameters ? false
	 * @param password Account password
	 * @param accountName Account name
	 * @param domain Name of your domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskPop postDomainAccount(java.lang.String password, java.lang.String accountName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Change MX filter, so change MX DNS records
	 * Facultative parameters ? true
	 * @param mxFilter New MX filter
	 * @param domain Name of your domain name
	 * @param subDomain Sub domain
	 * @param customTarget Target server for custom MX
	*/
	void postDomainChangeDnsMXFilter(java.lang.String mxFilter, java.lang.String domain, java.lang.String subDomain, java.lang.String customTarget) throws java.io.IOException;

	/**
	 * Change MX filter, so change MX DNS records
	 * Facultative parameters ? false
	 * @param mxFilter New MX filter
	 * @param domain Name of your domain name
	*/
	void postDomainChangeDnsMXFilter(java.lang.String mxFilter, java.lang.String domain) throws java.io.IOException;

	/**
	 * List all quotas for this domain
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	net.zyuiop.ovhapi.api.objects.domain.DomainQuota getDomainQuota(java.lang.String domain) throws java.io.IOException;

	/**
	 * Change filter activity
	 * Facultative parameters ? false
	 * @param activity New activity
	 * @param email Email
	 * @param name Filter name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskFilter postDelegatedAccountEmailFilterNameChangeActivity(boolean activity, java.lang.String email, java.lang.String name) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param domain Name of your domain name
	*/
	void putDomainServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String domain) throws java.io.IOException;

	/**
	 * Update usage of account
	 * Facultative parameters ? false
	 * @param email Email
	*/
	void postDelegatedAccountEmailUpdateUsage(java.lang.String email) throws java.io.IOException;

	/**
	 * Delete existing moderator
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param name Name of mailing list
	 * @param email null
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskMl deleteDomainMailingListNameModeratorEmail(java.lang.String domain, java.lang.String name, java.lang.String email) throws java.io.IOException;

	/**
	 * Create new redirection in server
	 * Facultative parameters ? false
	 * @param to Target of account
	 * @param localCopy If true keep a local copy
	 * @param from Name of redirection
	 * @param domain Name of your domain name
	*/
	net.zyuiop.ovhapi.api.objects.email.domain.TaskSpecialAccount postDomainRedirection(java.lang.String to, boolean localCopy, java.lang.String from, java.lang.String domain) throws java.io.IOException;

	/**
	 * Delete ACL
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountId OVH customer unique identifier
	*/
	void deleteDomainAclAccountId(java.lang.String domain, java.lang.String accountId) throws java.io.IOException;

}
