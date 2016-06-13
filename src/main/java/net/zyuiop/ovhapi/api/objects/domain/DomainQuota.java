package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Values of quota account (pop, mailing list, redirection, responder and big pop)
 */

public interface DomainQuota { 

	/**
	 * @return Maximum number of responders
	 */
	long getResponder(); 

	/**
	 * @return Maximum number of mailboxes
	 */
	long getAccount(); 

	/**
	 * @return Maximum number of mailing lists
	 */
	long getMailingList(); 

	/**
	 * @return Maximum number of redirections
	 */
	long getRedirection(); 

	/**
	 * @return Maximum number of aliases
	 */
	long getAlias(); 

}
