package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /me APIs
 */

public interface Me { 

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param keyName Name of this public SSH key
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.SshKey getSshKeyKeyName(java.lang.String keyName) throws java.io.IOException;

	/**
	 * Your customized operating system installation templates
	 * Facultative parameters ? false
	*/
	java.lang.String getInstallationTemplate() throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param movementId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.FidelityMovement getFidelityAccountMovementsMovementId(long movementId) throws java.io.IOException;

	/**
	 * Return status of order
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	java.lang.String getOrderOrderIdStatus(long orderId) throws java.io.IOException;


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
	 * Remove this RAID
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	 * @param name Hardware RAID name
	*/
	void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaidName(java.lang.String templateName, java.lang.String schemeName, java.lang.String name) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param id The Id of the restriction
	*/
	void putAccessRestrictionIpId(net.zyuiop.ovhapi.api.objects.nichandle.IpRestriction param0, long id) throws java.io.IOException;

	/**
	 * This call will send you a new email, containing a new token
	 * Facultative parameters ? false
	 * @param id null
	*/
	void postTaskContactChangeIdResendEmail(long id) throws java.io.IOException;

	/**
	 * Validate your SMS account
	 * Facultative parameters ? false
	 * @param code SMS code send to a cellphone
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionSmsIdValidate(java.lang.String code, long id) throws java.io.IOException;

	/**
	 * Add an IP access restriction
	 * Facultative parameters ? false
	 * @param ip An IP range where we will apply the rule
	 * @param warning Send an email if someone try to access with this IP address
	 * @param rule Accept or deny IP access
	*/
	void postAccessRestrictionIp(java.lang.String ip, boolean warning, java.lang.String rule) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	*/
	void putMe(net.zyuiop.ovhapi.api.objects.nichandle.Nichandle param0) throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param applicationId null
	*/
	net.zyuiop.ovhapi.api.objects.api.Application getApiApplicationApplicationId(long applicationId) throws java.io.IOException;


	/**
	 * Relaunch the task
	 * Facultative parameters ? false
	 * @param id Id of the task
	*/
	void postTaskDomainIdRelaunch(long id) throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.billing.FidelityAccount getFidelityAccount() throws java.io.IOException;

	/**
	 * VIP Status of this account
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.VipStatus getVipStatus() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ovhAccountId null
	 * @param movementId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Movement getOvhAccountOvhAccountIdMovementsMovementId(java.lang.String ovhAccountId, long movementId) throws java.io.IOException;

	/**
	 * Choose this credit card as your default payment mean. Will cancel the previous choice.
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void postPaymentMeanCreditCardIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException;

	/**
	 * Verify existing voucher
	 * Facultative parameters ? false
	 * @param voucher Voucher value
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.VoucherStatus postVoucherCheckValidity(java.lang.String voucher) throws java.io.IOException;

	/**
	 * Initiate a password change procedure
	 * Facultative parameters ? false
	*/
	void postChangePassword() throws java.io.IOException;


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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Payment getOrderOrderIdPayment(long orderId) throws java.io.IOException;

	/**
	 * Disable payment through this PayPal account
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void deletePaymentMeanPaypalId(long id) throws java.io.IOException;

	/**
	 * Delete this Two-Factor
	 * Facultative parameters ? false
	*/
	void deleteAccessRestrictionBackupCode() throws java.io.IOException;


	/**
	 * Disable this SOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	*/
	void postAccessRestrictionBackupCodeDisable(java.lang.String code) throws java.io.IOException;

	/**
	 * Choose this bank account as your default payment mean. Will cancel the previous choice.
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void postPaymentMeanBankAccountIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException;

	/**
	 * Accept this change request
	 * Facultative parameters ? false
	 * @param token The token you received by email for this request
	 * @param id null
	*/
	void postTaskContactChangeIdAccept(java.lang.String token, long id) throws java.io.IOException;


	/**
	 * Add CORS support on your container
	 * Facultative parameters ? false
	 * @param origin Allow this origin
	*/
	void postDocumentCors(java.lang.String origin) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id The Id of the restriction
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.IpRestriction getAccessRestrictionIpId(long id) throws java.io.IOException;

	/**
	 * List of registered payment mean you can use to pay this order
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.order.RegisteredPaymentMean getOrderOrderIdAvailableRegisteredPaymentMean(long orderId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.IpRestrictionDefaultRule getAccessRestrictionIpDefaultRule() throws java.io.IOException;

	/**
	 * List of all the bills the logged account has
	 * Facultative parameters ? true
	 * @param date.to Filter the value of date property (<=)
	 * @param date.from Filter the value of date property (>=)
	*/
	java.lang.String getBill(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException;

	/**
	 * List of all the bills the logged account has
	 * Facultative parameters ? false
	*/
	java.lang.String getBill() throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param organisationId null
	*/
	void putIpOrganisationOrganisationId(net.zyuiop.ovhapi.api.objects.nichandle.Ipv4Org param0, java.lang.String organisationId) throws java.io.IOException;

	/**
	 * Delete this Two-Factor
	 * Facultative parameters ? false
	 * @param id The Id of the restriction
	*/
	void deleteAccessRestrictionSmsId(long id) throws java.io.IOException;

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
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	*/
	void putAutorenew(net.zyuiop.ovhapi.api.objects.nichandle.NicAutorenewInfos param0) throws java.io.IOException;

	/**
	 * Retrieve information about a contact
	 * Facultative parameters ? false
	 * @param contactId Contact Identifier
	*/
	net.zyuiop.ovhapi.api.objects.contact.Contact getContactContactId(long contactId) throws java.io.IOException;

	/**
	 * List of TOTP accounts
	 * Facultative parameters ? false
	*/
	long[] getAccessRestrictionTotp() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param credentialId null
	*/
	net.zyuiop.ovhapi.api.objects.api.Application getApiCredentialCredentialIdApplication(long credentialId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param refundId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Payment getRefundRefundIdPayment(java.lang.String refundId) throws java.io.IOException;

	/**
	 * Validate your TOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionTotpIdValidate(java.lang.String code, long id) throws java.io.IOException;

	/**
	 * Enable this SOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	*/
	void postAccessRestrictionBackupCodeEnable(java.lang.String code) throws java.io.IOException;

	/**
	 * Delete this Two-Factor
	 * Facultative parameters ? false
	 * @param id The Id of the restriction
	*/
	void deleteAccessRestrictionTotpId(long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Payment getBillBillIdPayment(java.lang.String billId) throws java.io.IOException;


	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.EmailNotification getNotificationEmailHistoryId(long id) throws java.io.IOException;

	/**
	 * Delete this restriction rule
	 * Facultative parameters ? false
	 * @param id The Id of the restriction
	*/
	void deleteAccessRestrictionIpId(long id) throws java.io.IOException;

	/**
	 * Return main data about the object the processing of the order generated
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.order.AssociatedObject getOrderOrderIdAssociatedObject(long orderId) throws java.io.IOException;


	/**
	 * Generate an order that can be paid in order to credit the OVH account
	 * Facultative parameters ? false
	 * @param amount The amount in cents you want to credit your account of
	 * @param ovhAccountId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Order postOvhAccountOvhAccountIdCreditOrder(long amount, java.lang.String ovhAccountId) throws java.io.IOException;

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
	 * List of your public SSH keys
	 * Facultative parameters ? false
	*/
	java.lang.String getSshKey() throws java.io.IOException;

	/**
	 * remove this template
	 * Facultative parameters ? false
	 * @param templateName This template name
	*/
	void deleteInstallationTemplateTemplateName(java.lang.String templateName) throws java.io.IOException;


	/**
	 * Disable this TOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionTotpIdDisable(java.lang.String code, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Refund getOrderOrderIdRefund(long orderId) throws java.io.IOException;

	/**
	 * Delete a document
	 * Facultative parameters ? false
	 * @param id Document id
	*/
	void deleteDocumentId(java.lang.String id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	*/
	void putFidelityAccount(net.zyuiop.ovhapi.api.objects.billing.FidelityAccount param0) throws java.io.IOException;

	/**
	 * List of your Api Application
	 * Facultative parameters ? false
	*/
	long[] getApiApplication() throws java.io.IOException;

	/**
	 * Accept this contract
	 * Facultative parameters ? false
	 * @param id Id of the contract
	*/
	java.lang.String postAgreementsIdAccept(long id) throws java.io.IOException;

	/**
	 * List of all the refunds the logged account has
	 * Facultative parameters ? true
	 * @param date.to Filter the value of date property (<=)
	 * @param date.from Filter the value of date property (>=)
	*/
	java.lang.String getRefund(java.util.Date dateTo, java.util.Date dateFrom) throws java.io.IOException;

	/**
	 * List of all the refunds the logged account has
	 * Facultative parameters ? false
	*/
	java.lang.String getRefund() throws java.io.IOException;

	/**
	 * Disable this SMS account
	 * Facultative parameters ? false
	 * @param code SMS code send by a cellphone
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionSmsIdDisable(java.lang.String code, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param id Id of the object
	*/
	void putPaymentMeanCreditCardId(net.zyuiop.ovhapi.api.objects.billing.CreditCard param0, long id) throws java.io.IOException;


	/**
	 * Refuse this change request
	 * Facultative parameters ? false
	 * @param token The token you received by email for this request
	 * @param id null
	*/
	void postTaskContactChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException;

	/**
	 * Pay with an already registered payment mean
	 * Facultative parameters ? false
	 * @param paymentMean The registered payment mean you want to use
	 * @param orderId null
	*/
	void postOrderOrderIdPayWithRegisteredPaymentMean(java.lang.String paymentMean, long orderId) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param name Name of this script
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.Ipxe getIpxeScriptName(java.lang.String name) throws java.io.IOException;

	/**
	 * Hardware RAIDs defined in this partitioning scheme
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	java.lang.String getInstallationTemplateTemplateNamePartitionSchemeSchemeNameHardwareRaid(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.SlaApply getSlaId(long id) throws java.io.IOException;

	/**
	 * Display mandatory/read-only informations of a contact
	 * Facultative parameters ? false
	 * @param contactId Contact Identifier
	*/
	net.zyuiop.ovhapi.api.objects.contact.FieldInformation getContactContactIdFields(long contactId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param keyName Name of this public SSH key
	*/
	void putSshKeyKeyName(net.zyuiop.ovhapi.api.objects.nichandle.SshKey param0, java.lang.String keyName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param subscriptionType The type of subscription
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.Subscription getSubscriptionSubscriptionType(java.lang.String subscriptionType) throws java.io.IOException;

	/**
	 * Partitions defined in this partitioning scheme
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	java.lang.String getInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartition(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param organisationId null
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.Ipv4Org getIpOrganisationOrganisationId(java.lang.String organisationId) throws java.io.IOException;

	/**
	 * Generate an order that can be paid in order to credit the fidelity account
	 * Facultative parameters ? false
	 * @param amount The amount of points you want to credit your fidelity account of
	*/
	net.zyuiop.ovhapi.api.objects.billing.Order postFidelityAccountCreditOrder(long amount) throws java.io.IOException;

	/**
	 * Get services impacted by this SLA
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.SlaService getSlaIdServices(long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param id Id of the object
	*/
	void putPaymentMeanPaypalId(net.zyuiop.ovhapi.api.objects.billing.Paypal param0, long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param id Id of the task
	 * @param key Key of the argument
	*/
	void putTaskDomainIdArgumentKey(net.zyuiop.ovhapi.api.objects.nichandle.DomainTaskArgument param0, long id, java.lang.String key) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Bill getOrderOrderIdBill(long orderId) throws java.io.IOException;




	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param id Id of the object
	*/
	void putPaymentMeanBankAccountId(net.zyuiop.ovhapi.api.objects.billing.BankAccount param0, long id) throws java.io.IOException;

	/**
	 * Update an existing contact
	 * Facultative parameters ? true
	 * @param contactId Contact Identifier
	 * @param address Address of the contact
	 * @param cellPhone Cellphone number
	 * @param phone Landline phone number
	 * @param fax Fax phone number
	 * @param birthDay Birthday date
	 * @param birthCity City of birth
	 * @param birthZip Birth Zipcode
	 * @param birthCountry Birth Country
	 * @param vat VAT number
	 * @param companyNationalIdentificationNumber Company national identification number
	 * @param nationalIdentificationNumber National identification number
	 * @param organisationType Type of your organisation
	 * @param organisationName Name of your organisation
	 * @param email Email address
	 * @param firstName First name
	 * @param gender Gender
	 * @param language Language
	 * @param nationality Nationality
	 * @param lastName Last name
	 * @param legalForm Legal form of the contact
	*/
	net.zyuiop.ovhapi.api.objects.contact.Contact putContactContactId(long contactId, net.zyuiop.ovhapi.api.objects.contact.Address address, java.lang.String cellPhone, java.lang.String phone, java.lang.String fax, java.util.Date birthDay, java.lang.String birthCity, java.lang.String birthZip, java.lang.String birthCountry, java.lang.String vat, java.lang.String companyNationalIdentificationNumber, java.lang.String nationalIdentificationNumber, java.lang.String organisationType, java.lang.String organisationName, java.lang.String email, java.lang.String firstName, java.lang.String gender, java.lang.String language, java.lang.String nationality, java.lang.String lastName, java.lang.String legalForm) throws java.io.IOException;

	/**
	 * Update an existing contact
	 * Facultative parameters ? false
	 * @param contactId Contact Identifier
	*/
	net.zyuiop.ovhapi.api.objects.contact.Contact putContactContactId(long contactId) throws java.io.IOException;

	/**
	 * Add a new public SSH key
	 * Facultative parameters ? false
	 * @param key ASCII encoded public SSH key to add
	 * @param keyName name of the new public SSH key
	*/
	void postSshKey(java.lang.String key, java.lang.String keyName) throws java.io.IOException;

	/**
	 * Cancel the task
	 * Facultative parameters ? false
	 * @param id Id of the task
	*/
	void postTaskDomainIdCancel(long id) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billId null
	 * @param billDetailId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.BillDetail getBillBillIdDetailsBillDetailId(java.lang.String billId, java.lang.String billDetailId) throws java.io.IOException;

	/**
	 * Request a password recover
	 * Facultative parameters ? false
	 * @param ovhId Your OVH Account Id
	 * @param ovhCompany Company of your OVH Account Id
	*/
	void postPasswordRecover(java.lang.String ovhId, java.lang.String ovhCompany) throws java.io.IOException;

	/**
	 * Remove this credential
	 * Facultative parameters ? false
	 * @param credentialId null
	*/
	void deleteApiCredentialCredentialId(long credentialId) throws java.io.IOException;

	/**
	 * Disable payment through this account
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void deletePaymentMeanBankAccountId(long id) throws java.io.IOException;

	/**
	 * Disable payment through this credit card
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void deletePaymentMeanCreditCardId(long id) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	*/
	void putAccessRestrictionIpDefaultRule(net.zyuiop.ovhapi.api.objects.nichandle.IpRestrictionDefaultRule param0) throws java.io.IOException;

	/**
	 * Transfer money from ovhAccount to your bank account
	 * Facultative parameters ? false
	 * @param amount The amount in cents you want to transfer
	 * @param bankAccountId A valid bank account
	 * @param ovhAccountId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Order postOvhAccountOvhAccountIdRetrieveMoney(long amount, long bankAccountId, java.lang.String ovhAccountId) throws java.io.IOException;



	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.billing.Paypal getPaymentMeanPaypalId(long id) throws java.io.IOException;

	/**
	 * Enable payment through a new account
	 * Facultative parameters ? true
	 * @param iban Account's IBAN
	 * @param ownerAddress Account owner's address
	 * @param ownerName Account owner's name
	 * @param bic Account's BIC
	 * @param description Custom description of this account
	*/
	net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanBankAccount(java.lang.String iban, java.lang.String ownerAddress, java.lang.String ownerName, java.lang.String bic, java.lang.String description) throws java.io.IOException;

	/**
	 * Enable payment through a new account
	 * Facultative parameters ? false
	 * @param iban Account's IBAN
	 * @param ownerAddress Account owner's address
	 * @param ownerName Account owner's name
	 * @param bic Account's BIC
	*/
	net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanBankAccount(java.lang.String iban, java.lang.String ownerAddress, java.lang.String ownerName, java.lang.String bic) throws java.io.IOException;

	/**
	 * List of all your email notifications
	 * Facultative parameters ? false
	*/
	long[] getNotificationEmailHistory() throws java.io.IOException;


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
	 * List of Paypal accounts usable for payments on this account
	 * Facultative parameters ? false
	*/
	long[] getPaymentMeanPaypal() throws java.io.IOException;

	/**
	 * List of organisations
	 * Facultative parameters ? false
	*/
	java.lang.String getIpOrganisation() throws java.io.IOException;

	/**
	 * Give access to all entries of the refund
	 * Facultative parameters ? false
	 * @param refundId null
	*/
	java.lang.String getRefundRefundIdDetails(java.lang.String refundId) throws java.io.IOException;

	/**
	 * Refuse this change request
	 * Facultative parameters ? false
	 * @param token The token you received by email for this request
	 * @param id null
	*/
	void postTaskEmailChangeIdRefuse(java.lang.String token, long id) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param refundId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Refund getRefundRefundId(java.lang.String refundId) throws java.io.IOException;

	/**
	 * Accelerate the task
	 * Facultative parameters ? false
	 * @param id Id of the task
	*/
	void postTaskDomainIdAccelerate(long id) throws java.io.IOException;

	/**
	 * Ask for SLA application
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void postSlaIdApply(long id) throws java.io.IOException;

	/**
	 * List available payment methods in this Nic's country
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.billing.AutomaticPaymentMean getAvailableAutomaticPaymentMeans() throws java.io.IOException;

	/**
	 * remove this partition
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	 * @param mountpoint partition mount point
	*/
	void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeNamePartitionMountpoint(java.lang.String templateName, java.lang.String schemeName, java.lang.String mountpoint) throws java.io.IOException;

	/**
	 * Enable this TOTP account
	 * Facultative parameters ? false
	 * @param code OTP code given by the application
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionTotpIdEnable(java.lang.String code, long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param ovhAccountId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.OvhAccount getOvhAccountOvhAccountId(java.lang.String ovhAccountId) throws java.io.IOException;


	/**
	 * Add an IPXE script
	 * Facultative parameters ? false
	 * @param script Content of your IPXE script
	 * @param name name of your script
	 * @param description A personnal description of this script
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.Ipxe postIpxeScript(java.lang.String script, java.lang.String name, java.lang.String description) throws java.io.IOException;

	/**
	 * List of all your IPXE scripts
	 * Facultative parameters ? false
	*/
	java.lang.String getIpxeScript() throws java.io.IOException;

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
	 * Choose this Paypal agreement as your default payment mean. Will cancel the previous choice.
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	void postPaymentMeanPaypalIdChooseAsDefaultPaymentMean(long id) throws java.io.IOException;

	/**
	 * Give access to all entries of the bill
	 * Facultative parameters ? false
	 * @param billId null
	*/
	java.lang.String getBillBillIdDetails(java.lang.String billId) throws java.io.IOException;

	/**
	 * List of credit cards
	 * Facultative parameters ? false
	*/
	long[] getPaymentMeanCreditCard() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id Id of the contract
	*/
	net.zyuiop.ovhapi.api.objects.agreements.Contract getAgreementsIdContract(long id) throws java.io.IOException;

	/**
	 * Remove this IPXE Script
	 * Facultative parameters ? false
	 * @param name Name of this script
	*/
	void deleteIpxeScriptName(java.lang.String name) throws java.io.IOException;

	/**
	 * Accept this change request
	 * Facultative parameters ? false
	 * @param token The token you received by email for this request
	 * @param id null
	*/
	void postTaskEmailChangeIdAccept(java.lang.String token, long id) throws java.io.IOException;

	/**
	 * Add a scheme of partition
	 * Facultative parameters ? false
	 * @param priority on a reinstall, if a partitioning scheme is not specified, the one with the higher priority will be used by default, among all the compatible partitioning schemes (given the underlying hardware specifications)
	 * @param name name of this partitioning scheme
	 * @param templateName This template name
	*/
	void postInstallationTemplateTemplateNamePartitionScheme(long priority, java.lang.String name, java.lang.String templateName) throws java.io.IOException;

	/**
	 * Partitioning schemes available on this template
	 * Facultative parameters ? false
	 * @param templateName This template name
	*/
	java.lang.String getInstallationTemplateTemplateNamePartitionScheme(java.lang.String templateName) throws java.io.IOException;

	/**
	 * Remove this application. It will revoke all credential belonging to this application.
	 * Facultative parameters ? false
	 * @param applicationId null
	*/
	void deleteApiApplicationApplicationId(long applicationId) throws java.io.IOException;

	/**
	 * List of arguments
	 * Facultative parameters ? false
	 * @param id Id of the task
	*/
	java.lang.String getTaskDomainIdArgument(long id) throws java.io.IOException;

	/**
	 * Create a template
	 * Facultative parameters ? false
	 * @param defaultLanguage null
	 * @param name Your template name
	 * @param baseTemplateName OVH template name yours will be based on, choose one among the list given by compatibleTemplates function
	*/
	void postInstallationTemplate(java.lang.String defaultLanguage, java.lang.String name, java.lang.String baseTemplateName) throws java.io.IOException;

	/**
	 * Check whether this SLA can be applied on your services
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	boolean getSlaIdCanBeApplied(long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param orderId null
	 * @param orderDetailId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.OrderDetail getOrderOrderIdDetailsOrderDetailId(long orderId, long orderDetailId) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param subscriptionType The type of subscription
	*/
	void putSubscriptionSubscriptionType(net.zyuiop.ovhapi.api.objects.nichandle.Subscription param0, java.lang.String subscriptionType) throws java.io.IOException;

	/**
	 * Check the integrity of this template
	 * Facultative parameters ? false
	 * @param templateName This template name
	*/
	void postInstallationTemplateTemplateNameCheckIntegrity(java.lang.String templateName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param credentialId null
	*/
	net.zyuiop.ovhapi.api.objects.api.Credential getApiCredentialCredentialId(long credentialId) throws java.io.IOException;

	/**
	 * List of all OVH things you can subscribe to
	 * Facultative parameters ? false
	*/
	java.lang.String getSubscription() throws java.io.IOException;

	/**
	 * Create a new contact
	 * Facultative parameters ? true
	 * @param address Address of the contact
	 * @param phone Landline phone number
	 * @param email Email address
	 * @param firstName First name
	 * @param language Language
	 * @param lastName Last name
	 * @param legalForm Legal form of the contact
	 * @param cellPhone Cellphone number
	 * @param fax Fax phone number
	 * @param birthDay Birthday date
	 * @param birthCity City of birth
	 * @param birthZip Birth Zipcode
	 * @param birthCountry Birth Country
	 * @param vat VAT number
	 * @param companyNationalIdentificationNumber Company national identification number
	 * @param nationalIdentificationNumber National identification number
	 * @param organisationType Type of your organisation
	 * @param organisationName Name of your organisation
	 * @param gender Gender
	 * @param nationality Nationality
	*/
	net.zyuiop.ovhapi.api.objects.contact.Contact postContact(net.zyuiop.ovhapi.api.objects.contact.Address address, java.lang.String phone, java.lang.String email, java.lang.String firstName, java.lang.String language, java.lang.String lastName, java.lang.String legalForm, java.lang.String cellPhone, java.lang.String fax, java.util.Date birthDay, java.lang.String birthCity, java.lang.String birthZip, java.lang.String birthCountry, java.lang.String vat, java.lang.String companyNationalIdentificationNumber, java.lang.String nationalIdentificationNumber, java.lang.String organisationType, java.lang.String organisationName, java.lang.String gender, java.lang.String nationality) throws java.io.IOException;

	/**
	 * Create a new contact
	 * Facultative parameters ? false
	 * @param address Address of the contact
	 * @param phone Landline phone number
	 * @param email Email address
	 * @param firstName First name
	 * @param language Language
	 * @param lastName Last name
	 * @param legalForm Legal form of the contact
	*/
	net.zyuiop.ovhapi.api.objects.contact.Contact postContact(net.zyuiop.ovhapi.api.objects.contact.Address address, java.lang.String phone, java.lang.String email, java.lang.String firstName, java.lang.String language, java.lang.String lastName, java.lang.String legalForm) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.billing.BankAccount getPaymentMeanBankAccountId(long id) throws java.io.IOException;

	/**
	 * Activate auto renew for this nic
	 * Facultative parameters ? false
	 * @param renewDay Day of autorenew
	*/
	void postAutorenew(long renewDay) throws java.io.IOException;

	/**
	 * Remove this public SSH key
	 * Facultative parameters ? false
	 * @param keyName Name of this public SSH key
	*/
	void deleteSshKeyKeyName(java.lang.String keyName) throws java.io.IOException;

	/**
	 * Enable this SMS account
	 * Facultative parameters ? false
	 * @param code SMS code send by a cellphone
	 * @param id The Id of the restriction
	*/
	void postAccessRestrictionSmsIdEnable(java.lang.String code, long id) throws java.io.IOException;

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
	 * List of Sms accounts
	 * Facultative parameters ? false
	*/
	long[] getAccessRestrictionSms() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.billing.CreditCard getPaymentMeanCreditCardId(long id) throws java.io.IOException;

	/**
	 * Add a new credit card
	 * Facultative parameters ? true
	 * @param returnUrl Callback URL where the customer will be redirected to after validation
	 * @param description Custom description of this account
	*/
	net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanCreditCard(java.lang.String returnUrl, java.lang.String description) throws java.io.IOException;

	/**
	 * Add a new credit card
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanCreditCard() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.Nichandle getMe() throws java.io.IOException;

	/**
	 * Give access to all entries of the order
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	long[] getOrderOrderIdDetails(long orderId) throws java.io.IOException;

	/**
	 * Retrieve all contact that you created
	 * Facultative parameters ? false
	*/
	long[] getContact() throws java.io.IOException;



	/**
	 * Get this object properties
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.NicAutorenewInfos getAutorenew() throws java.io.IOException;



	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id Id of the task
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.DomainTask getTaskDomainId(long id) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id Id of the contract
	*/
	net.zyuiop.ovhapi.api.objects.agreements.ContractAgreement getAgreementsId(long id) throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param billId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Bill getBillBillId(java.lang.String billId) throws java.io.IOException;

	/**
	 * List of OVH accounts the logged account has
	 * Facultative parameters ? false
	*/
	java.lang.String getOvhAccount() throws java.io.IOException;

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
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param refundId null
	 * @param refundDetailId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.RefundDetail getRefundRefundIdDetailsRefundDetailId(java.lang.String refundId, java.lang.String refundDetailId) throws java.io.IOException;

	/**
	 * List of documents added in your account
	 * Facultative parameters ? false
	*/
	java.lang.String getDocument() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param orderId null
	*/
	net.zyuiop.ovhapi.api.objects.billing.Order getOrderOrderId(long orderId) throws java.io.IOException;

	/**
	 * remove this scheme of partition
	 * Facultative parameters ? false
	 * @param templateName This template name
	 * @param schemeName name of this partitioning scheme
	*/
	void deleteInstallationTemplateTemplateNamePartitionSchemeSchemeName(java.lang.String templateName, java.lang.String schemeName) throws java.io.IOException;

	/**
	 * Enable payment through a new PayPal account
	 * Facultative parameters ? true
	 * @param returnUrl Callback URL where the customer will be redirected to after validation
	 * @param description Custom description of this account
	*/
	net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanPaypal(java.lang.String returnUrl, java.lang.String description) throws java.io.IOException;

	/**
	 * Enable payment through a new PayPal account
	 * Facultative parameters ? false
	*/
	net.zyuiop.ovhapi.api.objects.billing.PaymentMeanValidation postPaymentMeanPaypal() throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param id Id of the task
	 * @param key Key of the argument
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.DomainTaskArgument getTaskDomainIdArgumentKey(long id, java.lang.String key) throws java.io.IOException;

	/**
	 * List of IP restrictions
	 * Facultative parameters ? false
	*/
	long[] getAccessRestrictionIp() throws java.io.IOException;

	/**
	 * List active SLA
	 * Facultative parameters ? false
	*/
	long[] getSla() throws java.io.IOException;

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

}
