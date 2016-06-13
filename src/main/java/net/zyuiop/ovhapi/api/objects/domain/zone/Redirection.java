package net.zyuiop.ovhapi.api.objects.domain.zone;

/**
 * Redirection
 */

public interface Redirection { 

	/**
	 * @return Redirection zone
	 */
	java.lang.String getZone(); 

	/**
	 * @return Desciption for invisible redirection
	 */
	java.lang.String getDescription(); 

	/**
	 * @return Keywords for invisible redirection
	 */
	java.lang.String getKeywords(); 

	/**
	 * @return Target of the redirection
	 */
	java.lang.String getTarget(); 

	/**
	 * @return Id of the redirection
	 */
	long getId(); 

	/**
	 * @return subdomain to redirect
	 */
	java.lang.String getSubDomain(); 

	/**
	 * @return Redirection type
	 */
	java.lang.String getType(); 

	/**
	 * @return Title for invisible redirection
	 */
	java.lang.String getTitle(); 

}
