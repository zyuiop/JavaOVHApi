package net.zyuiop.ovhapi.api.objects.secondarydns;

/**
 * A structure describing informations about secondary dns check field
 */

public interface SecondaryDNSCheckField { 

	/**
	 * @return The field type to add on your DNS zone for this subDomain
	 */
	java.lang.String getFieldType(); 

	/**
	 * @return The subdomain to add on your DNS zone for the domain
	 */
	java.lang.String getSubDomain(); 

	/**
	 * @return The field value to add on your DNS zone for this subDomain
	 */
	java.lang.String getFieldValue(); 

}
