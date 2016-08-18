package net.zyuiop.ovhapi.api.methods;

/**
 * A class to interact with OVH's /newAccount APIs
 */

public interface NewAccount { 




	/**
	 * All available corporation types for a given country
	 * Facultative parameters ? false
	 * @param country null
	*/
	java.lang.String[] getCorporationType(java.lang.String country) throws java.io.IOException;

	/**
	 * All available countries for an ovh company and an ovh subsidiary
	 * Facultative parameters ? false
	 * @param ovhSubsidiary null
	 * @param ovhCompany null
	*/
	java.lang.String[] getCountries(java.lang.String ovhSubsidiary, java.lang.String ovhCompany) throws java.io.IOException;

	/**
	 * All available legal forms for a given country
	 * Facultative parameters ? false
	 * @param country null
	*/
	java.lang.String[] getLegalform(java.lang.String country) throws java.io.IOException;

	/**
	 * All available areas for a given country
	 * Facultative parameters ? false
	 * @param country null
	*/
	java.lang.String[] getArea(java.lang.String country) throws java.io.IOException;

}
