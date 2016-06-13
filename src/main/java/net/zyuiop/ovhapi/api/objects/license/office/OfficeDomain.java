package net.zyuiop.ovhapi.api.objects.license.office;

/**
 * Office domain
 */

public interface OfficeDomain { 

	/**
	 * @return Domain state
	 */
	java.lang.String getStatus(); 

	/**
	 * @return TXT entry required for domain validation
	 */
	java.lang.String getTxtEntry(); 

	/**
	 * @return Domain name
	 */
	java.lang.String getDomainName(); 

}
