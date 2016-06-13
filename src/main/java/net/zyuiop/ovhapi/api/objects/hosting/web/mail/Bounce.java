package net.zyuiop.ovhapi.api.objects.hosting.web.mail;

/**
 * The volume history type
 */

public interface Bounce { 

	/**
	 * @return The email where you have the bounce
	 */
	java.lang.String getTo(); 

	/**
	 * @return The datetime of this bounce
	 */
	java.util.Date getDate(); 

	/**
	 * @return The return message for this bounce
	 */
	java.lang.String getMessage(); 

}
