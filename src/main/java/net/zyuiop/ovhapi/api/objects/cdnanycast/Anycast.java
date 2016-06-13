package net.zyuiop.ovhapi.api.objects.cdnanycast;

/**
 * Anycast IP of a CDN customer
 */

public interface Anycast { 

	/**
	 * @return null
	 */
	long getQuota(); 

	/**
	 * @return null
	 */
	long getBackendUse(); 

	/**
	 * @return null
	 */
	java.util.Date getLastQuotaOrder(); 

	/**
	 * @return null
	 */
	java.lang.String getOffer(); 

	/**
	 * @return null
	 */
	java.lang.String getAnycast(); 

	/**
	 * @return The internal name of your CDN offer
	 */
	java.lang.String getService(); 

	/**
	 * @return URL for downloading daily log of your CDN
	 */
	java.lang.String getLogUrl(); 

	/**
	 * @return null
	 */
	long getCacheRuleLimitPerDomain(); 

	/**
	 * @return null
	 */
	long getBackendLimit(); 

}
