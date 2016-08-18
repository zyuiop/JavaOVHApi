package net.zyuiop.ovhapi.api.methods.email;

/**
 * A class to interact with OVH's /email/domain APIs
 */

public interface Domain { 




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
	 * Get rules
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	 * @param name Filter name
	*/
	long[] getDomainAccountAccountNameFilterNameRule(java.lang.String domain, java.lang.String accountName, java.lang.String name) throws java.io.IOException;



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
	 * Get filters
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	java.lang.String[] getDomainAccountAccountNameFilter(java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Get rules
	 * Facultative parameters ? false
	 * @param email Email
	 * @param name Filter name
	*/
	long[] getDelegatedAccountEmailFilterNameRule(java.lang.String email, java.lang.String name) throws java.io.IOException;

	/**
	 * Get ACL on your domain
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	*/
	java.lang.String getDomainAcl(java.lang.String domain) throws java.io.IOException;



	/**
	 * Update usage of account
	 * Facultative parameters ? false
	 * @param email Email
	*/
	void postDelegatedAccountEmailUpdateUsage(java.lang.String email) throws java.io.IOException;






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
	 * Get filters
	 * Facultative parameters ? false
	 * @param email Email
	*/
	java.lang.String[] getDelegatedAccountEmailFilter(java.lang.String email) throws java.io.IOException;


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
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getEmailDomain() throws java.io.IOException;

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
	 * Create delegation for this account
	 * Facultative parameters ? false
	 * @param accountId OVH customer unique identifier
	 * @param domain Name of your domain name
	 * @param accountName Name of account
	*/
	java.lang.String postDomainAccountAccountNameDelegation(java.lang.String accountId, java.lang.String domain, java.lang.String accountName) throws java.io.IOException;

	/**
	 * Delete ACL
	 * Facultative parameters ? false
	 * @param domain Name of your domain name
	 * @param accountId OVH customer unique identifier
	*/
	void deleteDomainAclAccountId(java.lang.String domain, java.lang.String accountId) throws java.io.IOException;





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


}
