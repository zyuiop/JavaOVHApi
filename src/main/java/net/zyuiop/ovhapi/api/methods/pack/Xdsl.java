package net.zyuiop.ovhapi.api.methods.pack;

/**
 * A class to interact with OVH's /pack/xdsl APIs
 */

public interface Xdsl { 

	/**
	 * Get available hardwares
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPHardware getPackNameVoipLineOptionsHardwares(java.lang.String packName) throws java.io.IOException;

	/**
	 * Exchange 2013 organization services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameExchangeOrganizationServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param packName The internal name of your pack
	*/
	void putPackNameServiceInfos(net.zyuiop.ovhapi.api.objects.services.Service param0, java.lang.String packName) throws java.io.IOException;

	/**
	 * List services contained in the pack
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameSubServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * VOIP billing accounts
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameVoipBillingAccountServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Alter this object properties
	 * Facultative parameters ? false
	 * @param null New object properties
	 * @param packName The internal name of your pack
	*/
	void putPackName(net.zyuiop.ovhapi.api.objects.pack.xdsl.PackAdsl param0, java.lang.String packName) throws java.io.IOException;

	/**
	 * Get the available domains
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderDomain getPackNameSiteBuilderFullOptionsDomains(java.lang.String packName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeAccountService getPackNameExchangeAccountServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Service getPackNameSubServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Check if the email address is available for service creation
	 * Facultative parameters ? false
	 * @param email Email
	 * @param packName The internal name of your pack
	*/
	boolean getPackNameExchangeIndividualOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException;

	/**
	 * Domain services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameDomainServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Allowed shipping addresses given a context
	 * Facultative parameters ? false
	 * @param context Context
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ShippingAddress getPackNameShippingAddresses(java.lang.String context, java.lang.String packName) throws java.io.IOException;

	/**
	 * Activate a voicefax service
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameVoipEcofaxServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Informations about the services included in the pack
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ServiceInformation getPackNameServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Activate a voip line service
	 * Facultative parameters ? true
	 * @param hardwareNames List of names from hardwares call
	 * @param packName The internal name of your pack
	 * @param shippingId Shipping ID for the order
	 * @param mondialRelayId Mondial relay ID
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPLineOrder postPackNameVoipLineServices(java.lang.String hardwareNames, java.lang.String packName, long shippingId, java.lang.String mondialRelayId) throws java.io.IOException;

	/**
	 * Activate a voip line service
	 * Facultative parameters ? false
	 * @param hardwareNames List of names from hardwares call
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.VoIPLineOrder postPackNameVoipLineServices(java.lang.String hardwareNames, java.lang.String packName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.VoipLineService getPackNameVoipLineServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Create a new shippingId to be used for voipLine service creation
	 * Facultative parameters ? false
	 * @param zipCode Zip code
	 * @param firstName First name
	 * @param cityName City name
	 * @param address Address, including street name
	 * @param lastName Last name
	 * @param packName The internal name of your pack
	*/
	long postPackNameVoipLineOptionsCustomShippingAddress(java.lang.String zipCode, java.lang.String firstName, java.lang.String cityName, java.lang.String address, java.lang.String lastName, java.lang.String packName) throws java.io.IOException;


	/**
	 * Resiliate the pack
	 * Facultative parameters ? true
	 * @param resiliationSurvey Comment about resiliation reasons
	 * @param packName The internal name of your pack
	 * @param servicesToKeep Ids of service you will keep on resiliation. (you can get it with /pack/xdsl/{packName}/subServices)
	 * @param resiliationDate Effective date of the resiliation
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail postPackNameResiliate(net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String packName, double[] servicesToKeep, java.util.Date resiliationDate) throws java.io.IOException;

	/**
	 * Resiliate the pack
	 * Facultative parameters ? false
	 * @param resiliationSurvey Comment about resiliation reasons
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail postPackNameResiliate(net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationSurvey resiliationSurvey, java.lang.String packName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.PackAdsl getPackName(java.lang.String packName) throws java.io.IOException;

	/**
	 * Exchange lite services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameExchangeLiteServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Check if the resiliation can be cancelled
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	boolean getPackNameCanCancelResiliation(java.lang.String packName) throws java.io.IOException;


	/**
	 * Activate a exchange lite service
	 * Facultative parameters ? true
	 * @param email Email address
	 * @param password Password
	 * @param packName The internal name of your pack
	 * @param initials Initials
	 * @param firstName First name
	 * @param lastName Last name
	 * @param antispam Antispam protection
	 * @param displayName Display name
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameExchangeLiteServices(java.lang.String email, java.lang.String password, java.lang.String packName, java.lang.String initials, java.lang.String firstName, java.lang.String lastName, boolean antispam, java.lang.String displayName) throws java.io.IOException;

	/**
	 * Activate a exchange lite service
	 * Facultative parameters ? false
	 * @param email Email address
	 * @param password Password
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameExchangeLiteServices(java.lang.String email, java.lang.String password, java.lang.String packName) throws java.io.IOException;

	/**
	 * Exchange services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameExchangeIndividualServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Sitebuilder start services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameSiteBuilderStartServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Give the condition to unpack service from pack
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.UnpackTerms getPackNameSubServicesDomainKeepServiceTerms(java.lang.String packName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Hosted email services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameHostedEmailServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Tasks scheduled for this pack
	 * Facultative parameters ? true
	 * @param packName The internal name of your pack
	 * @param function Filter the value of function property (=)
	 * @param status Filter the value of status property (=)
	*/
	long[] getPackNameTasks(java.lang.String packName, java.lang.String function, java.lang.String status) throws java.io.IOException;

	/**
	 * Tasks scheduled for this pack
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	long[] getPackNameTasks(java.lang.String packName) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? true
	 * @param packName The internal name of your pack
	 * @param contactAdmin The contact to set as admin contact
	 * @param contactTech The contact to set as tech contact
	 * @param contactBilling The contact to set as billing contact
	*/
	long[] postPackNameChangeContact(java.lang.String packName, java.lang.String contactAdmin, java.lang.String contactTech, java.lang.String contactBilling) throws java.io.IOException;

	/**
	 * Launch a contact change procedure
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	long[] postPackNameChangeContact(java.lang.String packName) throws java.io.IOException;



	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.services.Service getPackNameServiceInfos(java.lang.String packName) throws java.io.IOException;

	/**
	 * Get the available templates
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderTemplate getPackNameSiteBuilderStartOptionsTemplates(java.lang.String packName) throws java.io.IOException;

	/**
	 * Activate a domain service
	 * Facultative parameters ? true
	 * @param tld TLD of the domain
	 * @param domain Domain name
	 * @param legalStatus Legal status
	 * @param action Domain action
	 * @param packName The internal name of your pack
	 * @param assoPublicationPage Needed for .fr domains when legalStatus is association and no waldec parameter
	 * @param authInfo Needed for transfer from another registrar
	 * @param birthCountry 
	 * @param lastName 
	 * @param brandOwner Brand owner name. Required for corporation
	 * @param birthCity 
	 * @param firstName 
	 * @param noId Required for corporation if there is no other identification method
	 * @param vatNumber VAT number. Required for corporation
	 * @param assoDeclaration Needed for .fr domains when legalStatus is association and no waldec parameter
	 * @param birthZipCode 
	 * @param siren SIREN. Required for corporation
	 * @param assoPublicationAnnounce Needed for .fr domains when legalStatus is association and no waldec parameter
	 * @param birthDate 
	 * @param corporationName Corporation name. Required for corporation
	 * @param assoPublication Needed for .fr domains when legalStatus is association and no waldec parameter
	 * @param idNumber ID number. Required for corporation
	 * @param inpi INPI .Required for corporation
	 * @param waldec Needed for .fr domains when legalStatus is association
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameDomainServices(java.lang.String tld, java.lang.String domain, java.lang.String legalStatus, java.lang.String action, java.lang.String packName, java.lang.String assoPublicationPage, java.lang.String authInfo, java.lang.String birthCountry, java.lang.String lastName, java.lang.String brandOwner, java.lang.String birthCity, java.lang.String firstName, boolean noId, java.lang.String vatNumber, java.lang.String assoDeclaration, java.lang.String birthZipCode, java.lang.String siren, java.lang.String assoPublicationAnnounce, java.lang.String birthDate, java.lang.String corporationName, java.lang.String assoPublication, java.lang.String idNumber, java.lang.String inpi, java.lang.String waldec) throws java.io.IOException;

	/**
	 * Activate a domain service
	 * Facultative parameters ? false
	 * @param tld TLD of the domain
	 * @param domain Domain name
	 * @param legalStatus Legal status
	 * @param action Domain action
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameDomainServices(java.lang.String tld, java.lang.String domain, java.lang.String legalStatus, java.lang.String action, java.lang.String packName) throws java.io.IOException;

	/**
	 * VOIP line services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameVoipLineServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Cancel the ongoing resiliation
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	void postPackNameCancelResiliation(java.lang.String packName) throws java.io.IOException;

	/**
	 * Sitebuilder full services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameSiteBuilderFullServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Migrate to the selected offer
	 * Facultative parameters ? true
	 * @param acceptContracts You explicitly accept the terms of the contract corresponding to your new offer
	 * @param offerName Reference of the new offer
	 * @param packName The internal name of your pack
	 * @param subServicesToDelete List of domains of services to delete if needed
	 * @param options Options wanted in the new offer
	 * @param nicShipping nicShipping if a shipping is needed
	 * @param mondialRelayId Mondial relay ID if a shipping is needed
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameMigrationMigrate(boolean acceptContracts, java.lang.String offerName, java.lang.String packName, net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferServiceToDelete subServicesToDelete, net.zyuiop.ovhapi.api.objects.pack.xdsl.migration.OfferOption options, java.lang.String nicShipping, long mondialRelayId) throws java.io.IOException;

	/**
	 * Migrate to the selected offer
	 * Facultative parameters ? false
	 * @param acceptContracts You explicitly accept the terms of the contract corresponding to your new offer
	 * @param offerName Reference of the new offer
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameMigrationMigrate(boolean acceptContracts, java.lang.String offerName, java.lang.String packName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ExchangeLiteService getPackNameExchangeLiteServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get the available tlds for domain order
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameDomainOptionsTlds(java.lang.String packName) throws java.io.IOException;

	/**
	 * Activate a sitebuilder full service
	 * Facultative parameters ? false
	 * @param domain Domain name
	 * @param subdomain Subdomain
	 * @param templateId Template ID
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameSiteBuilderStartServices(java.lang.String domain, java.lang.String subdomain, long templateId, java.lang.String packName) throws java.io.IOException;

	/**
	 * VOIP ecofax service
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameVoipEcofaxServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Creates a task to generate a new promotion code
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNamePromotionCodeGenerate(java.lang.String packName) throws java.io.IOException;

	/**
	 * Activate a sitebuilder full service
	 * Facultative parameters ? false
	 * @param domain Domain name
	 * @param subdomain Subdomain
	 * @param templateId Template ID
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameSiteBuilderFullServices(java.lang.String domain, java.lang.String subdomain, long templateId, java.lang.String packName) throws java.io.IOException;

	/**
	 * Get the available domains
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderDomain getPackNameSiteBuilderStartOptionsDomains(java.lang.String packName) throws java.io.IOException;

	/**
	 * Get the available templates
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.SiteBuilderTemplate getPackNameSiteBuilderFullOptionsTemplates(java.lang.String packName) throws java.io.IOException;

	/**
	 * Get the hostedemail available domains
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameHostedEmailOptionsDomains(java.lang.String packName) throws java.io.IOException;

	/**
	 * Activate an hosted email service
	 * Facultative parameters ? false
	 * @param email Email address
	 * @param password Password
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameHostedEmailServices(java.lang.String email, java.lang.String password, java.lang.String packName) throws java.io.IOException;

	/**
	 * Get resiliation terms
	 * Facultative parameters ? true
	 * @param packName The internal name of your pack
	 * @param resiliationDate The desired resiliation date
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationTerms getPackNameResiliationTerms(java.lang.String packName, java.util.Date resiliationDate) throws java.io.IOException;

	/**
	 * Get resiliation terms
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationTerms getPackNameResiliationTerms(java.lang.String packName) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	 * @param domain null
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Hubic getPackNameHubicServicesDomain(java.lang.String packName, java.lang.String domain) throws java.io.IOException;

	/**
	 * Get this object properties
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	 * @param id Id of the object
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task getPackNameTasksId(java.lang.String packName, long id) throws java.io.IOException;

	/**
	 * Exchange 2013 services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameExchangeAccountServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Get information about the ongoing resiliation
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ResiliationFollowUpDetail getPackNameResiliationFollowUp(java.lang.String packName) throws java.io.IOException;

	/**
	 * Get available shipping addresses
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.ShippingAddress getPackNameVoipLineOptionsShippingAddresses(java.lang.String packName) throws java.io.IOException;

	/**
	 * Get the available domains
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameExchangeIndividualOptionsDomains(java.lang.String packName) throws java.io.IOException;

	/**
	 * Activate an exchange service
	 * Facultative parameters ? false
	 * @param email Email address
	 * @param password Password
	 * @param packName The internal name of your pack
	*/
	net.zyuiop.ovhapi.api.objects.pack.xdsl.Task postPackNameExchangeIndividualServices(java.lang.String email, java.lang.String password, java.lang.String packName) throws java.io.IOException;

	/**
	 * Check if the email address is available for service creation
	 * Facultative parameters ? false
	 * @param email Email
	 * @param packName The internal name of your pack
	*/
	boolean getPackNameExchangeLiteOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException;

	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String getPackXdsl() throws java.io.IOException;



	/**
	 * Hubic perso services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameHubicServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * xDSL access services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String getPackNameXdslAccessServices(java.lang.String packName) throws java.io.IOException;

}
