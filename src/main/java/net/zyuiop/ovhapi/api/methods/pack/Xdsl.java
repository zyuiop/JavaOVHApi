package net.zyuiop.ovhapi.api.methods.pack;

/**
 * A class to interact with OVH's /pack/xdsl APIs
 */

public interface Xdsl { 



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
	 * Sitebuilder full services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameSiteBuilderFullServices(java.lang.String packName) throws java.io.IOException;



	/**
	 * List available services
	 * Facultative parameters ? false
	*/
	java.lang.String[] getPackXdsl() throws java.io.IOException;


	/**
	 * Exchange 2013 organization services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameExchangeOrganizationServices(java.lang.String packName) throws java.io.IOException;



	/**
	 * Exchange 2013 services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameExchangeAccountServices(java.lang.String packName) throws java.io.IOException;




	/**
	 * Exchange lite services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameExchangeLiteServices(java.lang.String packName) throws java.io.IOException;





	/**
	 * Check if the resiliation can be cancelled
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	boolean getPackNameCanCancelResiliation(java.lang.String packName) throws java.io.IOException;






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
	 * List services contained in the pack
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameSubServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Exchange services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameExchangeIndividualServices(java.lang.String packName) throws java.io.IOException;

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
	 * Get the available domains
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameExchangeIndividualOptionsDomains(java.lang.String packName) throws java.io.IOException;




	/**
	 * Check if the email address is available for service creation
	 * Facultative parameters ? false
	 * @param email Email
	 * @param packName The internal name of your pack
	*/
	boolean getPackNameExchangeLiteOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException;




	/**
	 * Hubic perso services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameHubicServices(java.lang.String packName) throws java.io.IOException;


	/**
	 * Check if the email address is available for service creation
	 * Facultative parameters ? false
	 * @param email Email
	 * @param packName The internal name of your pack
	*/
	boolean getPackNameExchangeIndividualOptionsIsEmailAvailable(java.lang.String email, java.lang.String packName) throws java.io.IOException;





	/**
	 * VOIP line services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameVoipLineServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * VOIP ecofax service
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameVoipEcofaxServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Hosted email services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameHostedEmailServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * xDSL access services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameXdslAccessServices(java.lang.String packName) throws java.io.IOException;

	/**
	 * Get the hostedemail available domains
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameHostedEmailOptionsDomains(java.lang.String packName) throws java.io.IOException;

	/**
	 * VOIP billing accounts
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameVoipBillingAccountServices(java.lang.String packName) throws java.io.IOException;



	/**
	 * Domain services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameDomainServices(java.lang.String packName) throws java.io.IOException;



	/**
	 * Get the available tlds for domain order
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameDomainOptionsTlds(java.lang.String packName) throws java.io.IOException;

	/**
	 * Cancel the ongoing resiliation
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	void postPackNameCancelResiliation(java.lang.String packName) throws java.io.IOException;





	/**
	 * Sitebuilder start services
	 * Facultative parameters ? false
	 * @param packName The internal name of your pack
	*/
	java.lang.String[] getPackNameSiteBuilderStartServices(java.lang.String packName) throws java.io.IOException;

}
