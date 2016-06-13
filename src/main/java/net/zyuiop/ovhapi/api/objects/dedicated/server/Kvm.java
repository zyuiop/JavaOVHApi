package net.zyuiop.ovhapi.api.objects.dedicated.server;

/**
 * Physical KVM
 */

public interface Kvm { 

	/**
	 * @return KVM access ip
	 */
	java.lang.String getIp(); 

	/**
	 * @return KVM hostname
	 */
	java.lang.String getName(); 

	/**
	 * @return KVM expiration date
	 */
	java.util.Date getExpiration(); 

}
