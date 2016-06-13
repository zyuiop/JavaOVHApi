package net.zyuiop.ovhapi.api.objects.veeamcloudconnect;

/**
 * Veeam Cloud Connect account
 */

public interface Account { 

	/**
	 * @return The commercial offer linked to your veeam cloud connect
	 */
	java.lang.String getProductOffer(); 

	/**
	 * @return Datacenter where your Cloud is physically located
	 */
	java.lang.String getLocation(); 

	/**
	 * @return Your login in the Veeam Cloud Connect interface
	 */
	java.lang.String getServiceName(); 

	/**
	 * @return Backuped VMs quantity on your account
	 */
	long getVmCount(); 

}
