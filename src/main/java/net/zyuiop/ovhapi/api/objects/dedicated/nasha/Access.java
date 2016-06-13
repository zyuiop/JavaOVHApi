package net.zyuiop.ovhapi.api.objects.dedicated.nasha;

/**
 * Define Acl for partition
 */

public interface Access { 

	/**
	 * @return the ip in root on storage
	 */
	java.lang.String getIp(); 

	/**
	 * @return the id of the access
	 */
	long getAccessId(); 

}
