package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Aliases
 */

public interface Alias { 

	/**
	 * @return Target account of alias
	 */
	java.lang.String getTo(); 

	/**
	 * @return Name of alias
	 */
	java.lang.String getFrom(); 

	/**
	 * @return Id of alias
	 */
	java.lang.String getId(); 

}
