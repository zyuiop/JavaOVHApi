package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Domain service
 */

public interface DomainService { 

	/**
	 * @return Name of domain
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Creation date of domain
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return List of allowed sizes for this domain in bytes
	 */
	long[] getAllowedAccountSize(); 

	/**
	 * @return Domain Status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Filerz of domain
	 */
	long getFilerz(); 

}
