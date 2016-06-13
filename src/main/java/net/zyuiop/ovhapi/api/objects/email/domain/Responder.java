package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Responder
 */

public interface Responder { 

	/**
	 * @return If true, emails will be copy to emailToCopy address
	 */
	boolean getCopy(); 

	/**
	 * @return Date of end responder
	 */
	java.util.Date getTo(); 

	/**
	 * @return Account where copy emails
	 */
	java.lang.String getCopyTo(); 

	/**
	 * @return Name of account
	 */
	java.lang.String getAccount(); 

	/**
	 * @return Date of start responder
	 */
	java.util.Date getFrom(); 

	/**
	 * @return Content of responder
	 */
	java.lang.String getContent(); 

}
