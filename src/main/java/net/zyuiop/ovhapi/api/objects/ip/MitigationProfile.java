package net.zyuiop.ovhapi.api.objects.ip;

/**
 * Mitigation profile for your ip
 */

public interface MitigationProfile { 

	/**
	 * @return null
	 */
	java.lang.String getIpMitigationProfile(); 

	/**
	 * @return Delay to wait before remove ip from auto mitigation after an attack
	 */
	long getAutoMitigationTimeOut(); 

	/**
	 * @return Current state of your mitigation profile
	 */
	java.lang.String getState(); 

}
