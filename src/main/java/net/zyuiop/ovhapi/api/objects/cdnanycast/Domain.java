package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * Domain on CDN
 */

public interface Domain { 

	/**
	 * @return null
	 */
	long getCacheRuleUse(); 

	/**
	 * @return Domain of this object
	 */
	java.lang.String getDomain(); 

	/**
	 * @return null
	 */
	java.lang.String getStatus(); 

	/**
	 * @return null
	 */
	java.lang.String getType(); 

	/**
	 * @return null
	 */
	java.lang.String getCname(); 

}
