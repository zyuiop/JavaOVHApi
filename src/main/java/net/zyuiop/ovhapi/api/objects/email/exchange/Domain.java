package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Exchange domain
 */

public interface Domain { 

	/**
	 * @return Domain name
	 */
	java.lang.String getName(); 

	/**
	 * @return If specified, indicates to which organization this domain belongs (Exchange 2010 only)
	 */
	java.lang.String getOrganization2010(); 

	/**
	 * @return null
	 */
	boolean getMxIsValid(); 

	/**
	 * @return If true your dns srv record is valid
	 */
	boolean getSrvIsValid(); 

	/**
	 * @return Domain state
	 */
	java.lang.String getState(); 

	/**
	 * @return If true this is an organization (Exchange 2010 only)
	 */
	boolean getMain(); 

	/**
	 * @return Cname that will be checked to prove the domain ownership
	 */
	java.lang.String getCnameToCheck(); 

	/**
	 * @return If specified, emails to not existing address will be redirected to that domain
	 */
	java.lang.String getMxRelay(); 

	/**
	 * @return Domain type
	 */
	java.lang.String getType(); 

	/**
	 * @return Domain validation status
	 */
	boolean getDomainValidated(); 

	/**
	 * @return Pending taks id
	 */
	long getTaskPendingId(); 

}
