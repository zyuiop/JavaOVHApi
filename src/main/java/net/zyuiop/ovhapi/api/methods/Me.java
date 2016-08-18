package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /me APIs
 */

public interface Me { 

	/**
	 * Validate your TOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionTotpIdValidate(java.lang.String code, long id) throws java.io.IOException;


	/**
	 * Initiate a password change procedure
	 * Facultative parameters ? false
	*/
	void postChangePassword() throws java.io.IOException;

	/**
	 * List of all the refunds the logged account has
	 * Facultative parameters ? true
	 * @param date.to Filter the value of date property (<=)
	 * @param date.from Filter the value of date property (>=)
	*/
	java.lang.String[] getRefund(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException;

	/**
	 * List of all the refunds the logged account has
	 * Facultative parameters ? false
	*/
	java.lang.String[] getRefund() throws java.io.IOException;

	/**
	 * Retrieve all contact that you created
	 * Facultative parameters ? false
	*/
	long[] getContact() throws java.io.IOException;

	/**
	 * Your customized operating system installation templates
	 * Facultative parameters ? false
	*/
	java.lang.String[] getInstallationTemplate() throws java.io.IOException;

	/**
	 * List of TOTP accounts
	 * Facultative parameters ? false
	*/
	long[] getAccessRestrictionTotp() throws java.io.IOException;




	/**
	 * List of credit cards
	 * Facultative parameters ? false
	*/
	long[] getPaymentMeanCreditCard() throws java.io.IOException;

	/**
	 * Refuse this change request
	 * Facultative parameters ? false
	 * @param token The token you received by email for this request
	 * @param id null
	*/
	void postTaskContactChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException;

	/**
	 * List of all your IPXE scripts
	 * Facultative parameters ? false
	*/
	java.lang.String[] getIpxeScript() throws java.io.IOException;

	/**
	 * Add a scheme of partition
	 * Facultative parameters ? false
	 * @param priority on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications)
	 * @param name name of this partitioning scheme
	 * @param templateName This template name
	*/
	void postInstallationTemplateTemplateNamePartitionScheme(long priority, java.lang.String name, java.lang.String templateName) throws java.io.IOException;

	/**
	 * List of contracts signed between you and OVH
	 * Facultative parameters ? true
	 * @param agreed Filter the value of agreed property (like)
	 * @param contractId Filter the value of contractId property (like)
	*/
	long[] getAgreements(java.lang.String agreed, long contractId) throws java.io.IOException;

	/**
	 * List of contracts signed between you and OVH
	 * Facultative parameters ? false
	*/
	long[] getAgreements() throws java.io.IOException;

	/**
	 * Delete this Two-Factor
	 * Facultative parameters ? false
	*/
	void deleteAccessRestrictionBackupCode() throws java.io.IOException;


	/**
	 * Enable this SOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	*/
	void postAccessRestrictionBackupCodeEnable(java.lang.String code) throws java.io.IOException;


	/**
	 * Give access to all entries of the order
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	long[] getOrderOrderIdDetails(long orderId) throws java.io.IOException;


	/**
	 * Remove this credential
	 * Facultative parameters ? false
	 * @param credentialId null
	*/
	void deleteApiCredentialCredentialId(long credentialId) throws java.io.IOException;

	/**
	 * Relaunch the task
	 * Facultative parameters ? false
	 * @param id Id of the task
	*/
	void postTaskDomainIdRelaunch(long id) throws java.io.IOException;

	/**
	 * Pay with an already registered payment mean
	 * Facultative parameters ? false
	 * @param paymentMean The registered payment mean you want to use
	 * @param orderId null
	*/
	void postOrderOrderIdPayWithRegisteredPaymentMean(java.lang.String paymentMean, long orderId) throws java.io.IOException;




	/**
	 * Add an organisation
	 * Facultative parameters ? true
	 * @param country null
	 * @param firstname null
	 * @param registry null
	 * @param lastname null
	 * @param phone null
	 * @param abuse_mailbox null
	 * @param city null
	 * @param address null
	 * @param zip null
	*/
	void postIpOrganisation(java.lang.String country, java.lang.String firstname, java.lang.String registry, java.lang.String lastname, java.lang.String phone, java.lang.String abuse_mailbox, java.lang.String city, java.lang.String address, java.lang.String zip) throws java.io.IOException;

	/**
	 * Add an organisation
	 * Facultative parameters ? false
	 * @param country null
	 * @param firstname null
	 * @param registry null
	 * @param lastname null
	 * @param phone null
	 * @param abuse_mailbox null
	 * @param city null
	 * @param address null
	*/
	void postIpOrganisation(java.lang.String country, java.lang.String firstname, java.lang.String registry, java.lang.String lastname, java.lang.String phone, java.lang.String abuse_mailbox, java.lang.String city, java.lang.String address) throws java.io.IOException;

	/**
	 * List of your Api Application
	 * Facultative parameters ? false
	*/
	long[] getApiApplication() throws java.io.IOException;

	/**
	 * Choose this bank account as your default payment mean. Will cancel the previous choice.
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void postPaymentMeanBankAccountIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException;

	/**
	 * Return status of order
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	java.lang.String getOrderOrderIdStatus(long orderId) throws java.io.IOException;

	/**
	 * List of Paypal accounts usable for payments on this account
	 * Facultative parameters ? false
	*/
	long[] getPaymentMeanPaypal() throws java.io.IOException;




	/**
	 * Accelerate the task
	 * Facultative parameters ? false
	 * @param id Id of the task
	*/
	void postTaskDomainIdAccelerate(long id) throws java.io.IOException;

	/**
	 * Activate auto renew for this nic
	 * Facultative parameters ? false
	 * @param renewDay Day of autorenew
	*/
	void postAutorenew(long renewDay) throws java.io.IOException;

	/**
	 * List of entries of the fidelity account
	 * Facultative parameters ? true
	 * @param date.to Filter the value of date property (<=)
	 * @param date.from Filter the value of date property (>=)
	*/
	long[] getFidelityAccountMovements(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException;

	/**
	 * List of entries of the fidelity account
	 * Facultative parameters ? false
	*/
	long[] getFidelityAccountMovements() throws java.io.IOException;

	/**
	 * List of email change tasks you are involved in
	 * Facultative parameters ? true
	 * @param state Filter the value of state property (like)
	*/
	long[] getTaskEmailChange(java.lang.String state) throws java.io.IOException;

	/**
	 * List of email change tasks you are involved in
	 * Facultative parameters ? false
	*/
	long[] getTaskEmailChange() throws java.io.IOException;

	/**
	 * Disable this TOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionTotpIdDisable(java.lang.String code, long id) throws java.io.IOException;

	/**
	 * List of domain task
	 * Facultative parameters ? true
	 * @param domain Filter the value of domain property (like)
	 * @param function Filter the value of function property (like)
	 * @param status Filter the value of status property (=)
	*/
	long[] getTaskDomain(java.lang.String domain, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * List of domain task
	 * Facultative parameters ? false
	*/
	long[] getTaskDomain() throws java.io.IOException;

	/**
	 * List of your public SSH keys
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSshKey() throws java.io.IOException;


	/**
	 * Add an hardware RAID in this partitioning scheme
	 * Facultative parameters ? false
	 * @param disks Disk list. Syntax is cX:dY for disks and [cX:dY, cX:dY] for groups. With X and Y resp. the controler id and the disk id.
	 * @param step Specifies the creation order of the hardware RAID
	 * @param mode RAID mode
	 * @param name Hardware RAID name
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	void postInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String disks, long step, java.lang.String mode, java.lang.String name, java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;





	/**
	 * Enable this SMS account
	 * Facultative parameters ? false
	 * @param code SMS code send by a cellphone
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionSmsIdEnable(java.lang.String code, long id) throws java.io.IOException;




	/**
	 * Give access to all entries of the bill
	 * Facultative parameters ? false
	 * @param billId null
	*/
	java.lang.String[] getBillBillIdDetails(java.lang.String billId) throws java.io.IOException;


	/**
	 * Accept this change request
	 * Facultative parameters ? false
	 * @param token The token you received by email for this request
	 * @param id null
	*/
	void postTaskEmailChangeIdAccept(java.lang.String token, long id) throws java.io.IOException;

	/**
	 * Remove this RAID
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	 * @param name Hardware RAID name
	*/
	void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaidName(java.lang.String templateName, java.lang.String schemeName, java.lang.String name) throws java.io.IOException;






	/**
	 * Request a password recover
	 * Facultative parameters ? false
	 * @param ovhId Your OVH Account Id
	 * @param ovhCompany Company of your OVH Account Id
	*/
	void postPasswordRecover(java.lang.String ovhId, java.lang.String ovhCompany) throws java.io.IOException;


	/**
	 * Ask for SLA application
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void postSlaIdApply(long id) throws java.io.IOException;


	/**
	 * Remove this application. It will revoke all credential belonging to this application.
	 * Facultative parameters ? false
	 * @param applicationId null
	*/
	void deleteApiApplicationApplicationId(long applicationId) throws java.io.IOException;




	/**
	 * Disable payment through this PayPal account
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void deletePaymentMeanPaypalId(long id) throws java.io.IOException;



	/**
	 * Delete this Two-Factor
	 * Facultative parameters ? false
	 * @param id The Id of the restriction
	*/
	void deleteAccessRestrictionTotpId(long id) throws java.io.IOException;

	/**
	 * List of bank accounts
	 * Facultative parameters ? true
	 * @param state Filter the value of state property (=)
	*/
	long[] getPaymentMeanBankAccount(java.lang.String state) throws java.io.IOException;

	/**
	 * List of bank accounts
	 * Facultative parameters ? false
	*/
	long[] getPaymentMeanBankAccount() throws java.io.IOException;


	/**
	 * Create a template
	 * Facultative parameters ? false
	 * @param defaultLanguage null
	 * @param name Your template name
	 * @param baseTemplateName OVH template name yours will be based on, choose one among the list given by compatibleTemplates function
	*/
	void postInstallationTemplate(java.lang.String defaultLanguage, java.lang.String name, java.lang.String baseTemplateName) throws java.io.IOException;




	/**
	 * Cancel the task
	 * Facultative parameters ? false
	 * @param id Id of the task
	*/
	void postTaskDomainIdCancel(long id) throws java.io.IOException;


	/**
	 * Check whether this SLA can be applied on your services
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	boolean getSlaIdCanBeApplied(long id) throws java.io.IOException;

	/**
	 * Give access to all entries of the refund
	 * Facultative parameters ? false
	 * @param refundId null
	*/
	java.lang.String[] getRefundRefundIdDetails(java.lang.String refundId) throws java.io.IOException;






	/**
	 * List active SLA
	 * Facultative parameters ? false
	*/
	long[] getSla() throws java.io.IOException;

	/**
	 * List of all the orders the logged account has
	 * Facultative parameters ? true
	 * @param date.to Filter the value of date property (<=)
	 * @param date.from Filter the value of date property (>=)
	*/
	long[] getOrder(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException;

	/**
	 * List of all the orders the logged account has
	 * Facultative parameters ? false
	*/
	long[] getOrder() throws java.io.IOException;

	/**
	 * List of all the bills the logged account has
	 * Facultative parameters ? true
	 * @param date.to Filter the value of date property (<=)
	 * @param date.from Filter the value of date property (>=)
	*/
	java.lang.String[] getBill(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException;

	/**
	 * List of all the bills the logged account has
	 * Facultative parameters ? false
	*/
	java.lang.String[] getBill() throws java.io.IOException;

	/**
	 * Disable this SOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	*/
	void postAccessRestrictionBackupCodeDisable(java.lang.String code) throws java.io.IOException;


	/**
	 * List of Sms accounts
	 * Facultative parameters ? false
	*/
	long[] getAccessRestrictionSms() throws java.io.IOException;

	/**
	 * This call will send you a new email, containing a new token
	 * Facultative parameters ? false
	 * @param id null
	*/
	void postTaskContactChangeIdResendEmail(long id) throws java.io.IOException;


	/**
	 * List of OVH accounts the logged account has
	 * Facultative parameters ? false
	*/
	java.lang.String[] getOvhAccount() throws java.io.IOException;

	/**
	 * Delete this Two-Factor
	 * Facultative parameters ? false
	 * @param id The Id of the restriction
	*/
	void deleteAccessRestrictionSmsId(long id) throws java.io.IOException;




	/**
	 * Choose this credit card as your default payment mean. Will cancel the previous choice.
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void postPaymentMeanCreditCardIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException;

	/**
	 * Accept this change request
	 * Facultative parameters ? false
	 * @param token The token you received by email for this request
	 * @param id null
	*/
	void postTaskContactChangeIdAccept(java.lang.String token, long id) throws java.io.IOException;



	/**
	 * Choose this Paypal agreement as your default payment mean. Will cancel the previous choice.
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void postPaymentMeanPaypalIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException;




	/**
	 * Partitioning schemes available on this template
	 * Facultative parameters ? false
	 * @param templateName This template name
	*/
	java.lang.String[] getInstallationTemplateTemplateNamePartitionScheme(java.lang.String templateName) throws java.io.IOException;

	/**
	 * Add a partition in this partitioning scheme
	 * Facultative parameters ? true
	 * @param step null
	 * @param filesystem Partition filesytem
	 * @param mountpoint partition mount point
	 * @param type null
	 * @param size size of partition in Mb, 0 => rest of the space
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	 * @param volumeName The volume name needed for proxmox distribution
	 * @param raid null
	*/
	void postInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(long step, java.lang.String filesystem, java.lang.String mountpoint, java.lang.String type, long size, java.lang.String templateName, java.lang.String schemeName, java.lang.String volumeName, long raid) throws java.io.IOException;

	/**
	 * Add a partition in this partitioning scheme
	 * Facultative parameters ? false
	 * @param step null
	 * @param filesystem Partition filesytem
	 * @param mountpoint partition mount point
	 * @param type null
	 * @param size size of partition in Mb, 0 => rest of the space
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	void postInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(long step, java.lang.String filesystem, java.lang.String mountpoint, java.lang.String type, long size, java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * remove this template
	 * Facultative parameters ? false
	 * @param templateName This template name
	*/
	void deleteInstallationTemplateTemplateName(java.lang.String templateName) throws java.io.IOException;


	/**
	 * Validate your SMS account
	 * Facultative parameters ? false
	 * @param code SMS code send to a cellphone
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionSmsIdValidate(java.lang.String code, long id) throws java.io.IOException;

	/**
	 * Enable this TOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionTotpIdEnable(java.lang.String code, long id) throws java.io.IOException;


	/**
	 * List of service contact change tasks you are involved in
	 * Facultative parameters ? true
	 * @param toAccount Filter the value of toAccount property (like)
	 * @param askingAccount Filter the value of askingAccount property (like)
	 * @param state Filter the value of state property (like)
	*/
	long[] getTaskContactChange(java.lang.String toAccount, java.lang.String askingAccount, java.lang.String state) throws java.io.IOException;

	/**
	 * List of service contact change tasks you are involved in
	 * Facultative parameters ? false
	*/
	long[] getTaskContactChange() throws java.io.IOException;


	/**
	 * Add a new public SSH key
	 * Facultative parameters ? false
	 * @param key ASCII encoded public SSH key to add
	 * @param keyName name of the new public SSH key
	*/
	void postSshKey(java.lang.String key, java.lang.String keyName) throws java.io.IOException;

	/**
	 * Refuse this change request
	 * Facultative parameters ? false
	 * @param token The token you received by email for this request
	 * @param id null
	*/
	void postTaskEmailChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException;


	/**
	 * Hardware RAIDs defined in this partitioning scheme
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	java.lang.String[] getInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * Disable payment through this credit card
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void deletePaymentMeanCreditCardId(long id) throws java.io.IOException;

	/**
	 * remove this scheme of partition
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeName(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * Details about an entry of the OVH account
	 * Facultative parameters ? true
	 * @param ovhAccountId null
	 * @param date.to Filter the value of date property (<=)
	 * @param date.from Filter the value of date property (>=)
	*/
	long[] getOvhAccountOvhAccountIdMovements(java.lang.String ovhAccountId, java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException;

	/**
	 * Details about an entry of the OVH account
	 * Facultative parameters ? false
	 * @param ovhAccountId null
	*/
	long[] getOvhAccountOvhAccountIdMovements(java.lang.String ovhAccountId) throws java.io.IOException;



	/**
	 * Remove this public SSH key
	 * Facultative parameters ? false
	 * @param keyName Name of this public SSH key
	*/
	void deleteSshKeyKeyName(java.lang.String keyName) throws java.io.IOException;



	/**
	 * Partitions defined in this partitioning scheme
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	java.lang.String[] getInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;



	/**
	 * Disable payment through this account
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void deletePaymentMeanBankAccountId(long id) throws java.io.IOException;




	/**
	 * List of documents added in your account
	 * Facultative parameters ? false
	*/
	java.lang.String[] getDocument() throws java.io.IOException;



	/**
	 * Check the integrity of this template
	 * Facultative parameters ? false
	 * @param templateName This template name
	*/
	void postInstallationTemplateTemplateNameCheckIntegrity(java.lang.String templateName) throws java.io.IOException;


	/**
	 * Add an IP access restriction
	 * Facultative parameters ? false
	 * @param ip An IP range where we will apply the rule
	 * @param warning Send an email if someone try to access with this IP address
	 * @param rule Accept or deny IP access
	*/
	void postAccessRestrictionIp(java.lang.String ip, boolean warning, java.lang.String rule) throws java.io.IOException;



	/**
	 * Disable this SMS account
	 * Facultative parameters ? false
	 * @param code SMS code send by a cellphone
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionSmsIdDisable(java.lang.String code, long id) throws java.io.IOException;

	/**
	 * Remove this IPXE Script
	 * Facultative parameters ? false
	 * @param name Name of this script
	*/
	void deleteIpxeScriptName(java.lang.String name) throws java.io.IOException;

	/**
	 * Add CORS support on your container
	 * Facultative parameters ? false
	 * @param origin Allow this origin
	*/
	void postDocumentCors(java.lang.String origin) throws java.io.IOException;





	/**
	 * List of organisations
	 * Facultative parameters ? false
	*/
	java.lang.String[] getIpOrganisation() throws java.io.IOException;

	/**
	 * List of all OVH things you can subscribe to
	 * Facultative parameters ? false
	*/
	java.lang.String[] getSubscription() throws java.io.IOException;

	/**
	 * List of arguments
	 * Facultative parameters ? false
	 * @param id Id of the task
	*/
	java.lang.String[] getTaskDomainIdArgument(long id) throws java.io.IOException;




	/**
	 * Delete a document
	 * Facultative parameters ? false
	 * @param id Document id
	*/
	void deleteDocumentId(java.lang.String id) throws java.io.IOException;



	/**
	 * List of all your email notifications
	 * Facultative parameters ? false
	*/
	long[] getNotificationEmailHistory() throws java.io.IOException;

	/**
	 * Accept this contract
	 * Facultative parameters ? false
	 * @param id Id of the contract
	*/
	java.lang.String postAgreementsIdAccept(long id) throws java.io.IOException;

	/**
	 * remove this partition
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	 * @param mountpoint partition mount point
	*/
	void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartitionMountpoint(java.lang.String templateName, java.lang.String schemeName, java.lang.String mountpoint) throws java.io.IOException;




	/**
	 * List of IP restrictions
	 * Facultative parameters ? false
	*/
	long[] getAccessRestrictionIp() throws java.io.IOException;






	/**
	 * List of your Api Credentials
	 * Facultative parameters ? true
	 * @param status Filter the value of status property (=)
	 * @param applicationId Filter the value of applicationId property (like)
	*/
	long[] getApiCredential(java.lang.String status, long applicationId) throws java.io.IOException;

	/**
	 * List of your Api Credentials
	 * Facultative parameters ? false
	*/
	long[] getApiCredential() throws java.io.IOException;



	/**
	 * Delete this restriction rule
	 * Facultative parameters ? false
	 * @param id The Id of the restriction
	*/
	void deleteAccessRestrictionIpId(long id) throws java.io.IOException;



}
