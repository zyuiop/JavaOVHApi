package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Values of number account (account, mailing list, redirection and responder)
 */

public interface DomainSummary { 

	/**
	 * @return Number of responders
	 */
	long getResponder(); 

	/**
	 * @return Number of mailboxes
	 */
	long getAccount(); 

	/**
	 * @return Number of mailing lists
	 */
	long getMailingList(); 

	/**
	 * @return Number of redirections
	 */
	long getRedirection(); 

}
