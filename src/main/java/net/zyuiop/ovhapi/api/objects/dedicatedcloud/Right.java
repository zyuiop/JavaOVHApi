package net.zyuiop.ovhapi.api.objects.dedicatedcloud;

/**
 * Dedicated Cloud User right
 */

public interface Right { 

	/**
	 * @return Determine if the user can add ressources in your Dedicated Cloud
	 */
	boolean getCanAddRessource(); 

	/**
	 * @return Determine what kind of access the User will have in this Datacenter of your Dedicated Cloud
	 */
	java.lang.String getRight(); 

	/**
	 * @return null
	 */
	long getRightId(); 

	/**
	 * @return null
	 */
	long getDatacenterId(); 

	/**
	 * @return Determine how this user can interact with the Dedicated Cloud VM Network
	 */
	java.lang.String getVmNetworkRole(); 

	/**
	 * @return Determine how this user can interact with the Dedicated Cloud V(x)Lans
	 */
	java.lang.String getNetworkRole(); 

}
