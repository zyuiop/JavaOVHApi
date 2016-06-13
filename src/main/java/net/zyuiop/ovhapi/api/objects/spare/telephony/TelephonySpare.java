package net.zyuiop.ovhapi.api.objects.spare.telephony;

/**
 * Spare properties
 */

public interface TelephonySpare { 

	/**
	 * @return Phone protocol
	 */
	java.lang.String getProtocol(); 

	/**
	 * @return Mac address
	 */
	java.lang.String getMacAddress(); 

	/**
	 * @return Phone brand model
	 */
	java.lang.String getBrand(); 

}
