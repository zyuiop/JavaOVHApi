package net.zyuiop.ovhapi.api.objects.domain;

/**
 * Structure of imapCopy
 */

public interface DomainMlOptionsStruct { 

	/**
	 * @return If true, enabled moderation for subscribe
	 */
	boolean getSubscribeByModerator(); 

	/**
	 * @return If true, just user can post
	 */
	boolean getUsersPostOnly(); 

	/**
	 * @return If true, messages are moderate
	 */
	boolean getModeratorMessage(); 

}
