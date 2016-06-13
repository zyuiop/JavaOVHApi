package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * Instance
 */

public interface Instance { 

	/**
	 * @return Instance status
	 */
	java.lang.String getStatus(); 

	/**
	 * @return Instance name
	 */
	java.lang.String getName(); 

	/**
	 * @return Instance id
	 */
	java.lang.String getRegion(); 

	/**
	 * @return Instance image id
	 */
	java.lang.String getImageId(); 

	/**
	 * @return Instance creation date
	 */
	java.util.Date getCreated(); 

	/**
	 * @return Instance flavor id
	 */
	java.lang.String getFlavorId(); 

	/**
	 * @return Instance ssh key id
	 */
	java.lang.String getSshKeyId(); 

	/**
	 * @return Instance monthly billing status
	 */
	net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling getMonthlyBilling(); 

	/**
	 * @return Instance IP addresses
	 */
	net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress getIpAddresses(); 

	/**
	 * @return Instance id
	 */
	java.lang.String getId(); 

}
