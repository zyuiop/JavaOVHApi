package net.zyuiop.ovhapi.api.objects.contact;

/**
 * Representation of an Address
 */

public interface Address { 

	/**
	 * @return Country
	 */
	java.lang.String getCountry(); 

	/**
	 * @return First line of the address
	 */
	java.lang.String getLine1(); 

	/**
	 * @return Second line of the address
	 */
	java.lang.String getLine2(); 

	/**
	 * @return Others details
	 */
	java.lang.String getOtherDetails(); 

	/**
	 * @return Third line of the address
	 */
	java.lang.String getLine3(); 

	/**
	 * @return City
	 */
	java.lang.String getCity(); 

	/**
	 * @return Zipcode
	 */
	java.lang.String getZip(); 

	/**
	 * @return Province name
	 */
	java.lang.String getProvince(); 

}
