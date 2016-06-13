package net.zyuiop.ovhapi.api.objects.email.domain;

/**
 * Forward
 */

public interface Forward { 

	/**
	 * @return Target account of forward
	 */
	java.lang.String getTo(); 

	/**
	 * @return Source account of forward
	 */
	java.lang.String getFrom(); 

	/**
	 * @return Id of forward
	 */
	java.lang.String getId(); 

}
