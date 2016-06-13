package net.zyuiop.ovhapi.api.objects.billing;

/**
 * Details about a Voucher account
 */

public interface VoucherAccount { 

	/**
	 * @return null
	 */
	java.lang.String getVoucherAccountId(); 

	/**
	 * @return null
	 */
	net.zyuiop.ovhapi.api.objects.order.Price getBalance(); 

	/**
	 * @return null
	 */
	java.util.Date getLastUpdate(); 

	/**
	 * @return null
	 */
	java.util.Date getOpenDate(); 

}
