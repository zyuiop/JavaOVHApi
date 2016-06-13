package net.zyuiop.ovhapi.api.objects.iploadbalancing;

/**
 * Ssl
 */

public interface Ssl { 

	/**
	 * @return Serial of your ssl
	 */
	java.lang.String getSerial(); 

	/**
	 * @return Subject of your ssl
	 */
	java.lang.String getSubject(); 

	/**
	 * @return Id of your ssl
	 */
	long getId(); 

	/**
	 * @return Type of your ssl
	 */
	java.lang.String getType(); 

}
