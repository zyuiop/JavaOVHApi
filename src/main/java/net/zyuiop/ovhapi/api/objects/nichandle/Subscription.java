package net.zyuiop.ovhapi.api.objects.nichandle;

/**
 * List of all OVH things you can subscribe to
 */

public interface Subscription { 

	/**
	 * @return Determine whether you are registered or not
	 */
	boolean getRegistered(); 

	/**
	 * @return The type of subscription
	 */
	java.lang.String getType(); 

}
