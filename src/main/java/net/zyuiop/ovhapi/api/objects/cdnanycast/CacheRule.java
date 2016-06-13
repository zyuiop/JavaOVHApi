package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * CacheRules for a domain
 */

public interface CacheRule { 

	/**
	 * @return null
	 */
	java.lang.String getDomain(); 

	/**
	 * @return null
	 */
	java.lang.String getCacheType(); 

	/**
	 * @return Id for this cache rule
	 */
	long getCacheRuleId(); 

	/**
	 * @return null
	 */
	java.lang.String getFileMatch(); 

	/**
	 * @return null
	 */
	long getTtl(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	java.lang.String getFileType(); 

}
