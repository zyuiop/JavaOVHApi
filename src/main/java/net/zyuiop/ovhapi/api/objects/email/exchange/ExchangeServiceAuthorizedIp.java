package net.zyuiop.ovhapi.api.objects.email.exchange;

/**
 * Get authorized IPs for POP, IMAP and webmail
 */

public interface ExchangeServiceAuthorizedIp { 

	/**
	 * @return Creation date
	 */
	java.util.Date getCreationDate(); 

	/**
	 * @return Authorized IP
	 */
	java.lang.String getIp(); 

	/**
	 * @return Authorized IP status
	 */
	java.lang.String getStatus(); 

}
