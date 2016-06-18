package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /newAccount APIs
 */

public interface NewAccount { 

	/**
	 * All available legal forms for a given country
	 * Facultative parameters ? false
	 * @param country null
	*/
	java.lang.String[] getLegalform(java.lang.String country) throws java.io.IOException;

	/**
	 * Give all the rules to follow in order to create an OVH identifier
	 * Facultative parameters ? false
	 * @param country null
	 * @param ovhSubsidiary null
	 * @param ovhCompany null
	 * @param legalform null
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.CreationRules getCreationRules(java.lang.String country, java.lang.String ovhSubsidiary, java.lang.String ovhCompany, java.lang.String legalform) throws java.io.IOException;

	/**
	 * All available countries for an ovh company and an ovh subsidiary
	 * Facultative parameters ? false
	 * @param ovhSubsidiary null
	 * @param ovhCompany null
	*/
	java.lang.String[] getCountries(java.lang.String ovhSubsidiary, java.lang.String ovhCompany) throws java.io.IOException;

	/**
	 * All available areas for a given country
	 * Facultative parameters ? false
	 * @param country null
	*/
	java.lang.String[] getArea(java.lang.String country) throws java.io.IOException;

	/**
	 * Create a new OVH identifier
	 * Facultative parameters ? true
	 * @param ovhSubsidiary null
	 * @param ovhCompany null
	 * @param email null
	 * @param country null
	 * @param legalform null
	 * @param firstname null
	 * @param vat null
	 * @param spareEmail null
	 * @param nationalIdentificationNumber null
	 * @param birthDay null
	 * @param area null
	 * @param city null
	 * @param fax null
	 * @param address null
	 * @param companyNationalIdentificationNumber null
	 * @param birthCity null
	 * @param organisation null
	 * @param language null
	 * @param name null
	 * @param sex null
	 * @param phone null
	 * @param zip null
	 * @param corporationType null
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.NewAccountAndToken postNewAccount(java.lang.String ovhSubsidiary, java.lang.String ovhCompany, java.lang.String email, java.lang.String country, java.lang.String legalform, java.lang.String firstname, java.lang.String vat, java.lang.String spareEmail, java.lang.String nationalIdentificationNumber, java.lang.String birthDay, java.lang.String area, java.lang.String city, java.lang.String fax, java.lang.String address, java.lang.String companyNationalIdentificationNumber, java.lang.String birthCity, java.lang.String organisation, java.lang.String language, java.lang.String name, java.lang.String sex, java.lang.String phone, java.lang.String zip, java.lang.String corporationType) throws java.io.IOException;

	/**
	 * Create a new OVH identifier
	 * Facultative parameters ? false
	 * @param ovhSubsidiary null
	 * @param ovhCompany null
	 * @param email null
	 * @param country null
	 * @param legalform null
	*/
	net.zyuiop.ovhapi.api.objects.nichandle.NewAccountAndToken postNewAccount(java.lang.String ovhSubsidiary, java.lang.String ovhCompany, java.lang.String email, java.lang.String country, java.lang.String legalform) throws java.io.IOException;

	/**
	 * All available corporation types for a given country
	 * Facultative parameters ? false
	 * @param country null
	*/
	java.lang.String[] getCorporationType(java.lang.String country) throws java.io.IOException;

}
