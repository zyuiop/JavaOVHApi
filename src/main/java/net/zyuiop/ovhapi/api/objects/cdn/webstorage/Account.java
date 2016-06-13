package net.zyuiop.ovhapi.api.objects.cdn.webstorage;

/**
 * Static CDN
 */

public interface Account { 

	/**
	 * @return null
	 */
	java.lang.String getDomain(); 

	/**
	 * @return value in Bytes
	 */
	long getStorageLimit(); 

	/**
	 * @return null
	 */
	java.lang.String getServer(); 

}
