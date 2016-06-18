package net.zyuiop.ovhapi.api.objects.cloud.instance;

/**
 * InstanceDetail
 */

public interface InstanceDetail { 

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
	 * @return Instance image
	 */
	net.zyuiop.ovhapi.api.objects.cloud.image.Image getImage(); 

	/**
	 * @return Instance creation date
	 */
	java.util.Date getCreated(); 

	/**
	 * @return Instance SSH key
	 */
	net.zyuiop.ovhapi.api.objects.cloud.sshkey.SshKeyDetail getSshKey(); 

	/**
	 * @return Instance monthly billing status
	 */
	net.zyuiop.ovhapi.api.objects.cloud.instance.MonthlyBilling getMonthlyBilling(); 

	/**
	 * @return Instance IP addresses
	 */
	net.zyuiop.ovhapi.api.objects.cloud.instance.IpAddress[] getIpAddresses(); 

	/**
	 * @return Instance id
	 */
	java.lang.String getId(); 

	/**
	 * @return Instance flavor
	 */
	net.zyuiop.ovhapi.api.objects.cloud.flavor.Flavor getFlavor(); 

}
