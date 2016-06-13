package net.zyuiop.ovhapi.api.objects.pack.xdsl;

/**
 * Hubic service
 */

public interface Hubic { 

	/**
	 * @return null
	 */
	java.lang.String getDomain(); 

	/**
	 * @return Size of the hubic account in bytes
	 */
	long getBytes(); 

	/**
	 * @return Voucher to enter on HubiC website to activate the account
	 */
	java.lang.String getVoucher(); 

	/**
	 * @return Human readable size of the hubic account
	 */
	java.lang.String getSize(); 

}
